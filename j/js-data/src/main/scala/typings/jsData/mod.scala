package typings.jsData

import typings.jsData.collectionMod.CollectionOpts
import typings.jsData.collectionMod.default
import typings.jsData.componentMod.ComponentOpts
import typings.jsData.dataStoreMod.DataStoreOpts
import typings.jsData.jsDataStrings.`LessthansignPercentsignEqualssign version PercentsignGreaterthansign`
import typings.jsData.jsDataStrings.belongsTo
import typings.jsData.jsDataStrings.hasMany
import typings.jsData.jsDataStrings.hasOne
import typings.jsData.mapperMod.MapperOpts
import typings.jsData.mindexMod.IndexOpts
import typings.jsData.schemaMod.SchemaDefinition
import typings.jsData.simpleStoreMod.SimpleStoreOpts
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Collection () extends default {
    def this(records: js.Any) = this()
    def this(records: js.Any, opts: String) = this()
    def this(records: js.Any, opts: js.Any) = this()
    def this(records: js.Any, opts: CollectionOpts) = this()
  }
  
  @js.native
  class Component ()
    extends typings.jsData.componentMod.default {
    def this(opts: js.Any) = this()
    def this(opts: ComponentOpts) = this()
  }
  
  @js.native
  class Container ()
    extends typings.jsData.containerMod.Container {
    def this(opts: js.Object) = this()
  }
  
  @js.native
  class DataStore ()
    extends typings.jsData.dataStoreMod.default {
    def this(opts: DataStoreOpts) = this()
  }
  
  @js.native
  class Index ()
    extends typings.jsData.mindexMod.default {
    def this(fieldList: js.Array[_]) = this()
    def this(fieldList: js.Array[_], opts: IndexOpts) = this()
  }
  
  @js.native
  class LinkedCollection protected ()
    extends typings.jsData.linkedCollectionMod.default {
    def this(records: js.Any, opts: js.Any) = this()
  }
  
  @js.native
  class Mapper ()
    extends typings.jsData.mapperMod.default {
    def this(opts: MapperOpts) = this()
  }
  
  @js.native
  class Query ()
    extends typings.jsData.queryMod.default {
    def this(collection: js.Any) = this()
  }
  
  @js.native
  class Record ()
    extends typings.jsData.recordMod.default {
    def this(props: js.Any) = this()
    def this(props: js.Any, opts: js.Any) = this()
  }
  
  @js.native
  class Schema ()
    extends typings.jsData.schemaMod.default {
    def this(definition: SchemaDefinition) = this()
  }
  
  @js.native
  class Settable ()
    extends typings.jsData.settableMod.default
  
  @js.native
  class SimpleStore ()
    extends typings.jsData.simpleStoreMod.default {
    def this(opts: SimpleStoreOpts) = this()
  }
  
  val belongsToType: belongsTo = js.native
  val hasManyType: hasMany = js.native
  val hasOneType: hasOne = js.native
  val version: `LessthansignPercentsignEqualssign version PercentsignGreaterthansign` = js.native
  def belongsTo(related: js.Any, opts: js.Any): js.Function1[/* mapper */ js.Any, Unit] = js.native
  def hasMany(related: js.Any, opts: js.Any): js.Function1[/* mapper */ js.Any, Unit] = js.native
  def hasOne(related: js.Any, opts: js.Any): js.Function1[/* mapper */ js.Any, Unit] = js.native
  /* static members */
  @js.native
  object Query extends js.Object {
    /**
      * The filtering operators supported by {@link Query#filter}, and which are
      * implemented by adapters (for the most part).
      *
      * @example <caption>Variant 1</caption>
      * const JSData = require('js-data');
      * const { DataStore } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      *
      * const store = new DataStore();
      * store.defineMapper('post');
      * const posts = [
      *   { author: 'John', age: 30, status: 'published', id: 1 },
      *   { author: 'Sally', age: 31, status: 'published', id: 2 },
      *   { author: 'Mike', age: 32, status: 'published', id: 3 },
      *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
      *   { author: 'Adam', age: 33, status: 'published', id: 5 }
      * ];
      * store.add('post', posts);
      * const publishedPosts = store.filter('post', {
      *   status: 'published',
      *   limit: 2
      * });
      * console.log(publishedPosts);
      *
      *
      * @example <caption>Variant 2</caption>
      * const JSData = require('js-data');
      * const { DataStore } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      *
      * const store = new DataStore();
      * store.defineMapper('post')
      * const posts = [
      *   { author: 'John', age: 30, status: 'published', id: 1 },
      *   { author: 'Sally', age: 31, status: 'published', id: 2 },
      *   { author: 'Mike', age: 32, status: 'published', id: 3 },
      *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
      *   { author: 'Adam', age: 33, status: 'published', id: 5 }
      * ];
      * store.add('post', posts);
      * const publishedPosts = store.filter('post', {
      *   where: {
      *     status: {
      *       '==': 'published'
      *     }
      *   },
      *   limit: 2
      * });
      * console.log(publishedPosts);
      *
      * @example <caption>Variant 3</caption>
      * const JSData = require('js-data');
      * const { DataStore } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      *
      * const store = new DataStore();
      * store.defineMapper('post');
      * const posts = [
      *   { author: 'John', age: 30, status: 'published', id: 1 },
      *   { author: 'Sally', age: 31, status: 'published', id: 2 },
      *   { author: 'Mike', age: 32, status: 'published', id: 3 },
      *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
      *   { author: 'Adam', age: 33, status: 'published', id: 5 }
      * ];
      * store.add('post', posts);
      * const publishedPosts = store
      *   .query('post')
      *   .filter({ status: 'published' })
      *   .limit(2)
      *   .run();
      * console.log(publishedPosts);
      *
      * @example <caption>Variant 4</caption>
      * const JSData = require('js-data');
      * const { DataStore } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      *
      * const store = new DataStore();
      * store.defineMapper('post');
      * const posts = [
      *   { author: 'John', age: 30, status: 'published', id: 1 },
      *   { author: 'Sally', age: 31, status: 'published', id: 2 },
      *   { author: 'Mike', age: 32, status: 'published', id: 3 },
      *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
      *   { author: 'Adam', age: 33, status: 'published', id: 5 }
      * ];
      * store.add('post', posts);
      * const publishedPosts = store
      *   .query('post')
      *   .filter({
      *     where: {
      *       status: {
      *         '==': 'published'
      *       }
      *     }
      *   })
      *   .limit(2)
      *   .run();
      * console.log(publishedPosts);
      *
      * @example <caption>Multiple operators</caption>
      * const JSData = require('js-data');
      * const { DataStore } = JSData;
      * console.log('Using JSData v' + JSData.version.full);
      *
      * const store = new DataStore();
      * store.defineMapper('post');
      * const posts = [
      *   { author: 'John', age: 30, status: 'published', id: 1 },
      *   { author: 'Sally', age: 31, status: 'published', id: 2 },
      *   { author: 'Mike', age: 32, status: 'published', id: 3 },
      *   { author: 'Adam', age: 33, status: 'deleted', id: 4 },
      *   { author: 'Adam', age: 33, status: 'published', id: 5 }
      * ];
      * store.add('post', posts);
      *
      * const myPublishedPosts = store.filter('post', {
      *   where: {
      *     status: {
      *       '==': 'published'
      *     },
      *     user_id: {
      *       '==': currentUser.id
      *     }
      *   }
      * });
      *
      * console.log(myPublishedPosts);
      *
      * @name Query.ops
      * @property {Function} == Equality operator.
      * @property {Function} != Inequality operator.
      * @property {Function} > Greater than operator.
      * @property {Function} >= Greater than (inclusive) operator.
      * @property {Function} < Less than operator.
      * @property {Function} <= Less than (inclusive) operator.
      * @property {Function} isectEmpty Operator that asserts that the intersection
      * between two arrays is empty.
      * @property {Function} isectNotEmpty Operator that asserts that the
      * intersection between two arrays is __not__ empty.
      * @property {Function} in Operator that asserts whether a value is in an
      * array.
      * @property {Function} notIn Operator that asserts whether a value is __not__
      * in an array.
      * @property {Function} contains Operator that asserts whether an array
      * contains a value.
      * @property {Function} notContains Operator that asserts whether an array
      * does __not__ contain a value.
      * @since 3.0.0
      * @type {Object}
      */
    var ops: Anon = js.native
  }
  
  /* static members */
  @js.native
  object Record extends js.Object {
    var creatingPath: String = js.native
    var keepChangeHistoryPath: String = js.native
    var mapper: typings.jsData.mapperMod.default = js.native
    var noValidatePath: String = js.native
    var previousPath: String = js.native
  }
  
  /* static members */
  @js.native
  object Schema extends js.Object {
    var ANY_OPS: js.Array[String] = js.native
    var ARRAY_OPS: js.Array[String] = js.native
    var NUMERIC_OPS: js.Array[String] = js.native
    var OBJECT_OPS: js.Array[String] = js.native
    var STRING_OPS: js.Array[String] = js.native
    var typeGroupValidators: AnonArray = js.native
    var types: AnonBoolean = js.native
    var validationKeywords: js.Any = js.native
    def validate(value: js.Any, schema: js.Any): js.Array[_] = js.native
    def validate(value: js.Any, schema: js.Any, opts: js.Any): js.Array[_] = js.native
  }
  
  @js.native
  object utils extends js.Object {
    /**
      * Recursively iterates over relations found in `opts.with`.
      *
      * @method utils._forRelation
      * @param {object} opts Configuration options.
      * @param {Relation} def Relation definition.
      * @param {Function} fn Callback function.
      * @param {*} [thisArg] Execution context for the callback function.
      * @private
      * @since 3.0.0
      */
    def _forRelation(opts: js.Any, `def`: js.Any, fn: js.Any, thisArg: js.Any): Unit = js.native
    /**
      * Find the index of a relation in the given list
      *
      * @method utils._getIndex
      * @param {string[]} list List to search.
      * @param {string} relation Relation to find.
      * @private
      * @returns {number}
      */
    def _getIndex(list: js.Any, relation: js.Any): Double = js.native
    /**
      * Shallow copy properties that meet the following criteria from `src` to
      * `dest`:
      *
      * - own enumerable
      * - not a function
      * - does not start with "_"
      *
      * @method utils._
      * @param {object} dest Destination object.
      * @param {object} src Source object.
      * @private
      * @since 3.0.0
      */
    @JSName("_")
    def _underscore(dest: js.Any, src: js.Any): Unit = js.native
    /**
      * Define hidden (non-enumerable), writable properties on `target` from the
      * provided `props`.
      *
      * @example
      * import { utils } from 'js-data';
      * function Cat () {}
      * utils.addHiddenPropsToTarget(Cat.prototype, {
      *   say () {
      *     console.log('meow');
      *   }
      * });
      * const cat = new Cat();
      * cat.say(); // "meow"
      *
      * @method utils.addHiddenPropsToTarget
      * @param {object} target That to which `props` should be added.
      * @param {object} props Properties to be added to `target`.
      * @since 3.0.0
      */
    def addHiddenPropsToTarget(target: js.Any, props: js.Any): Unit = js.native
    /**
      * Return whether the two objects are deeply different.
      *
      * @example
      * import { utils } from 'js-data';
      * utils.areDifferent({}, {}); // false
      * utils.areDifferent({ a: 1 }, { a: 1 }); // false
      * utils.areDifferent({ foo: 'bar' }, {}); // true
      *
      * @method utils.areDifferent
      * @param newObject
      * @param oldObject
      * @param {object} [opts] Configuration options.
      * @param {Function} [opts.equalsFn={@link utils.deepEqual}] Equality function.
      * @param {array} [opts.ignore=[]] Array of strings or RegExp of fields to ignore.
      * @returns {boolean} Whether the two objects are deeply different.
      * @see utils.diffObjects
      * @since 3.0.0
      */
    def areDifferent(newObject: js.Any, oldObject: js.Any): Boolean = js.native
    def areDifferent(newObject: js.Any, oldObject: js.Any, opts: js.Any): Boolean = js.native
    /**
      * Deep copy a value.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = { foo: { bar: 'baz' } };
      * const b = utils.copy(a);
      * a === b; // false
      * utils.areDifferent(a, b); // false
      *
      * @param {*} from Value to deep copy.
      * @param {*} [to] Destination object for the copy operation.
      * @param {*} [stackFrom] For internal use.
      * @param {*} [stackTo] For internal use.
      * @param {string[]|RegExp[]} [blacklist] List of strings or RegExp of
      * properties to skip.
      * @param {boolean} [plain] Whether to make a plain copy (don't try to use
      * original prototype).
      * @returns {*} Deep copy of `from`.
      * @since 3.0.0
      */
    def copy(from: js.Any): js.Any = js.native
    def copy(from: js.Any, to: js.Any): js.Any = js.native
    def copy(from: js.Any, to: js.Any, stackFrom: js.Any): js.Any = js.native
    def copy(from: js.Any, to: js.Any, stackFrom: js.Any, stackTo: js.Any): js.Any = js.native
    def copy(from: js.Any, to: js.Any, stackFrom: js.Any, stackTo: js.Any, blacklist: js.Any): js.Any = js.native
    def copy(from: js.Any, to: js.Any, stackFrom: js.Any, stackTo: js.Any, blacklist: js.Any, plain: js.Any): js.Any = js.native
    /**
      * Check whether the two provided objects are deeply equal.
      *
      * @example
      * import { utils } from 'js-data';
      *
      * const objA = {
      *   name: 'John',
      *   id: 27,
      *   nested: {
      *     item: 'item 1',
      *     colors: ['red', 'green', 'blue']
      *   }
      * };
      *
      * const objB = {
      *   name: 'John',
      *   id: 27,
      *   nested: {
      *     item: 'item 1',
      *     colors: ['red', 'green', 'blue']
      *   }
      * };
      *
      * console.log(utils.deepEqual(a,b)); // true
      * objB.nested.colors.add('yellow'); // make a change to a nested object's array
      * console.log(utils.deepEqual(a,b)); // false
      *
      * @method utils.deepEqual
      * @param {object} a First object in the comparison.
      * @param {object} b Second object in the comparison.
      * @returns {boolean} Whether the two provided objects are deeply equal.
      * @see utils.equal
      * @since 3.0.0
      */
    def deepEqual(a: js.Any, b: js.Any): Boolean = js.native
    /**
      * Recursively shallow fill in own enumerable properties from `source` to
      * `dest`.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = { foo: { bar: 'baz' }, beep: 'boop' };
      * const b = { beep: 'bip' };
      * utils.deepFillIn(b, a);
      * console.log(b); // {"foo":{"bar":"baz"},"beep":"bip"}
      *
      * @method utils.deepFillIn
      * @param {object} dest The destination object.
      * @param {object} source The source object.
      * @see utils.fillIn
      * @see utils.deepMixIn
      * @since 3.0.0
      */
    def deepFillIn(dest: js.Any): js.Any = js.native
    def deepFillIn(dest: js.Any, source: js.Any): js.Any = js.native
    /**
      * Recursively shallow copy enumerable properties from `source` to `dest`.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = { foo: { bar: 'baz' }, beep: 'boop' };
      * const b = { beep: 'bip' };
      * utils.deepFillIn(b, a);
      * console.log(b); // {"foo":{"bar":"baz"},"beep":"boop"}
      *
      * @method utils.deepMixIn
      * @param {object} dest The destination object.
      * @param {object} source The source object.
      * @see utils.fillIn
      * @see utils.deepFillIn
      * @since 3.0.0
      */
    def deepMixIn(dest: js.Any): js.Any = js.native
    def deepMixIn(dest: js.Any, source: js.Any): js.Any = js.native
    /**
      * Return a diff of the base object to the comparison object.
      *
      * @example
      * import { utils } from 'js-data';
      * const oldObject = { foo: 'bar', a: 1234 };
      * const newObject = { beep: 'boop', a: 5678 };
      * const diff = utils.diffObjects(oldObject, newObject);
      * console.log(diff.added); // {"beep":"boop"}
      * console.log(diff.changed); // {"a":5678}
      * console.log(diff.removed); // {"foo":undefined}
      *
      * @method utils.diffObjects
      * @param {object} newObject Comparison object.
      * @param {object} oldObject Base object.
      * @param {object} [opts] Configuration options.
      * @param {Function} [opts.equalsFn={@link utils.deepEqual}] Equality function.
      * @param {array} [opts.ignore=[]] Array of strings or RegExp of fields to ignore.
      * @returns {Object} The diff from the base object to the comparison object.
      * @see utils.areDifferent
      * @since 3.0.0
      */
    def diffObjects(newObject: js.Any, oldObject: js.Any): AnonAdded = js.native
    def diffObjects(newObject: js.Any, oldObject: js.Any, opts: js.Any): AnonAdded = js.native
    /**
      * Return whether the two values are equal according to the `==` operator.
      *
      * @example
      * import { utils } from 'js-data';
      * console.log(utils.equal(1,1)); // true
      * console.log(utils.equal(1,'1')); // true
      * console.log(utils.equal(93, 66)); // false
      *
      * @method utils.equal
      * @param {*} a First value in the comparison.
      * @param {*} b Second value in the comparison.
      * @returns {boolean} Whether the two values are equal according to `==`.
      * @since 3.0.0
      */
    def equal(a: js.Any, b: js.Any): Boolean = js.native
    /**
      * Produce a factory function for making Error objects with the provided
      * metadata. Used throughout the various js-data components.
      *
      * @example
      * import { utils } from 'js-data';
      * const errorFactory = utils.err('domain', 'target');
      * const error400 = errorFactory(400, 'expected type', 'actual type');
      * console.log(error400); // [Error: [domain:target] expected: expected type, found: string
      * http://www.js-data.io/v3.0/docs/errors#400]
      * @method utils.err
      * @param {string} domain Namespace.
      * @param {string} target Target.
      * @returns {Function} Factory function.
      * @since 3.0.0
      */
    def err(domain: js.Any): js.Function2[/* code */ js.Any, /* repeated */ js.Any, Error] = js.native
    def err(domain: js.Any, target: js.Any): js.Function2[/* code */ js.Any, /* repeated */ js.Any, Error] = js.native
    /**
      * Add eventing capabilities into the target object.
      *
      * @example
      * import { utils } from 'js-data';
      * const user = { name: 'John' };
      * utils.eventify(user);
      * user.on('foo', () => console.log(arguments));
      * user.emit('foo', 1, 'bar'); // should log to console values (1, "bar")
      *
      * @method utils.eventify
      * @param {object} target Target object.
      * @param {Function} [getter] Custom getter for retrieving the object's event
      * listeners.
      * @param {Function} [setter] Custom setter for setting the object's event
      * listeners.
      * @since 3.0.0
      */
    def eventify(target: js.Any): Unit = js.native
    def eventify(target: js.Any, getter: js.Any): Unit = js.native
    def eventify(target: js.Any, getter: js.Any, setter: js.Any): Unit = js.native
    /**
      * Shallow copy own enumerable properties from `src` to `dest` that are on
      * `src` but are missing from `dest.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = { foo: 'bar', beep: 'boop' };
      * const b = { beep: 'bip' };
      * utils.fillIn(b, a);
      * console.log(b); // {"foo":"bar","beep":"bip"}
      *
      * @method utils.fillIn
      * @param {object} dest The destination object.
      * @param src
      * @see utils.deepFillIn
      * @see utils.deepMixIn
      * @since 3.0.0
      */
    def fillIn(dest: js.Any, src: js.Any): Unit = js.native
    /**
      * Find the last index of an item in an array according to the given checker function.
      *
      * @example
      * import { utils } from 'js-data';
      *
      * const john = { name: 'John', age: 20 };
      * const sara = { name: 'Sara', age: 25 };
      * const dan = { name: 'Dan', age: 20 };
      * const users = [john, sara, dan];
      *
      * console.log(utils.findIndex(users, (user) => user.age === 25)); // 1
      * console.log(utils.findIndex(users, (user) => user.age > 19)); // 2
      * console.log(utils.findIndex(users, (user) => user.name === 'John')); // 0
      * console.log(utils.findIndex(users, (user) => user.name === 'Jimmy')); // -1
      *
      * @method utils.findIndex
      * @param {array} array The array to search.
      * @param {Function} fn Checker function.
      * @returns {number} Index if found or -1 if not found.
      * @since 3.0.0
      */
    def findIndex(array: js.Any, fn: js.Any): Double = js.native
    /**
      * Recursively iterate over a {@link Mapper}'s relations according to
      * `opts.with`.
      *
      * @method utils.forEachRelation
      * @param {Mapper} mapper Mapper.
      * @param {object} opts Configuration options.
      * @param {Function} fn Callback function.
      * @param {*} thisArg Execution context for the callback function.
      * @since 3.0.0
      */
    def forEachRelation(mapper: js.Any, opts: js.Any, fn: js.Any): Unit = js.native
    def forEachRelation(mapper: js.Any, opts: js.Any, fn: js.Any, thisArg: js.Any): Unit = js.native
    /**
      * Iterate over an object's own enumerable properties.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = { b: 1, c: 4 };
      * let sum = 0;
      * utils.forOwn(a, function (value, key) {
      *   sum += value;
      * });
      * console.log(sum); // 5
      *
      * @method utils.forOwn
      * @param obj
      * @param {Function} fn Iteration function.
      * @param {object} [thisArg] Content to which to bind `fn`.
      * @since 3.0.0
      */
    def forOwn(obj: js.Any, fn: js.Any): Unit = js.native
    def forOwn(obj: js.Any, fn: js.Any, thisArg: js.Any): Unit = js.native
    /**
      * Proxy for `JSON.parse`.
      *
      * @example
      * import { utils } from 'js-data';
      *
      * const a = utils.fromJson('{"name" : "John"}');
      * console.log(a); // { name: 'John' }
      *
      * @method utils.fromJson
      * @param {string} json JSON to parse.
      * @returns {Object} Parsed object.
      * @see utils.toJson
      * @since 3.0.0
      */
    def fromJson(json: js.Any): js.Any = js.native
    /**
      * Retrieve the specified property from the given object. Supports retrieving
      * nested properties.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = { foo: { bar: 'baz' }, beep: 'boop' };
      * console.log(utils.get(a, 'beep')); // "boop"
      * console.log(utils.get(a, 'foo.bar')); // "baz"
      *
      * @method utils.get
      * @param {object} object Object from which to retrieve a property's value.
      * @param {string} prop Property to retrieve.
      * @returns {*} Value of the specified property.
      * @see utils.set
      * @since 3.0.0
      */
    def get(`object`: js.Any, prop: js.Any): js.Any = js.native
    /**
      * Gets default locale for the js-data context.
      *
      * @example
      * import { utils } from 'js-data';
      *
      *
      * utils.getDefaultLocale();
      *
      * @method utils.getDefaultLocale
      * @since 4.0.0
      */
    def getDefaultLocale(): String = js.native
    /**
      * Return the superclass for the given instance or subclass. If an instance is
      * provided, then finds the parent class of the instance's constructor.
      *
      * @example
      * import { utils } from 'js-data';
      * // using ES2015 classes
      * class Foo {}
      * class Bar extends Foo {}
      * const barInstance = new Bar();
      * let baseType = utils.getSuper(barInstance);
      * console.log(Foo === baseType); // true
      *
      * // using Function constructor with utils.extend
      * function Foo () {}
      * Foo.extend = utils.extend;
      * const Bar = Foo.extend();
      * const barInstance = new Bar();
      * let baseType = utils.getSuper(barInstance);
      * console.log(Foo === baseType); // true
      *
      * @method utils.getSuper
      * @param {Object|Function} instance Instance or constructor.
      * @param {boolean} [isCtor=false] Whether `instance` is a constructor.
      * @returns {Constructor} The superclass (grandparent constructor).
      * @since 3.0.0
      */
    def getSuper(instance: js.Any): js.Any = js.native
    def getSuper(instance: js.Any, isCtor: js.Any): js.Any = js.native
    /**
      * Return the intersection of two arrays.
      *
      * @example
      * import { utils } from 'js-data';
      * const arrA = ['green', 'red', 'blue', 'red'];
      * const arrB = ['green', 'yellow', 'red'];
      * const intersected = utils.intersection(arrA, arrB);
      *
      * console.log(intersected); // ['green', 'red'])
      *
      * @method utils.intersection
      * @param {array} array1 First array.
      * @param {array} array2 Second array.
      * @returns {Array} Array of elements common to both arrays.
      * @since 3.0.0
      */
    def intersection(array1: js.Any, array2: js.Any): js.Array[_] = js.native
    /**
      * Proxy for `Array.isArray`.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = [1,2,3,4,5];
      * const b = { foo: "bar" };
      * console.log(utils.isArray(a)); // true
      * console.log(utils.isArray(b)); // false
      *
      * @method utils.isArray
      * @param {*} value The value to test.
      * @returns {boolean} Whether the provided value is an array.
      * @since 3.0.0
      */
    def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = js.native
    /**
      * Return whether `prop` is matched by any string or regular expression in
      * `blacklist`.
      *
      * @example
      * import { utils } from 'js-data';
      * const blacklist = [/^\$hashKey/g, /^_/g, 'id'];
      * console.log(utils.isBlacklisted("$hashKey", blacklist)); // true
      * console.log(utils.isBlacklisted("id", blacklist)); // true
      * console.log(utils.isBlacklisted("_myProp", blacklist)); // true
      * console.log(utils.isBlacklisted("my_id", blacklist)); // false
      *
      * @method utils.isBlacklisted
      * @param {string} prop The name of a property to check.
      * @param {array} blacklist Array of strings and regular expressions.
      * @returns {boolean} Whether `prop` was matched.
      * @since 3.0.0
      */
    def isBlacklisted(prop: js.Any, blacklist: js.Any): Boolean = js.native
    /**
      * Return whether the provided value is a boolean.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = true;
      * const b = { foo: "bar" };
      * console.log(utils.isBoolean(a)); // true
      * console.log(utils.isBoolean(b)); // false
      *
      * @method utils.isBoolean
      * @param {*} value The value to test.
      * @returns {boolean} Whether the provided value is a boolean.
      * @since 3.0.0
      */
    def isBoolean(value: js.Any): Boolean = js.native
    /**
      * Return whether the provided value is a date.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = new Date();
      * const b = { foo: "bar" };
      * console.log(utils.isDate(a)); // true
      * console.log(utils.isDate(b)); // false
      *
      * @method utils.isDate
      * @param {*} value The value to test.
      * @returns {Date} Whether the provided value is a date.
      * @since 3.0.0
      */
    def isDate(value: js.Any): Boolean = js.native
    /**
      * Return whether the provided value is a function.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = function () { console.log('foo bar'); };
      * const b = { foo: "bar" };
      * console.log(utils.isFunction(a)); // true
      * console.log(utils.isFunction(b)); // false
      *
      * @method utils.isFunction
      * @param {*} value The value to test.
      * @returns {boolean} Whether the provided value is a function.
      * @since 3.0.0
      */
    def isFunction(value: js.Any): Boolean = js.native
    /**
      * Return whether the provided value is an integer.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = 1;
      * const b = 1.25;
      * const c = '1';
      * console.log(utils.isInteger(a)); // true
      * console.log(utils.isInteger(b)); // false
      * console.log(utils.isInteger(c)); // false
      *
      * @method utils.isInteger
      * @param {*} value The value to test.
      * @returns {boolean} Whether the provided value is an integer.
      * @since 3.0.0
      */
    def isInteger(value: js.Any): Boolean = js.native
    /**
      * Return whether the provided value is `null`.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = null;
      * const b = { foo: "bar" };
      * console.log(utils.isNull(a)); // true
      * console.log(utils.isNull(b)); // false
      *
      * @method utils.isNull
      * @param {*} value The value to test.
      * @returns {boolean} Whether the provided value is `null`.
      * @since 3.0.0
      */
    def isNull(value: js.Any): Boolean = js.native
    /**
      * Return whether the provided value is a number.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = 1;
      * const b = -1.25;
      * const c = '1';
      * console.log(utils.isNumber(a)); // true
      * console.log(utils.isNumber(b)); // true
      * console.log(utils.isNumber(c)); // false
      *
      * @method utils.isNumber
      * @param {*} value The value to test.
      * @returns {boolean} Whether the provided value is a number.
      * @since 3.0.0
      */
    def isNumber(value: js.Any): Boolean = js.native
    /**
      * Return whether the provided value is an object.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = { foo: "bar" };
      * const b = 'foo bar';
      * console.log(utils.isObject(a)); // true
      * console.log(utils.isObject(b)); // false
      *
      * @method utils.isObject
      * @param {*} value The value to test.
      * @returns {boolean} Whether the provided value is an object.
      * @since 3.0.0
      */
    def isObject(value: js.Any): Boolean = js.native
    /**
      * Return whether the provided value is a regular expression.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = /^\$.+$/ig;
      * const b = new RegExp('^\$.+$', 'ig');
      * const c = { foo: "bar" };
      * console.log(utils.isRegExp(a)); // true
      * console.log(utils.isRegExp(b)); // true
      * console.log(utils.isRegExp(c)); // false
      *
      * @method utils.isRegExp
      * @param {*} value The value to test.
      * @returns {boolean} Whether the provided value is a regular expression.
      * @since 3.0.0
      */
    def isRegExp(value: js.Any): Boolean = js.native
    /**
      * Return whether the provided value is a string or a number.
      *
      * @example
      * import { utils } from 'js-data';
      * console.log(utils.isSorN('')); // true
      * console.log(utils.isSorN(-1.65)); // true
      * console.log(utils.isSorN('my string')); // true
      * console.log(utils.isSorN({})); // false
      * console.log(utils.isSorN([1,2,4])); // false
      *
      * @method utils.isSorN
      * @param {*} value The value to test.
      * @returns {boolean} Whether the provided value is a string or a number.
      * @since 3.0.0
      */
    def isSorN(value: js.Any): Boolean = js.native
    /**
      * Return whether the provided value is a string.
      *
      * @example
      * import { utils } from 'js-data';
      * console.log(utils.isString('')); // true
      * console.log(utils.isString('my string')); // true
      * console.log(utils.isString(100)); // false
      * console.log(utils.isString([1,2,4])); // false
      *
      * @method utils.isString
      * @param {*} value The value to test.
      * @returns {boolean} Whether the provided value is a string.
      * @since 3.0.0
      */
    def isString(value: js.Any): Boolean = js.native
    /**
      * Return whether the provided value is a `undefined`.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = undefined;
      * const b = { foo: "bar"};
      * console.log(utils.isUndefined(a)); // true
      * console.log(utils.isUndefined(b.baz)); // true
      * console.log(utils.isUndefined(b)); // false
      * console.log(utils.isUndefined(b.foo)); // false
      *
      * @method utils.isUndefined
      * @param {*} value The value to test.
      * @returns {boolean} Whether the provided value is a `undefined`.
      * @since 3.0.0
      */
    def isUndefined(value: js.Any): Boolean = js.native
    /**
      * Mix in logging capabilities to the target.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = { foo: "bar"};
      *
      * // Add standard logging to an object
      * utils.logify(a);
      * a.log('info', 'test log info'); // output 'test log info' to console.
      *
      * // Toggle debug output of an object
      * a.dbg('test debug output'); // does not output because debug is off.
      * a.debug = true;
      * a.dbg('test debug output'); // output 'test debug output' to console.
      *
      * @method utils.logify
      * @param {*} target The target.
      * @since 3.0.0
      */
    def logify(target: js.Any): Unit = js.native
    /**
      * Adds the given record to the provided array only if it's not already in the
      * array.
      *
      * @example
      * import { utils } from 'js-data';
      * const colors = ['red', 'green', 'yellow'];
      *
      * console.log(colors.length); // 3
      * utils.noDupeAdd(colors, 'red');
      * console.log(colors.length); // 3, red already exists
      *
      * utils.noDupeAdd(colors, 'blue');
      * console.log(colors.length); // 4, blue was added
      *
      * @method utils.noDupeAdd
      * @param {array} array The array.
      * @param {*} record The value to add.
      * @param {Function} fn Callback function passed to {@link utils.findIndex}.
      * @since 3.0.0
      */
    def noDupeAdd(array: js.Any): Unit = js.native
    def noDupeAdd(array: js.Any, record: js.Any): Unit = js.native
    def noDupeAdd(array: js.Any, record: js.Any, fn: js.Any): Unit = js.native
    /**
      * Return a shallow copy of the provided object, minus the properties
      * specified in `keys`.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = { name: 'John', $hashKey: 1214910 };
      *
      * let b = utils.omit(a, ['$hashKey']);
      * console.log(b); // { name: 'John' }
      *
      * @method utils.omit
      * @param {object} props The object to copy.
      * @param {string[]} keys Array of strings, representing properties to skip.
      * @returns {Object} Shallow copy of `props`, minus `keys`.
      * @since 3.0.0
      */
    def omit(props: js.Any, keys: js.Any): js.Object = js.native
    /**
      * Return a shallow copy of the provided object, but only include the
      * properties specified in `keys`.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = { name: 'John', $hashKey: 1214910 };
      *
      * let b = utils.pick(a, ['$hashKey']);
      * console.log(b); // { $hashKey: 1214910 }
      *
      * @method utils.pick
      * @param {object} props The object to copy.
      * @param {string[]} keys Array of strings, representing properties to keep.
      * @returns {Object} Shallow copy of `props`, but only including `keys`.
      * @since 3.0.0
      */
    def pick(props: js.Any, keys: js.Any): js.Any = js.native
    /**
      * Return a plain copy of the given value.
      *
      * @example
      * import { utils } from 'js-data';
      * const a = { name: 'John' };
      * let b = utils.plainCopy(a);
      * console.log(a === b); // false
      *
      * @method utils.plainCopy
      * @param {*} value The value to copy.
      * @returns {*} Plain copy of `value`.
      * @see utils.copy
      * @since 3.0.0
      */
    def plainCopy(value: js.Any): js.Any = js.native
    /**
      * Shortcut for `utils.Promise.reject(value)`.
      *
      * @example
      * import { utils } from 'js-data';
      *
      * utils.reject("Testing static reject").then(function (data) {
      *   // not called
      * }).catch(function (reason) {
      *   console.log(reason); // "Testing static reject"
      * });
      *
      * @method utils.reject
      * @param {*} [value] Value with which to reject the Promise.
      * @returns {Promise} Promise reject with `value`.
      */
    def reject(value: js.Any): js.Promise[scala.Nothing] = js.native
    /**
      * Remove the last item found in array according to the given checker function.
      *
      * @example
      * import { utils } from 'js-data';
      *
      * const colors = ['red', 'green', 'yellow', 'red'];
      * utils.remove(colors, (color) => color === 'red');
      * console.log(colors); // ['red', 'green', 'yellow']
      *
      * @method utils.remove
      * @param {array} array The array to search.
      * @param {Function} fn Checker function.
      */
    def remove(array: js.Any): Unit = js.native
    def remove(array: js.Any, fn: js.Any): Unit = js.native
    /**
      * Shortcut for `utils.Promise.resolve(value)`.
      *
      * @example
      * import { utils } from 'js-data';
      *
      * utils.resolve("Testing static resolve").then(function (data) {
      *   console.log(data); // "Testing static resolve"
      * }).catch(function (reason) {
      *   // not called
      * });
      *
      * @param {*} [value] Value with which to resolve the Promise.
      * @returns {Promise} Promise resolved with `value`.
      */
    def resolve(): js.Promise[_] = js.native
    def resolve(value: js.Any): js.Promise[_] = js.native
    /**
      * Set the value at the provided key or path.
      *
      * @example
      * import { utils } from 'js-data';
      *
      * const john = {
      *   name: 'John',
      *   age: 25,
      *   parent: {
      *     name: 'John's Mom',
      *     age: 50
      *   }
      * };
      * // set value by key
      * utils.set(john, 'id', 98);
      * console.log(john.id); // 98
      *
      * // set value by path
      * utils.set(john, 'parent.id', 20);
      * console.log(john.parent.id); // 20
      *
      * // set value by path/value map
      * utils.set(john, {
      *   'id': 1098,
      *   'parent': { id: 1020 },
      *   'parent.age': '55'
      * });
      * console.log(john.id); // 1098
      * console.log(john.parent.id); // 1020
      * console.log(john.parent.age); // 55
      *
      * @method utils.set
      * @param {object} object The object on which to set a property.
      * @param {(string|Object)} path The key or path to the property. Can also
      * pass in an object of path/value pairs, which will all be set on the target
      * object.
      * @param {*} [value] The value to set.
      */
    def set(`object`: js.Any, path: js.Any): Unit = js.native
    def set(`object`: js.Any, path: js.Any, value: js.Any): Unit = js.native
    def set(`object`: js.Any, path: js.Any, value: js.Any, opts: js.Any): Unit = js.native
    /**
      * Proxy for `JSON.stringify`.
      *
      * @example
      * import { utils } from 'js-data';
      *
      * const a = { name: 'John' };
      * let jsonVal = utils.toJson(a);
      * console.log(jsonVal); // '{"name" : "John"}'
      *
      * @method utils.toJson
      * @param {*} value Value to serialize to JSON.
      * @returns {string} JSON string.
      * @see utils.fromJson
      * @since 3.0.0
      */
    def toJson(value: js.Any): String = js.native
    def toJson(value: js.Any, replacer: js.Array[Double | String]): String = js.native
    def toJson(value: js.Any, replacer: js.Array[String | Double], space: String): String = js.native
    def toJson(value: js.Any, replacer: js.Array[String | Double], space: Double): String = js.native
    def toJson(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _]
    ): String = js.native
    def toJson(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
      space: String
    ): String = js.native
    def toJson(
      value: js.Any,
      replacer: js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _],
      space: Double
    ): String = js.native
    /**
      * Unset the value at the provided key or path.
      *
      * @example
      * import { utils } from 'js-data';
      *
      * const john = {
      *   name: 'John',
      *   age: 25,
      *   parent: {
      *     name: 'John's Mom',
      *     age: 50
      *   }
      * };
      *
      * utils.unset(john, age);
      * utils.unset(john, parent.age);
      *
      * console.log(john.age); // null
      * console.log(john.parent.age); // null
      *
      * @method utils.unset
      * @param {object} object The object from which to delete the property.
      * @param {string} path The key or path to the property.
      * @see utils.set
      * @since 3.0.0
      */
    def unset(`object`: js.Any, path: String): Unit = js.native
  }
  
}

