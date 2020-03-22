package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data/dist/Record", JSImport.Namespace)
@js.native
object recordMod extends js.Object {
  @js.native
  trait Record
    extends typings.jsData.settableMod.default {
    /**
      * Returns the {@link Mapper} paired with this record's class, if any.
      *
      * @method Record#_mapper
      * @returns {Mapper} The {@link Mapper} paired with this record's class, if any.
      * @since 3.0.0
      */
    def _mapper(): js.Any = js.native
    /**
      * Lifecycle hook.
      *
      * @method Record#afterLoadRelations
      * @param {string[]} relations The `relations` argument passed to {@link Record#loadRelations}.
      * @param {object} opts The `opts` argument passed to {@link Record#loadRelations}.
      * @since 3.0.0
      */
    def afterLoadRelations(relations: js.Array[String]): Unit = js.native
    def afterLoadRelations(relations: js.Array[String], opts: js.Any): Unit = js.native
    /**
      * Lifecycle hook.
      *
      * @method Record#beforeLoadRelations
      * @param {string[]} relations The `relations` argument passed to {@link Record#loadRelations}.
      * @param {object} opts The `opts` argument passed to {@link Record#loadRelations}.
      * @since 3.0.0
      */
    def beforeLoadRelations(relations: js.Array[String]): Unit = js.native
    def beforeLoadRelations(relations: js.Array[String], opts: js.Any): Unit = js.native
    /**
      * Return the change history of this record since it was instantiated or
      * {@link Record#commit} was called.
      *
      * @method Record#changeHistory
      * @since 3.0.0
      */
    def changeHistory(): js.Any = js.native
    /**
      * Return changes to this record since it was instantiated or
      * {@link Record#commit} was called.
      *
      * @example <caption>Record#changes</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      *
      * const store = new Container();
      * store.defineMapper('user');
      * const user = store.createRecord('user');
      * console.log('user changes: ' + JSON.stringify(user.changes()));
      * user.name = 'John';
      * console.log('user changes: ' + JSON.stringify(user.changes()));
      *
      * @method Record#changes
      * @param [opts] Configuration options.
      * @param {Function} [opts.equalsFn={@link utils.deepEqual}] Equality function.
      * @param {array} [opts.ignore=[]] Array of strings or RegExp of fields to ignore.
      * @returns {Object} Object describing the changes to this record since it was
      * instantiated or its {@link Record#commit} method was last called.
      * @since 3.0.0
      */
    def changes(): AnonAdded = js.native
    def changes(opts: js.Any): AnonAdded = js.native
    /**
      * Make the record's current in-memory state it's only state, with any
      * previous property values being set to current values.
      *
      * @example <caption>Record#commit</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      *
      * const store = new Container();
      * store.defineMapper('user');
      * const user = store.createRecord('user');
      * console.log('user hasChanges: ' + user.hasChanges());
      * user.name = 'John';
      * console.log('user hasChanges: ' + user.hasChanges());
      * user.commit();
      * console.log('user hasChanges: ' + user.hasChanges());
      *
      * @method Record#commit
      * @param {object} [opts] Configuration options. Passed to {@link Record#toJSON}.
      * @since 3.0.0
      */
    def commit(): Unit = js.native
    def commit(opts: js.Any): Unit = js.native
    /**
      * Call {@link Mapper#destroy} using this record's primary key.
      *
      * @example
      * import { Container } from 'js-data';
      * import { RethinkDBAdapter } from 'js-data-rethinkdb';
      *
      * const store = new Container();
      * store.registerAdapter('rethink', new RethinkDBAdapter(), { default: true });
      * store.defineMapper('user');
      * store.find('user', 1234).then((user) => {
      *   console.log(user.id); // 1234
      *
      *   // Destroy this user from the database
      *   return user.destroy();
      * });
      *
      * @method Record#destroy
      * @param {object} [opts] Configuration options passed to {@link Mapper#destroy}.
      * @returns {Promise} The result of calling {@link Mapper#destroy} with the
      * primary key of this record.
      * @since 3.0.0
      */
    def destroy(): js.Any = js.native
    def destroy(opts: js.Any): js.Any = js.native
    /**
      * Return the value at the given path for this instance.
      *
      * @example <caption>Record#get</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      * const store = new Container();
      * store.defineMapper('user');
      *
      * const user = store.createRecord('user', { name: 'Bob' });
      * console.log('user.get("name"): ' + user.get('name'));
      *
      * @method Record#get
      * @param {string} key Path of value to retrieve.
      * @returns {*} Value at path.
      * @since 3.0.0
      */
    def get(key: js.Any): js.Any = js.native
    /**
      * Return whether this record has changed since it was instantiated or
      * {@link Record#commit} was called.
      *
      * @example <caption>Record#hasChanges</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      * const store = new Container();
      * store.defineMapper('user');
      * const user = store.createRecord('user');
      * console.log('user hasChanges: ' + user.hasChanges());
      * user.name = 'John';
      * console.log('user hasChanges: ' + user.hasChanges());
      * user.commit();
      * console.log('user hasChanges: ' + user.hasChanges());
      *
      * @method Record#hasChanges
      * @param [opts] Configuration options.
      * @param {Function} [opts.equalsFn={@link utils.deepEqual}] Equality function.
      * @param {array} [opts.ignore=[]] Array of strings or RegExp of fields to ignore.
      * @returns {boolean} Return whether the record has changed since it was
      * instantiated or since its {@link Record#commit} method was called.
      * @since 3.0.0
      */
    def hasChanges(): Boolean = js.native
    def hasChanges(opts: js.Any): Boolean = js.native
    /**
      * Return whether the record is unsaved. Records that have primary keys are
      * considered "saved". Records without primary keys are considered "unsaved".
      *
      * @example <caption>Record#isNew</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      * const store = new Container();
      * store.defineMapper('user');
      * const user = store.createRecord('user', {
      *   id: 1234
      * });
      * const user2 = store.createRecord('user');
      * console.log('user isNew: ' + user.isNew()); // false
      * console.log('user2 isNew: ' + user2.isNew()); // true
      *
      * @method Record#isNew
      * @returns {boolean} Whether the record is unsaved.
      * @since 3.0.0
      */
    def isNew(): Boolean = js.native
    def isNew(opts: js.Any): Boolean = js.native
    /**
      * Return whether the record in its current state passes validation.
      *
      * @example <caption>Record#isValid</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      * const store = new Container();
      * store.defineMapper('user', {
      *   schema: {
      *     properties: {
      *       name: { type: 'string' }
      *     }
      *   }
      * });
      * const user = store.createRecord('user', {
      *   name: 1234
      * }, {
      *   noValidate: true // this allows us to put the record into an invalid state
      * });
      * console.log('user isValid: ' + user.isValid());
      * user.name = 'John';
      * console.log('user isValid: ' + user.isValid());
      *
      * @method Record#isValid
      * @param {object} [opts] Configuration options. Passed to {@link Mapper#validate}.
      * @returns {boolean} Whether the record in its current state passes
      * validation.
      * @since 3.0.0
      */
    def isValid(opts: js.Any): Boolean = js.native
    /**
      * Lazy load relations of this record, to be attached to the record once their
      * loaded.
      *
      * @example
      * import { Container } from 'js-data';
      * import { RethinkDBAdapter } from 'js-data-rethinkdb';
      *
      * const store = new Container();
      * store.registerAdapter('rethink', new RethinkDBAdapter(), { default: true });
      * store.defineMapper('user', {
      *   relations: {
      *     hasMany: {
      *       post: {
      *         localField: 'posts',
      *         foreignKey: 'user_id'
      *       }
      *     }
      *   }
      * });
      * store.defineMapper('post', {
      *   relations: {
      *     belongsTo: {
      *       user: {
      *         localField: 'user',
      *         foreignKey: 'user_id'
      *       }
      *     }
      *   }
      * });
      * store.find('user', 1234).then((user) => {
      *   console.log(user.id); // 1234
      *
      *   // Load the user's post relations
      *   return user.loadRelations(['post']);
      * }).then((user) => {
      *   console.log(user.posts); // [{...}, {...}, ...]
      * });
      *
      * @method Record#loadRelations
      * @param {string[]} [relations] List of relations to load. Can use localField
      * names or Mapper names to pick relations.
      * @param {object} [opts] Configuration options.
      * @returns {Promise} Resolves with the record, with the loaded relations now
      * attached.
      * @since 3.0.0
      */
    def loadRelations(): js.Promise[this.type] = js.native
    def loadRelations(relations: String): js.Promise[this.type] = js.native
    def loadRelations(relations: String, opts: js.Any): js.Promise[this.type] = js.native
    def loadRelations(relations: js.Any): js.Promise[this.type] = js.native
    def loadRelations(relations: js.Any, opts: js.Any): js.Promise[this.type] = js.native
    def loadRelations(relations: js.Array[String]): js.Promise[this.type] = js.native
    def loadRelations(relations: js.Array[String], opts: js.Any): js.Promise[this.type] = js.native
    /**
      * Return the properties with which this record was instantiated.
      *
      * @example <caption>Record#previous</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      * const store = new Container();
      * store.defineMapper('user');
      * const user = store.createRecord('user', {
      *   name: 'William'
      * });
      * console.log('user previous: ' + JSON.stringify(user.previous()));
      * user.name = 'Bob';
      * console.log('user previous: ' + JSON.stringify(user.previous()));
      * user.commit();
      * console.log('user previous: ' + JSON.stringify(user.previous()));
      *
      * @method Record#previous
      * @param {string} [key] If specified, return just the initial value of the
      * given key.
      * @returns {Object} The initial properties of this record.
      * @since 3.0.0
      */
    def previous(key: js.Any): js.Any = js.native
    def removeInverseRelation(currentParent: js.Any, id: js.Any, inverseDef: js.Any, idAttribute: js.Any): Unit = js.native
    /**
      * Revert changes to this record back to the properties it had when it was
      * instantiated.
      *
      * @example <caption>Record#revert</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      * const store = new Container();
      * store.defineMapper('user');
      * const user = store.createRecord('user', {
      *   name: 'William'
      * });
      * console.log('user: ' + JSON.stringify(user));
      * user.name = 'Bob';
      * console.log('user: ' + JSON.stringify(user));
      * user.revert();
      * console.log('user: ' + JSON.stringify(user));
      *
      * @method Record#revert
      * @param {object} [opts] Configuration options.
      * @param {string[]} [opts.preserve] Array of strings or Regular Expressions
      * denoting properties that should not be reverted.
      * @since 3.0.0
      */
    def revert(): Unit = js.native
    def revert(opts: js.Any): Unit = js.native
    /**
      * Delegates to {@link Mapper#create} or {@link Mapper#update}.
      *
      * @example
      * import { Container } from 'js-data';
      * import { RethinkDBAdapter } from 'js-data-rethinkdb';
      *
      * const store = new Container();
      * store.registerAdapter('rethink', new RethinkDBAdapter(), { default: true });
      * store.defineMapper('session');
      * const session = store.createRecord('session', { topic: 'Node.js' });
      *
      * // Create a new record in the database
      * session.save().then(() => {
      *   console.log(session.id); // 1234
      *
      *   session.skill_level = 'beginner';
      *
      *   // Update the record in the database
      *   return session.save();
      * });
      *
      * @method Record#save
      * @param {object} [opts] Configuration options. See {@link Mapper#create} and
      * {@link Mapper#update}.
      * @param {boolean} [opts.changesOnly] Equality function. Default uses `===`.
      * @param {Function} [opts.equalsFn] Passed to {@link Record#changes} when
      * `opts.changesOnly` is `true`.
      * @param {array} [opts.ignore] Passed to {@link Record#changes} when
      * `opts.changesOnly` is `true`.
      * @returns {Promise} The result of calling {@link Mapper#create} or
      * {@link Mapper#update}.
      * @since 3.0.0
      */
    def save(): js.Any = js.native
    def save(opts: js.Any): js.Any = js.native
    /**
      * Set the value for a given key, or the values for the given keys if "key" is
      * an object. Triggers change events on those properties that have `track: true`
      * in {@link Mapper#schema}.
      *
      * @example <caption>Record#set</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      * const store = new Container();
      * store.defineMapper('user');
      *
      * const user = store.createRecord('user');
      * console.log('user: ' + JSON.stringify(user));
      *
      * user.set('name', 'Bob');
      * console.log('user: ' + JSON.stringify(user));
      *
      * user.set({ age: 30, role: 'admin' });
      * console.log('user: ' + JSON.stringify(user));
      *
      * @fires Record#change
      * @method Record#set
      * @param {(string|Object)} key Key to set or hash of key-value pairs to set.
      * @param {*} [value] Value to set for the given key.
      * @param {object} [opts] Configuration options.
      * @param {boolean} [opts.silent=false] Whether to trigger change events.
      * @since 3.0.0
      */
    def set(key: String): Unit = js.native
    def set(key: String, value: js.Any): Unit = js.native
    def set(key: String, value: js.Any, opts: js.Any): Unit = js.native
    def set(key: js.Any): Unit = js.native
    def set(key: js.Any, value: js.Any): Unit = js.native
    def set(key: js.Any, value: js.Any, opts: js.Any): Unit = js.native
    def setupInverseRelation(record: js.Any, id: js.Any, inverseDef: js.Any, idAttribute: js.Any): Unit = js.native
    /**
      * Return a plain object representation of this record. If the class from
      * which this record was created has a Mapper, then {@link Mapper#toJSON} will
      * be called with this record instead.
      *
      * @example <caption>Record#toJSON</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      * const store = new Container();
      * store.defineMapper('user', {
      *   schema: {
      *     properties: {
      *       name: { type: 'string' }
      *     }
      *   }
      * });
      *
      * const user = store.createRecord('user', {
      *   name: 'John',
      *   $$hashKey: '1234'
      * });
      * console.log('user: ' + JSON.stringify(user.toJSON()));
      *
      * @method Record#toJSON
      * @param {object} [opts] Configuration options.
      * @param {string[]} [opts.with] Array of relation names or relation fields
      * to include in the representation. Only available as an option if the class
      * from which this record was created has a Mapper and this record resides in
      * an instance of {@link DataStore}.
      * @returns {Object} Plain object representation of this record.
      * @since 3.0.0
      */
    def toJSON(): js.Any = js.native
    def toJSON(opts: js.Any): js.Any = js.native
    /**
      * Unset the value for a given key. Triggers change events on those properties
      * that have `track: true` in {@link Mapper#schema}.
      *
      * @example <caption>Record#unset</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      * const store = new Container();
      * store.defineMapper('user');
      *
      * const user = store.createRecord('user', {
      *   name: 'John'
      * });
      * console.log('user: ' + JSON.stringify(user));
      *
      * user.unset('name');
      * console.log('user: ' + JSON.stringify(user));
      *
      * @method Record#unset
      * @param {string} key Key to unset.
      * @param {object} [opts] Configuration options.
      * @param {boolean} [opts.silent=false] Whether to trigger change events.
      * @since 3.0.0
      */
    def unset(key: String): Unit = js.native
    def unset(key: String, opts: js.Any): Unit = js.native
    /**
      * Validate this record based on its current properties.
      *
      * @example <caption>Record#validate</caption>
      * const JSData = require('js-data');
      * const { Container } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      * const store = new Container();
      * store.defineMapper('user', {
      *   schema: {
      *     properties: {
      *       name: { type: 'string' }
      *     }
      *   }
      * });
      * const user = store.createRecord('user', {
      *   name: 1234
      * }, {
      *   noValidate: true // this allows us to put the record into an invalid state
      * });
      * console.log('user validation: ' + JSON.stringify(user.validate()));
      * user.name = 'John';
      * console.log('user validation: ' + user.validate());
      *
      * @method Record#validate
      * @param {object} [opts] Configuration options. Passed to {@link Mapper#validate}.
      * @returns {*} Array of errors or `undefined` if no errors.
      * @since 3.0.0
      */
    def validate(opts: js.Any): js.Any = js.native
  }
  
  @js.native
  class default () extends Record {
    def this(props: js.Any) = this()
    def this(props: js.Any, opts: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var creatingPath: String = js.native
    var keepChangeHistoryPath: String = js.native
    var mapper: typings.jsData.mapperMod.default = js.native
    var noValidatePath: String = js.native
    var previousPath: String = js.native
  }
  
}

