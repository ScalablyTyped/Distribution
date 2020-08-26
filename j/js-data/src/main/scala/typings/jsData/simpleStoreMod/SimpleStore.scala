package typings.jsData.simpleStoreMod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.jsData.collectionMod.CollectionOpts
import typings.jsData.containerMod.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleStore extends Container {
  var _collections: StringDictionary[typings.jsData.collectionMod.default] = js.native
  var collectionClass: Instantiable2[
    /* records */ js.UndefOr[js.Any], 
    /* opts */ js.UndefOr[CollectionOpts | String | js.Any], 
    typings.jsData.collectionMod.default
  ] = js.native
  var usePendingFind: Boolean = js.native
  var usePendingFindAll: Boolean = js.native
  /**
    * Internal method used to handle Mapper responses.
    *
    * @method SimpleStore#_end
    * @private
    * @param {string} name Name of the {@link Collection} to which to
    * add the data.
    * @param {object} result The result from a Mapper.
    * @param {object} [opts] Configuration options.
    * @returns {(Object|Array)} Result.
    */
  def _end(name: js.Any, result: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Register a new event listener on this SimpleStore.
    *
    * Proxy for {@link Container#on}. If an event was emitted by a Mapper or
    * Collection in the SimpleStore, then the name of the Mapper or Collection will
    * be prepended to the arugments passed to the provided event handler.
    *
    * @example
    * // Listen for all "afterCreate" events in a SimpleStore
    * store.on('afterCreate', (mapperName, props, opts, result) => {
    *   console.log(mapperName); // "post"
    *   console.log(props.id); // undefined
    *   console.log(result.id); // 1234
    * });
    * store.create('post', { title: 'Modeling your data' }).then((post) => {
    *   console.log(post.id); // 1234
    * });
    *
    * @example
    * // Listen for the "add" event on a collection
    * store.on('add', (mapperName, records) => {
    *   console.log(records); // [...]
    * });
    *
    * @example
    * // Listen for "change" events on a record
    * store.on('change', (mapperName, record, changes) => {
    *   console.log(changes); // { changed: { title: 'Modeling your data' } }
    * });
    * post.title = 'Modeling your data';
    *
    * @method SimpleStore#on
    * @param {string} event Name of event to subsribe to.
    * @param {Function} listener Listener function to handle the event.
    * @param {*} [ctx] Optional content in which to invoke the listener.
    */
  /**
    * Used to bind to events emitted by collections in this store.
    *
    * @method SimpleStore#_onCollectionEvent
    * @private
    * @param {string} name Name of the collection that emitted the event.
    * @param {...*} [args] Args passed to {@link Collection#emit}.
    */
  def _onCollectionEvent(name: js.Any, args: js.Any*): Unit = js.native
  /**
    * Wrapper for {@link Collection#add}.
    *
    * @example <caption>SimpleStore#add</caption>
    * const JSData = require('js-data');
    * const { SimpleStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new SimpleStore();
    * store.defineMapper('book');
    *
    * // Add one book to the in-memory store:
    * store.add('book', { id: 1, title: 'Respect your Data' });
    * // Add multiple books to the in-memory store:
    * store.add('book', [
    *   { id: 2, title: 'Easy data recipes' },
    *   { id: 3, title: 'Active Record 101' }
    * ]);
    *
    * @fires SimpleStore#add
    * @method SimpleStore#add
    * @param {(string|number)} name Name of the {@link Mapper} to target.
    * @param {(Object|Object[]|Record|Record[])} records See {@link Collection#add}.
    * @param {object} [opts] Configuration options. See {@link Collection#add}.
    * @returns {(Object|Object[]|Record|Record[])} See {@link Collection#add}.
    * @see Collection#add
    * @see Collection#add
    * @since 3.0.0
    */
  def add(name: js.Any, records: js.Any): js.Any = js.native
  def add(name: js.Any, records: js.Any, opts: js.Any): js.Any = js.native
  /**
    * This method takes the data received from {@link SimpleStore#find},
    * {@link SimpleStore#findAll}, {@link SimpleStore#update}, etc., and adds the
    * data to the store. _You don't need to call this method directly._
    *
    * If you're using the http adapter and your response data is in an unexpected
    * format, you may need to override this method so the right data gets added
    * to the store.
    *
    * @example
    * const store = new SimpleStore({
    *   addToCache (mapperName, data, opts) {
    *     // Let's say for a particular Resource, response data is in a weird format
    *     if (name === 'comment') {
    *       // Re-assign the variable to add the correct records into the stores
    *       data = data.items;
    *     }
    *     // Now perform default behavior
    *     return SimpleStore.prototype.addToCache.call(this, mapperName, data, opts);
    *   }
    * });
    *
    * @example
    * // Extend using ES2015 class syntax.
    * class MyStore extends SimpleStore {
    *   addToCache (mapperName, data, opts) {
    *     // Let's say for a particular Resource, response data is in a weird format
    *     if (name === 'comment') {
    *       // Re-assign the variable to add the correct records into the stores
    *       data = data.items;
    *     }
    *     // Now perform default behavior
    *     return super.addToCache(mapperName, data, opts);
    *   }
    * }
    * const store = new MyStore();
    *
    * @method SimpleStore#addToCache
    * @param {string} name Name of the {@link Mapper} to target.
    * @param {*} data Data from which data should be selected for add.
    * @param {object} [opts] Configuration options.
    */
  def addToCache(name: js.Any, data: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Wrapper for {@link Collection#between}.
    *
    * @example
    * // Get all users ages 18 to 30
    * const users = store.between('user', 18, 30, { index: 'age' });
    *
    * @example
    * // Same as above
    * const users = store.between('user', [18], [30], { index: 'age' });
    *
    * @method SimpleStore#between
    * @param {(string|number)} name Name of the {@link Mapper} to target.
    * @param {array} leftKeys See {@link Collection#between}.
    * @param {array} rightKeys See {@link Collection#between}.
    * @param {object} [opts] Configuration options. See {@link Collection#between}.
    * @returns {Object[]|Record[]} See {@link Collection#between}.
    * @see Collection#between
    * @see Collection#between
    * @since 3.0.0
    */
  def between(name: js.Any, leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Mark a {@link Mapper#find} result as cached by adding an entry to
    * {@link SimpleStore#_completedQueries}. By default, once a `find` entry is
    * added it means subsequent calls to the same Resource with the same `id`
    * argument will immediately resolve with the result of calling
    * {@link SimpleStore#get} instead of delegating to {@link Mapper#find}.
    *
    * As part of implementing your own caching strategy, you may choose to
    * override this method.
    *
    * @example
    * const store = new SimpleStore({
    *   cacheFind (mapperName, data, id, opts) {
    *     // Let's say for a particular Resource, we always want to pull fresh from the server
    *     if (mapperName === 'schedule') {
    *       // Return without saving an entry to SimpleStore#_completedQueries
    *       return;
    *     }
    *     // Otherwise perform default behavior
    *     return SimpleStore.prototype.cacheFind.call(this, mapperName, data, id, opts);
    *   }
    * });
    *
    * @example
    * // Extend using ES2015 class syntax.
    * class MyStore extends SimpleStore {
    *   cacheFind (mapperName, data, id, opts) {
    *     // Let's say for a particular Resource, we always want to pull fresh from the server
    *     if (mapperName === 'schedule') {
    *       // Return without saving an entry to SimpleStore#_completedQueries
    *       return;
    *     }
    *     // Otherwise perform default behavior
    *     return super.cacheFind(mapperName, data, id, opts);
    *   }
    * }
    * const store = new MyStore();
    *
    * @method SimpleStore#cacheFind
    * @param {string} name The `name` argument passed to {@link SimpleStore#find}.
    * @param {*} data The result to cache.
    * @param {(string|number)} id The `id` argument passed to {@link SimpleStore#find}.
    * @param {object} opts The `opts` argument passed to {@link SimpleStore#find}.
    * @since 3.0.0
    */
  def cacheFind(name: js.Any, data: js.Any, id: js.Any, opts: js.Any): Unit = js.native
  /**
    * Mark a {@link Mapper#findAll} result as cached by adding an entry to
    * {@link SimpleStore#_completedQueries}. By default, once a `findAll` entry is
    * added it means subsequent calls to the same Resource with the same `query`
    * argument will immediately resolve with the result of calling
    * {@link SimpleStore#filter} instead of delegating to {@link Mapper#findAll}.
    *
    * As part of implementing your own caching strategy, you may choose to
    * override this method.
    *
    * @example
    * const store = new SimpleStore({
    *   cachedFindAll (mapperName, data, hash, opts) {
    *     // Let's say for a particular Resource, we always want to pull fresh from the server
    *     if (mapperName === 'schedule') {
    *       // Return without saving an entry to SimpleStore#_completedQueries
    *       return;
    *     }
    *     // Otherwise perform default behavior.
    *     return SimpleStore.prototype.cachedFindAll.call(this, mapperName, data, hash, opts);
    *   }
    * });
    *
    * @example
    * // Extend using ES2015 class syntax.
    * class MyStore extends SimpleStore {
    *   cachedFindAll (mapperName, data, hash, opts) {
    *     // Let's say for a particular Resource, we always want to pull fresh from the server
    *     if (mapperName === 'schedule') {
    *       // Return without saving an entry to SimpleStore#_completedQueries
    *       return;
    *     }
    *     // Otherwise perform default behavior.
    *     return super.cachedFindAll(mapperName, data, hash, opts);
    *   }
    * }
    * const store = new MyStore();
    *
    * @method SimpleStore#cacheFindAll
    * @param {string} name The `name` argument passed to {@link SimpleStore#findAll}.
    * @param {*} data The result to cache.
    * @param {string} hash The result of calling {@link SimpleStore#hashQuery} on
    * the `query` argument passed to {@link SimpleStore#findAll}.
    * @param {object} opts The `opts` argument passed to {@link SimpleStore#findAll}.
    * @since 3.0.0
    */
  def cacheFindAll(name: js.Any, data: js.Any, hash: js.Any, opts: js.Any): Unit = js.native
  /**
    * Retrieve a cached `find` result, if any. This method is called during
    * {@link SimpleStore#find} to determine if {@link Mapper#find} needs to be
    * called. If this method returns `undefined` then {@link Mapper#find} will
    * be called. Otherwise {@link SimpleStore#find} will immediately resolve with
    * the return value of this method.
    *
    * When using {@link SimpleStore} in the browser, you can override this method
    * to implement your own cache-busting strategy.
    *
    * @example
    * const store = new SimpleStore({
    *   cachedFind (mapperName, id, opts) {
    *     // Let's say for a particular Resource, we always want to pull fresh from the server
    *     if (mapperName === 'schedule') {
    *       // Return undefined to trigger a Mapper#find call
    *       return;
    *     }
    *     // Otherwise perform default behavior
    *     return SimpleStore.prototype.cachedFind.call(this, mapperName, id, opts);
    *   }
    * });
    *
    * @example
    * // Extend using ES2015 class syntax.
    * class MyStore extends SimpleStore {
    *   cachedFind (mapperName, id, opts) {
    *     // Let's say for a particular Resource, we always want to pull fresh from the server
    *     if (mapperName === 'schedule') {
    *       // Return undefined to trigger a Mapper#find call
    *       return;
    *     }
    *     // Otherwise perform default behavior
    *     return super.cachedFind(mapperName, id, opts);
    *   }
    * }
    * const store = new MyStore();
    *
    * @method SimpleStore#cachedFind
    * @param {string} name The `name` argument passed to {@link SimpleStore#find}.
    * @param {(string|number)} id The `id` argument passed to {@link SimpleStore#find}.
    * @param {object} opts The `opts` argument passed to {@link SimpleStore#find}.
    * @since 3.0.0
    */
  def cachedFind(name: js.Any, hashOrId: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Retrieve a cached `findAll` result, if any. This method is called during
    * {@link SimpleStore#findAll} to determine if {@link Mapper#findAll} needs to be
    * called. If this method returns `undefined` then {@link Mapper#findAll} will
    * be called. Otherwise {@link SimpleStore#findAll} will immediately resolve with
    * the return value of this method.
    *
    * When using {@link SimpleStore} in the browser, you can override this method
    * to implement your own cache-busting strategy.
    *
    * @example
    * const store = new SimpleStore({
    *   cachedFindAll (mapperName, hash, opts) {
    *     // Let's say for a particular Resource, we always want to pull fresh from the server
    *     if (mapperName === 'schedule') {
    *       // Return undefined to trigger a Mapper#findAll call
    *       return undefined;
    *     }
    *     // Otherwise perform default behavior
    *     return SimpleStore.prototype.cachedFindAll.call(this, mapperName, hash, opts);
    *   }
    * });
    *
    * @example
    * // Extend using ES2015 class syntax.
    * class MyStore extends SimpleStore {
    *   cachedFindAll (mapperName, hash, opts) {
    *     // Let's say for a particular Resource, we always want to pull fresh from the server
    *     if (mapperName === 'schedule') {
    *       // Return undefined to trigger a Mapper#findAll call
    *       return undefined;
    *     }
    *     // Otherwise perform default behavior
    *     return super.cachedFindAll(mapperName, hash, opts);
    *   }
    * }
    * const store = new MyStore();
    *
    * @method SimpleStore#cachedFindAll
    * @param {string} name The `name` argument passed to {@link SimpleStore#findAll}.
    * @param {string} hash The result of calling {@link SimpleStore#hashQuery} on
    * the `query` argument passed to {@link SimpleStore#findAll}.
    * @param {object} opts The `opts` argument passed to {@link SimpleStore#findAll}.
    * @since 3.0.0
    */
  def cachedFindAll(name: js.Any, hashOrId: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Remove __all__ records from the in-memory store and reset
    * {@link SimpleStore#_completedQueries}.
    *
    * @method SimpleStore#clear
    * @returns {Object} Object containing all records that were in the store.
    * @see SimpleStore#remove
    * @see SimpleStore#removeAll
    * @since 3.0.0
    */
  def clear(): js.Object = js.native
  /**
    * Fired during {@link SimpleStore#create}. See
    * {@link SimpleStore~beforeCreateListener} for how to listen for this event.
    *
    * @event SimpleStore#beforeCreate
    * @see SimpleStore~beforeCreateListener
    * @see SimpleStore#create
    */
  /**
    * Callback signature for the {@link SimpleStore#event:beforeCreate} event.
    *
    * @example
    * function onBeforeCreate (mapperName, props, opts) {
    *   // do something
    * }
    * store.on('beforeCreate', onBeforeCreate);
    *
    * @callback SimpleStore~beforeCreateListener
    * @param {string} name The `name` argument received by {@link Mapper#beforeCreate}.
    * @param {object} props The `props` argument received by {@link Mapper#beforeCreate}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeCreate}.
    * @see SimpleStore#event:beforeCreate
    * @see SimpleStore#create
    * @since 3.0.0
    */
  /**
    * Fired during {@link SimpleStore#create}. See
    * {@link SimpleStore~afterCreateListener} for how to listen for this event.
    *
    * @event SimpleStore#afterCreate
    * @see SimpleStore~afterCreateListener
    * @see SimpleStore#create
    */
  /**
    * Callback signature for the {@link SimpleStore#event:afterCreate} event.
    *
    * @example
    * function onAfterCreate (mapperName, props, opts, result) {
    *   // do something
    * }
    * store.on('afterCreate', onAfterCreate);
    *
    * @callback SimpleStore~afterCreateListener
    * @param {string} name The `name` argument received by {@link Mapper#afterCreate}.
    * @param {object} props The `props` argument received by {@link Mapper#afterCreate}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterCreate}.
    * @param {object} result The `result` argument received by {@link Mapper#afterCreate}.
    * @see SimpleStore#event:afterCreate
    * @see SimpleStore#create
    * @since 3.0.0
    */
  /**
    * Wrapper for {@link Mapper#create}. Adds the created record to the store.
    *
    * @example
    * import { SimpleStore } from 'js-data';
    * import { HttpAdapter } from 'js-data-http';
    *
    * const store = new SimpleStore();
    * store.registerAdapter('http', new HttpAdapter(), { default: true });
    *
    * store.defineMapper('book');
    *
    * // Since this example uses the http adapter, we'll get something like:
    * //
    * //   POST /book {"author_id":1234,...}
    * store.create('book', {
    *   author_id: 1234,
    *   edition: 'First Edition',
    *   title: 'Respect your Data'
    * }).then((book) => {
    *   console.log(book.id); // 120392
    *   console.log(book.title); // "Respect your Data"
    * });
    *
    * @fires SimpleStore#beforeCreate
    * @fires SimpleStore#afterCreate
    * @fires SimpleStore#add
    * @method SimpleStore#create
    * @param {string} name Name of the {@link Mapper} to target.
    * @param {object} record Passed to {@link Mapper#create}.
    * @param {object} [opts] Passed to {@link Mapper#create}. See
    * {@link Mapper#create} for more configuration options.
    * @returns {Promise} Resolves with the result of the create.
    * @since 3.0.0
    */
  def create(name: js.Any, record: js.Any): js.Promise[_] = js.native
  /**
    * Wrapper for {@link Collection#createIndex}.
    *
    * @example
    * // Index users by age
    * store.createIndex('user', 'age');
    *
    * @example
    * // Index users by status and role
    * store.createIndex('user', 'statusAndRole', ['status', 'role']);
    *
    * @method SimpleStore#createIndex
    * @param {(string|number)} name Name of the {@link Mapper} to target.
    * @param {string} indexName See {@link Collection#createIndex}.
    * @param {string[]} [fieldList] See {@link Collection#createIndex}.
    * @param {object} [opts] Configuration options. See {@link Collection#between}.
    * @see Collection#createIndex
    * @see Collection#createIndex
    * @since 3.0.0
    */
  def createIndex(name: String, indexName: String): Unit = js.native
  def createIndex(name: String, indexName: String, fieldList: js.UndefOr[scala.Nothing], opts: js.Any): Unit = js.native
  def createIndex(name: String, indexName: String, fieldList: js.Array[String]): Unit = js.native
  def createIndex(name: String, indexName: String, fieldList: js.Array[String], opts: js.Any): Unit = js.native
  def createIndex(name: Double, indexName: String): Unit = js.native
  def createIndex(name: Double, indexName: String, fieldList: js.UndefOr[scala.Nothing], opts: js.Any): Unit = js.native
  def createIndex(name: Double, indexName: String, fieldList: js.Array[String]): Unit = js.native
  def createIndex(name: Double, indexName: String, fieldList: js.Array[String], opts: js.Any): Unit = js.native
  /**
    * Fired during {@link SimpleStore#createMany}. See
    * {@link SimpleStore~beforeCreateManyListener} for how to listen for this event.
    *
    * @event SimpleStore#beforeCreateMany
    * @see SimpleStore~beforeCreateManyListener
    * @see SimpleStore#createMany
    */
  /**
    * Callback signature for the {@link SimpleStore#event:beforeCreateMany} event.
    *
    * @example
    * function onBeforeCreateMany (mapperName, records, opts) {
    *   // do something
    * }
    * store.on('beforeCreateMany', onBeforeCreateMany);
    *
    * @callback SimpleStore~beforeCreateManyListener
    * @param {string} name The `name` argument received by {@link Mapper#beforeCreateMany}.
    * @param {object} records The `records` argument received by {@link Mapper#beforeCreateMany}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeCreateMany}.
    * @see SimpleStore#event:beforeCreateMany
    * @see SimpleStore#createMany
    * @since 3.0.0
    */
  /**
    * Fired during {@link SimpleStore#createMany}. See
    * {@link SimpleStore~afterCreateManyListener} for how to listen for this event.
    *
    * @event SimpleStore#afterCreateMany
    * @see SimpleStore~afterCreateManyListener
    * @see SimpleStore#createMany
    */
  /**
    * Callback signature for the {@link SimpleStore#event:afterCreateMany} event.
    *
    * @example
    * function onAfterCreateMany (mapperName, records, opts, result) {
    *   // do something
    * }
    * store.on('afterCreateMany', onAfterCreateMany);
    *
    * @callback SimpleStore~afterCreateManyListener
    * @param {string} name The `name` argument received by {@link Mapper#afterCreateMany}.
    * @param {object} records The `records` argument received by {@link Mapper#afterCreateMany}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterCreateMany}.
    * @param {object} result The `result` argument received by {@link Mapper#afterCreateMany}.
    * @see SimpleStore#event:afterCreateMany
    * @see SimpleStore#createMany
    * @since 3.0.0
    */
  /**
    * Wrapper for {@link Mapper#createMany}. Adds the created records to the
    * store.
    *
    * @example
    * import { SimpleStore } from 'js-data';
    * import { HttpAdapter } from 'js-data-http';
    *
    * const store = new SimpleStore();
    * store.registerAdapter('http', new HttpAdapter(), { default: true });
    *
    * store.defineMapper('book');
    *
    * // Since this example uses the http adapter, we'll get something like:
    * //
    * //   POST /book [{"author_id":1234,...},{...}]
    * store.createMany('book', [{
    *   author_id: 1234,
    *   edition: 'First Edition',
    *   title: 'Respect your Data'
    * }, {
    *   author_id: 1234,
    *   edition: 'Second Edition',
    *   title: 'Respect your Data'
    * }]).then((books) => {
    *   console.log(books[0].id); // 142394
    *   console.log(books[0].title); // "Respect your Data"
    * });
    *
    * @fires SimpleStore#beforeCreateMany
    * @fires SimpleStore#afterCreateMany
    * @fires SimpleStore#add
    * @method SimpleStore#createMany
    * @param {string} name Name of the {@link Mapper} to target.
    * @param {array} records Passed to {@link Mapper#createMany}.
    * @param {object} [opts] Passed to {@link Mapper#createMany}. See
    * {@link Mapper#createMany} for more configuration options.
    * @returns {Promise} Resolves with the result of the create.
    * @since 3.0.0
    */
  def createMany(name: js.Any, records: js.Any): js.Promise[_] = js.native
  /**
    * Fired during {@link SimpleStore#destroy}. See
    * {@link SimpleStore~beforeDestroyListener} for how to listen for this event.
    *
    * @event SimpleStore#beforeDestroy
    * @see SimpleStore~beforeDestroyListener
    * @see SimpleStore#destroy
    */
  /**
    * Callback signature for the {@link SimpleStore#event:beforeDestroy} event.
    *
    * @example
    * function onBeforeDestroy (mapperName, id, opts) {
    *   // do something
    * }
    * store.on('beforeDestroy', onBeforeDestroy);
    *
    * @callback SimpleStore~beforeDestroyListener
    * @param {string} name The `name` argument received by {@link Mapper#beforeDestroy}.
    * @param {string|number} id The `id` argument received by {@link Mapper#beforeDestroy}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeDestroy}.
    * @see SimpleStore#event:beforeDestroy
    * @see SimpleStore#destroy
    * @since 3.0.0
    */
  /**
    * Fired during {@link SimpleStore#destroy}. See
    * {@link SimpleStore~afterDestroyListener} for how to listen for this event.
    *
    * @event SimpleStore#afterDestroy
    * @see SimpleStore~afterDestroyListener
    * @see SimpleStore#destroy
    */
  /**
    * Callback signature for the {@link SimpleStore#event:afterDestroy} event.
    *
    * @example
    * function onAfterDestroy (mapperName, id, opts, result) {
    *   // do something
    * }
    * store.on('afterDestroy', onAfterDestroy);
    *
    * @callback SimpleStore~afterDestroyListener
    * @param {string} name The `name` argument received by {@link Mapper#afterDestroy}.
    * @param {string|number} id The `id` argument received by {@link Mapper#afterDestroy}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterDestroy}.
    * @param {object} result The `result` argument received by {@link Mapper#afterDestroy}.
    * @see SimpleStore#event:afterDestroy
    * @see SimpleStore#destroy
    * @since 3.0.0
    */
  /**
    * Wrapper for {@link Mapper#destroy}. Removes any destroyed record from the
    * in-memory store. Clears out any {@link SimpleStore#_completedQueries} entries
    * associated with the provided `id`.
    *
    * @example
    * import { SimpleStore } from 'js-data';
    * import { HttpAdapter } from 'js-data-http';
    *
    * const store = new SimpleStore();
    * store.registerAdapter('http', new HttpAdapter(), { default: true });
    *
    * store.defineMapper('book');
    *
    * store.add('book', { id: 1234, title: 'Data Management is Hard' });
    *
    * // Since this example uses the http adapter, we'll get something like:
    * //
    * //   DELETE /book/1234
    * store.destroy('book', 1234).then(() => {
    *   // The book record is no longer in the in-memory store
    *   console.log(store.get('book', 1234)); // undefined
    *
    *   return store.find('book', 1234);
    * }).then((book) {
    *   // The book was deleted from the database too
    *   console.log(book); // undefined
    * });
    *
    * @fires SimpleStore#beforeDestroy
    * @fires SimpleStore#afterDestroy
    * @fires SimpleStore#remove
    * @method SimpleStore#destroy
    * @param {string} name Name of the {@link Mapper} to target.
    * @param {(string|number)} id Passed to {@link Mapper#destroy}.
    * @param {object} [opts] Passed to {@link Mapper#destroy}. See
    * {@link Mapper#destroy} for more configuration options.
    * @returns {Promise} Resolves when the destroy operation completes.
    * @since 3.0.0
    */
  def destroy(name: js.Any, id: js.Any): js.Promise[_] = js.native
  /**
    * Fired during {@link SimpleStore#destroyAll}. See
    * {@link SimpleStore~beforeDestroyAllListener} for how to listen for this event.
    *
    * @event SimpleStore#beforeDestroyAll
    * @see SimpleStore~beforeDestroyAllListener
    * @see SimpleStore#destroyAll
    */
  /**
    * Callback signature for the {@link SimpleStore#event:beforeDestroyAll} event.
    *
    * @example
    * function onBeforeDestroyAll (mapperName, query, opts) {
    *   // do something
    * }
    * store.on('beforeDestroyAll', onBeforeDestroyAll);
    *
    * @callback SimpleStore~beforeDestroyAllListener
    * @param {string} name The `name` argument received by {@link Mapper#beforeDestroyAll}.
    * @param {object} query The `query` argument received by {@link Mapper#beforeDestroyAll}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeDestroyAll}.
    * @see SimpleStore#event:beforeDestroyAll
    * @see SimpleStore#destroyAll
    * @since 3.0.0
    */
  /**
    * Fired during {@link SimpleStore#destroyAll}. See
    * {@link SimpleStore~afterDestroyAllListener} for how to listen for this event.
    *
    * @event SimpleStore#afterDestroyAll
    * @see SimpleStore~afterDestroyAllListener
    * @see SimpleStore#destroyAll
    */
  /**
    * Callback signature for the {@link SimpleStore#event:afterDestroyAll} event.
    *
    * @example
    * function onAfterDestroyAll (mapperName, query, opts, result) {
    *   // do something
    * }
    * store.on('afterDestroyAll', onAfterDestroyAll);
    *
    * @callback SimpleStore~afterDestroyAllListener
    * @param {string} name The `name` argument received by {@link Mapper#afterDestroyAll}.
    * @param {object} query The `query` argument received by {@link Mapper#afterDestroyAll}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterDestroyAll}.
    * @param {object} result The `result` argument received by {@link Mapper#afterDestroyAll}.
    * @see SimpleStore#event:afterDestroyAll
    * @see SimpleStore#destroyAll
    * @since 3.0.0
    */
  /**
    * Wrapper for {@link Mapper#destroyAll}. Removes any destroyed records from
    * the in-memory store.
    *
    * @example
    * import { SimpleStore } from 'js-data';
    * import { HttpAdapter } from 'js-data-http';
    *
    * const store = new SimpleStore();
    * store.registerAdapter('http', new HttpAdapter(), { default: true });
    *
    * store.defineMapper('book');
    *
    * store.add('book', { id: 1234, title: 'Data Management is Hard' });
    *
    * // Since this example uses the http adapter, we'll get something like:
    * //
    * //   DELETE /book/1234
    * store.destroy('book', 1234).then(() => {
    *   // The book record is gone from the in-memory store
    *   console.log(store.get('book', 1234)); // undefined
    *   return store.find('book', 1234);
    * }).then((book) {
    *   // The book was deleted from the database too
    *   console.log(book); // undefined
    * });
    *
    * @fires SimpleStore#beforeDestroyAll
    * @fires SimpleStore#afterDestroyAll
    * @fires SimpleStore#remove
    * @method SimpleStore#destroyAll
    * @param {string} name Name of the {@link Mapper} to target.
    * @param {object} [query] Passed to {@link Mapper#destroyAll}.
    * @param {object} [opts] Passed to {@link Mapper#destroyAll}. See
    * {@link Mapper#destroyAll} for more configuration options.
    * @returns {Promise} Resolves when the delete completes.
    * @since 3.0.0
    */
  def destroyAll(name: js.Any, query: js.Any): js.Promise[_] = js.native
  def eject(name: js.Any, id: js.Any, opts: js.Any): js.Any = js.native
  def ejectAll(name: js.Any, query: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Wrapper for {@link Collection#filter}.
    *
    * @example <caption>SimpleStore#filter</caption>
    * const JSData = require('js-data');
    * const { SimpleStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new SimpleStore();
    * store.defineMapper('post');
    * store.add('post', [
    *   { id: 1, status: 'draft', created_at_timestamp: new Date().getTime() }
    * ]);
    *
    * // Get the draft posts created less than three months ago
    * let posts = store.filter('post', {
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
    * posts = store.filter('post', function (post) { return post.id % 2 === 0 });
    *
    * @method SimpleStore#filter
    * @param {(string|number)} name Name of the {@link Mapper} to target.
    * @param {(Object|Function)} [queryOrFn={}] See {@link Collection#filter}.
    * @param {object} [thisArg] See {@link Collection#filter}.
    * @returns {Array} See {@link Collection#filter}.
    * @see Collection#filter
    * @see Collection#filter
    * @since 3.0.0
    */
  def filter(name: js.Any): js.Any = js.native
  def filter(name: js.Any, queryOrFn: js.UndefOr[scala.Nothing], thisArg: js.Any): js.Any = js.native
  def filter(name: js.Any, queryOrFn: js.Any): js.Any = js.native
  def filter(name: js.Any, queryOrFn: js.Any, thisArg: js.Any): js.Any = js.native
  /**
    * Fired during {@link SimpleStore#find}. See
    * {@link SimpleStore~beforeFindListener} for how to listen for this event.
    *
    * @event SimpleStore#beforeFind
    * @see SimpleStore~beforeFindListener
    * @see SimpleStore#find
    */
  /**
    * Callback signature for the {@link SimpleStore#event:beforeFind} event.
    *
    * @example
    * function onBeforeFind (mapperName, id, opts) {
    *   // do something
    * }
    * store.on('beforeFind', onBeforeFind);
    *
    * @callback SimpleStore~beforeFindListener
    * @param {string} name The `name` argument received by {@link Mapper#beforeFind}.
    * @param {string|number} id The `id` argument received by {@link Mapper#beforeFind}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeFind}.
    * @see SimpleStore#event:beforeFind
    * @see SimpleStore#find
    * @since 3.0.0
    */
  /**
    * Fired during {@link SimpleStore#find}. See
    * {@link SimpleStore~afterFindListener} for how to listen for this event.
    *
    * @event SimpleStore#afterFind
    * @see SimpleStore~afterFindListener
    * @see SimpleStore#find
    */
  /**
    * Callback signature for the {@link SimpleStore#event:afterFind} event.
    *
    * @example
    * function onAfterFind (mapperName, id, opts, result) {
    *   // do something
    * }
    * store.on('afterFind', onAfterFind);
    *
    * @callback SimpleStore~afterFindListener
    * @param {string} name The `name` argument received by {@link Mapper#afterFind}.
    * @param {string|number} id The `id` argument received by {@link Mapper#afterFind}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterFind}.
    * @param {object} result The `result` argument received by {@link Mapper#afterFind}.
    * @see SimpleStore#event:afterFind
    * @see SimpleStore#find
    * @since 3.0.0
    */
  /**
    * Wrapper for {@link Mapper#find}. Adds any found record to the store.
    *
    * @example
    * import { SimpleStore } from 'js-data';
    * import { HttpAdapter } from 'js-data-http';
    *
    * const store = new SimpleStore();
    * store.registerAdapter('http', new HttpAdapter(), { default: true });
    *
    * store.defineMapper('book');
    *
    * // Since this example uses the http adapter, we'll get something like:
    * //
    * //   GET /book/1234
    * store.find('book', 1234).then((book) => {
    *   // The book record is now in the in-memory store
    *   console.log(store.get('book', 1234) === book); // true
    * });
    *
    * @fires SimpleStore#beforeFind
    * @fires SimpleStore#afterFind
    * @fires SimpleStore#add
    * @method SimpleStore#find
    * @param {string} name Name of the {@link Mapper} to target.
    * @param {(string|number)} id Passed to {@link Mapper#find}.
    * @param {object} [opts] Passed to {@link Mapper#find}.
    * @param {boolean} [opts.force] Bypass cacheFind
    * @param {boolean|Function} [opts.usePendingFind] See {@link SimpleStore#usePendingFind}
    * @returns {Promise} Resolves with the result, if any.
    * @since 3.0.0
    */
  def find(name: js.Any, id: js.Any): js.Any = js.native
  /**
    * Fired during {@link SimpleStore#findAll}. See
    * {@link SimpleStore~beforeFindAllListener} for how to listen for this event.
    *
    * @event SimpleStore#beforeFindAll
    * @see SimpleStore~beforeFindAllListener
    * @see SimpleStore#findAll
    */
  /**
    * Callback signature for the {@link SimpleStore#event:beforeFindAll} event.
    *
    * @example
    * function onBeforeFindAll (mapperName, query, opts) {
    *   // do something
    * }
    * store.on('beforeFindAll', onBeforeFindAll);
    *
    * @callback SimpleStore~beforeFindAllListener
    * @param {string} name The `name` argument received by {@link Mapper#beforeFindAll}.
    * @param {object} query The `query` argument received by {@link Mapper#beforeFindAll}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeFindAll}.
    * @see SimpleStore#event:beforeFindAll
    * @see SimpleStore#findAll
    * @since 3.0.0
    */
  /**
    * Fired during {@link SimpleStore#findAll}. See
    * {@link SimpleStore~afterFindAllListener} for how to listen for this event.
    *
    * @event SimpleStore#afterFindAll
    * @see SimpleStore~afterFindAllListener
    * @see SimpleStore#findAll
    */
  /**
    * Callback signature for the {@link SimpleStore#event:afterFindAll} event.
    *
    * @example
    * function onAfterFindAll (mapperName, query, opts, result) {
    *   // do something
    * }
    * store.on('afterFindAll', onAfterFindAll);
    *
    * @callback SimpleStore~afterFindAllListener
    * @param {string} name The `name` argument received by {@link Mapper#afterFindAll}.
    * @param {object} query The `query` argument received by {@link Mapper#afterFindAll}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterFindAll}.
    * @param {object} result The `result` argument received by {@link Mapper#afterFindAll}.
    * @see SimpleStore#event:afterFindAll
    * @see SimpleStore#findAll
    * @since 3.0.0
    */
  /**
    * Wrapper for {@link Mapper#findAll}. Adds any found records to the store.
    *
    * @example
    * import { SimpleStore } from 'js-data';
    * import { HttpAdapter } from 'js-data-http';
    *
    * const store = new SimpleStore();
    * store.registerAdapter('http', new HttpAdapter(), { default: true });
    *
    * store.defineMapper('movie');
    *
    * // Since this example uses the http adapter, we'll get something like:
    * //
    * //   GET /movie?rating=PG
    * store.find('movie', { rating: 'PG' }).then((movies) => {
    *   // The movie records are now in the in-memory store
    *   console.log(store.filter('movie'));
    * });
    *
    * @fires SimpleStore#beforeFindAll
    * @fires SimpleStore#afterFindAll
    * @fires SimpleStore#add
    * @method SimpleStore#findAll
    * @param {string} name Name of the {@link Mapper} to target.
    * @param {object} [query] Passed to {@link Mapper.findAll}.
    * @param {object} [opts] Passed to {@link Mapper.findAll}.
    * @param {boolean} [opts.force] Bypass cacheFindAll
    * @param {boolean|Function} [opts.usePendingFindAll] See {@link SimpleStore#usePendingFindAll}
    * @returns {Promise} Resolves with the result, if any.
    * @since 3.0.0
    */
  def findAll(name: js.Any, query: js.Any): js.Any = js.native
  /**
    * Wrapper for {@link Collection#get}.
    *
    * @example <caption>SimpleStore#get</caption>
    * const JSData = require('js-data');
    * const { SimpleStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new SimpleStore();
    * store.defineMapper('post');
    * store.add('post', [
    *   { id: 1, status: 'draft', created_at_timestamp: new Date().getTime() }
    * ]);
    *
    * console.log(store.get('post', 1)); // {...}
    * console.log(store.get('post', 2)); // undefined
    *
    * @method SimpleStore#get
    * @param {(string|number)} name Name of the {@link Mapper} to target.
    * @param {(string|number)} id See {@link Collection#get}.
    * @returns {(Object|Record)} See {@link Collection#get}.
    * @see Collection#get
    * @see Collection#get
    * @since 3.0.0
    */
  def get(name: js.Any, id: js.Any): js.Any = js.native
  /**
    * Wrapper for {@link Collection#getAll}.
    *
    * @example
    * // Get the posts where "status" is "draft" or "inReview"
    * const posts = store.getAll('post', 'draft', 'inReview', { index: 'status' });
    *
    * @example
    * // Same as above
    * const posts = store.getAll('post', ['draft'], ['inReview'], { index: 'status' });
    *
    * @method SimpleStore#getAll
    * @param {(string|number)} name Name of the {@link Mapper} to target.
    * @param {...Array} [keyList] See {@link Collection#getAll}.
    * @param {object} [opts] See {@link Collection#getAll}.
    * @returns {Array} See {@link Collection#getAll}.
    * @see Collection#getAll
    * @see Collection#getAll
    * @since 3.0.0
    */
  def getAll(name: js.Any, args: js.Any*): js.Any = js.native
  /**
    * Return the {@link Collection} with the given name, if for some
    * reason you need a direct reference to the collection.
    *
    * @param {string} name Name of the {@link Collection} to retrieve.
    * @since 3.0.0
    * @throws {Error} Thrown if the specified {@link Collection} does not
    * exist.
    */
  def getCollection(name: js.Any): typings.jsData.collectionMod.default = js.native
  /**
    * Hashing function used to cache {@link SimpleStore#find} and
    * {@link SimpleStore#findAll} requests. This method simply JSONifies the
    * `query` argument passed to {@link SimpleStore#find} or
    * {@link SimpleStore#findAll}.
    *
    * Override this method for custom hashing behavior.
    * @method SimpleStore#hashQuery
    * @param {string} name The `name` argument passed to {@link SimpleStore#find}
    * or {@link SimpleStore#findAll}.
    * @param {object} query The `query` argument passed to {@link SimpleStore#find}
    * or {@link SimpleStore#findAll}.
    * @returns {string} The JSONified `query`.
    * @since 3.0.0
    */
  def hashQuery(name: js.Any, query: js.Any, opts: js.Any): String = js.native
  def inject(name: js.Any, records: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Wrapper for {@link Collection#prune}.
    *
    * @method SimpleStore#prune
    * @param name
    * @param {object} [opts] See {@link Collection#prune}.
    * @returns {Array} See {@link Collection#prune}.
    * @see Collection#prune
    * @see Collection#prune
    * @since 3.0.0
    */
  def prune(name: String): js.Any = js.native
  def prune(name: String, opts: js.Any): js.Any = js.native
  /**
    * Wrapper for {@link Collection#query}.
    *
    * @example
    * // Grab page 2 of users between ages 18 and 30
    * store.query('user')
    *   .between(18, 30, { index: 'age' }) // between ages 18 and 30
    *   .skip(10) // second page
    *   .limit(10) // page size
    *   .run();
    *
    * @method SimpleStore#query
    * @param {(string|number)} name Name of the {@link Mapper} to target.
    * @returns {Query} See {@link Collection#query}.
    * @see Collection#query
    * @see Collection#query
    * @since 3.0.0
    */
  def query(name: js.Any): typings.jsData.queryMod.default = js.native
  /**
    * Wrapper for {@link Collection#remove}. Removes the specified
    * {@link Record} from the store.
    *
    * @example <caption>SimpleStore#remove</caption>
    * const JSData = require('js-data');
    * const { SimpleStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new SimpleStore();
    * store.defineMapper('book');
    * console.log(store.getAll('book').length);
    * store.add('book', { id: 1234 });
    * console.log(store.getAll('book').length);
    * store.remove('book', 1234);
    * console.log(store.getAll('book').length);
    *
    * @fires SimpleStore#remove
    * @method SimpleStore#remove
    * @param {string} name The name of the {@link Collection} to target.
    * @param {string|number} id The primary key of the {@link Record} to remove.
    * @param {object} [opts] Configuration options.
    * @param {string[]} [opts.with] Relations of the {@link Record} to also
    * remove from the store.
    * @returns {Record} The removed {@link Record}, if any.
    * @see Collection#add
    * @see Collection#add
    * @since 3.0.0
    */
  def remove(name: js.Any, id: js.Any): js.Any = js.native
  def remove(name: js.Any, id: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Wrapper for {@link Collection#removeAll}. Removes the selected
    * {@link Record}s from the store.
    *
    * @example <caption>SimpleStore#removeAll</caption>
    * const JSData = require('js-data');
    * const { SimpleStore } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const store = new SimpleStore();
    * store.defineMapper('movie');
    * console.log(store.getAll('movie').length);
    * store.add('movie', [{ id: 3, rating: 'R' }, { id: 4, rating: 'PG-13' });
    * console.log(store.getAll('movie').length);
    * store.removeAll('movie', { rating: 'R' });
    * console.log(store.getAll('movie').length);
    *
    * @fires SimpleStore#remove
    * @method SimpleStore#removeAll
    * @param {string} name The name of the {@link Collection} to target.
    * @param {object} [query={}] Selection query. See {@link query}.
    * @param {object} [query.where] See {@link query.where}.
    * @param {number} [query.offset] See {@link query.offset}.
    * @param {number} [query.limit] See {@link query.limit}.
    * @param {string|Array[]} [query.orderBy] See {@link query.orderBy}.
    * @param {object} [opts] Configuration options.
    * @param {string[]} [opts.with] Relations of the {@link Record} to also
    * remove from the store.
    * @returns {Record} The removed {@link Record}s, if any.
    * @see Collection#add
    * @see Collection#add
    * @since 3.0.0
    */
  def removeAll(name: js.Any, query: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Remove from the store {@link Record}s that are related to the provided
    * {@link Record}(s).
    *
    * @fires SimpleStore#remove
    * @method SimpleStore#removeRelated
    * @param {string} name The name of the {@link Collection} to target.
    * @param {Record|Record[]} records {@link Record}s whose relations are to be
    * removed.
    * @param {object} [opts] Configuration options.
    * @param {string[]} [opts.with] Relations of the {@link Record}(s) to remove
    * from the store.
    * @since 3.0.0
    */
  def removeRelated(name: js.Any, records: js.Any, opts: js.Any): Unit = js.native
  /**
    * Wrapper for {@link Collection#unsaved}.
    *
    * @method SimpleStore#unsaved
    * @returns {Array} See {@link Collection#unsaved}.
    * @see Collection#unsaved
    * @see Collection#unsaved
    * @since 3.0.0
    */
  def unsaved(name: js.Any): js.Any = js.native
  def unsaved(name: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Fired during {@link SimpleStore#update}. See
    * {@link SimpleStore~beforeUpdateListener} for how to listen for this event.
    *
    * @event SimpleStore#beforeUpdate
    * @see SimpleStore~beforeUpdateListener
    * @see SimpleStore#update
    */
  /**
    * Callback signature for the {@link SimpleStore#event:beforeUpdate} event.
    *
    * @example
    * function onBeforeUpdate (mapperName, id, props, opts) {
    *   // do something
    * }
    * store.on('beforeUpdate', onBeforeUpdate);
    *
    * @callback SimpleStore~beforeUpdateListener
    * @param {string} name The `name` argument received by {@link Mapper#beforeUpdate}.
    * @param {string|number} id The `id` argument received by {@link Mapper#beforeUpdate}.
    * @param {object} props The `props` argument received by {@link Mapper#beforeUpdate}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeUpdate}.
    * @see SimpleStore#event:beforeUpdate
    * @see SimpleStore#update
    * @since 3.0.0
    */
  /**
    * Fired during {@link SimpleStore#update}. See
    * {@link SimpleStore~afterUpdateListener} for how to listen for this event.
    *
    * @event SimpleStore#afterUpdate
    * @see SimpleStore~afterUpdateListener
    * @see SimpleStore#update
    */
  /**
    * Callback signature for the {@link SimpleStore#event:afterUpdate} event.
    *
    * @example
    * function onAfterUpdate (mapperName, id, props, opts, result) {
    *   // do something
    * }
    * store.on('afterUpdate', onAfterUpdate);
    *
    * @callback SimpleStore~afterUpdateListener
    * @param {string} name The `name` argument received by {@link Mapper#afterUpdate}.
    * @param {string|number} id The `id` argument received by {@link Mapper#afterUpdate}.
    * @param {object} props The `props` argument received by {@link Mapper#afterUpdate}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterUpdate}.
    * @param {object} result The `result` argument received by {@link Mapper#afterUpdate}.
    * @see SimpleStore#event:afterUpdate
    * @see SimpleStore#update
    * @since 3.0.0
    */
  /**
    * Wrapper for {@link Mapper#update}. Adds the updated {@link Record} to the
    * store.
    *
    * @example
    * import { SimpleStore } from 'js-data';
    * import { HttpAdapter } from 'js-data-http';
    *
    * const store = new SimpleStore();
    * store.registerAdapter('http', new HttpAdapter(), { default: true });
    *
    * store.defineMapper('post');
    *
    * // Since this example uses the http adapter, we'll get something like:
    * //
    * //   PUT /post/1234 {"status":"published"}
    * store.update('post', 1, { status: 'published' }).then((post) => {
    *   // The post record has also been updated in the in-memory store
    *   console.log(store.get('post', 1234));
    * });
    *
    * @fires SimpleStore#beforeUpdate
    * @fires SimpleStore#afterUpdate
    * @fires SimpleStore#add
    * @method SimpleStore#update
    * @param {string} name Name of the {@link Mapper} to target.
    * @param {(string|number)} id Passed to {@link Mapper#update}.
    * @param {object} record Passed to {@link Mapper#update}.
    * @param {object} [opts] Passed to {@link Mapper#update}. See
    * {@link Mapper#update} for more configuration options.
    * @returns {Promise} Resolves with the result of the update.
    * @since 3.0.0
    */
  def update(name: js.Any, id: js.Any, record: js.Any): js.Promise[_] = js.native
  /**
    * Fired during {@link SimpleStore#updateAll}. See
    * {@link SimpleStore~beforeUpdateAllListener} for how to listen for this event.
    *
    * @event SimpleStore#beforeUpdateAll
    * @see SimpleStore~beforeUpdateAllListener
    * @see SimpleStore#updateAll
    */
  /**
    * Callback signature for the {@link SimpleStore#event:beforeUpdateAll} event.
    *
    * @example
    * function onBeforeUpdateAll (mapperName, props, query, opts) {
    *   // do something
    * }
    * store.on('beforeUpdateAll', onBeforeUpdateAll);
    *
    * @callback SimpleStore~beforeUpdateAllListener
    * @param {string} name The `name` argument received by {@link Mapper#beforeUpdateAll}.
    * @param {object} props The `props` argument received by {@link Mapper#beforeUpdateAll}.
    * @param {object} query The `query` argument received by {@link Mapper#beforeUpdateAll}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeUpdateAll}.
    * @see SimpleStore#event:beforeUpdateAll
    * @see SimpleStore#updateAll
    * @since 3.0.0
    */
  /**
    * Fired during {@link SimpleStore#updateAll}. See
    * {@link SimpleStore~afterUpdateAllListener} for how to listen for this event.
    *
    * @event SimpleStore#afterUpdateAll
    * @see SimpleStore~afterUpdateAllListener
    * @see SimpleStore#updateAll
    */
  /**
    * Callback signature for the {@link SimpleStore#event:afterUpdateAll} event.
    *
    * @example
    * function onAfterUpdateAll (mapperName, props, query, opts, result) {
    *   // do something
    * }
    * store.on('afterUpdateAll', onAfterUpdateAll);
    *
    * @callback SimpleStore~afterUpdateAllListener
    * @param {string} name The `name` argument received by {@link Mapper#afterUpdateAll}.
    * @param {object} props The `props` argument received by {@link Mapper#afterUpdateAll}.
    * @param {object} query The `query` argument received by {@link Mapper#afterUpdateAll}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterUpdateAll}.
    * @param {object} result The `result` argument received by {@link Mapper#afterUpdateAll}.
    * @see SimpleStore#event:afterUpdateAll
    * @see SimpleStore#updateAll
    * @since 3.0.0
    */
  /**
    * Wrapper for {@link Mapper#updateAll}. Adds the updated {@link Record}s to
    * the store.
    *
    * @example
    * import { SimpleStore } from 'js-data';
    * import { HttpAdapter } from 'js-data-http';
    *
    * const store = new SimpleStore();
    * store.registerAdapter('http', new HttpAdapter(), { default: true });
    *
    * store.defineMapper('post');
    *
    * // Since this example uses the http adapter, we'll get something like:
    * //
    * //   PUT /post?author_id=1234 {"status":"published"}
    * store.updateAll('post', { author_id: 1234 }, { status: 'published' }).then((posts) => {
    *   // The post records have also been updated in the in-memory store
    *   console.log(store.filter('posts', { author_id: 1234 }));
    * });
    *
    * @fires SimpleStore#beforeUpdateAll
    * @fires SimpleStore#afterUpdateAll
    * @fires SimpleStore#add
    * @method SimpleStore#updateAll
    * @param {string} name Name of the {@link Mapper} to target.
    * @param {object} props Passed to {@link Mapper#updateAll}.
    * @param {object} [query] Passed to {@link Mapper#updateAll}.
    * @param {object} [opts] Passed to {@link Mapper#updateAll}. See
    * {@link Mapper#updateAll} for more configuration options.
    * @returns {Promise} Resolves with the result of the update.
    * @since 3.0.0
    */
  def updateAll(name: js.Any, props: js.Any, query: js.Any): js.Promise[_] = js.native
  /**
    * Fired during {@link SimpleStore#updateMany}. See
    * {@link SimpleStore~beforeUpdateManyListener} for how to listen for this event.
    *
    * @event SimpleStore#beforeUpdateMany
    * @see SimpleStore~beforeUpdateManyListener
    * @see SimpleStore#updateMany
    */
  /**
    * Callback signature for the {@link SimpleStore#event:beforeUpdateMany} event.
    *
    * @example
    * function onBeforeUpdateMany (mapperName, records, opts) {
    *   // do something
    * }
    * store.on('beforeUpdateMany', onBeforeUpdateMany);
    *
    * @callback SimpleStore~beforeUpdateManyListener
    * @param {string} name The `name` argument received by {@link Mapper#beforeUpdateMany}.
    * @param {object} records The `records` argument received by {@link Mapper#beforeUpdateMany}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeUpdateMany}.
    * @see SimpleStore#event:beforeUpdateMany
    * @see SimpleStore#updateMany
    * @since 3.0.0
    */
  /**
    * Fired during {@link SimpleStore#updateMany}. See
    * {@link SimpleStore~afterUpdateManyListener} for how to listen for this event.
    *
    * @event SimpleStore#afterUpdateMany
    * @see SimpleStore~afterUpdateManyListener
    * @see SimpleStore#updateMany
    */
  /**
    * Callback signature for the {@link SimpleStore#event:afterUpdateMany} event.
    *
    * @example
    * function onAfterUpdateMany (mapperName, records, opts, result) {
    *   // do something
    * }
    * store.on('afterUpdateMany', onAfterUpdateMany);
    *
    * @callback SimpleStore~afterUpdateManyListener
    * @param {string} name The `name` argument received by {@link Mapper#afterUpdateMany}.
    * @param {object} records The `records` argument received by {@link Mapper#afterUpdateMany}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterUpdateMany}.
    * @param {object} result The `result` argument received by {@link Mapper#afterUpdateMany}.
    * @see SimpleStore#event:afterUpdateMany
    * @see SimpleStore#updateMany
    * @since 3.0.0
    */
  /**
    * Wrapper for {@link Mapper#updateMany}. Adds the updated {@link Record}s to
    * the store.
    *
    * @example
    * import { SimpleStore } from 'js-data';
    * import { HttpAdapter } from 'js-data-http';
    *
    * const store = new SimpleStore();
    * store.registerAdapter('http', new HttpAdapter(), { default: true });
    *
    * store.defineMapper('post');
    *
    * // Since this example uses the http adapter, we'll get something like:
    * //
    * //   PUT /post [{"id":3,status":"published"},{"id":4,status":"published"}]
    * store.updateMany('post', [
    *   { id: 3, status: 'published' },
    *   { id: 4, status: 'published' }
    * ]).then((posts) => {
    *   // The post records have also been updated in the in-memory store
    *   console.log(store.getAll('post', 3, 4));
    * });
    *
    * @fires SimpleStore#beforeUpdateMany
    * @fires SimpleStore#afterUpdateMany
    * @fires SimpleStore#add
    * @method SimpleStore#updateMany
    * @param {string} name Name of the {@link Mapper} to target.
    * @param {(Object[]|Record[])} records Passed to {@link Mapper#updateMany}.
    * @param {object} [opts] Passed to {@link Mapper#updateMany}. See
    * {@link Mapper#updateMany} for more configuration options.
    * @returns {Promise} Resolves with the result of the update.
    * @since 3.0.0
    */
  def updateMany(name: js.Any, records: js.Any): js.Promise[_] = js.native
}

