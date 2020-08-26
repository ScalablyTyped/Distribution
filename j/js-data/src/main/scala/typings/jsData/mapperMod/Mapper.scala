package typings.jsData.mapperMod

import typings.jsData.anon.Count
import typings.jsData.anon.TypeofRecord
import typings.jsData.jsDataBooleans.`false`
import typings.jsData.queryMod.QueryDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mapper
  extends typings.jsData.componentMod.default {
  var _adapters: js.Any = js.native
  var applySchema: js.Any = js.native
  /**
    * The {@link Container} that holds this Mapper. __Do not modify.__
    *
    * @name Mapper#lifecycleMethods
    * @since 3.0.0
    * @type {Object}
    */
  var datastore: js.Any = js.native
  var defaultAdapter: js.Any = js.native
  var idAttribute: String = js.native
  var keepChangeHistory: js.Any = js.native
  /**
    * The meta information describing this Mapper's available lifecycle
    * methods. __Do not modify.__
    *
    * @name Mapper#lifecycleMethods
    * @since 3.0.0
    * @type {Object}
    */
  var lifecycleMethods: Count = js.native
  var methods: js.Any = js.native
  var name: String = js.native
  /**
    * Set to `false` to force the Mapper to work with POJO objects only.
    *
    * @example
    * // Use POJOs only.
    * import { Mapper, Record } from 'js-data';
    * const UserMapper = new Mapper({ recordClass: false });
    * UserMapper.recordClass // false;
    * const user = UserMapper.createRecord();
    * user instanceof Record; // false
    *
    * @example
    * // Set to a custom class to have records wrapped in your custom class.
    * import { Mapper, Record } from 'js-data';
    *  // Custom class
    * class User {
    *   constructor (props = {}) {
    *     for (var key in props) {
    *       if (props.hasOwnProperty(key)) {
    *         this[key] = props[key];
    *       }
    *     }
    *   }
    * }
    * const UserMapper = new Mapper({ recordClass: User });
    * UserMapper.recordClass; // function User() {}
    * const user = UserMapper.createRecord();
    * user instanceof Record; // false
    * user instanceof User; // true
    *
    *
    * @example
    * // Extend the {@link Record} class.
    * import { Mapper, Record } from 'js-data';
    *  // Custom class
    * class User extends Record {
    *   constructor () {
    *     super(props);
    *   }
    * }
    * const UserMapper = new Mapper({ recordClass: User });
    * UserMapper.recordClass; // function User() {}
    * const user = UserMapper.createRecord();
    * user instanceof Record; // true
    * user instanceof User; // true
    *
    * @name Mapper#recordClass
    * @default {@link Record}
    * @see Record
    * @since 3.0.0
    */
  var recordClass: TypeofRecord | js.Function | `false` | js.Any = js.native
  var relationFields: js.Any = js.native
  var relationList: js.Any = js.native
  var relations: js.Any = js.native
  /**
    * This Mapper's {@link Schema}.
    *
    * @example <caption>Mapper#schema</caption>
    * const JSData = require('js-data');
    * const { Mapper } = JSData;
    * console.log('Using JSData v' + JSData.version.full);
    *
    * const UserMapper = new Mapper({
    *   name: 'user',
    *   schema: {
    *     properties: {
    *       id: { type: 'number' },
    *       first: { type: 'string', track: true },
    *       last: { type: 'string', track: true },
    *       role: { type: 'string', track: true, required: true },
    *       age: { type: 'integer', track: true },
    *       is_active: { type: 'number' }
    *     }
    *   }
    * });
    * const user = UserMapper.createRecord({
    *   id: 1,
    *   name: 'John',
    *   role: 'admin'
    * });
    * user.on('change', function (user, changes) {
    *   console.log(changes);
    * });
    * user.on('change:role', function (user, value) {
    *   console.log('change:role - ' + value);
    * });
    * user.role = 'owner';
    *
    * @name Mapper#schema
    * @see Schema
    * @since 3.0.0
    * @type {Schema}
    */
  var schema: typings.jsData.schemaMod.default = js.native
  var validateOnSet: js.Any = js.native
  def _commitChanges(recordOrRecords: js.Any, newValues: js.Any): js.Any = js.native
  /**
    * Creates child record for relation types like HasOne or HasMany with foreignKey
    * in order to satisfy foreignKey dependency (so called parent records).
    * @param {object} props See {@link Mapper#create}.
    * @param {object} context contains collected information.
    * @param {object} context.opts See {@link Mapper#create}.
    * @param {object} context.parentRelationMap contains parent records map
    * @param {object} context.originalProps contains data passed into {@link Mapper#create} method
    * @return {Promise} updated props
    * @see Mapper#create
    * @since 3.0.0
    */
  def _createOrAssignChildRecordIfRequired(props: js.Any, context: js.Any): js.Promise[_] = js.native
  /**
    * Creates parent record for relation types like BelongsTo or HasMany with localKeys
    * in order to satisfy foreignKey dependency (so called child records).
    * @param {object} props See {@link Mapper#create}.
    * @param {object} opts See {@link Mapper#create}.
    * @returns {Object} cached parent records map
    * @see Mapper#create
    * @since 3.0.0
    */
  def _createParentRecordIfRequired(props: js.Any, opts: js.Any): js.Promise[_] = js.native
  /**
    * This method is called at the end of most lifecycle methods. It does the
    * following:
    *
    * 1. If `opts.raw` is `true`, add this Mapper's configuration to the `opts`
    * argument as metadata for the operation.
    * 2. Wrap the result data appropriately using {@link Mapper#wrap}, which
    * calls {@link Mapper#createRecord}.
    *
    * @method Mapper#_end
    * @private
    * @since 3.0.0
    */
  def _end(result: js.Any, opts: js.Any): js.Any = js.native
  def _end(result: js.Any, opts: js.Any, skip: Boolean): js.Any = js.native
  def _invokeAdapterMethod(method: js.Any, propsOrRecords: js.Any, opts: js.Any): js.Any = js.native
  def _runHook(hookName: js.Any, hookArgs: js.Any*): js.Promise[_] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#count}. If this method
    * returns a promise then {@link Mapper#count} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#afterCount
    * @param {object} query The `query` argument passed to {@link Mapper#count}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#count}.
    * @param {*} result The result, if any.
    * @since 3.0.0
    */
  def afterCount(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#create}. If this method
    * returns a promise then {@link Mapper#create} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#afterCreate
    * @param {object} props The `props` argument passed to {@link Mapper#create}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#create}.
    * @param {*} result The result, if any.
    * @since 3.0.0
    */
  def afterCreate(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#createMany}. If this method
    * returns a promise then {@link Mapper#createMany} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#afterCreateMany
    * @param {array} records The `records` argument passed to {@link Mapper#createMany}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#createMany}.
    * @param {*} result The result, if any.
    * @since 3.0.0
    */
  def afterCreateMany(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#destroy}. If this method
    * returns a promise then {@link Mapper#destroy} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#afterDestroy
    * @param {(string|number)} id The `id` argument passed to {@link Mapper#destroy}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#destroy}.
    * @param {*} result The result, if any.
    * @since 3.0.0
    */
  def afterDestroy(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#destroyAll}. If this method
    * returns a promise then {@link Mapper#destroyAll} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#afterDestroyAll
    * @param {*} data The `data` returned by the adapter.
    * @param {query} query The `query` argument passed to {@link Mapper#destroyAll}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#destroyAll}.
    * @param {*} result The result, if any.
    * @since 3.0.0
    */
  def afterDestroyAll(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#find}. If this method
    * returns a promise then {@link Mapper#find} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#afterFind
    * @param {(string|number)} id The `id` argument passed to {@link Mapper#find}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#find}.
    * @param {*} result The result, if any.
    * @since 3.0.0
    */
  def afterFind(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#findAll}. If this method
    * returns a promise then {@link Mapper#findAll} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#afterFindAll
    * @param {object} query The `query` argument passed to {@link Mapper#findAll}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#findAll}.
    * @param {*} result The result, if any.
    * @since 3.0.0
    */
  def afterFindAll(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#sum}. If this method
    * returns a promise then {@link Mapper#sum} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#afterSum
    * @param {object} query The `query` argument passed to {@link Mapper#sum}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#sum}.
    * @param {*} result The result, if any.
    * @since 3.0.0
    */
  def afterSum(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#update}. If this method
    * returns a promise then {@link Mapper#update} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#afterUpdate
    * @param {(string|number)} id The `id` argument passed to {@link Mapper#update}.
    * @param {props} props The `props` argument passed to {@link Mapper#update}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#update}.
    * @param {*} result The result, if any.
    * @since 3.0.0
    */
  def afterUpdate(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#updateAll}. If this method
    * returns a promise then {@link Mapper#updateAll} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#afterUpdateAll
    * @param {object} props The `props` argument passed to {@link Mapper#updateAll}.
    * @param {object} query The `query` argument passed to {@link Mapper#updateAll}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#updateAll}.
    * @param {*} result The result, if any.
    * @since 3.0.0
    */
  def afterUpdateAll(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#updateMany}. If this method
    * returns a promise then {@link Mapper#updateMany} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#afterUpdateMany
    * @param {array} records The `records` argument passed to {@link Mapper#updateMany}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#updateMany}.
    * @param {*} result The result, if any.
    * @since 3.0.0
    */
  def afterUpdateMany(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#count}. If this method
    * returns a promise then {@link Mapper#count} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#beforeCount
    * @param {object} query The `query` argument passed to {@link Mapper#count}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#count}.
    * @since 3.0.0
    */
  def beforeCount(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#create}. If this method
    * returns a promise then {@link Mapper#create} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#beforeCreate
    * @param {object} props The `props` argument passed to {@link Mapper#create}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#create}.
    * @since 3.0.0
    */
  def beforeCreate(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#createMany}. If this method
    * returns a promise then {@link Mapper#createMany} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#beforeCreateMany
    * @param {array} records The `records` argument passed to {@link Mapper#createMany}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#createMany}.
    * @since 3.0.0
    */
  def beforeCreateMany(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#destroy}. If this method
    * returns a promise then {@link Mapper#destroy} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#beforeDestroy
    * @param {(string|number)} id The `id` argument passed to {@link Mapper#destroy}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#destroy}.
    * @since 3.0.0
    */
  def beforeDestroy(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#destroyAll}. If this method
    * returns a promise then {@link Mapper#destroyAll} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#beforeDestroyAll
    * @param {query} query The `query` argument passed to {@link Mapper#destroyAll}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#destroyAll}.
    * @since 3.0.0
    */
  def beforeDestroyAll(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mappers lifecycle hook called by {@link Mapper#find}. If this method
    * returns a promise then {@link Mapper#find} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#beforeFind
    * @param {(string|number)} id The `id` argument passed to {@link Mapper#find}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#find}.
    * @since 3.0.0
    */
  def beforeFind(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#findAll}. If this method
    * returns a promise then {@link Mapper#findAll} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#beforeFindAll
    * @param {object} query The `query` argument passed to {@link Mapper#findAll}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#findAll}.
    * @since 3.0.0
    */
  def beforeFindAll(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#sum}. If this method
    * returns a promise then {@link Mapper#sum} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#beforeSum
    * @param {string} field The `field` argument passed to {@link Mapper#sum}.
    * @param {object} query The `query` argument passed to {@link Mapper#sum}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#sum}.
    * @since 3.0.0
    */
  def beforeSum(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#update}. If this method
    * returns a promise then {@link Mapper#update} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#beforeUpdate
    * @param {(string|number)} id The `id` argument passed to {@link Mapper#update}.
    * @param {props} props The `props` argument passed to {@link Mapper#update}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#update}.
    * @since 3.0.0
    */
  def beforeUpdate(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#updateAll}. If this method
    * returns a promise then {@link Mapper#updateAll} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#beforeUpdateAll
    * @param {object} props The `props` argument passed to {@link Mapper#updateAll}.
    * @param {object} query The `query` argument passed to {@link Mapper#updateAll}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#updateAll}.
    * @since 3.0.0
    */
  def beforeUpdateAll(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Mapper lifecycle hook called by {@link Mapper#updateMany}. If this method
    * returns a promise then {@link Mapper#updateMany} will wait for the promise
    * to resolve before continuing.
    *
    * @method Mapper#beforeUpdateMany
    * @param {array} records The `records` argument passed to {@link Mapper#updateMany}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#updateMany}.
    * @since 3.0.0
    */
  def beforeUpdateMany(args: js.Any*): js.Promise[scala.Nothing] = js.native
  /**
    * Define a belongsTo relationship. Only useful if you're managing your
    * Mappers manually and not using a Container or DataStore component.
    *
    * @example
    * PostMapper.belongsTo(UserMapper, {
    *   // post.user_id points to user.id
    *   foreignKey: 'user_id'
    *   // user records will be attached to post records at "post.user"
    *   localField: 'user'
    * });
    *
    * CommentMapper.belongsTo(UserMapper, {
    *   // comment.user_id points to user.id
    *   foreignKey: 'user_id'
    *   // user records will be attached to comment records at "comment.user"
    *   localField: 'user'
    * });
    * CommentMapper.belongsTo(PostMapper, {
    *   // comment.post_id points to post.id
    *   foreignKey: 'post_id'
    *   // post records will be attached to comment records at "comment.post"
    *   localField: 'post'
    * });
    *
    * @method Mapper#belongsTo
    * @see http://www.js-data.io/v3.0/docs/relations
    * @since 3.0.0
    */
  def belongsTo(relatedMapper: js.Any, opts: js.Any): Unit = js.native
  /**
    * Select records according to the `query` argument and return the count.
    *
    * {@link Mapper#beforeCount} will be called before calling the adapter.
    * {@link Mapper#afterCount} will be called after calling the adapter.
    *
    * @example
    * // Get the number of published blog posts
    * PostMapper.count({ status: 'published' }).then((numPublished) => {
    *   console.log(numPublished); // e.g. 45
    * });
    *
    * @method Mapper#count
    * @param {object} [query={}] Selection query. See {@link query}.
    * @param {object} [query.where] See {@link query.where}.
    * @param {number} [query.offset] See {@link query.offset}.
    * @param {number} [query.limit] See {@link query.limit}.
    * @param {string|Array[]} [query.orderBy] See {@link query.orderBy}.
    * @param {object} [opts] Configuration options. Refer to the `count` method
    * of whatever adapter you're using for more configuration options.
    * @param {boolean} [opts.adapter={@link Mapper#defaultAdapter}] Name of the
    * adapter to use.
    * @param {boolean} [opts.notify={@link Mapper#notify}] See {@link Mapper#notify}.
    * @param {boolean} [opts.raw={@link Mapper#raw}] See {@link Mapper#raw}.
    * @returns {Promise} Resolves with the count of the selected records.
    * @since 3.0.0
    */
  def count(query: js.Any): js.Promise[_] = js.native
  def count(query: js.Any, opts: js.Any): js.Promise[_] = js.native
  /**
    * Fired during {@link Mapper#create}. See
    * {@link Mapper~beforeCreateListener} for how to listen for this event.
    *
    * @event Mapper#beforeCreate
    * @see Mapper~beforeCreateListener
    * @see Mapper#create
    */
  /**
    * Callback signature for the {@link Mapper#event:beforeCreate} event.
    *
    * @example
    * function onBeforeCreate (props, opts) {
    *   // do something
    * }
    * store.on('beforeCreate', onBeforeCreate);
    *
    * @callback Mapper~beforeCreateListener
    * @param {object} props The `props` argument passed to {@link Mapper#beforeCreate}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#beforeCreate}.
    * @see Mapper#event:beforeCreate
    * @see Mapper#create
    * @since 3.0.0
    */
  /**
    * Fired during {@link Mapper#create}. See
    * {@link Mapper~afterCreateListener} for how to listen for this event.
    *
    * @event Mapper#afterCreate
    * @see Mapper~afterCreateListener
    * @see Mapper#create
    */
  /**
    * Callback signature for the {@link Mapper#event:afterCreate} event.
    *
    * @example
    * function onAfterCreate (props, opts, result) {
    *   // do something
    * }
    * store.on('afterCreate', onAfterCreate);
    *
    * @callback Mapper~afterCreateListener
    * @param {object} props The `props` argument passed to {@link Mapper#afterCreate}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#afterCreate}.
    * @param {object} result The `result` argument passed to {@link Mapper#afterCreate}.
    * @see Mapper#event:afterCreate
    * @see Mapper#create
    * @since 3.0.0
    */
  /**
    * Create and save a new the record using the provided `props`.
    *
    * {@link Mapper#beforeCreate} will be called before calling the adapter.
    * {@link Mapper#afterCreate} will be called after calling the adapter.
    *
    * @example
    * // Create and save a new blog post
    * PostMapper.create({
    *   title: 'Modeling your data',
    *   status: 'draft'
    * }).then((post) => {
    *   console.log(post); // { id: 1234, status: 'draft', ... }
    * });
    *
    * @fires Mapper#beforeCreate
    * @fires Mapper#afterCreate
    * @method Mapper#create
    * @param {object} props The properties for the new record.
    * @param {object} [opts] Configuration options. Refer to the `create` method
    * of whatever adapter you're using for more configuration options.
    * @param {boolean} [opts.adapter={@link Mapper#defaultAdapter}] Name of the
    * adapter to use.
    * @param {boolean} [opts.noValidate={@link Mapper#noValidate}] See {@link Mapper#noValidate}.
    * @param {boolean} [opts.notify={@link Mapper#notify}] See {@link Mapper#notify}.
    * @param {boolean} [opts.raw={@link Mapper#raw}] See {@link Mapper#raw}.
    * @param {string[]} [opts.with=[]] Relations to create in a cascading
    * create if `props` contains nested relations. NOT performed in a
    * transaction. Each nested create will result in another {@link Mapper#create}
    * or {@link Mapper#createMany} call.
    * @param {string[]} [opts.pass=[]] Relations to send to the adapter as part
    * of the payload. Normally relations are not sent.
    * @returns {Promise} Resolves with the created record.
    * @since 3.0.0
    */
  def create(): js.Promise[_] = js.native
  def create(props: js.UndefOr[scala.Nothing], opts: js.Any): js.Promise[_] = js.native
  def create(props: js.Any): js.Promise[_] = js.native
  def create(props: js.Any, opts: js.Any): js.Promise[_] = js.native
  /**
    * Use {@link Mapper#createRecord} instead.
    * @deprecated
    * @method Mapper#createInstance
    * @param {Object|Array} props See {@link Mapper#createRecord}.
    * @param {object} [opts] See {@link Mapper#createRecord}.
    * @returns {Object|Array} See {@link Mapper#createRecord}.
    * @see Mapper#createRecord
    * @since 3.0.0
    */
  def createInstance(props: js.Any): js.Any = js.native
  def createInstance(props: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Fired during {@link Mapper#createMany}. See
    * {@link Mapper~beforeCreateManyListener} for how to listen for this event.
    *
    * @event Mapper#beforeCreateMany
    * @see Mapper~beforeCreateManyListener
    * @see Mapper#createMany
    */
  /**
    * Callback signature for the {@link Mapper#event:beforeCreateMany} event.
    *
    * @example
    * function onBeforeCreateMany (records, opts) {
    *   // do something
    * }
    * store.on('beforeCreateMany', onBeforeCreateMany);
    *
    * @callback Mapper~beforeCreateManyListener
    * @param {object} records The `records` argument received by {@link Mapper#beforeCreateMany}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeCreateMany}.
    * @see Mapper#event:beforeCreateMany
    * @see Mapper#createMany
    * @since 3.0.0
    */
  /**
    * Fired during {@link Mapper#createMany}. See
    * {@link Mapper~afterCreateManyListener} for how to listen for this event.
    *
    * @event Mapper#afterCreateMany
    * @see Mapper~afterCreateManyListener
    * @see Mapper#createMany
    */
  /**
    * Callback signature for the {@link Mapper#event:afterCreateMany} event.
    *
    * @example
    * function onAfterCreateMany (records, opts, result) {
    *   // do something
    * }
    * store.on('afterCreateMany', onAfterCreateMany);
    *
    * @callback Mapper~afterCreateManyListener
    * @param {object} records The `records` argument received by {@link Mapper#afterCreateMany}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterCreateMany}.
    * @param {object} result The `result` argument received by {@link Mapper#afterCreateMany}.
    * @see Mapper#event:afterCreateMany
    * @see Mapper#createMany
    * @since 3.0.0
    */
  /**
    * Given an array of records, batch create them via an adapter.
    *
    * {@link Mapper#beforeCreateMany} will be called before calling the adapter.
    * {@link Mapper#afterCreateMany} will be called after calling the adapter.
    *
    * @example
    * // Create and save several new blog posts
    * PostMapper.createMany([{
    *   title: 'Modeling your data',
    *   status: 'draft'
    * }, {
    *   title: 'Reading data',
    *   status: 'draft'
    * }]).then((posts) => {
    *   console.log(posts[0]); // { id: 1234, status: 'draft', ... }
    *   console.log(posts[1]); // { id: 1235, status: 'draft', ... }
    * });
    *
    * @fires Mapper#beforeCreate
    * @fires Mapper#afterCreate
    * @method Mapper#createMany
    * @param {Record[]} records Array of records to be created in one batch.
    * @param {object} [opts] Configuration options. Refer to the `createMany`
    * method of whatever adapter you're using for more configuration options.
    * @param {boolean} [opts.adapter={@link Mapper#defaultAdapter}] Name of the
    * adapter to use.
    * @param {boolean} [opts.noValidate={@link Mapper#noValidate}] See {@link Mapper#noValidate}.
    * @param {boolean} [opts.notify={@link Mapper#notify}] See {@link Mapper#notify}.
    * @param {boolean} [opts.raw={@link Mapper#raw}] See {@link Mapper#raw}.
    * @param {string[]} [opts.with=[]] Relations to create in a cascading
    * create if `records` contains nested relations. NOT performed in a
    * transaction. Each nested create will result in another {@link Mapper#createMany}
    * call.
    * @param {string[]} [opts.pass=[]] Relations to send to the adapter as part
    * of the payload. Normally relations are not sent.
    * @returns {Promise} Resolves with the created records.
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/saving-data","Saving data"]
    */
  def createMany(): js.Promise[_] = js.native
  def createMany(records: js.UndefOr[scala.Nothing], opts: js.Any): js.Promise[_] = js.native
  def createMany(records: js.Array[_]): js.Promise[_] = js.native
  def createMany(records: js.Array[_], opts: js.Any): js.Promise[_] = js.native
  /**
    * Create an unsaved, uncached instance of this Mapper's
    * {@link Mapper#recordClass}.
    *
    * Returns `props` if `props` is already an instance of
    * {@link Mapper#recordClass}.
    *
    * __Note:__ This method does __not__ interact with any adapter, and does
    * __not__ save any data. It only creates new objects in memory.
    *
    * @example
    * // Create empty unsaved record instance
    * const post = PostMapper.createRecord();
    *
    * @example
    * // Create an unsaved record instance with inital properties
    * const post = PostMapper.createRecord({
    *   title: 'Modeling your data',
    *   status: 'draft'
    * });
    *
    * @example
    * // Create a record instance that corresponds to a saved record
    * const post = PostMapper.createRecord({
    *   // JSData thinks this record has been saved if it has a primary key
    *   id: 1234,
    *   title: 'Modeling your data',
    *   status: 'draft'
    * });
    *
    * @example
    * // Create record instances from an array
    * const posts = PostMapper.createRecord([{
    *   title: 'Modeling your data',
    *   status: 'draft'
    * }, {
    *   title: 'Reading data',
    *   status: 'draft'
    * }]);
    *
    * @example
    * // Records are validated by default
    * import { Mapper } from 'js-data';
    * const PostMapper = new Mapper({
    *   name: 'post',
    *   schema: { properties: { title: { type: 'string' } } }
    * });
    * try {
    *   const post = PostMapper.createRecord({
    *     title: 1234,
    *   });
    * } catch (err) {
    *   console.log(err.errors); // [{ expected: 'one of (string)', actual: 'number', path: 'title' }]
    * }
    *
    * @example
    * // Skip validation
    * import { Mapper } from 'js-data';
    * const PostMapper = new Mapper({
    *   name: 'post',
    *   schema: { properties: { title: { type: 'string' } } }
    * });
    * const post = PostMapper.createRecord({
    *   title: 1234,
    * }, { noValidate: true });
    * console.log(post.isValid()); // false
    *
    * @method Mapper#createRecord
    * @param {Object|Object[]} props The properties for the Record instance or an
    * array of property objects for the Record instances.
    * @param {object} [opts] Configuration options.
    * @param {boolean} [opts.noValidate={@link Mapper#noValidate}] See {@link Mapper#noValidate}.
    * @returns {Record|Record[]} The Record instance or Record instances.
    * @since 3.0.0
    */
  def createRecord(): typings.jsData.recordMod.default | js.Array[typings.jsData.recordMod.default] | js.Any = js.native
  def createRecord(props: js.UndefOr[scala.Nothing], opts: js.Any): typings.jsData.recordMod.default | js.Array[typings.jsData.recordMod.default] | js.Any = js.native
  def createRecord(props: js.Any): typings.jsData.recordMod.default | js.Array[typings.jsData.recordMod.default] | js.Any = js.native
  def createRecord(props: js.Any, opts: js.Any): typings.jsData.recordMod.default | js.Array[typings.jsData.recordMod.default] | js.Any = js.native
  /**
    * Lifecycle invocation method. You probably won't call this method directly.
    *
    * @method Mapper#crud
    * @param {string} method Name of the lifecycle method to invoke.
    * @param {...*} args Arguments to pass to the lifecycle method.
    * @returns {Promise}
    * @since 3.0.0
    */
  def crud(method: js.Any, args: js.Any*): js.Promise[_] = js.native
  /**
    * @ignore
    */
  def defineRelations(): Unit = js.native
  /**
    * Fired during {@link Mapper#destroy}. See
    * {@link Mapper~beforeDestroyListener} for how to listen for this event.
    *
    * @event Mapper#beforeDestroy
    * @see Mapper~beforeDestroyListener
    * @see Mapper#destroy
    */
  /**
    * Callback signature for the {@link Mapper#event:beforeDestroy} event.
    *
    * @example
    * function onBeforeDestroy (id, opts) {
    *   // do something
    * }
    * store.on('beforeDestroy', onBeforeDestroy);
    *
    * @callback Mapper~beforeDestroyListener
    * @param {string|number} id The `id` argument passed to {@link Mapper#beforeDestroy}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#beforeDestroy}.
    * @see Mapper#event:beforeDestroy
    * @see Mapper#destroy
    * @since 3.0.0
    */
  /**
    * Fired during {@link Mapper#destroy}. See
    * {@link Mapper~afterDestroyListener} for how to listen for this event.
    *
    * @event Mapper#afterDestroy
    * @see Mapper~afterDestroyListener
    * @see Mapper#destroy
    */
  /**
    * Callback signature for the {@link Mapper#event:afterDestroy} event.
    *
    * @example
    * function onAfterDestroy (id, opts, result) {
    *   // do something
    * }
    * store.on('afterDestroy', onAfterDestroy);
    *
    * @callback Mapper~afterDestroyListener
    * @param {string|number} id The `id` argument passed to {@link Mapper#afterDestroy}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#afterDestroy}.
    * @param {object} result The `result` argument passed to {@link Mapper#afterDestroy}.
    * @see Mapper#event:afterDestroy
    * @see Mapper#destroy
    * @since 3.0.0
    */
  /**
    * Using an adapter, destroy the record with the given primary key.
    *
    * {@link Mapper#beforeDestroy} will be called before destroying the record.
    * {@link Mapper#afterDestroy} will be called after destroying the record.
    *
    * @example
    * // Destroy a specific blog post
    * PostMapper.destroy(1234).then(() => {
    *   // Blog post #1234 has been destroyed
    * });
    *
    * @example
    * // Get full response
    * PostMapper.destroy(1234, { raw: true }).then((result) => {
    *   console.log(result.deleted); e.g. 1
    *   console.log(...); // etc., more metadata can be found on the result
    * });
    *
    * @fires Mapper#beforeDestroy
    * @fires Mapper#afterDestroy
    * @method Mapper#destroy
    * @param {(string|number)} id The primary key of the record to destroy.
    * @param {object} [opts] Configuration options. Refer to the `destroy` method
    * of whatever adapter you're using for more configuration options.
    * @param {boolean} [opts.adapter={@link Mapper#defaultAdapter}] Name of the
    * adapter to use.
    * @param {boolean} [opts.notify={@link Mapper#notify}] See {@link Mapper#notify}.
    * @param {boolean} [opts.raw={@link Mapper#raw}] See {@link Mapper#raw}.
    * @returns {Promise} Resolves when the record has been destroyed. Resolves
    * even if no record was found to be destroyed.
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/saving-data","Saving data"]
    */
  def destroy(id: String): js.Promise[_] = js.native
  def destroy(id: String, opts: js.Any): js.Promise[_] = js.native
  def destroy(id: Double): js.Promise[_] = js.native
  def destroy(id: Double, opts: js.Any): js.Promise[_] = js.native
  /**
    * Fired during {@link Mapper#destroyAll}. See
    * {@link Mapper~beforeDestroyAllListener} for how to listen for this event.
    *
    * @event Mapper#beforeDestroyAll
    * @see Mapper~beforeDestroyAllListener
    * @see Mapper#destroyAll
    */
  /**
    * Callback signature for the {@link Mapper#event:beforeDestroyAll} event.
    *
    * @example
    * function onBeforeDestroyAll (query, opts) {
    *   // do something
    * }
    * store.on('beforeDestroyAll', onBeforeDestroyAll);
    *
    * @callback Mapper~beforeDestroyAllListener
    * @param {object} query The `query` argument passed to {@link Mapper#beforeDestroyAll}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#beforeDestroyAll}.
    * @see Mapper#event:beforeDestroyAll
    * @see Mapper#destroyAll
    * @since 3.0.0
    */
  /**
    * Fired during {@link Mapper#destroyAll}. See
    * {@link Mapper~afterDestroyAllListener} for how to listen for this event.
    *
    * @event Mapper#afterDestroyAll
    * @see Mapper~afterDestroyAllListener
    * @see Mapper#destroyAll
    */
  /**
    * Callback signature for the {@link Mapper#event:afterDestroyAll} event.
    *
    * @example
    * function onAfterDestroyAll (query, opts, result) {
    *   // do something
    * }
    * store.on('afterDestroyAll', onAfterDestroyAll);
    *
    * @callback Mapper~afterDestroyAllListener
    * @param {object} query The `query` argument passed to {@link Mapper#afterDestroyAll}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#afterDestroyAll}.
    * @param {object} result The `result` argument passed to {@link Mapper#afterDestroyAll}.
    * @see Mapper#event:afterDestroyAll
    * @see Mapper#destroyAll
    * @since 3.0.0
    */
  /**
    * Destroy the records selected by `query` via an adapter. If no `query` is
    * provided then all records will be destroyed.
    *
    * {@link Mapper#beforeDestroyAll} will be called before destroying the records.
    * {@link Mapper#afterDestroyAll} will be called after destroying the records.
    *
    * @example
    * // Destroy all blog posts
    * PostMapper.destroyAll().then(() => {
    *   // All blog posts have been destroyed
    * });
    *
    * @example
    * // Destroy all "draft" blog posts
    * PostMapper.destroyAll({ status: 'draft' }).then(() => {
    *   // All "draft" blog posts have been destroyed
    * });
    *
    * @example
    * // Get full response
    * const query = null;
    * const options = { raw: true };
    * PostMapper.destroyAll(query, options).then((result) => {
    *   console.log(result.deleted); e.g. 14
    *   console.log(...); // etc., more metadata can be found on the result
    * });
    *
    * @fires Mapper#beforeDestroyAll
    * @fires Mapper#afterDestroyAll
    * @method Mapper#destroyAll
    * @param {object} [query={}] Selection query. See {@link query}.
    * @param {object} [query.where] See {@link query.where}.
    * @param {number} [query.offset] See {@link query.offset}.
    * @param {number} [query.limit] See {@link query.limit}.
    * @param {string|Array[]} [query.orderBy] See {@link query.orderBy}.
    * @param {object} [opts] Configuration options. Refer to the `destroyAll`
    * method of whatever adapter you're using for more configuration options.
    * @param {boolean} [opts.adapter={@link Mapper#defaultAdapter}] Name of the
    * adapter to use.
    * @param {boolean} [opts.notify={@link Mapper#notify}] See {@link Mapper#notify}.
    * @param {boolean} [opts.raw={@link Mapper#raw}] See {@link Mapper#raw}.
    * @returns {Promise} Resolves when the records have been destroyed. Resolves
    * even if no records were found to be destroyed.
    * @see query
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/saving-data","Saving data"]
    */
  def destroyAll(): js.Promise[_] = js.native
  def destroyAll(query: js.UndefOr[scala.Nothing], opts: js.Any): js.Promise[_] = js.native
  def destroyAll(query: js.Any): js.Promise[_] = js.native
  def destroyAll(query: js.Any, opts: js.Any): js.Promise[_] = js.native
  /**
    * Fired during {@link Mapper#find}. See
    * {@link Mapper~beforeFindListener} for how to listen for this event.
    *
    * @event Mapper#beforeFind
    * @see Mapper~beforeFindListener
    * @see Mapper#find
    */
  /**
    * Callback signature for the {@link Mapper#event:beforeFind} event.
    *
    * @example
    * function onBeforeFind (id, opts) {
    *   // do something
    * }
    * store.on('beforeFind', onBeforeFind);
    *
    * @callback Mapper~beforeFindListener
    * @param {string|number} id The `id` argument passed to {@link Mapper#beforeFind}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#beforeFind}.
    * @see Mapper#event:beforeFind
    * @see Mapper#find
    * @since 3.0.0
    */
  /**
    * Fired during {@link Mapper#find}. See
    * {@link Mapper~afterFindListener} for how to listen for this event.
    *
    * @event Mapper#afterFind
    * @see Mapper~afterFindListener
    * @see Mapper#find
    */
  /**
    * Callback signature for the {@link Mapper#event:afterFind} event.
    *
    * @example
    * function onAfterFind (id, opts, result) {
    *   // do something
    * }
    * store.on('afterFind', onAfterFind);
    *
    * @callback Mapper~afterFindListener
    * @param {string|number} id The `id` argument passed to {@link Mapper#afterFind}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#afterFind}.
    * @param {object} result The `result` argument passed to {@link Mapper#afterFind}.
    * @see Mapper#event:afterFind
    * @see Mapper#find
    * @since 3.0.0
    */
  /**
    * Retrieve via an adapter the record with the given primary key.
    *
    * {@link Mapper#beforeFind} will be called before calling the adapter.
    * {@link Mapper#afterFind} will be called after calling the adapter.
    *
    * @example
    * PostMapper.find(1).then((post) => {
    *   console.log(post); // { id: 1, ...}
    * });
    *
    * @example
    * // Get full response
    * PostMapper.find(1, { raw: true }).then((result) => {
    *   console.log(result.data); // { id: 1, ...}
    *   console.log(result.found); // 1
    *   console.log(...); // etc., more metadata can be found on the result
    * });
    *
    * @fires Mapper#beforeFind
    * @fires Mapper#afterFind
    * @method Mapper#find
    * @param {(string|number)} id The primary key of the record to retrieve.
    * @param {object} [opts] Configuration options. Refer to the `find` method
    * of whatever adapter you're using for more configuration options.
    * @param {boolean} [opts.adapter={@link Mapper#defaultAdapter}] Name of the
    * adapter to use.
    * @param {boolean} [opts.notify={@link Mapper#notify}] See {@link Mapper#notify}.
    * @param {boolean} [opts.raw={@link Mapper#raw}] See {@link Mapper#raw}.
    * @param {string[]} [opts.with=[]] Relations to eager load in the request.
    * @returns {Promise} Resolves with the found record. Resolves with
    * `undefined` if no record was found.
    * @see http://www.js-data.io/v3.0/docs/reading-data
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/reading-data","Reading data"]
    */
  def find(id: String): js.Promise[_] = js.native
  def find(id: String, opts: js.Any): js.Promise[_] = js.native
  def find(id: Double): js.Promise[_] = js.native
  def find(id: Double, opts: js.Any): js.Promise[_] = js.native
  /**
    * Fired during {@link Mapper#findAll}. See
    * {@link Mapper~beforeFindAllListener} for how to listen for this event.
    *
    * @event Mapper#beforeFindAll
    * @see Mapper~beforeFindAllListener
    * @see Mapper#findAll
    */
  /**
    * Callback signature for the {@link Mapper#event:beforeFindAll} event.
    *
    * @example
    * function onBeforeFindAll (query, opts) {
    *   // do something
    * }
    * store.on('beforeFindAll', onBeforeFindAll);
    *
    * @callback Mapper~beforeFindAllListener
    * @param {object} query The `query` argument passed to {@link Mapper#beforeFindAll}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#beforeFindAll}.
    * @see Mapper#event:beforeFindAll
    * @see Mapper#findAll
    * @since 3.0.0
    */
  /**
    * Fired during {@link Mapper#findAll}. See
    * {@link Mapper~afterFindAllListener} for how to listen for this event.
    *
    * @event Mapper#afterFindAll
    * @see Mapper~afterFindAllListener
    * @see Mapper#findAll
    */
  /**
    * Callback signature for the {@link Mapper#event:afterFindAll} event.
    *
    * @example
    * function onAfterFindAll (query, opts, result) {
    *   // do something
    * }
    * store.on('afterFindAll', onAfterFindAll);
    *
    * @callback Mapper~afterFindAllListener
    * @param {object} query The `query` argument passed to {@link Mapper#afterFindAll}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#afterFindAll}.
    * @param {object} result The `result` argument passed to {@link Mapper#afterFindAll}.
    * @see Mapper#event:afterFindAll
    * @see Mapper#findAll
    * @since 3.0.0
    */
  /**
    * Using the `query` argument, select records to retrieve via an adapter.
    *
    * {@link Mapper#beforeFindAll} will be called before calling the adapter.
    * {@link Mapper#afterFindAll} will be called after calling the adapter.
    *
    * @example
    * // Find all "published" blog posts
    * PostMapper.findAll({ status: 'published' }).then((posts) => {
    *   console.log(posts); // [{ id: 1, status: 'published', ...}, ...]
    * });
    *
    * @example
    * // Get full response
    * PostMapper.findAll({ status: 'published' }, { raw: true }).then((result) => {
    *   console.log(result.data); // [{ id: 1, status: 'published', ...}, ...]
    *   console.log(result.found); // e.g. 13
    *   console.log(...); // etc., more metadata can be found on the result
    * });
    *
    * @fires Mapper#beforeFindAll
    * @fires Mapper#afterFindAll
    * @method Mapper#findAll
    * @param {object} [query={}] Selection query. See {@link query}.
    * @param {object} [query.where] See {@link query.where}.
    * @param {number} [query.offset] See {@link query.offset}.
    * @param {number} [query.limit] See {@link query.limit}.
    * @param {string|Array[]} [query.orderBy] See {@link query.orderBy}.
    * @param {object} [opts] Configuration options. Refer to the `findAll` method
    * of whatever adapter you're using for more configuration options.
    * @param {boolean} [opts.adapter={@link Mapper#defaultAdapter}] Name of the
    * adapter to use.
    * @param {boolean} [opts.notify={@link Mapper#notify}] See {@link Mapper#notify}.
    * @param {boolean} [opts.raw={@link Mapper#raw}] See {@link Mapper#raw}.
    * @param {string[]} [opts.with=[]] Relations to eager load in the request.
    * @returns {Promise} Resolves with the found records, if any.
    * @see query
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/reading-data","Reading data"]
    */
  def findAll(query: js.Any): js.Promise[_] = js.native
  def findAll(query: js.Any, opts: js.Any): js.Promise[_] = js.native
  /**
    * Return the registered adapter with the given name or the default adapter if
    * no name is provided.
    *
    * @method Mapper#getAdapter
    * @param {string} [name] The name of the adapter to retrieve.
    * @returns {Adapter} The adapter.
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/connecting-to-a-data-source","Connecting to a data source"]
    */
  def getAdapter(): js.Any = js.native
  def getAdapter(name: String): js.Any = js.native
  /**
    * Return the name of a registered adapter based on the given name or options,
    * or the name of the default adapter if no name provided.
    *
    * @method Mapper#getAdapterName
    * @param {(Object|string)} [opts] The name of an adapter or options, if any.
    * @returns {string} The name of the adapter.
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/connecting-to-a-data-source","Connecting to a data source"]
    */
  def getAdapterName(): js.Any = js.native
  def getAdapterName(opts: js.Any): js.Any = js.native
  /**
    * Get the object of registered adapters for this Mapper.
    *
    * @method Mapper#getAdapters
    * @returns {Object} {@link Mapper#_adapters}
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/connecting-to-a-data-source","Connecting to a data source"]
    */
  def getAdapters(): js.Any = js.native
  /**
    * Returns this Mapper's {@link Schema}.
    *
    * @method Mapper#getSchema
    * @returns {Schema} This Mapper's {@link Schema}.
    * @see Mapper#schema
    * @since 3.0.0
    */
  def getSchema(): typings.jsData.schemaMod.default = js.native
  /**
    * Defines a hasMany relationship. Only useful if you're managing your
    * Mappers manually and not using a Container or DataStore component.
    *
    * @example
    * UserMapper.hasMany(PostMapper, {
    *   // post.user_id points to user.id
    *   foreignKey: 'user_id'
    *   // post records will be attached to user records at "user.posts"
    *   localField: 'posts'
    * });
    *
    * @method Mapper#hasMany
    * @see http://www.js-data.io/v3.0/docs/relations
    * @since 3.0.0
    */
  def hasMany(relatedMapper: js.Any, opts: js.Any): Unit = js.native
  /**
    * Defines a hasOne relationship. Only useful if you're managing your Mappers
    * manually and not using a {@link Container} or {@link DataStore} component.
    *
    * @example
    * UserMapper.hasOne(ProfileMapper, {
    *   // profile.user_id points to user.id
    *   foreignKey: 'user_id'
    *   // profile records will be attached to user records at "user.profile"
    *   localField: 'profile'
    * });
    *
    * @method Mapper#hasOne
    * @see http://www.js-data.io/v3.0/docs/relations
    * @since 3.0.0
    */
  def hasOne(relatedMapper: js.Any, opts: js.Any): Unit = js.native
  /**
    * Return whether `record` is an instance of this Mapper's recordClass.
    *
    * @example
    * const post = PostMapper.createRecord();
    *
    * console.log(PostMapper.is(post)); // true
    * // Equivalent to what's above
    * console.log(post instanceof PostMapper.recordClass); // true
    *
    * @method Mapper#is
    * @param {Object|Record} record The record to check.
    * @returns {boolean} Whether `record` is an instance of this Mapper's
    * {@link Mapper#recordClass}.
    * @since 3.0.0
    */
  def is(record: js.Any): Boolean = js.native
  /**
    * Register an adapter on this Mapper under the given name.
    *
    * @method Mapper#registerAdapter
    * @param {string} name The name of the adapter to register.
    * @param {Adapter} adapter The adapter to register.
    * @param {object} [opts] Configuration options.
    * @param {boolean} [opts.default=false] Whether to make the adapter the
    * default adapter for this Mapper.
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/connecting-to-a-data-source","Connecting to a data source"]
    */
  def registerAdapter(name: js.Any, adapter: js.Any): Unit = js.native
  def registerAdapter(name: js.Any, adapter: js.Any, opts: js.Any): Unit = js.native
  /**
    * Select records according to the `query` argument, and aggregate the sum
    * value of the property specified by `field`.
    *
    * {@link Mapper#beforeSum} will be called before calling the adapter.
    * {@link Mapper#afterSum} will be called after calling the adapter.
    *
    * @example
    * PurchaseOrderMapper.sum('amount', { status: 'paid' }).then((amountPaid) => {
    *   console.log(amountPaid); // e.g. 451125.34
    * });
    *
    * @method Mapper#sum
    * @param {string} field The field to sum.
    * @param {object} [query={}] Selection query. See {@link query}.
    * @param {object} [query.where] See {@link query.where}.
    * @param {number} [query.offset] See {@link query.offset}.
    * @param {number} [query.limit] See {@link query.limit}.
    * @param {string|Array[]} [query.orderBy] See {@link query.orderBy}.
    * @param {object} [opts] Configuration options. Refer to the `sum` method
    * of whatever adapter you're using for more configuration options.
    * @param {boolean} [opts.adapter={@link Mapper#defaultAdapter}] Name of the
    * adapter to use.
    * @param {boolean} [opts.notify={@link Mapper#notify}] See {@link Mapper#notify}.
    * @param {boolean} [opts.raw={@link Mapper#raw}] See {@link Mapper#raw}.
    * @returns {Promise} Resolves with the aggregated sum.
    * @since 3.0.0
    */
  def sum(field: js.Any, query: QueryDefinition): js.Promise[_] = js.native
  def sum(field: js.Any, query: QueryDefinition, opts: js.Any): js.Promise[_] = js.native
  /**
    * Return a plain object representation of the given record. Relations can
    * be optionally be included. Non-schema properties can be excluded.
    *
    * @example
    * import { Mapper, Schema } from 'js-data';
    * const PersonMapper = new Mapper({
    *   name: 'person',
    *   schema: {
    *     properties: {
    *       name: { type: 'string' },
    *       id: { type: 'string' }
    *     }
    *   }
    * });
    * const person = PersonMapper.createRecord({ id: 1, name: 'John', foo: 'bar' });
    * // "foo" is stripped by toJSON()
    * console.log(PersonMapper.toJSON(person)); // {"id":1,"name":"John"}
    *
    * const PersonRelaxedMapper = new Mapper({
    *   name: 'personRelaxed',
    *   schema: {
    *     properties: {
    *       name: { type: 'string' },
    *       id: { type: 'string' }
    *     },
    *     additionalProperties: true
    *   }
    * });
    * const person2 = PersonRelaxedMapper.createRecord({ id: 1, name: 'John', foo: 'bar' });
    * // "foo" is not stripped by toJSON
    * console.log(PersonRelaxedMapper.toJSON(person2)); // {"id":1,"name":"John","foo":"bar"}
    *
    * @method Mapper#toJSON
    * @param {Record|Record[]} records Record or records from which to create a
    * POJO representation.
    * @param {object} [opts] Configuration options.
    * @param {string[]} [opts.with] Array of relation names or relation fields
    * to include in the POJO representation.
    * @param {boolean} [opts.withAll] Whether to simply include all relations in
    * the representation. Overrides `opts.with`.
    * @returns {Object|Object[]} POJO representation of the record or records.
    * @since 3.0.0
    */
  def toJSON(records: js.Any): js.Any = js.native
  def toJSON(records: js.Any, opts: js.Any): js.Any = js.native
  /**
    * Fired during {@link Mapper#update}. See
    * {@link Mapper~beforeUpdateListener} for how to listen for this event.
    *
    * @event Mapper#beforeUpdate
    * @see Mapper~beforeUpdateListener
    * @see Mapper#update
    */
  /**
    * Callback signature for the {@link Mapper#event:beforeUpdate} event.
    *
    * @example
    * function onBeforeUpdate (id, props, opts) {
    *   // do something
    * }
    * store.on('beforeUpdate', onBeforeUpdate);
    *
    * @callback Mapper~beforeUpdateListener
    * @param {string|number} id The `id` argument passed to {@link Mapper#beforeUpdate}.
    * @param {object} props The `props` argument passed to {@link Mapper#beforeUpdate}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#beforeUpdate}.
    * @see Mapper#event:beforeUpdate
    * @see Mapper#update
    * @since 3.0.0
    */
  /**
    * Fired during {@link Mapper#update}. See
    * {@link Mapper~afterUpdateListener} for how to listen for this event.
    *
    * @event Mapper#afterUpdate
    * @see Mapper~afterUpdateListener
    * @see Mapper#update
    */
  /**
    * Callback signature for the {@link Mapper#event:afterUpdate} event.
    *
    * @example
    * function onAfterUpdate (id, props, opts, result) {
    *   // do something
    * }
    * store.on('afterUpdate', onAfterUpdate);
    *
    * @callback Mapper~afterUpdateListener
    * @param {string|number} id The `id` argument passed to {@link Mapper#afterUpdate}.
    * @param {object} props The `props` argument passed to {@link Mapper#afterUpdate}.
    * @param {object} opts The `opts` argument passed to {@link Mapper#afterUpdate}.
    * @param {object} result The `result` argument passed to {@link Mapper#afterUpdate}.
    * @see Mapper#event:afterUpdate
    * @see Mapper#update
    * @since 3.0.0
    */
  /**
    * Using an adapter, update the record with the primary key specified by the
    * `id` argument.
    *
    * {@link Mapper#beforeUpdate} will be called before updating the record.
    * {@link Mapper#afterUpdate} will be called after updating the record.
    *
    * @example
    * // Update a specific post
    * PostMapper.update(1234, {
    *   status: 'published',
    *   published_at: new Date()
    * }).then((post) => {
    *   console.log(post); // { id: 1234, status: 'published', ... }
    * });
    *
    * @fires Mapper#beforeUpdate
    * @fires Mapper#afterUpdate
    * @method Mapper#update
    * @param {(string|number)} id The primary key of the record to update.
    * @param {object} props The update to apply to the record.
    * @param {object} [opts] Configuration options. Refer to the `update` method
    * of whatever adapter you're using for more configuration options.
    * @param {boolean} [opts.adapter={@link Mapper#defaultAdapter}] Name of the
    * adapter to use.
    * @param {boolean} [opts.notify={@link Mapper#notify}] See {@link Mapper#notify}.
    * @param {boolean} [opts.noValidate={@link Mapper#noValidate}] See {@link Mapper#noValidate}.
    * @param {boolean} [opts.raw={@link Mapper#raw}] See {@link Mapper#raw}.
    * transaction.
    * @returns {Promise} Resolves with the updated record. Rejects if the record
    * could not be found.
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/saving-data","Saving data"]
    */
  def update(id: js.Any, props: js.Any): js.Promise[_] = js.native
  def update(id: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
  /**
    * Fired during {@link Mapper#updateAll}. See
    * {@link Mapper~beforeUpdateAllListener} for how to listen for this event.
    *
    * @event Mapper#beforeUpdateAll
    * @see Mapper~beforeUpdateAllListener
    * @see Mapper#updateAll
    */
  /**
    * Callback signature for the {@link Mapper#event:beforeUpdateAll} event.
    *
    * @example
    * function onBeforeUpdateAll (props, query, opts) {
    *   // do something
    * }
    * store.on('beforeUpdateAll', onBeforeUpdateAll);
    *
    * @callback Mapper~beforeUpdateAllListener
    * @param {object} props The `props` argument received by {@link Mapper#beforeUpdateAll}.
    * @param {object} query The `query` argument received by {@link Mapper#beforeUpdateAll}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeUpdateAll}.
    * @see Mapper#event:beforeUpdateAll
    * @see Mapper#updateAll
    * @since 3.0.0
    */
  /**
    * Fired during {@link Mapper#updateAll}. See
    * {@link Mapper~afterUpdateAllListener} for how to listen for this event.
    *
    * @event Mapper#afterUpdateAll
    * @see Mapper~afterUpdateAllListener
    * @see Mapper#updateAll
    */
  /**
    * Callback signature for the {@link Mapper#event:afterUpdateAll} event.
    *
    * @example
    * function onAfterUpdateAll (props, query, opts, result) {
    *   // do something
    * }
    * store.on('afterUpdateAll', onAfterUpdateAll);
    *
    * @callback Mapper~afterUpdateAllListener
    * @param {object} props The `props` argument received by {@link Mapper#afterUpdateAll}.
    * @param {object} query The `query` argument received by {@link Mapper#afterUpdateAll}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterUpdateAll}.
    * @param {object} result The `result` argument received by {@link Mapper#afterUpdateAll}.
    * @see Mapper#event:afterUpdateAll
    * @see Mapper#updateAll
    * @since 3.0.0
    */
  /**
    * Using the `query` argument, perform the a single updated to the selected
    * records.
    *
    * {@link Mapper#beforeUpdateAll} will be called before making the update.
    * {@link Mapper#afterUpdateAll} will be called after making the update.
    *
    * @example
    * // Turn all of John's blog posts into drafts.
    * const update = { status: draft: published_at: null };
    * const query = { userId: 1234 };
    * PostMapper.updateAll(update, query).then((posts) => {
    *   console.log(posts); // [...]
    * });
    *
    * @fires Mapper#beforeUpdateAll
    * @fires Mapper#afterUpdateAll
    * @method Mapper#updateAll
    * @param {object} props Update to apply to selected records.
    * @param {object} [query={}] Selection query. See {@link query}.
    * @param {object} [query.where] See {@link query.where}.
    * @param {number} [query.offset] See {@link query.offset}.
    * @param {number} [query.limit] See {@link query.limit}.
    * @param {string|Array[]} [query.orderBy] See {@link query.orderBy}.
    * @param {object} [opts] Configuration options. Refer to the `updateAll`
    * method of whatever adapter you're using for more configuration options.
    * @param {boolean} [opts.adapter={@link Mapper#defaultAdapter}] Name of the
    * adapter to use.
    * @param {boolean} [opts.notify={@link Mapper#notify}] See {@link Mapper#notify}.
    * @param {boolean} [opts.noValidate={@link Mapper#noValidate}] See {@link Mapper#noValidate}.
    * @param {boolean} [opts.raw={@link Mapper#raw}] See {@link Mapper#raw}.
    * @returns {Promise} Resolves with the update records, if any.
    * @see query
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/saving-data","Saving data"]
    */
  def updateAll(props: js.Any): js.Promise[_] = js.native
  def updateAll(props: js.Any, query: js.UndefOr[scala.Nothing], opts: js.Any): js.Promise[_] = js.native
  def updateAll(props: js.Any, query: QueryDefinition): js.Promise[_] = js.native
  def updateAll(props: js.Any, query: QueryDefinition, opts: js.Any): js.Promise[_] = js.native
  /**
    * Fired during {@link Mapper#updateMany}. See
    * {@link Mapper~beforeUpdateManyListener} for how to listen for this event.
    *
    * @event Mapper#beforeUpdateMany
    * @see Mapper~beforeUpdateManyListener
    * @see Mapper#updateMany
    */
  /**
    * Callback signature for the {@link Mapper#event:beforeUpdateMany} event.
    *
    * @example
    * function onBeforeUpdateMany (records, opts) {
    *   // do something
    * }
    * store.on('beforeUpdateMany', onBeforeUpdateMany);
    *
    * @callback Mapper~beforeUpdateManyListener
    * @param {object} records The `records` argument received by {@link Mapper#beforeUpdateMany}.
    * @param {object} opts The `opts` argument received by {@link Mapper#beforeUpdateMany}.
    * @see Mapper#event:beforeUpdateMany
    * @see Mapper#updateMany
    * @since 3.0.0
    */
  /**
    * Fired during {@link Mapper#updateMany}. See
    * {@link Mapper~afterUpdateManyListener} for how to listen for this event.
    *
    * @event Mapper#afterUpdateMany
    * @see Mapper~afterUpdateManyListener
    * @see Mapper#updateMany
    */
  /**
    * Callback signature for the {@link Mapper#event:afterUpdateMany} event.
    *
    * @example
    * function onAfterUpdateMany (records, opts, result) {
    *   // do something
    * }
    * store.on('afterUpdateMany', onAfterUpdateMany);
    *
    * @callback Mapper~afterUpdateManyListener
    * @param {object} records The `records` argument received by {@link Mapper#afterUpdateMany}.
    * @param {object} opts The `opts` argument received by {@link Mapper#afterUpdateMany}.
    * @param {object} result The `result` argument received by {@link Mapper#afterUpdateMany}.
    * @see Mapper#event:afterUpdateMany
    * @see Mapper#updateMany
    * @since 3.0.0
    */
  /**
    * Given an array of updates, perform each of the updates via an adapter. Each
    * "update" is a hash of properties with which to update an record. Each
    * update must contain the primary key of the record to be updated.
    *
    * {@link Mapper#beforeUpdateMany} will be called before making the update.
    * {@link Mapper#afterUpdateMany} will be called after making the update.
    *
    * @example
    * PostMapper.updateMany([
    *   { id: 1234, status: 'draft' },
    *   { id: 2468, status: 'published', published_at: new Date() }
    * ]).then((posts) => {
    *   console.log(posts); // [...]
    * });
    *
    * @fires Mapper#beforeUpdateMany
    * @fires Mapper#afterUpdateMany
    * @method Mapper#updateMany
    * @param {Record[]} records Array up record updates.
    * @param {object} [opts] Configuration options. Refer to the `updateMany`
    * method of whatever adapter you're using for more configuration options.
    * @param {boolean} [opts.adapter={@link Mapper#defaultAdapter}] Name of the
    * adapter to use.
    * @param {boolean} [opts.notify={@link Mapper#notify}] See {@link Mapper#notify}.
    * @param {boolean} [opts.noValidate={@link Mapper#noValidate}] See {@link Mapper#noValidate}.
    * @param {boolean} [opts.raw={@link Mapper#raw}] See {@link Mapper#raw}.
    * @returns {Promise} Resolves with the updated records. Rejects if any of the
    * records could be found.
    * @since 3.0.0
    * @tutorial ["http://www.js-data.io/v3.0/docs/saving-data","Saving data"]
    */
  def updateMany(records: js.Any): js.Promise[_] = js.native
  def updateMany(records: js.Any, opts: js.Any): js.Promise[_] = js.native
  /**
    * Validate the given record or records according to this Mapper's
    * {@link Schema}. If there are no validation errors then the return value
    * will be `undefined`.
    *
    * @example
    * import {Mapper, Schema} from 'js-data'
    * const PersonSchema = new Schema({
    *   properties: {
    *     name: { type: 'string' },
    *     id: { type: 'string' }
    *   }
    * });
    * const PersonMapper = new Mapper({
    *   name: 'person',
    *   schema: PersonSchema
    * });
    * let errors = PersonMapper.validate({ name: 'John' });
    * console.log(errors); // undefined
    * errors = PersonMapper.validate({ name: 123 });
    * console.log(errors); // [{ expected: 'one of (string)', actual: 'number', path: 'name' }]
    *
    * @method Mapper#validate
    * @param {Object|Object[]} record The record or records to validate.
    * @param {object} [opts] Configuration options. Passed to
    * {@link Schema#validate}.
    * @returns {Object[]} Array of errors or `undefined` if no errors.
    * @since 3.0.0
    */
  def validate(record: js.Any): js.Array[_] = js.native
  def validate(record: js.Any, opts: js.Any): js.Array[_] = js.native
  /**
    * Method used to wrap data returned by an adapter with this Mapper's
    * {@link Mapper#recordClass}. This method is used by all of a Mapper's CRUD
    * methods. The provided implementation of this method assumes that the `data`
    * passed to it is a record or records that need to be wrapped with
    * {@link Mapper#createRecord}. Override with care.
    *
    * Provided implementation of {@link Mapper#wrap}:
    *
    * ```
    * function (data, opts) {
    *   return this.createRecord(data, opts);
    * }
    * ```
    *
    * @example
    * const PostMapper = new Mapper({
    *   name: 'post',
    *   // Override to customize behavior
    *   wrap (data, opts) {
    *     const originalWrap = this.constructor.prototype.wrap;
    *     // Let's say "GET /post" doesn't return JSON quite like JSData expects,
    *     // but the actual post records are nested under a "posts" field. So,
    *     // we override Mapper#wrap to handle this special case.
    *     if (opts.op === 'findAll') {
    *       return originalWrap.call(this, data.posts, opts);
    *     }
    *     // Otherwise perform original behavior
    *     return originalWrap.call(this, data, opts);
    *   }
    * });
    *
    * @method Mapper#wrap
    * @param {Object|Object[]} data The record or records to be wrapped.
    * @param {object} [opts] Configuration options. Passed to {@link Mapper#createRecord}.
    * @returns {Record|Record[]} The wrapped record or records.
    * @since 3.0.0
    */
  def wrap(data: js.Any, opts: js.Any): js.Any = js.native
}

