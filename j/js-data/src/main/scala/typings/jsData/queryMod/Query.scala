package typings.jsData.queryMod

import typings.jsData.anon.Fields
import typings.jsData.anon.First
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query
  extends typings.jsData.componentMod.default {
  var collection: js.UndefOr[js.Any] = js.native
  /**
    * The current data result of this query.
    *
    * @name Query#data
    * @since 3.0.0
    * @type {Array}
    */
  var data: js.Any = js.native
  def _applyWhereFromArray(where: js.Any): js.Any = js.native
  def _applyWhereFromObject(where: js.Any): Fields = js.native
  def _testArrayGroup(keep: js.Any, first: js.Any, groups: js.Any, item: js.Any): First = js.native
  def _testObjectGroup(keep: js.Any, first: js.Any, group: js.Any, item: js.Any): First = js.native
  /**
    * Find all entities between two boundaries.
    *
    * @example <caption>Get the users ages 18 to 30.</caption>
    * const JSData = require('js-data');
    * const { DataStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new DataStore();
    * store.defineMapper('user');
    * const users = [
    *   { name: 'Peter', age: 25, id: 1 },
    *   { name: 'Jim', age: 19, id: 2 },
    *   { name: 'Mike', age: 17, id: 3 },
    *   { name: 'Alan', age: 29, id: 4 },
    *   { name: 'Katie', age: 33, id: 5 }
    * ];
    * store.add('user', users)
    * const filteredUsers = store
    *   .query('user')
    *   .between(18, 30, { index: 'age' })
    *   .run();
    * console.log(filteredUsers);
    *
    * @example <caption>Same as above.</caption>
    * const JSData = require('js-data');
    * const { DataStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new DataStore();
    * store.defineMapper('user');
    * const users = [
    *   { name: 'Peter', age: 25, id: 1 },
    *   { name: 'Jim', age: 19, id: 2 },
    *   { name: 'Mike', age: 17, id: 3 },
    *   { name: 'Alan', age: 29, id: 4 },
    *   { name: 'Katie', age: 33, id: 5 }
    * ];
    * store.add('user', users)
    * const filteredUsers = store
    *   .query('user')
    *   .between([18], [30], { index: 'age' })
    *   .run();
    * console.log(filteredUsers);
    *
    * @method Query#between
    * @param {array} leftKeys Keys defining the left boundary.
    * @param {array} rightKeys Keys defining the right boundary.
    * @param {object} [opts] Configuration options.
    * @param {string} [opts.index] Name of the secondary index to use in the
    * query. If no index is specified, the main index is used.
    * @param {boolean} [opts.leftInclusive=true] Whether to include entities
    * on the left boundary.
    * @param {boolean} [opts.rightInclusive=false] Whether to include entities
    * on the left boundary.
    * @param {boolean} [opts.limit] Limit the result to a certain number.
    * @param {boolean} [opts.offset] The number of resulting entities to skip.
    * @returns {Query} A reference to itself for chaining.
    * @since 3.0.0
    */
  def between(): this.type = js.native
  def between(leftKeys: js.Any): this.type = js.native
  def between(leftKeys: js.Any, rightKeys: js.Any): this.type = js.native
  def between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): this.type = js.native
  /**
    * The comparison function used by the {@link Query} class.
    *
    * @method Query#compare
    * @param {array} orderBy An orderBy clause used for sorting and sub-sorting.
    * @param {number} index The index of the current orderBy clause being used.
    * @param {*} a The first item in the comparison.
    * @param {*} b The second item in the comparison.
    * @returns {number} -1 if `b` should preceed `a`. 0 if `a` and `b` are equal.
    * 1 if `a` should preceed `b`.
    * @since 3.0.0
    */
  def compare(orderBy: js.Any, index: js.Any, a: js.Any, b: js.Any, compare: js.Any): js.Any = js.native
  /**
    * Predicate evaluation function used by the {@link Query} class.
    *
    * @method Query#evaluate
    * @param {*} value The value to evaluate.
    * @param {string} op The operator to use in this evaluation.
    * @param {*} predicate The predicate to use in this evaluation.
    * @returns {boolean} Whether the value passed the evaluation or not.
    * @since 3.0.0
    */
  def evaluate(value: js.Any, op: js.Any, predicate: js.Any): js.Any = js.native
  /**
    * Find the record or records that match the provided query or are accepted by
    * the provided filter function.
    *
    * @example <caption>Get the draft posts by authors younger than 30</caption>
    * const JSData = require('js-data');
    * const { DataStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new DataStore();
    * store.defineMapper('post')
    * const posts = [
    *   { author: 'John', age: 30, status: 'published', id: 1 },
    *   { author: 'Sally', age: 31, status: 'published', id: 2 },
    *   { author: 'Mike', age: 32, status: 'draft', id: 3 },
    *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
    *   { author: 'Adam', age: 33, status: 'published', id: 5 }
    *   { author: 'Peter', age: 25, status: 'deleted', id: 6 },
    *   { author: 'Sally', age: 21, status: 'draft', id: 7 },
    *   { author: 'Jim', age: 27, status: 'draft', id: 8 },
    *   { author: 'Jim', age: 27, status: 'published', id: 9 },
    *   { author: 'Jason', age: 55, status: 'published', id: 10 }
    * ];
    * store.add('post', posts);
    * const results = store
    *   .query('post')
    *   .filter({
    *     where: {
    *       status: {
    *         '==': 'draft'
    *       },
    *       age: {
    *         '<': 30
    *       }
    *     }
    *   })
    *   .run();
    * console.log(results);
    *
    * @example <caption>Use a custom filter function</caption>
    * const posts = query
    *   .filter(function (post) {
    *     return post.isReady();
    *   })
    *   .run();
    *
    * @method Query#filter
    * @param {(Object|Function)} [query={}] Selection query or filter
    * function.
    * @param {Function} [thisArg] Context to which to bind `queryOrFn` if
    * `queryOrFn` is a function.
    * @returns {Query} A reference to itself for chaining.
    * @since 3.0.0
    */
  def filter(): Query = js.native
  def filter(query: QueryDefinition): Query = js.native
  def filter(query: QueryDefinition, thisArg: js.Function): Query = js.native
  /**
    * Iterate over all entities.
    *
    * @method Query#forEach
    * @param {Function} forEachFn Iteration function.
    * @param {*} [thisArg] Context to which to bind `forEachFn`.
    * @returns {Query} A reference to itself for chaining.
    * @since 3.0.0
    */
  def forEach(forEachFn: js.Function): this.type = js.native
  def forEach(forEachFn: js.Function, thisArg: js.Any): this.type = js.native
  /**
    * Find the entity or entities that match the provided key.
    *
    * @example <caption>Get the entity whose primary key is 25.</caption>
    * const entities = query.get(25).run();
    *
    * @example <caption>Same as above.</caption>
    * const entities = query.get([25]).run();
    *
    * @example <caption>Get all users who are active and have the "admin" role.</caption>
    * const activeAdmins = query.get(['active', 'admin'], {
    *   index: 'activityAndRoles'
    * }).run();
    *
    * @example <caption>Get all entities that match a certain weather condition.</caption>
    * const niceDays = query.get(['sunny', 'humid', 'calm'], {
    *   index: 'weatherConditions'
    * }).run();
    *
    * @method Query#get
    * @param {array} keyList Key(s) defining the entity to retrieve. If
    * `keyList` is not an array (i.e. for a single-value key), it will be
    * wrapped in an array.
    * @param {object} [opts] Configuration options.
    * @param {string} [opts.string] Name of the secondary index to use in the
    * query. If no index is specified, the main index is used.
    * @returns {Query} A reference to itself for chaining.
    * @since 3.0.0
    */
  def get(): this.type = js.native
  def get(keyList: js.Array[_]): this.type = js.native
  def get(keyList: js.Array[_], opts: js.Any): this.type = js.native
  /**
    * Find the entity or entities that match the provided keyLists.
    *
    * @example <caption>Get the posts where "status" is "draft" or "inReview".</caption>
    * const posts = query.getAll('draft', 'inReview', { index: 'status' }).run();
    *
    * @example <caption>Same as above.</caption>
    * const posts = query.getAll(['draft'], ['inReview'], { index: 'status' }).run();
    *
    * @method Query#getAll
    * @param {...Array} [keyList] Provide one or more keyLists, and all
    * entities matching each keyList will be retrieved. If no keyLists are
    * provided, all entities will be returned.
    * @param {object} [opts] Configuration options.
    * @param {string} [opts.index] Name of the secondary index to use in the
    * query. If no index is specified, the main index is used.
    * @returns {Query} A reference to itself for chaining.
    * @since 3.0.0
    */
  def getAll(): js.Any = js.native
  def getAll(keyList: js.Array[js.Any]): js.Any = js.native
  def getAll(keyList: js.Array[js.Any], opts: js.Any): js.Any = js.native
  /**
    * Return the current data result of this query.
    *
    * @method Query#getData
    * @returns {Array} The data in this query.
    * @since 3.0.0
    */
  def getData(): js.Any = js.native
  /**
    * Implementation used by the `like` operator. Takes a pattern and flags and
    * returns a `RegExp` instance that can test strings.
    *
    * @method Query#like
    * @param {string} pattern Testing pattern.
    * @param {string} flags Flags for the regular expression.
    * @returns {RegExp} Regular expression for testing strings.
    * @since 3.0.0
    */
  def like(pattern: js.Any, flags: js.Any): RegExp = js.native
  /**
    * Limit the result.
    *
    * @example <caption>Get only the first 2 posts.</caption>
    * const store = new JSData.DataStore();
    * store.defineMapper('post');
    * const posts = [
    *   { author: 'John', age: 30, status: 'published', id: 1 },
    *   { author: 'Sally', age: 31, status: 'draft', id: 2 },
    *   { author: 'Mike', age: 32, status: 'draft', id: 3 },
    *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
    *   { author: 'Adam', age: 33, status: 'draft', id: 5 }
    * ];
    * store.add('post', posts);
    * const results = store.query('post').limit(2).run();
    * console.log(results);
    *
    * @method Query#limit
    * @param {number} num The maximum number of entities to keep in the result.
    * @returns {Query} A reference to itself for chaining.
    * @since 3.0.0
    */
  def limit(num: js.Any): this.type = js.native
  /**
    * Apply a mapping function to the result data.
    *
    * @example
    * const JSData = require('js-data');
    * const { DataStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new DataStore();
    * store.defineMapper('user');
    * const users = [
    *   { name: 'Peter', age: 25, id: 1 },
    *   { name: 'Jim', age: 19, id: 2 },
    *   { name: 'Mike', age: 17, id: 3 },
    *   { name: 'Alan', age: 29, id: 4 },
    *   { name: 'Katie', age: 33, id: 5 }
    * ];
    * store.add('user', users);
    * const ages = store
    *   .query('user')
    *   .map(function (user) {
    *     return user.age;
    *   })
    *   .run();
    * console.log(ages);
    *
    * @method Query#map
    * @param {Function} mapFn Mapping function.
    * @param {*} [thisArg] Context to which to bind `mapFn`.
    * @returns {Query} A reference to itself for chaining.
    * @since 3.0.0
    */
  def map(mapFn: js.Any): this.type = js.native
  def map(mapFn: js.Any, thisArg: js.Any): this.type = js.native
  /**
    * Return the result of calling the specified function on each item in this
    * collection's main index.
    *
    * @example
    * const stringAges = UserCollection.query().mapCall('toString').run();
    *
    * @method Query#mapCall
    * @param {string} funcName Name of function to call
    * @param args Remaining arguments to be passed to the function.
    * @returns {Query} A reference to itself for chaining.
    * @since 3.0.0
    */
  def mapCall(funcName: js.Any, args: js.Any*): this.type = js.native
  /**
    * Complete the execution of the query and return the resulting data.
    *
    * @method Query#run
    * @returns {Array} The result of executing this query.
    * @since 3.0.0
    */
  def run(): js.Any = js.native
  /**
    * Skip a number of results.
    *
    * @example <caption>Get all but the first 2 posts.</caption>
    * const JSData = require('js-data');
    * const { DataStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new DataStore();
    * store.defineMapper('post');
    * const posts = [
    *   { author: 'John', age: 30, status: 'published', id: 1 },
    *   { author: 'Sally', age: 31, status: 'draft', id: 2 },
    *   { author: 'Mike', age: 32, status: 'draft', id: 3 },
    *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
    *   { author: 'Adam', age: 33, status: 'draft', id: 5 }
    * ];
    * store.add('post', posts);
    * const results = store.query('post').skip(2).run();
    * console.log(results);
    *
    * @method Query#skip
    * @param {number} num The number of entities to skip.
    * @returns {Query} A reference to itself for chaining.
    * @since 3.0.0
    */
  def skip(num: js.Any): this.type = js.native
}

