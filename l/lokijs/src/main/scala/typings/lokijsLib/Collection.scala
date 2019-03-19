package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Collection class that handles documents of same type
  * @implements LokiEventEmitter
  * @see {@link Loki#addCollection} for normal creation of collections
  */
@JSGlobal("Collection")
@js.native
class Collection[E /* <: js.Object */] protected () extends LokiEventEmitter {
  /**
    * @param name - collection name
    * @param [options] - (optional) configuration object
    * @param [options.unique=[]] - array of property names to define unique constraints for
    * @param [options.exact=[]] - array of property names to define exact constraints for
    * @param [options.indices=[]] - array property names to define binary indexes for
    * @param [options.adaptiveBinaryIndices=true] - collection indices will be actively rebuilt rather than lazily
    * @param [options.asyncListeners=false] - whether listeners are invoked asynchronously
    * @param [options.disableChangesApi=true] - set to false to enable Changes API
    * @param [options.disableDeltaChangesApi=true] - set to false to enable Delta Changes API (requires Changes API, forces cloning)
    * @param [options.autoupdate=false] - use Object.observe to update objects automatically
    * @param [options.clone=false] - specify whether inserts and queries clone to/from user
    * @param [options.serializableIndices=true[]] - converts date values on binary indexed properties to epoch time
    * @param [options.cloneMethod='parse-stringify'] - 'parse-stringify', 'jquery-extend-deep', 'shallow', 'shallow-assign'
    * @param options.ttlInterval - time interval for clearing out 'aged' documents; not set by default.
    * @see {@link Loki#addCollection} for normal creation of collections
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, options: stdLib.Partial[CollectionOptions[E]]) = this()
  var DynamicViews: js.Array[DynamicView[js.Object]] = js.native
  var adaptiveBinaryIndices: scala.Boolean = js.native
  var autoupdate: scala.Boolean = js.native
  var binaryIndices: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.BinaryIndex}
    */ lokijsLib.lokijsLibStrings.Collection with js.Any = js.native
  var cachedBinaryIndex: (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]: lokijs.BinaryIndex}
    */ lokijsLib.lokijsLibStrings.Collection with js.Any) | scala.Null = js.native
  var cachedData: js.Array[E] | scala.Null = js.native
  var cachedIndex: js.Array[scala.Double] | scala.Null = js.native
  var changes: js.Array[CollectionChange] = js.native
  var cloneMethod: lokijsLib.lokijsLibStrings.`parse-stringify` | lokijsLib.lokijsLibStrings.`jquery-extend-deep` | lokijsLib.lokijsLibStrings.shallow | lokijsLib.lokijsLibStrings.`shallow-assign` | lokijsLib.lokijsLibStrings.`shallow-recurse-objects` | scala.Null = js.native
  var cloneObjects: scala.Boolean = js.native
  /**
    * a collection of objects recording the changes applied through a commmitStage
    */
  var commitLog: js.Array[Anon_Data] = js.native
  var console: Anon_Args = js.native
  var constraints: Anon_Exact[E] = js.native
  var data: js.Array[E] = js.native
  var dirty: scala.Boolean = js.native
  var disableChangesApi: scala.Boolean = js.native
  var disableDeltaChangesApi: scala.Boolean = js.native
  var idIndex: js.Array[scala.Double] = js.native
  var maxId: scala.Double = js.native
  var name: java.lang.String = js.native
  var objType: java.lang.String = js.native
  var serializableIndices: scala.Boolean = js.native
  /* ------ STAGING API -------- */
  /**
    * stages: a map of uniquely identified 'stages', which hold copies of objects to be
    * manipulated without affecting the data in the original collection
    */
  var stages: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var transactional: scala.Boolean = js.native
  var transforms: org.scalablytyped.runtime.StringDictionary[js.Array[Transform]] = js.native
  var ttl: Anon_Age = js.native
  var uniqueNames: js.Array[java.lang.String] = js.native
  /**
    * Adaptively insert a selected item to the index.
    * @param dataPosition : coll.data array index/position
    * @param binaryIndexName : index to search for dataPosition in
    */
  def adaptiveBinaryIndexInsert(dataPosition: scala.Double, binaryIndexName: java.lang.String): scala.Unit = js.native
  /**
    * Adaptively remove a selected item from the index.
    * @param dataPosition : coll.data array index/position
    * @param binaryIndexName : index to search for dataPosition in
    */
  def adaptiveBinaryIndexRemove(dataPosition: scala.Double, binaryIndexName: java.lang.String): scala.Unit = js.native
  def adaptiveBinaryIndexRemove(dataPosition: scala.Double, binaryIndexName: java.lang.String, removedFromIndexOnly: scala.Boolean): scala.Unit = js.native
  /**
    * Adaptively update a selected item within an index.
    * @param dataPosition : coll.data array index/position
    * @param binaryIndexName : index to search for dataPosition in
    */
  def adaptiveBinaryIndexUpdate(dataPosition: scala.Double, binaryIndexName: java.lang.String): scala.Unit = js.native
  /**
    * Add object to collection
    */
  def add(obj: (E with LokiObj) | E): E with LokiObj = js.native
  def addAutoUpdateObserver(obj: js.Any): scala.Unit = js.native
  /**
    * Add a dynamic view to the collection
    * @param name - name of dynamic view to add
    * @param [options] - options to configure dynamic view with
    * @param [options.persistent=false] - indicates if view is to main internal results array in 'resultdata'
    * @param [options.sortPriority='passive'] - 'passive' (sorts performed on call to data) or 'active' (after updates)
    * @param options.minRebuildInterval - minimum rebuild interval (need clarification to docs here)
    * @returns reference to the dynamic view added
    * @example
    * var pview = users.addDynamicView('progeny');
    * pview.applyFind({'age': {'$lte': 40}});
    * pview.applySimpleSort('name');
    *
    * var results = pview.data();
    */
  def addDynamicView(name: java.lang.String): DynamicView[E] = js.native
  def addDynamicView(name: java.lang.String, options: stdLib.Partial[DynamicViewOptions]): DynamicView[E] = js.native
  /**
    * Adds a named collection transform to the collection
    * @param name - name to associate with transform
    * @param transform - an array of transformation 'step' objects to save into the collection
    * @example
    * users.addTransform('progeny', [
    *   {
    *     type: 'find',
    *     value: {
    *       'age': {'$lte': 40}
    *     }
    *   }
    * ]);
    *
    * var results = users.chain('progeny').data();
    */
  def addTransform(name: java.lang.String, transform: js.Array[Transform]): scala.Unit = js.native
  // async executor. This is only to enable callbacks at the end of the execution.
  def async(fun: js.Function0[scala.Unit], callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Calculates the average numerical value of a property
    *
    * @param field - name of property in docs to average
    * @returns average of property in all docs in the collection
    */
  def avg(field: java.lang.String): scala.Double = js.native
  def by(field: java.lang.String): js.UndefOr[E | (js.Function1[/* value */ js.Any, js.UndefOr[E]])] = js.native
  def by(field: java.lang.String, value: js.Any): js.UndefOr[E] = js.native
  def byExample(template: js.Object): Anon_AndAny = js.native
  /**
    * Retrieve doc by Unique index
    * @param field - name of uniquely indexed property to use when doing lookup
    * @param value - unique value to search for
    * @returns document matching the value passed
    */
  @JSName("by")
  def by_Function1(field: java.lang.String): js.Function1[/* value */ js.Any, js.UndefOr[E]] = js.native
  def calculateRange(op: lokijsLib.lokijsLibStrings.DOLLARaeq, prop: java.lang.String, `val`: js.Any): js.Array[scala.Double] = js.native
  def calculateRange(op: lokijsLib.lokijsLibStrings.DOLLARbetween, prop: java.lang.String, `val`: js.Any): js.Array[scala.Double] = js.native
  def calculateRange(op: lokijsLib.lokijsLibStrings.DOLLARdteq, prop: java.lang.String, `val`: js.Any): js.Array[scala.Double] = js.native
  /**
    * calculateRange() - Binary Search utility method to find range/segment of values matching criteria.
    *    this is used for collection.find() and first find filter of resultset/dynview
    *    slightly different than get() binary search in that get() hones in on 1 value,
    *    but we have to hone in on many (range)
    * @param op - operation, such as $eq
    * @param prop - name of property to calculate range for
    * @param val - value to use for range calculation.
    * @returns [start, end] index array positions
    */
  def calculateRange(op: lokijsLib.lokijsLibStrings.DOLLAReq, prop: java.lang.String, `val`: js.Any): js.Array[scala.Double] = js.native
  def calculateRange(op: lokijsLib.lokijsLibStrings.DOLLARgte, prop: java.lang.String, `val`: js.Any): js.Array[scala.Double] = js.native
  def calculateRange(op: lokijsLib.lokijsLibStrings.DOLLARgt, prop: java.lang.String, `val`: js.Any): js.Array[scala.Double] = js.native
  def calculateRange(op: lokijsLib.lokijsLibStrings.DOLLARin, prop: java.lang.String, `val`: js.Any): js.Array[scala.Double] = js.native
  def calculateRange(op: lokijsLib.lokijsLibStrings.DOLLARlte, prop: java.lang.String, `val`: js.Any): js.Array[scala.Double] = js.native
  def calculateRange(op: lokijsLib.lokijsLibStrings.DOLLARlt, prop: java.lang.String, `val`: js.Any): js.Array[scala.Double] = js.native
  /**
    * Internal method used for indexed $between.  Given a prop (index name), and a value
    * (which may or may not yet exist) this will find the final position of that upper range value.
    */
  def calculateRangeEnd(prop: java.lang.String, `val`: js.Any): scala.Double = js.native
  /**
    * Internal method used for index maintenance and indexed searching.
    * Calculates the beginning of an index range for a given value.
    * For index maintainance (adaptive:true), we will return a valid index position to insert to.
    * For querying (adaptive:false/undefined), we will :
    *    return lower bound/index of range of that value (if found)
    *    return next lower index position if not found (hole)
    * If index is empty it is assumed to be handled at higher level, so
    * this method assumes there is at least 1 document in index.
    *
    * @param prop - name of property which has binary index
    * @param val - value to find within index
    * @param [adaptive] - if true, we will return insert position
    */
  def calculateRangeStart(prop: java.lang.String, `val`: js.Any): scala.Double = js.native
  def calculateRangeStart(prop: java.lang.String, `val`: js.Any, adaptive: scala.Boolean): scala.Double = js.native
  /**
    * Chain method, used for beginning a series of chained find() and/or view() operations
    * on a collection.
    *
    * @param [transform] - Ordered array of transform step objects similar to chain
    * @param [parameters] - Object containing properties representing parameters to substitute
    * @returns (this) resultset, or data array if any map or join functions where called
    */
  def chain(): Resultset[E with LokiObj] = js.native
  def chain(transform: java.lang.String): Resultset[_] = js.native
  def chain(transform: java.lang.String, parameters: js.Object): Resultset[_] = js.native
  def chain(transform: js.Array[java.lang.String | Transform]): Resultset[_] = js.native
  def chain(transform: js.Array[java.lang.String | Transform], parameters: js.Object): Resultset[_] = js.native
  /**
    * Perform checks to determine validity/consistency of all binary indices
    * @param [options] - optional configuration object
    * @param [options.randomSampling] - whether (faster) random sampling should be used
    * @param [options.randomSamplingFactor] - percentage of total rows to randomly sample
    * @param [options.repair] - whether to fix problems if they are encountered
    */
  def checkAllIndexes(): js.Array[java.lang.String] = js.native
  def checkAllIndexes(options: stdLib.Partial[CheckIndexOptions]): js.Array[java.lang.String] = js.native
  /**
    * Perform checks to determine validity/consistency of a binary index
    * @param property - name of the binary-indexed property to check
    * @param [options] optional configuration object
    * @param [options.randomSampling] - whether (faster) random sampling should be used
    * @param [options.randomSamplingFactor] - percentage of total rows to randomly sample
    * @param [options.repair] - whether to fix problems if they are encountered
    */
  def checkIndex(property: java.lang.String): scala.Boolean = js.native
  def checkIndex(property: java.lang.String, options: stdLib.Partial[CheckIndexOptions]): scala.Boolean = js.native
  /**
    * Empties the collection.
    * @param [options] - configure clear behavior
    * @param [options.removeIndices] - (default: false)
    */
  def clear(): scala.Unit = js.native
  def clear(options: Anon_RemoveIndices): scala.Unit = js.native
  /** commit the transation */
  def commit(): scala.Unit = js.native
  /**
    * (Staging API) re-attach all objects to the original collection, so indexes and views can be rebuilt
    * then create a message to be inserted in the commitlog
    * @param stageName - name of stage
    * @param message
    */
  def commitStage(stageName: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
    * Will allow reconfiguring certain collection options.
    * @param [options.adaptiveBinaryIndices] - collection indices will be actively rebuilt rather than lazily
    */
  def configureOptions(): scala.Unit = js.native
  def configureOptions(options: Anon_AdaptiveBinaryIndices): scala.Unit = js.native
  /**
    * Quickly determine number of documents in collection (or query)
    * @param [query] - (optional) query object to count results of
    * @returns number of documents in the collection
    */
  def count(): scala.Double = js.native
  def count(query: LokiQuery[E with LokiObj]): scala.Double = js.native
  /**
    * Ensure all binary indices
    */
  def ensureAllIndexes(): scala.Unit = js.native
  def ensureAllIndexes(force: scala.Boolean): scala.Unit = js.native
  /**
    * Rebuild idIndex
    */
  def ensureId(): scala.Unit = js.native
  /**
    * Rebuild idIndex async with callback - useful for background syncing with a remote server
    */
  def ensureIdAsync(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Ensure binary index on a certain field
    * @param property - name of property to create binary index on
    * @param [force] - (Optional) flag indicating whether to construct index immediately
    */
  def ensureIndex(property: java.lang.String): scala.Unit = js.native
  def ensureIndex(property: java.lang.String, force: scala.Boolean): scala.Unit = js.native
  def ensureUniqueIndex(field: java.lang.String): UniqueIndex[E] = js.native
  def eqJoin(joinData: js.Array[_], leftJoinProp: java.lang.String, rightJoinProp: java.lang.String): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: java.lang.String
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: js.Array[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  /**
    * Join two collections on specified properties
    *
    * @param joinData - array of documents to 'join' to this collection
    * @param leftJoinProp - property name in collection
    * @param rightJoinProp - property name in joinData
    * @param mapFun - (Optional) map function to use
    * @param dataOptions - options to data() before input to your map function
    * @param [dataOptions.removeMeta] - allows removing meta before calling mapFun
    * @param [dataOptions.forceClones] - forcing the return of cloned objects to your map object
    * @param [dataOptions.forceCloneMethod] - Allows overriding the default or collection specified cloning method.
    * @returns Result of the mapping operation
    */
  def eqJoin(joinData: Collection[_], leftJoinProp: java.lang.String, rightJoinProp: java.lang.String): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: java.lang.String
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Collection[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  def eqJoin(joinData: Resultset[_], leftJoinProp: java.lang.String, rightJoinProp: java.lang.String): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinProp: java.lang.String,
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: java.lang.String
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: java.lang.String,
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _]
  ): Resultset[_] = js.native
  def eqJoin(
    joinData: Resultset[_],
    leftJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    rightJoinProp: js.Function1[/* obj */ js.Any, java.lang.String],
    mapFun: js.Function2[/* left */ js.Any, /* right */ js.Any, _],
    dataOptions: stdLib.Partial[GetDataOptions]
  ): Resultset[_] = js.native
  def extract(field: java.lang.String): js.Array[_] = js.native
  def extractNumerical(field: java.lang.String): js.Array[scala.Double] = js.native
  /**
    * Find method, api is similar to mongodb.
    * for more complex queries use [chain()]{@link Collection#chain} or [where()]{@link Collection#where}.
    * @example {@tutorial Query Examples}
    * @param query - 'mongo-like' query object
    * @returns Array of matching documents
    */
  def find(): js.Array[E with LokiObj] = js.native
  def find(query: LokiQuery[E with LokiObj]): js.Array[E with LokiObj] = js.native
  /**
    * Applies a 'mongo-like' find query object removes all documents which match that filter.
    *
    * @param filterObject - 'mongo-like' query object
    */
  def findAndRemove(): scala.Unit = js.native
  def findAndRemove(filterObject: LokiQuery[E with LokiObj]): scala.Unit = js.native
  /**
    * Applies a 'mongo-like' find query object and passes all results to an update function.
    * For filter function querying you should migrate to [updateWhere()]{@link Collection#updateWhere}.
    *
    * @param filterObject - 'mongo-like' query object (or deprecated filterFunction mode)
    * @param updateFunction - update function to run against filtered documents
    */
  def findAndUpdate(
    filterObject: js.Function1[/* data */ E, scala.Boolean],
    updateFunction: js.Function1[/* obj */ E with LokiObj, _]
  ): scala.Unit = js.native
  def findAndUpdate(filterObject: LokiQuery[E with LokiObj], updateFunction: js.Function1[/* obj */ E with LokiObj, _]): scala.Unit = js.native
  def findObject(template: js.Object): E | scala.Null = js.native
  def findObjects(template: js.Object): js.Array[E] = js.native
  /**
    * Find one object by index property, by property equal to value
    * @param query - query object used to perform search with
    * @returns First matching document, or null if none
    */
  def findOne(): (E with LokiObj) | scala.Null = js.native
  def findOne(query: LokiQuery[E with LokiObj]): (E with LokiObj) | scala.Null = js.native
  /**
    * Find object by unindexed field by property equal to value,
    * simply iterates and returns the first element matching the query
    */
  def findOneUnindexed(prop: java.lang.String, value: js.Any): (E with LokiObj) | scala.Null = js.native
  def flagBinaryIndexDirty(index: java.lang.String): scala.Unit = js.native
  def flagBinaryIndexesDirty(): scala.Unit = js.native
  def flushChanges(): scala.Unit = js.native
  def get(id: scala.Double): (E with LokiObj) | (js.Tuple2[E with LokiObj, scala.Double]) | scala.Null = js.native
  def get(id: scala.Double, returnPosition: lokijsLib.lokijsLibNumbers.`true`): js.Tuple2[E with LokiObj, scala.Double] = js.native
  def get(id: scala.Double, returnPosition: scala.Boolean): (E with LokiObj) | (js.Tuple2[E with LokiObj, scala.Double]) | scala.Null = js.native
  /**
    * Perform binary range lookup for the data[dataPosition][binaryIndexName] property value
    *    Since multiple documents may contain the same value (which the index is sorted on),
    *    we hone in on range and then linear scan range to find exact index array position.
    * @param dataPosition : coll.data array index/position
    * @param binaryIndexName : index to search for dataPosition in
    */
  def getBinaryIndexPosition(dataPosition: scala.Double, binaryIndexName: java.lang.String): scala.Double | scala.Null = js.native
  def getChangeDelta(obj: js.Any): js.Any = js.native
  def getChangeDelta(obj: js.Any, old: js.Any): js.Any = js.native
  def getChanges(): js.Array[CollectionChange] = js.native
  /**
    * Look up dynamic view reference from within the collection
    * @param name - name of dynamic view to retrieve reference of
    * @returns A reference to the dynamic view with that name
    **/
  def getDynamicView(name: java.lang.String): DynamicView[_] | scala.Null = js.native
  def getObjectDelta(oldObject: js.Any): js.Any = js.native
  def getObjectDelta(oldObject: js.Any, newObject: js.Any): js.Any = js.native
  def getSequencedIndexValues(property: java.lang.String): java.lang.String = js.native
  /**
    * (Staging API) create a stage and/or retrieve it
    */
  def getStage(name: java.lang.String): js.Any = js.native
  /**
    * Retrieves a named transform from the collection.
    * @param name - name of the transform to lookup.
    */
  def getTransform(name: java.lang.String): js.Array[Transform] = js.native
  /*---------------------+
    | Finding methods     |
    +----------------------*/
  /**
    * Get by Id - faster than other methods because of the searching algorithm
    * @param id - $loki id of document you want to retrieve
    * @param returnPosition - if 'true' we will return [object, position]
    * @returns Object reference if document was found, null if not,
    *     or an array if 'returnPosition' was passed.
    */
  @JSName("get")
  def `get_<intersection>`(id: scala.Double): E with LokiObj = js.native
  /**
    * Adds object(s) to collection, ensure object(s) have meta properties, clone it if necessary, etc.
    * @param doc - the document (or array of documents) to be inserted
    * @returns document or documents inserted
    * @example
    * users.insert({
    *     name: 'Odin',
    *     age: 50,
    *     address: 'Asgard'
    * });
    *
    * // alternatively, insert array of documents
    * users.insert([{ name: 'Thor', age: 35}, { name: 'Loki', age: 30}]);
    */
  def insert(doc: E): js.UndefOr[E] = js.native
  def insert(doc: js.Array[E]): js.UndefOr[js.Array[E]] = js.native
  /**
    * Adds a single object, ensures it has meta properties, clone it if necessary, etc.
    * @param doc - the document to be inserted
    * @param [bulkInsert] - quiet pre-insert and insert event emits
    * @returns document or 'undefined' if there was a problem inserting it
    */
  def insertOne(doc: E): js.UndefOr[E with LokiObj] = js.native
  def insertOne(doc: E, bulkInsert: scala.Boolean): js.UndefOr[E with LokiObj] = js.native
  /**
    * Map Reduce operation
    *
    * @param mapFunction - function to use as map function
    * @param reduceFunction - function to use as reduce function
    * @returns The result of your mapReduce operation
    */
  def mapReduce[U, R](
    mapFunction: js.Function3[/* value */ E, /* index */ scala.Double, /* array */ js.Array[E], U],
    reduceFunction: js.Function1[/* ary */ js.Array[U], R]
  ): R = js.native
  def max(field: java.lang.String): scala.Double = js.native
  def maxRecord(field: java.lang.String): Anon_Index = js.native
  /**
    * @param field - property name
    */
  def median(field: java.lang.String): scala.Double = js.native
  def min(field: java.lang.String): scala.Double = js.native
  def minRecord(field: java.lang.String): Anon_Index = js.native
  /**
    * @param field
    */
  def mode(field: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def no_op(): scala.Unit = js.native
  def observerCallback(changes: js.Array[Anon_Object]): scala.Unit = js.native
  /*----------------------------+
    | INDEXING                    |
    +----------------------------*/
  /**
    * create a row filter that covers all documents in the collection
    */
  def prepareFullDocIndex(): js.Array[scala.Double] = js.native
  def remove(doc: E): E | scala.Null = js.native
  def remove(doc: js.Array[scala.Double | E]): E | scala.Null | scala.Unit = js.native
  /**
    * Remove a document from the collection
    * @param doc - document to remove from collection
    */
  def remove(doc: scala.Double): E | scala.Null = js.native
  def removeAutoUpdateObserver(obj: js.Any): scala.Unit = js.native
  def removeDataOnly(): scala.Unit = js.native
  /**
    * Remove a dynamic view from the collection
    * @param name - name of dynamic view to remove
    **/
  def removeDynamicView(name: java.lang.String): scala.Unit = js.native
  /**
    * Removes a named collection transform from the collection
    * @param name - name of collection transform to remove
    */
  def removeTransform(name: java.lang.String): scala.Unit = js.native
  /**
    * Remove all documents matching supplied filter function.
    * For 'mongo-like' querying you should migrate to [findAndRemove()]{@link Collection#findAndRemove}.
    * @param query - query object to filter on
    */
  def removeWhere(
    query: js.Function3[/* value */ E, /* index */ scala.Double, /* array */ js.Array[E], scala.Boolean]
  ): scala.Unit = js.native
  def removeWhere(query: LokiQuery[E with LokiObj]): scala.Unit = js.native
  @JSName("remove")
  def remove_Unit(doc: js.Array[scala.Double | E]): scala.Unit = js.native
  /** roll back the transation */
  def rollback(): scala.Unit = js.native
  def setChangesApi(): scala.Unit = js.native
  def setChangesApi(enabled: scala.Boolean): scala.Unit = js.native
  /**
    * Updates or applies collection TTL settings.
    * @param age - age (in ms) to expire document from collection
    * @param interval - time (in ms) to clear collection of aged documents.
    */
  def setTTL(age: scala.Double, interval: scala.Double): scala.Unit = js.native
  /**
    * Updates a named collection transform to the collection
    * @param name - name to associate with transform
    * @param transform - a transformation object to save into collection
    */
  def setTransform(name: java.lang.String, transform: js.Array[Transform]): scala.Unit = js.native
  /**
    * (Staging API) create a copy of an object and insert it into a stage
    */
  def stage[F /* <: E */](stageName: java.lang.String, obj: F): F = js.native
  /**
    * Transaction methods
    */
  /** start the transation */
  def startTransaction(): scala.Unit = js.native
  /**
    * Calculate standard deviation of a field
    * @param field
    */
  def stdDev(field: java.lang.String): scala.Double = js.native
  /*----------------------------+
    | TTL daemon                  |
    +----------------------------*/
  def ttlDaemonFuncGen(): js.Function0[scala.Unit] = js.native
  def update(doc: E): E | scala.Unit = js.native
  def update(doc: js.Array[E]): E | scala.Unit = js.native
  /**
    * Applies a filter function and passes all results to an update function.
    *
    * @param filterFunction - filter function whose results will execute update
    * @param updateFunction - update function to run against filtered documents
    */
  def updateWhere(
    filterFunction: js.Function1[/* data */ E, scala.Boolean],
    updateFunction: js.Function1[/* obj */ E with LokiObj, _]
  ): scala.Unit = js.native
  /**
    * Updates an object and notifies collection that the document has changed.
    * @param doc - document to update within the collection
    */
  @JSName("update")
  def update_E(doc: E): E = js.native
  @JSName("update")
  def update_Unit(doc: js.Array[E]): scala.Unit = js.native
  /**
    * Query the collection by supplying a javascript filter function.
    * @example
    * var results = coll.where(function(obj) {
    *   return obj.legs === 8;
    * });
    *
    * @param fun - filter function to run against all collection docs
    * @returns all documents which pass your filter function
    */
  def where(fun: js.Function1[/* data */ E, scala.Boolean]): js.Array[E with LokiObj] = js.native
}

