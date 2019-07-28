package typings.lokijs

import typings.lokijs.lokijsStrings.BROWSER
import typings.lokijs.lokijsStrings.CORDOVA
import typings.lokijs.lokijsStrings.NA
import typings.lokijs.lokijsStrings.NATIVESCRIPT
import typings.lokijs.lokijsStrings.NODEJS
import typings.lokijs.lokijsStrings.adapter
import typings.lokijs.lokijsStrings.autosaveHandle
import typings.lokijs.lokijsStrings.constraints
import typings.lokijs.lokijsStrings.fs
import typings.lokijs.lokijsStrings.localStorage
import typings.lokijs.lokijsStrings.memory
import typings.lokijs.lokijsStrings.persistenceAdapter
import typings.lokijs.lokijsStrings.throttledCallbacks
import typings.lokijs.lokijsStrings.throttledSavePending
import typings.lokijs.lokijsStrings.ttl
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Loki: The main database class
  * @implements LokiEventEmitter
  */
@JSGlobal("Loki")
@js.native
class Loki protected () extends LokiEventEmitter {
  /**
    * @param filename - name of the file to be saved to
    * @param options - (Optional) config options object
    * @param options.env - override environment detection as 'NODEJS', 'BROWSER', 'CORDOVA'
    * @param [options.verbose=false] - enable console output
    * @param [options.autosave=false] - enables autosave
    * @param [options.autosaveInterval=5000] - time interval (in milliseconds) between saves (if dirty)
    * @param [options.autoload=false] - enables autoload on loki instantiation
    * @param options.autoloadCallback - user callback called after database load
    * @param options.adapter - an instance of a loki persistence adapter
    * @param [options.serializationMethod='normal'] - ['normal', 'pretty', 'destructured']
    * @param options.destructureDelimiter - string delimiter used for destructured serialization
    * @param [options.throttledSaves=true] - debounces multiple calls to to saveDatabase reducing number of disk I/O operations
    and guaranteeing proper serialization of the calls.
    */
  def this(filename: String) = this()
  def this(
    filename: String,
    options: Partial[LokiConstructorOptions] with Partial[LokiConfigOptions] with Partial[ThrottledSaveDrainOptions]
  ) = this()
  var ENV: NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA = js.native
  var autosave: Boolean = js.native
  var autosaveHandle: Double | Null = js.native
  var autosaveInterval: Double = js.native
  var collections: js.Array[Collection[_]] = js.native
  var databaseVersion: Double = js.native
  var engineVersion: Double = js.native
  var filename: String = js.native
  var name: js.UndefOr[String] = js.native
  var options: Partial[LokiConstructorOptions] with LokiConfigOptions with Partial[ThrottledSaveDrainOptions] = js.native
  var persistenceAdapter: js.UndefOr[LokiPersistenceAdapter | Null] = js.native
  var persistenceMethod: js.UndefOr[fs | localStorage | memory | adapter | Null] = js.native
  // alias
  @JSName("save")
  var save_Original: js.Function1[/* callback */ js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]], Unit] = js.native
  var throttledCallbacks: js.Array[js.Function1[/* err */ js.UndefOr[_], Unit]] = js.native
  var throttledSavePending: Boolean = js.native
  var throttledSaves: Boolean = js.native
  // alias of serialize
  @JSName("toJson")
  var toJson_Original: Fn_Options = js.native
  var verbose: Boolean = js.native
  /**
    * Adds a collection to the database.
    * @param name - name of collection to add
    * @param options - (optional) options to configure collection with.
    * @param [options.unique=[]] - array of property names to define unique constraints for
    * @param [options.exact=[]] - array of property names to define exact constraints for
    * @param [options.indices=[]] - array property names to define binary indexes for
    * @param [options.asyncListeners=false] - whether listeners are called asynchronously
    * @param [options.disableChangesApi=true] - set to false to enable Changes Api
    * @param [options.autoupdate=false] - use Object.observe to update objects automatically
    * @param [options.clone=false] - specify whether inserts and queries clone to/from user
    * @param [options.cloneMethod='parse-stringify'] - 'parse-stringify', 'jquery-extend-deep', 'shallow, 'shallow-assign'
    * @param options.ttlInterval - time interval for clearing out 'aged' documents; not set by default.
    * @returns a reference to the collection which was just added
    */
  def addCollection[F /* <: js.Object */](name: String): Collection[F] = js.native
  def addCollection[F /* <: js.Object */](name: String, options: Partial[CollectionOptions[F]]): Collection[F] = js.native
  /**
    * autosaveClearFlags - resets dirty flags on all collections.
    *    Called from saveDatabase() after db is saved.
    *
    */
  def autosaveClearFlags(): Unit = js.native
  /**
    * autosaveDirty - check whether any collections are 'dirty' meaning we need to save (entire) database
    *
    * @returns true if database has changed since last autosave, false if not.
    */
  def autosaveDirty(): Boolean = js.native
  /**
    * autosaveDisable - stop the autosave interval timer.
    */
  def autosaveDisable(): Unit = js.native
  /**
    * autosaveEnable - begin a javascript interval to periodically save the database.
    *
    * @param [options] - not currently used (remove or allow overrides?)
    * @param [callback] - (Optional) user supplied async callback
    */
  def autosaveEnable(): Unit = js.native
  def autosaveEnable(options: js.Any): Unit = js.native
  def autosaveEnable(options: js.Any, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  /**
    * (Changes API) : clears all the changes in all collections.
    */
  def clearChanges(): Unit = js.native
  /**
    * Emits the close event. In autosave scenarios, if the database is dirty, this will save and disable timer.
    * Does not actually destroy the db.
    *
    * @param callback - (Optional) if supplied will be registered with close event before emitting.
    */
  def close(): Unit = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  /**
    * Allows reconfiguring database options
    *
    * @param options - configuration options to apply to loki db object
    * @param options.env - override environment detection as 'NODEJS', 'BROWSER', 'CORDOVA'
    * @param options.verbose - enable console output (default is 'false')
    * @param options.autosave - enables autosave
    * @param options.autosaveInterval - time interval (in milliseconds) between saves (if dirty)
    * @param options.autoload - enables autoload on loki instantiation
    * @param options.autoloadCallback - user callback called after database load
    * @param options.adapter - an instance of a loki persistence adapter
    * @param options.serializationMethod - ['normal', 'pretty', 'destructured']
    * @param options.destructureDelimiter - string delimiter used for destructured serialization
    * @param initialConfig - (internal) true is passed when loki ctor is invoking
    */
  def configureOptions(): Unit = js.native
  def configureOptions(options: Partial[LokiConfigOptions] with Partial[ThrottledSaveDrainOptions]): Unit = js.native
  def configureOptions(
    options: Partial[LokiConfigOptions] with Partial[ThrottledSaveDrainOptions],
    initialConfig: Boolean
  ): Unit = js.native
  /**
    * Copies 'this' database into a new Loki instance. Object references are shared to make lightweight.
    *
    * @param options - apply or override collection level settings
    * @param options.removeNonSerializable - nulls properties not safe for serialization.
    */
  def copy(): Loki = js.native
  def copy(options: Anon_RemoveNonSerializable): Loki = js.native
  def deleteDatabase(): Unit = js.native
  /**
    * Handles deleting a database from file system, local
    *    storage, or adapter (indexeddb)
    *    This method utilizes loki configuration options (if provided) to determine which
    *    persistence method to use, or environment detection (if configuration was not provided).
    *
    * @param callback - (Optional) user supplied async callback / error handler
    */
  def deleteDatabase(callback: js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]): Unit = js.native
  def deleteDatabase(
    options: js.Function2[/* err */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], Unit],
    callback: js.Function2[/* err */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def deleteDatabase(
    options: Null,
    callback: js.Function2[/* err */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  /**
    * Collection level utility function to deserializes a destructured collection.
    *
    * @param destructuredSource - destructured representation of collection to inflate
    * @param [options] - used to describe format of destructuredSource input
    * @param [options.delimited=false] - whether source is delimited string or an array
    * @param [options.delimiter] - if delimited, this is delimiter to use (if other than default)
    *
    * @returns an array of documents to attach to collection.data.
    */
  def deserializeCollection(destructuredSource: String): js.Array[_] = js.native
  def deserializeCollection(destructuredSource: String, options: Anon_DelimitedDelimiter): js.Array[_] = js.native
  def deserializeCollection(destructuredSource: js.Array[String]): js.Array[_] = js.native
  def deserializeCollection(destructuredSource: js.Array[String], options: Anon_DelimitedDelimiter): js.Array[_] = js.native
  def deserializeDestructured(): js.Any = js.native
  /**
    * Database level destructured JSON deserialization routine to minimize memory overhead.
    * Internally, Loki supports destructuring via loki "serializationMethod' option and
    * the optional LokiPartitioningAdapter class. It is also available if you wish to do
    * your own structured persistence or data exchange.
    *
    * @param destructuredSource - destructured json or array to deserialize from
    * @param [options] - source format options
    * @param [options.partitioned=false] - whether db and each collection are separate
    * @param [options.partition] - can be used to deserialize only a single partition
    * @param [options.delimited=true] - whether subitems are delimited or subarrays
    * @param [options.delimiter] - override default delimiter
    *
    * @returns An object representation of the deserialized database, not yet applied to 'this' db or document array
    */
  def deserializeDestructured(destructuredSource: String): js.Any = js.native
  def deserializeDestructured(destructuredSource: String, options: DeserializeOptions): js.Any = js.native
  def deserializeDestructured(destructuredSource: js.Array[String]): js.Any = js.native
  def deserializeDestructured(destructuredSource: js.Array[String], options: DeserializeOptions): js.Any = js.native
  def deserializeDestructured(destructuredSource: Null, options: DeserializeOptions): js.Any = js.native
  /**-------------------------+
    | Changes API               |
    +--------------------------*/
  /**
    * The Changes API enables the tracking the changes occurred in the collections since the beginning of the session,
    * so it's possible to create a differential dataset for synchronization purposes (possibly to a remote db)
    */
  /**
    * (Changes API) : takes all the changes stored in each
    * collection and creates a single array for the entire database. If an array of names
    * of collections is passed then only the included collections will be tracked.
    *
    * @param optional array of collection names. No arg means all collections are processed.
    * @returns array of changes
    * @see private method createChange() in Collection
    */
  def generateChangesNotification(): js.Array[CollectionChange] = js.native
  def generateChangesNotification(arrayOfCollectionNames: js.Array[String]): js.Array[CollectionChange] = js.native
  /**
    * Retrieves reference to a collection by name.
    * @param collectionName - name of collection to look up
    * @returns Reference to collection in database by that name, or null if not found
    */
  def getCollection[F /* <: js.Object */](collectionName: String): Collection[F] = js.native
  // experimental support for browserify's abstract syntax scan to pick up dependency of indexed adapter.
  // Hopefully, once this hits npm a browserify require of lokijs should scan the main file and detect this indexed adapter reference.
  def getIndexedAdapter(): js.Any = js.native
  def getName(): String = js.native
  def listCollections(): js.Array[Collection[_]] = js.native
  def loadCollection(collection: Collection[_]): Unit = js.native
  /**
    * Handles manually loading from file system, local storage, or adapter (such as indexeddb)
    *    This method utilizes loki configuration options (if provided) to determine which
    *    persistence method to use, or environment detection (if configuration was not provided).
    *    To avoid contention with any throttledSaves, we will drain the save queue first.
    *
    * If you are configured with autosave, you do not need to call this method yourself.
    *
    * @param [options] - if throttling saves and loads, this controls how we drain save queue before loading
    * @param [options.recursiveWait] - (default: true) wait recursively until no saves are queued
    * @param [options.recursiveWaitLimit] - (default: false) limit our recursive waiting to a duration
    * @param [options.recursiveWaitLimitDelay] - (default: 2000) cutoff in ms to stop recursively re-draining
    * @param [callback] - (Optional) user supplied async callback / error handler
    * @example
    * db.loadDatabase({}, function(err) {
    *   if (err) {
    *     console.log("error : " + err);
    *   }
    *   else {
    *     console.log("database loaded.");
    *   }
    * });
    */
  def loadDatabase(): Unit = js.native
  def loadDatabase(options: Partial[ThrottledSaveDrainOptions]): Unit = js.native
  def loadDatabase(options: Partial[ThrottledSaveDrainOptions], callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  /**
    * Internal load logic, decoupled from throttling/contention logic
    *
    * @param [options] - not currently used (remove or allow overrides?)
    * @param [callback] - (Optional) user supplied async callback / error handler
    */
  def loadDatabaseInternal(): Unit = js.native
  def loadDatabaseInternal(options: js.Any): Unit = js.native
  def loadDatabaseInternal(
    options: js.Any,
    callback: js.Function2[/* err */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  /**
    * Inflates a loki database from a serialized JSON string
    *
    * @param serializedDb - a serialized loki database string
    * @param [options] - apply or override collection level settings
    * @param [options.serializationMethod] - the serialization format to deserialize
    */
  def loadJSON(serializedDb: String): Unit = js.native
  def loadJSON(serializedDb: String, options: Anon_CollName): Unit = js.native
  /**
    * Inflates a loki database from a JS object
    *
    * @param dbObject - a serialized loki database string
    * @param options - apply or override collection level settings
    * @param options.retainDirtyFlags - whether collection dirty flags will be preserved
    */
  def loadJSONObject(dbObject: Anon_Collections): Unit = js.native
  def loadJSONObject(dbObject: Anon_Collections, options: Anon_CollNameRetainDirtyFlags): Unit = js.native
  /**
    * Removes a collection from the database.
    * @param collectionName - name of collection to remove
    */
  def removeCollection(collectionName: String): Unit = js.native
  /**
    * Renames an existing loki collection
    * @param oldName - name of collection to rename
    * @param newName - new name of collection
    * @returns reference to the newly renamed collection
    */
  def renameCollection(oldName: String, newName: String): Collection[_] = js.native
  // alias
  def save(): Unit = js.native
  def save(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  /**
    * Handles manually saving to file system, local storage, or adapter (such as indexeddb)
    *    This method utilizes loki configuration options (if provided) to determine which
    *    persistence method to use, or environment detection (if configuration was not provided).
    *
    * If you are configured with autosave, you do not need to call this method yourself.
    *
    * @param [callback] - (Optional) user supplied async callback / error handler
    * @example
    * db.saveDatabase(function(err) {
    *   if (err) {
    *     console.log("error : " + err);
    *   }
    *   else {
    *     console.log("database saved.");
    *   }
    * });
    */
  def saveDatabase(): Unit = js.native
  def saveDatabase(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  /**
    * Internal save logic, decoupled from save throttling logic
    */
  def saveDatabaseInternal(): Unit = js.native
  def saveDatabaseInternal(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def serialize(): String | js.Array[String] = js.native
  def serialize(options: Anon_Destructured): js.Array[String] = js.native
  def serialize(options: Anon_Normal): String = js.native
  def serialize(options: Anon_SerializationMethod): String | js.Array[String] = js.native
  /**
    * (Changes API) - stringify changes for network transmission
    * @returns string representation of the changes
    */
  def serializeChanges(): String = js.native
  def serializeChanges(collectionNamesArray: js.Array[String]): String = js.native
  /**
    * Collection level utility method to serialize a collection in a 'destructured' format
    *
    * @param [options] - used to determine output of method
    * @param [options.delimited] - whether to return single delimited string or an array
    * @param [options.delimiter] - (optional) if delimited, this is delimiter to use
    * @param [options.collectionIndex] - specify which collection to serialize data for
    *
    * @returns A custom, restructured aggregation of independent serializations for a single collection.
    */
  def serializeCollection(): String | js.Array[String] = js.native
  def serializeCollection(options: Anon_CollectionIndex): String | js.Array[String] = js.native
  /**
    * Database level destructured JSON serialization routine to allow alternate serialization methods.
    * Internally, Loki supports destructuring via loki "serializationMethod' option and
    * the optional LokiPartitioningAdapter class. It is also available if you wish to do
    * your own structured persistence or data exchange.
    *
    * @param options - output format options for use externally to loki
    * @param options.partitioned - (default: false) whether db and each collection are separate
    * @param options.partition - can be used to only output an individual collection or db (-1)
    * @param options.delimited - (default: true) whether subitems are delimited or subarrays
    * @param options.delimiter - override default delimiter
    *
    * @returns A custom, restructured aggregation of independent serializations.
    */
  def serializeDestructured(): String | js.Array[String] = js.native
  def serializeDestructured(options: Anon_Delimited): String | js.Array[String] = js.native
  def serializeReplacer(key: String, value: js.Any): js.Any = js.native
  /**
    * serializeReplacer - used to prevent certain properties from being serialized
    */
  @JSName("serializeReplacer")
  def serializeReplacer_autosaveHandle(key: autosaveHandle, value: js.Any): js.Any = js.native
  @JSName("serializeReplacer")
  def serializeReplacer_constraints(key: constraints, value: js.Any): js.Any = js.native
  @JSName("serializeReplacer")
  def serializeReplacer_persistenceAdapter(key: persistenceAdapter, value: js.Any): js.Any = js.native
  @JSName("serializeReplacer")
  def serializeReplacer_throttledCallbacks(key: throttledCallbacks, value: js.Any): js.Any = js.native
  @JSName("serializeReplacer")
  def serializeReplacer_throttledSavePending(key: throttledSavePending, value: js.Any): js.Any = js.native
  @JSName("serializeReplacer")
  def serializeReplacer_ttl(key: ttl, value: js.Any): js.Any = js.native
  /**
    * Serialize database to a string which can be loaded via {@link Loki#loadJSON}
    *
    * @returns Stringified representation of the loki database.
    */
  @JSName("serialize")
  def serialize_String(): String = js.native
  /**
    * Wait for throttledSaves to complete and invoke your callback when drained or duration is met.
    *
    * @param callback - callback to fire when save queue is drained, it is passed a sucess parameter value
    * @param [options] - configuration options
    * @param [options.recursiveWait] - (default: true) if after queue is drained, another save was kicked off, wait for it
    * @param [options.recursiveWaitLimit] - (default: false) limit our recursive waiting to a duration
    * @param [options.recursiveWaitLimitDelay] - (default: 2000) cutoff in ms to stop recursively re-draining
    */
  def throttledSaveDrain(callback: js.Function1[/* result */ js.UndefOr[Boolean], Unit]): Unit = js.native
  def throttledSaveDrain(
    callback: js.Function1[/* result */ js.UndefOr[Boolean], Unit],
    options: Partial[ThrottledSaveDrainOptions]
  ): Unit = js.native
  // alias of serialize
  def toJson(): String | js.Array[String] = js.native
  // alias of serialize
  def toJson(options: Anon_Destructured): js.Array[String] = js.native
  // alias of serialize
  def toJson(options: Anon_Normal): String = js.native
  def toJson(options: Anon_SerializationMethod): String | js.Array[String] = js.native
  // alias of serialize
  @JSName("toJson")
  def toJson_String(): String = js.native
}

