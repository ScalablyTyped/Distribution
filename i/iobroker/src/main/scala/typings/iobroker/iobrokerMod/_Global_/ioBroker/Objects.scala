package typings.iobroker.iobrokerMod._Global_.ioBroker

import typings.iobroker.Anon_IsBinary
import typings.iobroker.Anon_Mode
import typings.iobroker.Anon_Sorted
import typings.node.Buffer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides low-level access to the ioBroker objects db */
@js.native
trait Objects extends js.Object {
  /**
    * Changes access rights of all files in the root directory matching <name>
    * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
    * @param name Pattern to match against
    * @param options Mode of the access change as a number or hexadecimal string
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def chmodFile(id: String, name: String, options: Anon_Mode, callback: ChownFileCallback): Unit = js.native
  def chmodFile(id: String, name: String, options: Record[String, _], callback: ChownFileCallback): Unit = js.native
  /**
    * Changes access rights of all objects matching <pattern>
    * @param pattern Pattern to match against
    * @param options Mode of the access change as a number or hexadecimal string
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def chmodObject(pattern: String, callback: ChownObjectCallback): Unit = js.native
  def chmodObject(pattern: String, options: js.Any, callback: ChownObjectCallback): Unit = js.native
  /**
    * Takes possession all files in the root directory matching <name>
    * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
    * @param name Pattern to match against
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def chownFile(id: String, name: String, callback: ChownFileCallback): Unit = js.native
  def chownFile(id: String, name: String, options: js.Any, callback: ChownFileCallback): Unit = js.native
  /**
    * Takes possession of all objects matching <pattern>
    * @param pattern Pattern to match against
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def chownObject(pattern: String, callback: ChownObjectCallback): Unit = js.native
  def chownObject(pattern: String, options: js.Any, callback: ChownObjectCallback): Unit = js.native
  /**
    * Deletes an object in the object db
    * @param id ID of the object
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def delConfig(id: String, callback: ErrorCallback): Unit = js.native
  def delConfig(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  /**
    * Deletes a file.
    * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
    * @param name File name
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def delFile(id: String, name: String, callback: ErrorCallback): Unit = js.native
  def delFile(id: String, name: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  /**
    * Deletes an object in the object db
    * @param id ID of the object
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def delObject(id: String, callback: ErrorCallback): Unit = js.native
  def delObject(id: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  // I'd rather not document a function with the name "destroyDB"
  /** Destructor of the class. Call this before shutting down. */
  def destroy(): Unit = js.native
  /**
    * Extends an object in the object db with new properties
    * @param id ID of the object
    * @param obj Object to extend the original one with. May be just parts of an object.
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def extendObject(id: String, obj: PartialObject, callback: ExtendObjectCallback): Unit = js.native
  def extendObject(id: String, obj: PartialObject, options: js.Any, callback: ExtendObjectCallback): Unit = js.native
  def findObject(idOrName: String, `type`: js.UndefOr[scala.Nothing], callback: FindObjectCallback): Unit = js.native
  def findObject(idOrName: String, `type`: js.UndefOr[scala.Nothing], options: js.Any, callback: FindObjectCallback): Unit = js.native
  def findObject(idOrName: String, `type`: Null, callback: FindObjectCallback): Unit = js.native
  def findObject(idOrName: String, `type`: Null, options: js.Any, callback: FindObjectCallback): Unit = js.native
  /**
    * Finds an object by ID or name. If multiple objects were found, return the first one
    * @param idOrName ID or name of the object
    * @param type If != null, only return an object with a common.type equal to this
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def findObject(idOrName: String, `type`: CommonType, callback: FindObjectCallback): Unit = js.native
  def findObject(idOrName: String, `type`: CommonType, options: js.Any, callback: FindObjectCallback): Unit = js.native
  /**
    * Retrieves a copy of the object with the given ID
    * @param id Id of the object to find
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getConfig(id: String, callback: GetObjectCallback): Unit = js.native
  def getConfig(id: String, options: js.Any, callback: GetObjectCallback): Unit = js.native
  /**
    * Returns a list of config keys matching <pattern>
    * @param pattern Pattern to match against
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    * @param dontModify unused
    */
  def getConfigKeys(pattern: String, callback: GetConfigKeysCallback): Unit = js.native
  def getConfigKeys(pattern: String, callback: GetConfigKeysCallback, dontModify: js.Any): Unit = js.native
  def getConfigKeys(pattern: String, options: js.Any, callback: GetConfigKeysCallback): Unit = js.native
  def getConfigKeys(pattern: String, options: js.Any, callback: GetConfigKeysCallback, dontModify: js.Any): Unit = js.native
  /**
    * Returns a list of objects with the given ids
    * @param keys IDs of the objects to be retrieved
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    * @param dontModify unused
    */
  def getConfigs(keys: js.Array[String], callback: GetObjectsCallback2): Unit = js.native
  def getConfigs(keys: js.Array[String], callback: GetObjectsCallback2, dontModify: js.Any): Unit = js.native
  def getConfigs(keys: js.Array[String], options: js.Any, callback: GetObjectsCallback2): Unit = js.native
  def getConfigs(keys: js.Array[String], options: js.Any, callback: GetObjectsCallback2, dontModify: js.Any): Unit = js.native
  /**
    * Determines the mime type for a given file extension
    * @param ext File extension, including the leading dot, e.g. ".zip"
    */
  def getMimeType(ext: String): Anon_IsBinary = js.native
  /**
    * Retrieves a copy of the object with the given ID
    * @param id Id of the object to find
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getObject(id: String, callback: GetObjectCallback): Unit = js.native
  def getObject(id: String, options: js.Any, callback: GetObjectCallback): Unit = js.native
  def getObjectList(params: Null, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: Null, options: Anon_Sorted, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: Null, options: Record[String, _], callback: GetObjectListCallback): Unit = js.native
  /**
    * Returns a list of objects with id between params.startkey and params.endkey
    * @param params Parameters determining the objects included in the return list. Null to include all objects
    * @param options (optional) If the returned list should be sorted. And some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getObjectList(params: GetObjectListParams, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: GetObjectListParams, options: Anon_Sorted, callback: GetObjectListCallback): Unit = js.native
  def getObjectList(params: GetObjectListParams, options: Record[String, _], callback: GetObjectListCallback): Unit = js.native
  def getObjectView(design: String, search: String, params: js.UndefOr[scala.Nothing], callback: GetObjectViewCallback): Unit = js.native
  def getObjectView(
    design: String,
    search: String,
    params: js.UndefOr[scala.Nothing],
    options: js.Any,
    callback: GetObjectViewCallback
  ): Unit = js.native
  def getObjectView(design: String, search: String, params: Null, callback: GetObjectViewCallback): Unit = js.native
  def getObjectView(design: String, search: String, params: Null, options: js.Any, callback: GetObjectViewCallback): Unit = js.native
  /**
    * Query a predefined object view (similar to SQL stored procedures) and return the results
    * For a detailed description refer to https://github.com/ioBroker/ioBroker/wiki/Adapter-Development-Documentation#object-fields
    * or http://guide.couchdb.org/editions/1/en/views.html
    * @param design The namespace of the object view, as defined in io-package.json. Usually the adapter name, e.g. "hm-rpc"
    * @param search The name of the object view.
    * @param params Parameters to additionally filter out objects from the return list. Null to include all objects
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def getObjectView(design: String, search: String, params: GetObjectViewParams, callback: GetObjectViewCallback): Unit = js.native
  def getObjectView(
    design: String,
    search: String,
    params: GetObjectViewParams,
    options: js.Any,
    callback: GetObjectViewCallback
  ): Unit = js.native
  /**
    * Returns a list of objects with the given ids
    * @param keys IDs of the objects to be retrieved
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    * @param dontModify unused
    */
  def getObjects(keys: js.Array[String], callback: GetObjectsCallback2): Unit = js.native
  def getObjects(keys: js.Array[String], callback: GetObjectsCallback2, dontModify: js.Any): Unit = js.native
  def getObjects(keys: js.Array[String], options: js.Any, callback: GetObjectsCallback2): Unit = js.native
  def getObjects(keys: js.Array[String], options: js.Any, callback: GetObjectsCallback2, dontModify: js.Any): Unit = js.native
  /**
    * For a given user, returns the groups they belong to, and their access rights
    * @param user Name of the user. Has to start with "system.user."
    * @param callback The callback function to be invoked with the return values
    */
  def getUserGroup(user: String, callback: GetUserGroupCallback): Unit = js.native
  /**
    * Creates an empty directory with the given name
    * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
    * @param name Directory name
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def mkDir(id: String, name: String, callback: ErrorCallback): Unit = js.native
  def mkDir(id: String, name: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  /**
    * Finds all files and directories starting with <name>
    * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
    * @param name File or directory name
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def readDir(id: String, name: String, callback: ReadDirCallback): Unit = js.native
  def readDir(id: String, name: String, options: js.Any, callback: ReadDirCallback): Unit = js.native
  /**
    * Reads a file.
    * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
    * @param name File name
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def readFile(id: String, name: String, callback: ReadFileCallback): Unit = js.native
  def readFile(id: String, name: String, options: js.Any, callback: ReadFileCallback): Unit = js.native
  /**
    * Renames a file or directory
    * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
    * @param oldName Old file or directory name
    * @param newName Name to rename to
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def rename(id: String, oldName: String, newName: String, callback: ErrorCallback): Unit = js.native
  def rename(id: String, oldName: String, newName: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  /**
    * Deletes all files in the root directory matching <name>
    * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
    * @param name Pattern to match against
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def rm(id: String, name: String, callback: RmCallback): Unit = js.native
  def rm(id: String, name: String, options: js.Any, callback: RmCallback): Unit = js.native
  /**
    * Creates or overwrites an object in the object db
    * @param id ID of the object
    * @param obj Object to store
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def setConfig(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
  def setConfig(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
  /**
    * Creates or overwrites an object in the object db
    * @param id ID of the object
    * @param obj Object to store
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def setObject(id: String, obj: SettableObject, callback: SetObjectCallback): Unit = js.native
  def setObject(id: String, obj: SettableObject, options: js.Any, callback: SetObjectCallback): Unit = js.native
  /**
    * Subscribe to object changes
    * @param pattern The pattern to match against
    */
  def subscribe(pattern: String, callback: EmptyCallback): Unit = js.native
  def subscribe(pattern: String, options: js.Any, callback: EmptyCallback): Unit = js.native
  // not documented. enabled = true seems to disable the cache
  // enableFileCache(enabled, options, callback)
  /**
    * Subscribe to object changes
    * @param pattern The pattern to match against
    */
  def subscribeConfig(pattern: String, callback: EmptyCallback): Unit = js.native
  def subscribeConfig(pattern: String, options: js.Any, callback: EmptyCallback): Unit = js.native
  /**
    * Creates an empty file with the given name
    * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
    * @param name File name
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def touch(id: String, name: String, callback: ErrorCallback): Unit = js.native
  def touch(id: String, name: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  /**
    * Deletes a file.
    * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
    * @param name File name
    * @param options (optional) Some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def unlink(id: String, name: String, callback: ErrorCallback): Unit = js.native
  def unlink(id: String, name: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  /**
    * Unsubscribe from object changes
    * @param pattern The pattern to match against
    */
  def unsubscribe(pattern: String, callback: EmptyCallback): Unit = js.native
  def unsubscribe(pattern: String, options: js.Any, callback: EmptyCallback): Unit = js.native
  /**
    * Unsubscribe from object changes
    * @param pattern The pattern to match against
    */
  def unsubscribeConfig(pattern: String, callback: EmptyCallback): Unit = js.native
  def unsubscribeConfig(pattern: String, options: js.Any, callback: EmptyCallback): Unit = js.native
  def writeFile(id: String, name: String, data: String, callback: ErrorCallback): Unit = js.native
  def writeFile(id: String, name: String, data: String, options: String, callback: ErrorCallback): Unit = js.native
  def writeFile(id: String, name: String, data: String, options: js.Any, callback: ErrorCallback): Unit = js.native
  /**
    * Writes a file.
    * @param id Name of the root directory. This should be the adapter instance, e.g. "admin.0"
    * @param name File name
    * @param data Contents of the file
    * @param options (optional) MIME type of the file (string). Or some internal options.
    * @param callback Is called when the operation has finished (successfully or not)
    */
  def writeFile(id: String, name: String, data: Buffer, callback: ErrorCallback): Unit = js.native
  def writeFile(id: String, name: String, data: Buffer, options: String, callback: ErrorCallback): Unit = js.native
  def writeFile(id: String, name: String, data: Buffer, options: js.Any, callback: ErrorCallback): Unit = js.native
}

