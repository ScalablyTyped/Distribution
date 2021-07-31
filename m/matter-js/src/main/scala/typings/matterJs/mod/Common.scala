package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Common")
@js.native
class Common () extends StObject
/* static members */
object Common {
  
  @JSImport("matter-js", "Common")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to require external libraries outside of the bundle.
    * It first looks for the `globalName` on the environment's global namespace.
    * If the global is not found, it will fall back to using the standard `require` using the `moduleName`.
    * @private
    * @method _requireGlobal
    * @param {string} globalName The global module name
    * @param {string} moduleName The fallback CommonJS module name
    * @return {} The loaded module
    */
  @scala.inline
  def _requireGlobal(globalName: String, moduleName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_requireGlobal")(globalName.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Takes _n_ functions as arguments and returns a new function that calls them in order.
    * The arguments applied when calling the new function will also be applied to every function passed.
    * The value of `this` refers to the last value returned in the chain that was not `undefined`.
    * Therefore if a passed function does not return a value, the previously returned value is maintained.
    * After all passed functions have been called the new function returns the last returned value (if any).
    * If any of the passed functions are a chain, then the chain will be flattened.
    * @method chain
    * @param ...funcs {function} The functions to chain.
    * @return {function} A new function that calls the passed functions in order.
    */
  @scala.inline
  def chain(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")().asInstanceOf[js.Function]
  
  /**
    * Chains a function to excute after the original function on the given `path` relative to `base`.
    * See also docs for `Common.chain`.
    * @method chainPathAfter
    * @param {} base The base object
    * @param {string} path The path relative to `base`
    * @param {function} func The function to chain after the original
    * @return {function} The chained function that replaced the original
    */
  @scala.inline
  def chainPathAfter(base: js.Object, path: String, func: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("chainPathAfter")(base.asInstanceOf[js.Any], path.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Chains a function to excute before the original function on the given `path` relative to `base`.
    * See also docs for `Common.chain`.
    * @method chainPathBefore
    * @param {} base The base object
    * @param {string} path The path relative to `base`
    * @param {function} func The function to chain before the original
    * @return {function} The chained function that replaced the original
    */
  @scala.inline
  def chainPathBefore(base: js.Object, path: String, func: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("chainPathBefore")(base.asInstanceOf[js.Any], path.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Randomly chooses a value from a list with equal probability.
    * The function uses a seeded random generator.
    * @method choose
    * @param {array} choices
    * @return {object} A random choice object from the array
    */
  @scala.inline
  def choose(choices: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("choose")(choices.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Returns the given value clamped between a minimum and maximum value.
    * @method clamp
    * @param {number} value
    * @param {number} min
    * @param {number} max
    * @return {number} The value clamped between min and max inclusive
    */
  @scala.inline
  def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Creates a new clone of the object, if deep is true references will also be cloned.
    * @method clone
    * @param {} obj
    * @param {bool} deep
    * @return {} obj cloned
    */
  @scala.inline
  def clone(obj: js.Object, deep: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  /**
    * Converts a CSS hex colour string into an integer.
    * @method colorToNumber
    * @param {string} colorString
    * @return {number} An integer representing the CSS hex string
    */
  @scala.inline
  def colorToNumber(colorString: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToNumber")(colorString.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Extends the object in the first argument using the object in the second argument.
    * @method extend
    * @param {} obj
    * @param {boolean} deep
    * @return {} obj extended
    */
  @scala.inline
  def extend(obj: js.Object, deep: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(obj.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  /**
    * Gets a value from `base` relative to the `path` string.
    * @method get
    * @param {} obj The base object
    * @param {string} path The path relative to `base`, e.g. 'Foo.Bar.baz'
    * @param {number} [begin] Path slice begin
    * @param {number} [end] Path slice end
    * @return {} The object at the given path
    */
  @scala.inline
  def get(obj: js.Object, path: String, begin: Double, end: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  /**
    * A cross browser compatible indexOf implementation.
    * @method indexOf
    * @param {array} haystack
    * @param {object} needle
    * @return {number} The position of needle in haystack, otherwise -1.
    */
  @scala.inline
  def indexOf(haystack: js.Array[js.Any], needle: js.Object): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Shows a `console.info` message only if the current `Common.logLevel` allows it.
    * The message will be prefixed with 'matter-js' to make it easily identifiable.
    * @method info
    * @param ...objs {} The objects to log.
    */
  @scala.inline
  def info(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("info")().asInstanceOf[js.Any]
  
  /**
    * Returns true if the object is an array.
    * @method isArray
    * @param {object} obj
    * @return {boolean} True if the object is an array, otherwise false
    */
  @scala.inline
  def isArray(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns true if the object is a HTMLElement, otherwise false.
    * @method isElement
    * @param {object} obj
    * @return {boolean} True if the object is a HTMLElement, otherwise false
    */
  @scala.inline
  def isElement(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns true if the object is a function.
    * @method isFunction
    * @param {object} obj
    * @return {boolean} True if the object is a function, otherwise false
    */
  @scala.inline
  def isFunction(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns true if the object is a plain object.
    * @method isPlainObject
    * @param {object} obj
    * @return {boolean} True if the object is a plain object, otherwise false
    */
  @scala.inline
  def isPlainObject(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns true if the object is a string.
    * @method isString
    * @param {object} obj
    * @return {boolean} True if the object is a string, otherwise false
    */
  @scala.inline
  def isString(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns the list of keys for the given object.
    * @method keys
    * @param {} obj
    * @return {string[]} keys
    */
  @scala.inline
  def keys(obj: js.Object): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * Shows a `console.log` message only if the current `Common.logLevel` allows it.
    * The message will be prefixed with 'matter-js' to make it easily identifiable.
    * @method log
    * @param ...objs {} The objects to log.
    */
  @scala.inline
  def log(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[js.Any]
  
  /**
    * A cross browser compatible array map implementation.
    * @method map
    * @param {array} list
    * @param {function} func
    * @return {array} Values from list transformed by func.
    */
  @scala.inline
  def map(list: js.Array[js.Any], funct: js.Function): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(list.asInstanceOf[js.Any], funct.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Returns the next unique sequential ID.
    * @method nextId
    * @return {number} Unique sequential ID
    */
  @scala.inline
  def nextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextId")().asInstanceOf[Double]
  
  /**
    * Returns the current timestamp since the time origin (e.g. from page load).
    * The result will be high-resolution including decimal places if available.
    * @method now
    * @return {number} the current timestamp
    */
  @scala.inline
  def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  /**
    * Returns a random value between a minimum and a maximum value inclusive.
    * The function uses a seeded random generator.
    * @method random
    * @param {number} min
    * @param {number} max
    * @return {number} A random number between min and max inclusive
    */
  @scala.inline
  def random(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Double]
  @scala.inline
  def random(min: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def random(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def random(min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Sets a value on `base` relative to the given `path` string.
    * @method set
    * @param {} obj The base object
    * @param {string} path The path relative to `base`, e.g. 'Foo.Bar.baz'
    * @param {} val The value to set
    * @param {number} [begin] Path slice begin
    * @param {number} [end] Path slice end
    * @return {} Pass through `val` for chaining
    */
  @scala.inline
  def set(obj: js.Object, path: String, `val`: js.Object, begin: Double, end: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  /**
    * Shuffles the given array in-place.
    * The function uses a seeded random generator.
    * @method shuffle
    * @param {array} array
    * @return {array} array shuffled randomly
    */
  @scala.inline
  def shuffle(array: js.Array[js.Any]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Returns the sign of the given value.
    * @method sign
    * @param {number} value
    * @return {number} -1 if negative, +1 if 0 or positive
    */
  @scala.inline
  def sign(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Takes a directed graph and returns the partially ordered set of vertices in topological order.
    * Circular dependencies are allowed.
    * @method topologicalSort
    * @param {object} graph
    * @return {array} Partially ordered set of vertices in topological order.
    */
  @scala.inline
  def topologicalSort(graph: js.Object): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("topologicalSort")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Returns the list of values for the given object.
    * @method values
    * @param {} obj
    * @return {array} Array of the objects property values
    */
  @scala.inline
  def values(obj: js.Object): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Shows a `console.warn` message only if the current `Common.logLevel` allows it.
    * The message will be prefixed with 'matter-js' to make it easily identifiable.
    * @method warn
    * @param ...objs {} The objects to log.
    */
  @scala.inline
  def warn(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")().asInstanceOf[js.Any]
}
