package typings.iobroker.iobrokerMod._Global_.ioBroker

import typings.node.Buffer
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides low-level access to the ioBroker states DB */
@js.native
trait States extends js.Object {
  def clearAllLogs(): Unit = js.native
  def clearAllLogs(callback: EmptyCallback): Unit = js.native
  def clearAllMessages(): Unit = js.native
  def clearAllMessages(callback: EmptyCallback): Unit = js.native
  /**
    * Deletes a binary state from Redis
    * @param id The id of the state to be deleted
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def delBinaryState(id: String, callback: DeleteStateCallback): Unit = js.native
  /**
    * Deletes a config object in the object db
    * @param id ID of the object
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def delConfig(id: String, callback: ErrorCallback): Unit = js.native
  def delLog(id: String, logId: String, callback: ErrorCallback): Unit = js.native
  def delMessage(id: String, messageId: Double, callback: ErrorCallback): Unit = js.native
  /**
    * Deletes a state
    * @param id ID of the state to be stored
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def delState(id: String, callback: DeleteStateCallback): Unit = js.native
  /** Destructor of the class. Call this before shutting down */
  def destroy(): Unit = js.native
  def destroySession(id: String): Unit = js.native
  def destroySession(id: String, callback: EmptyCallback): Unit = js.native
  /**
    * Reads a binary state from Redis
    * @param id The id of the state
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getBinaryState(id: String, callback: GetBinaryStateCallback): Unit = js.native
  /**
    * Retrieves a copy of the object with the given ID
    * @param id Id of the object to find
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getConfig(id: String, callback: GetObjectCallback): Unit = js.native
  /**
    * Returns a list of config keys matching <pattern>
    * @param pattern Pattern to match against
    * @param callback Is called when the operation has finished (successfully or not)
    * @param dontModify unused
    */
  def getConfigKeys(pattern: String, callback: GetConfigKeysCallback): Unit = js.native
  def getConfigKeys(pattern: String, callback: GetConfigKeysCallback, dontModify: js.Any): Unit = js.native
  /**
    * Returns a list of objects with the given ids
    * @param keys IDs of the objects to be retrieved
    * @param callback Is called when the operation has finished (successfully or not)
    * @param dontModify unused
    */
  def getConfigs(keys: js.Array[String], callback: GetObjectsCallback2): Unit = js.native
  def getConfigs(keys: js.Array[String], callback: GetObjectsCallback2, dontModify: js.Any): Unit = js.native
  /**
    * Retrieves all ids of states matching @link{pattern}
    * @param pattern The pattern to match against
    * @param callback Is called when the operation has finished (successfully or not)
    * @param dontModify unused
    */
  def getKeys(pattern: String, callback: GetConfigKeysCallback): Unit = js.native
  def getKeys(pattern: String, callback: GetConfigKeysCallback, dontModify: js.Any): Unit = js.native
  def getLog(id: String, callback: GenericCallback[Log]): Unit = js.native
  def getMessage(id: String, callback: GenericCallback[Message]): Unit = js.native
  def getSession(id: String, callback: GetSessionCallback): Unit = js.native
  /**
    * Returns the state with the given id
    * @param id ID of the state to be retrieved
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getState(id: String, callback: GetStateCallback): Unit = js.native
  /**
    * Returns a list of states with the given ids
    * @param keys IDs of the states to be retrieved
    * @param callback Is called when the operation has finished (successfully or not)
    * @param dontModify unused
    */
  def getStates(keys: js.Array[String], callback: GetStatesCallback2): Unit = js.native
  def getStates(keys: js.Array[String], callback: GetStatesCallback2, dontModify: js.Any): Unit = js.native
  def lenLog(id: String, callback: GenericCallback[Double]): Unit = js.native
  def lenMessage(id: String, callback: GenericCallback[Double]): Unit = js.native
  /**
    * EDUCATED GUESS: Notify all clients about changes to an object
    * @param type object type
    * @param id State/object id
    * @param obj The changed object
    */
  def publishAll(`type`: String, id: String, obj: Message): Unit = js.native
  def pushLog(id: String, log: Log, callback: SetStateCallback): Unit = js.native
  // TODO: Documentation for these functions is missing
  def pushMessage(id: String, state: Message, callback: SetStateCallback): Unit = js.native
  /**
    * Register an adapter instance as subscribable.
    * This means that the instance can read information about all subscriptions to its states
    * and will be notified of changes.
    * @param instance Adapter instance to register, e.g. "admin.0"
    * @param cb Is called when the operation has finished (successfully or not)
    */
  def registerAdapterSubs(instance: String): Unit = js.native
  def registerAdapterSubs(instance: String, cb: js.Function2[/* error */ Null, /* success */ Boolean, Unit]): Unit = js.native
  /**
    * Writes a binary state into Redis
    * @param id The id of the state
    * @param data The data to be written
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def setBinaryState(id: String, data: Buffer, callback: SetStateCallback): Unit = js.native
  /**
    * Creates or overwrites a config object in the object db
    * @param id ID of the object
    * @param obj Object to store
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def setConfig(id: String, obj: Object, callback: SetObjectCallback): Unit = js.native
  /**
    * Updates a state in memory without triggering a save
    * @param id ID of the state to be stored
    * @param state The state to be updated
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def setRawState(id: String, state: State): Unit = js.native
  def setRawState(id: String, state: State, callback: SetStateCallback): Unit = js.native
  def setSession(id: String, expire: Double): Unit = js.native
  def setSession(id: String, expire: Double, callback: EmptyCallback): Unit = js.native
  def setSession(id: String, expire: Double, obj: Session): Unit = js.native
  def setSession(id: String, expire: Double, obj: Session, callback: EmptyCallback): Unit = js.native
  /**
    * Stores a state in the db
    * @param id ID of the state to be stored
    * @param state The state to be stored in the db
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def setState(id: String): Unit = js.native
  def setState(id: String, state: String): Unit = js.native
  def setState(id: String, state: String, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Boolean): Unit = js.native
  def setState(id: String, state: Boolean, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Double): Unit = js.native
  def setState(id: String, state: Double, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: State): Unit = js.native
  def setState(id: String, state: State, callback: SetStateCallback): Unit = js.native
  def setState(id: String, state: Partial[State]): Unit = js.native
  def setState(id: String, state: Partial[State], callback: SetStateCallback): Unit = js.native
  /**
    * Subscribe to changes of all states matching @link{pattern}
    * @param pattern The pattern to match against
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def subscribe(pattern: String, cb: EmptyCallback): Unit = js.native
  /**
    * Subscribe to config object changes
    * @param pattern The pattern to match against
    */
  def subscribeConfig(pattern: String, callback: EmptyCallback): Unit = js.native
  def subscribeLog(id: String, cb: EmptyCallback): Unit = js.native
  def subscribeMessage(id: String, cb: EmptyCallback): Unit = js.native
  /**
    * Unregister an adapter instance as subscribable.
    * @param instance Adapter instance to unregister, e.g. "admin.0"
    * @param cb Is called when the operation has finished (successfully or not)
    */
  def unregisterAdapterSubs(instance: String): Unit = js.native
  def unregisterAdapterSubs(instance: String, cb: js.Function2[/* error */ Null, /* success */ Boolean, Unit]): Unit = js.native
  /**
    * Unsubscribe from changes of all states matching @link{pattern}
    * @param pattern The pattern to match against
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def unsubscribe(pattern: String, cb: EmptyCallback): Unit = js.native
  /**
    * Unsubscribe from config object changes
    * @param pattern The pattern to match against
    */
  def unsubscribeConfig(pattern: String, callback: EmptyCallback): Unit = js.native
  def unsubscribeLog(id: String, cb: EmptyCallback): Unit = js.native
  def unsubscribeMessage(id: String, cb: EmptyCallback): Unit = js.native
}

