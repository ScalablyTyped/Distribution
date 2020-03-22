package typings.jsData.collectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsData.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection
  extends typings.jsData.componentMod.default {
  var emit: js.Any = js.native
  var emitRecordEvents: js.Any = js.native
  var idAttribute: js.Any = js.native
  /**
    * The main index, which uses @{link Collection#recordId} as the key.
    *
    * @name Collection#index
    * @type {Index}
    */
  var index: typings.jsData.mindexMod.default = js.native
  /**
    * Object that holds the secondary indexes of this collection.
    *
    * @name Collection#indexes
    * @type {Object.<string, Index>}
    */
  var indexes: StringDictionary[typings.jsData.mindexMod.default] = js.native
  /**
    * Default Mapper for this collection. Optional. If a Mapper is provided, then
    * the collection will use the {@link Mapper#idAttribute} setting, and will
    * wrap records in {@link Mapper#recordClass}.
    *
    * @example <caption>Collection#mapper</caption>
    * const JSData = require('js-data');
    * const {Collection, Mapper} = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * class MyMapperClass extends Mapper {
    *   foo () { return 'bar'; }
    * }
    * const myMapper = new MyMapperClass({ name: 'myMapper' });
    * const collection = new Collection(null, { mapper: myMapper });
    *
    * @name Collection#mapper
    * @type {Mapper}
    * @default null
    * @since 3.0.0
    */
  var mapper: js.Any = js.native
  var onConflict: String = js.native
  var queryClass: js.Any = js.native
  /**
    * Used to bind to events emitted by records in this Collection.
    *
    * @method Collection#_onRecordEvent
    * @since 3.0.0
    * @private
    * @param {...*} [args] Args passed to {@link Collection#emit}.
    */
  def _onRecordEvent(args: js.Any*): Unit = js.native
  /**
    * Insert the provided record or records.
    *
    * If a record is already in the collection then the provided record will
    * either merge with or replace the existing record based on the value of the
    * `onConflict` option.
    *
    * The collection's secondary indexes will be updated as each record is
    * visited.
    *
    * @method Collection#add
    * @since 3.0.0
    * @param {(Object|Object[]|Record|Record[])} records The record or records to insert.
    * @param {object} [opts] Configuration options.
    * @param {boolean} [opts.commitOnMerge=true] See {@link Collection#commitOnMerge}.
    * @param {boolean} [opts.noValidate] See {@link Record#noValidate}.
    * @param {string} [opts.onConflict] See {@link Collection#onConflict}.
    * @returns {(Object|Object[]|Record|Record[])} The added record or records.
    */
  def add(records: js.Any): js.Any = js.native
  def add(records: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Lifecycle hook called by {@link Collection#add}. If this method returns a
    * value then {@link Collection#add} will return that same value.
    *
    * @method Collection#method
    * @since 3.0.0
    * @param {(Object|Object[]|Record|Record[])} record The record or records
    * that were added to this Collection by {@link Collection#add}.
    * @param {object} opts The `opts` argument passed to {@link Collection#add}.
    * @param result
    */
  def afterAdd(record: js.Any, opts: js.Any, result: js.Any): js.Any = js.native
  /**
    * Lifecycle hook called by {@link Collection#remove}. If this method returns
    * a value then {@link Collection#remove} will return that same value.
    *
    * @method Collection#afterRemove
    * @since 3.0.0
    * @param {(string|number)} id The `id` argument passed to {@link Collection#remove}.
    * @param {object} opts The `opts` argument passed to {@link Collection#remove}.
    * @param {object} record The result that will be returned by {@link Collection#remove}.
    */
  def afterRemove(id: js.Any, opts: js.Any, record: js.Any): js.Any = js.native
  /**
    * Lifecycle hook called by {@link Collection#removeAll}. If this method
    * returns a value then {@link Collection#removeAll} will return that same
    * value.
    *
    * @method Collection#afterRemoveAll
    * @since 3.0.0
    * @param {object} query The `query` argument passed to {@link Collection#removeAll}.
    * @param {object} opts The `opts` argument passed to {@link Collection#removeAll}.
    * @param {object} records The result that will be returned by {@link Collection#removeAll}.
    */
  def afterRemoveAll(query: js.Any, opts: js.Any, records: js.Any): js.Any = js.native
  /**
    * Lifecycle hook called by {@link Collection#add}. If this method returns a
    * value then the `records` argument in {@link Collection#add} will be
    * re-assigned to the returned value.
    *
    * @method Collection#beforeAdd
    * @since 3.0.0
    * @param {(Object|Object[]|Record|Record[])} records The `records` argument passed to {@link Collection#add}.
    * @param {object} opts The `opts` argument passed to {@link Collection#add}.
    */
  def beforeAdd(records: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Lifecycle hook called by {@link Collection#remove}.
    *
    * @method Collection#beforeRemove
    * @since 3.0.0
    * @param {(string|number)} id The `id` argument passed to {@link Collection#remove}.
    * @param {object} opts The `opts` argument passed to {@link Collection#remove}.
    */
  def beforeRemove(id: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Lifecycle hook called by {@link Collection#removeAll}.
    *
    * @method Collection#beforeRemoveAll
    * @since 3.0.0
    * @param {object} query The `query` argument passed to {@link Collection#removeAll}.
    * @param {object} opts The `opts` argument passed to {@link Collection#removeAll}.
    */
  def beforeRemoveAll(query: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Find all records between two boundaries.
    *
    * Shortcut for `collection.query().between(18, 30, { index: 'age' }).run()`
    *
    * @example
    * // Get all users ages 18 to 30
    * const users = collection.between(18, 30, { index: 'age' });
    *
    * @example
    * // Same as above
    * const users = collection.between([18], [30], { index: 'age' });
    *
    * @method Collection#between
    * @since 3.0.0
    * @param {array} leftKeys Keys defining the left boundary.
    * @param {array} rightKeys Keys defining the right boundary.
    * @param {object} [opts] Configuration options.
    * @param {string} [opts.index] Name of the secondary index to use in the
    * query. If no index is specified, the main index is used.
    * @param {boolean} [opts.leftInclusive=true] Whether to include records
    * on the left boundary.
    * @param {boolean} [opts.rightInclusive=false] Whether to include records
    * on the left boundary.
    * @param {boolean} [opts.limit] Limit the result to a certain number.
    * @param {boolean} [opts.offset] The number of resulting records to skip.
    * @returns {Object[]|Record[]} The result.
    */
  def between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Create a new secondary index on the contents of the collection.
    *
    * @example
    * // Index users by age
    * collection.createIndex('age');
    *
    * @example
    * // Index users by status and role
    * collection.createIndex('statusAndRole', ['status', 'role']);
    *
    * @method Collection#createIndex
    * @since 3.0.0
    * @param {string} name The name of the new secondary index.
    * @param {string[]} [fieldList] Array of field names to use as the key or
    * compound key of the new secondary index. If no fieldList is provided, then
    * the name will also be the field that is used to index the collection.
    * @param opts
    */
  def createIndex(name: js.Any): Unit = js.native
  def createIndex(name: js.Any, fieldList: js.Any): Unit = js.native
  def createIndex(name: js.Any, fieldList: js.Any, opts: js.Any): Unit = js.native
  /**
    * Find the record or records that match the provided query or pass the
    * provided filter function.
    *
    * Shortcut for `collection.query().filter(queryOrFn[, thisArg]).run()`
    *
    * @example <caption>Collection#filter</caption>
    * const JSData = require('js-data');
    * const { Collection } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const collection = new Collection([
    *   { id: 1, status: 'draft', created_at_timestamp: new Date().getTime() }
    * ]);
    *
    * // Get the draft posts created less than three months ago
    * let posts = collection.filter({
    *   where: {
    *     status: {
    *       '==': 'draft'
    *     },
    *     created_at_timestamp: {
    *       '>=': (new Date().getTime() - (1000 \* 60 \* 60 \* 24 \* 30 \* 3)) // 3 months ago
    *     }
    *   }
    * });
    * console.log(posts);
    *
    * // Use a custom filter function
    * posts = collection.filter((post) => post.id % 2 === 0);
    *
    * @method Collection#filter
    * @param {(Object|Function)} [queryOrFn={}] Selection query or filter
    * function.
    * @param {object} [thisArg] Context to which to bind `queryOrFn` if
    * `queryOrFn` is a function.
    * @returns {Array} The result.
    * @see query
    * @since 3.0.0
    */
  def filter(queryOrFn: js.Any): js.Any = js.native
  def filter(queryOrFn: js.Any, thisArg: js.Any): js.Any = js.native
  /**
    * Iterate over all records.
    *
    * @example
    * collection.forEach(function (record) {
    *   // do something
    * });
    *
    * @method Collection#forEach
    * @since 3.0.0
    * @param {Function} forEachFn Iteration function.
    * @param {*} [thisArg] Context to which to bind `forEachFn`.
    * @returns {Array} The result.
    */
  def forEach(forEachFn: js.Any): Unit = js.native
  def forEach(forEachFn: js.Any, thisArg: js.Any): Unit = js.native
  /**
    * Get the record with the given id.
    *
    * @method Collection#get
    * @since 3.0.0
    * @param {(string|number)} id The primary key of the record to get.
    * @returns {(Object|Record)} The record with the given id.
    */
  def get(id: js.Any): js.Any = js.native
  /**
    * Find the record or records that match the provided keyLists.
    *
    * Shortcut for `collection.query().getAll(keyList1, keyList2, ...).run()`
    *
    * @example
    * // Get the posts where "status" is "draft" or "inReview"
    * const posts = collection.getAll('draft', 'inReview', { index: 'status' });
    *
    * @example
    * // Same as above
    * const posts = collection.getAll(['draft'], ['inReview'], { index: 'status' });
    *
    * @method Collection#getAll
    * @since 3.0.0
    * @param {...Array} [keyList] Provide one or more keyLists, and all
    * records matching each keyList will be retrieved. If no keyLists are
    * provided, all records will be returned.
    * @param {object} [opts] Configuration options.
    * @param {string} [opts.index] Name of the secondary index to use in the
    * query. If no index is specified, the main index is used.
    * @returns {Array} The result.
    */
  def getAll(): js.Any = js.native
  def getAll(keyList: String): js.Any = js.native
  def getAll(keyList: String, args: js.Any*): js.Any = js.native
  def getAll(keyList: String, opts: js.Any): js.Any = js.native
  def getAll(keyList: js.Array[String | Double]): js.Any = js.native
  def getAll(keyList: js.Array[String | Double], args: js.Any*): js.Any = js.native
  def getAll(keyList: js.Array[String | Double], opts: js.Any): js.Any = js.native
  def getAll(keyList: Double): js.Any = js.native
  def getAll(keyList: Double, args: js.Any*): js.Any = js.native
  def getAll(keyList: Double, opts: js.Any): js.Any = js.native
  /**
    * Return the index with the given name. If no name is provided, return the
    * main index. Throws an error if the specified index does not exist.
    *
    * @method Collection#getIndex
    * @since 3.0.0
    * @param {string} [name] The name of the index to retrieve.
    */
  def getIndex(name: js.Any): typings.jsData.mindexMod.default = js.native
  /**
    * Limit the result.
    *
    * Shortcut for `collection.query().limit(maximumNumber).run()`
    *
    * @example
    * const posts = collection.limit(10);
    *
    * @method Collection#limit
    * @since 3.0.0
    * @param {number} num The maximum number of records to keep in the result.
    * @returns {Array} The result.
    */
  def limit(num: js.Any): js.Any = js.native
  /**
    * Apply a mapping function to all records.
    *
    * @example
    * const names = collection.map((user) => user.name);
    *
    * @method Collection#map
    * @since 3.0.0
    * @param {Function} mapFn Mapping function.
    * @param {*} [thisArg] Context to which to bind `mapFn`.
    * @returns {Array} The result of the mapping.
    */
  def map(cb: js.Any, thisArg: js.Any): js.Array[_] = js.native
  /**
    * Return the result of calling the specified function on each record in this
    * collection's main index.
    *
    * @method Collection#mapCall
    * @since 3.0.0
    * @param {string} funcName Name of function to call
    * @param {...*} [args] Remaining arguments to be passed to the function.
    * @returns {Array} The result.
    */
  def mapCall(funcName: js.Any, args: js.Any*): js.Array[_] = js.native
  /**
    * Return all "unsaved" (not uniquely identifiable) records in this colleciton.
    *
    * @method Collection#prune
    * @param {object} [opts] Configuration options, passed to {@link Collection#removeAll}.
    * @since 3.0.0
    * @returns {Array} The removed records, if any.
    */
  def prune(opts: js.Any): js.Any = js.native
  /**
    * Create a new query to be executed against the contents of the collection.
    * The result will be all or a subset of the contents of the collection.
    *
    * @example
    * // Grab page 2 of users between ages 18 and 30
    * collection.query()
    *   .between(18, 30, { index: 'age' }) // between ages 18 and 30
    *   .skip(10) // second page
    *   .limit(10) // page size
    *   .run();
    *
    * @method Collection#query
    * @since 3.0.0
    * @returns {Query} New query object.
    */
  def query(): typings.jsData.queryMod.default = js.native
  /**
    * Return the primary key of the given, or if no record is provided, return the
    * name of the field that holds the primary key of records in this Collection.
    *
    * @method Collection#recordId
    * @since 3.0.0
    * @param {(Object|Record)} [record] The record whose primary key is to be
    * returned.
    * @returns {(string|number)} Primary key or name of field that holds primary
    * key.
    */
  def recordId(): js.Any = js.native
  def recordId(record: js.Any): js.Any = js.native
  /**
    * Reduce the data in the collection to a single value and return the result.
    *
    * @example
    * const totalVotes = collection.reduce((prev, record) => {
    *   return prev + record.upVotes + record.downVotes;
    * }, 0);
    *
    * @method Collection#reduce
    * @since 3.0.0
    * @param {Function} cb Reduction callback.
    * @param {*} initialValue Initial value of the reduction.
    * @returns {*} The result.
    */
  def reduce(cb: js.Any, initialValue: js.Any): js.Any = js.native
  /**
    * Remove the record with the given id from this Collection.
    *
    * @method Collection#remove
    * @since 3.0.0
    * @param {(string|number|object|Record)} idOrRecord The primary key of the
    * record to be removed, or a reference to the record that is to be removed.
    * @param {object} [opts] Configuration options.
    * @returns {Object|Record} The removed record, if any.
    */
  def remove(idOrRecord: js.Any): js.Any = js.native
  def remove(idOrRecord: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Remove from this collection the given records or the records selected by
    * the given "query".
    *
    * @method Collection#removeAll
    * @since 3.0.0
    * @param {Object|Object[]|Record[]} [queryOrRecords={}] Records to be removed or selection query. See {@link query}.
    * @param {object} [queryOrRecords.where] See {@link query.where}.
    * @param {number} [queryOrRecords.offset] See {@link query.offset}.
    * @param {number} [queryOrRecords.limit] See {@link query.limit}.
    * @param {string|Array[]} [queryOrRecords.orderBy] See {@link query.orderBy}.
    * @param {object} [opts] Configuration options.
    * @returns {(Object[]|Record[])} The removed records, if any.
    */
  def removeAll(queryOrRecords: js.Any): js.Any = js.native
  def removeAll(queryOrRecords: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Skip a number of results.
    *
    * Shortcut for `collection.query().skip(numberToSkip).run()`
    *
    * @example
    * const posts = collection.skip(10);
    *
    * @method Collection#skip
    * @since 3.0.0
    * @param {number} num The number of records to skip.
    * @returns {Array} The result.
    */
  def skip(num: js.Any): js.Any = js.native
  /**
    * Return the plain JSON representation of all items in this collection.
    * Assumes records in this collection have a toJSON method.
    *
    * @method Collection#toJSON
    * @since 3.0.0
    * @param {object} [opts] Configuration options.
    * @param {string[]} [opts.with] Array of relation names or relation fields
    * to include in the representation.
    * @returns {Array} The records.
    */
  def toJSON(): js.Array[_] = js.native
  def toJSON(opts: js.Any): js.Array[_] = js.native
  /**
    * Return all "unsaved" (not uniquely identifiable) records in this colleciton.
    *
    * @method Collection#unsaved
    * @since 3.0.0
    * @returns {Array} The unsaved records, if any.
    */
  def unsaved(): js.Any = js.native
  def unsaved(opts: js.Any): js.Any = js.native
  /**
    * Update a record's position in a single index of this collection. See
    * {@link Collection#updateIndexes} to update a record's position in all
    * indexes at once.
    *
    * @method Collection#updateIndex
    * @since 3.0.0
    * @param {object} record The record to update.
    * @param {object} [opts] Configuration options.
    * @param {string} [opts.index] The index in which to update the record's
    * position. If you don't specify an index then the record will be updated
    * in the main index.
    */
  def updateIndex(record: js.Any): Unit = js.native
  def updateIndex(record: js.Any, opts: AnonIndex): Unit = js.native
  /**
    * Updates all indexes in this collection for the provided record. Has no
    * effect if the record is not in the collection.
    *
    * @method Collection#updateIndexes
    * @since 3.0.0
    * @param {object} record TODO
    */
  def updateIndexes(record: js.Any): Unit = js.native
}

