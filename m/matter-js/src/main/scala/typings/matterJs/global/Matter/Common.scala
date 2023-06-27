package typings.matterJs.global.Matter

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Common")
@js.native
open class Common ()
  extends typings.matterJs.mod.Common
/* static members */
object Common {
  
  @JSGlobal("Matter.Common")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Used to require external libraries outside of the bundle.
    * It first looks for the `globalName` on the environment's global namespace.
    * If the global is not found, it will fall back to using the standard `require` using the `moduleName`.
    * @method _requireGlobal
    * @param {string} globalName The global module name
    * @param {string} moduleName The fallback CommonJS module name
    * @returns {} The loaded module
    */
  inline def _requireGlobal(globalName: String, moduleName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_requireGlobal")(globalName.asInstanceOf[js.Any], moduleName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Takes _n_ functions as arguments and returns a new function that calls them in order.
    * The arguments applied when calling the new function will also be applied to every function passed.
    * The value of `this` refers to the last value returned in the chain that was not `undefined`.
    * Therefore if a passed function does not return a value, the previously returned value is maintained.
    * After all passed functions have been called the new function returns the last returned value (if any).
    * If any of the passed functions are a chain, then the chain will be flattened.
    * @method chain
    * @param ...funcs {function} The functions to chain.
    * @returns {function} A new function that calls the passed functions in order.
    */
  inline def chain(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")().asInstanceOf[js.Function]
  
  /**
    * Chains a function to excute after the original function on the given `path` relative to `base`.
    * See also docs for `Common.chain`.
    * @method chainPathAfter
    * @param {} base The base object
    * @param {string} path The path relative to `base`
    * @param {function} func The function to chain after the original
    * @returns {function} The chained function that replaced the original
    */
  inline def chainPathAfter(base: Any, path: String, func: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("chainPathAfter")(base.asInstanceOf[js.Any], path.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Chains a function to excute before the original function on the given `path` relative to `base`.
    * See also docs for `Common.chain`.
    * @method chainPathBefore
    * @param {} base The base object
    * @param {string} path The path relative to `base`
    * @param {function} func The function to chain before the original
    * @returns {function} The chained function that replaced the original
    */
  inline def chainPathBefore(base: Any, path: String, func: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("chainPathBefore")(base.asInstanceOf[js.Any], path.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  /**
    * Randomly chooses a value from a list with equal probability.
    * The function uses a seeded random generator.
    * @method choose
    * @param {array} choices
    * @returns {any} A random choice object from the array
    */
  inline def choose(choices: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("choose")(choices.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Returns the given value clamped between a minimum and maximum value.
    * @method clamp
    * @param {number} value
    * @param {number} min
    * @param {number} max
    * @returns {number} The value clamped between min and max inclusive
    */
  inline def clamp(value: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Creates a new clone of the object, if deep is true references will also be cloned.
    * @method clone
    * @param {any} obj
    * @param {boolean} deep
    * @returns {any} obj cloned
    */
  inline def clone(obj: Any, deep: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Converts a CSS hex colour string into an integer.
    * @method colorToNumber
    * @param {string} colorString
    * @returns {number} An integer representing the CSS hex string
    */
  inline def colorToNumber(colorString: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("colorToNumber")(colorString.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Shows a deprecated console warning when the function on the given object is called.
    * The target function will be replaced with a new function that first shows the warning
    * and then calls the original function.
    * @method deprecated
    * @param {any} obj The object or module
    * @param {string} name The property name of the function on obj
    * @param {string} warning The one-time message to show if the function is called
    */
  inline def deprecated(obj: Record[String, Any], prop: String, warning: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Extends the object in the first argument using the object in the second argument.
    * @method extend
    * @param {any} obj
    * @param {boolean} deep
    * @returns {any} obj extended
    */
  inline def extend(obj: Any, deep: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(obj.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Gets a value from `base` relative to the `path` string.
    * @method get
    * @param {any} obj The base object
    * @param {string} path The path relative to `base`, e.g. 'Foo.Bar.baz'
    * @param {number} [begin] Path slice begin
    * @param {number} [end] Path slice end
    * @returns {} The object at the given path
    */
  inline def get(obj: Any, path: String, begin: Double, end: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Returns the [poly-decomp](https://github.com/schteppe/poly-decomp.js) library module provided through `Common.setDecomp`,
    * otherwise returns the global `decomp` if set.
    * @method getDecomp
    * @returns {} The [poly-decomp](https://github.com/schteppe/poly-decomp.js) library module if provided.
    */
  inline def getDecomp(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecomp")().asInstanceOf[Any]
  
  /**
    * A cross browser compatible indexOf implementation.
    * @method indexOf
    * @param {array} haystack
    * @param {any} needle
    * @returns {number} The position of needle in haystack, otherwise -1.
    */
  inline def indexOf(haystack: js.Array[Any], needle: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Shows a `console.info` message only if the current `Common.logLevel` allows it.
    * The message will be prefixed with 'matter-js' to make it easily identifiable.
    * @method info
    * @param ...objs {} The objects to log.
    */
  inline def info(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("info")().asInstanceOf[Any]
  
  /**
    * Returns true if the object is an array.
    * @method isArray
    * @param {any} obj
    * @returns {boolean} True if the object is an array, otherwise false
    */
  inline def isArray(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns true if the object is a HTMLElement, otherwise false.
    * @method isElement
    * @param {any} obj
    * @returns {boolean} True if the object is a HTMLElement, otherwise false
    */
  inline def isElement(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns true if the object is a function.
    * @method isFunction
    * @param {any} obj
    * @returns {boolean} True if the object is a function, otherwise false
    */
  inline def isFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns true if the object is a plain object.
    * @method isPlainObject
    * @param {any} obj
    * @returns {boolean} True if the object is a plain object, otherwise false
    */
  inline def isPlainObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns true if the object is a string.
    * @method isString
    * @param {any} obj
    * @returns {boolean} True if the object is a string, otherwise false
    */
  inline def isString(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Returns the list of keys for the given object.
    * @method keys
    * @param {any} obj
    * @returns {string[]} keys
    */
  inline def keys(obj: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keys")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**
    * Shows a `console.log` message only if the current `Common.logLevel` allows it.
    * The message will be prefixed with 'matter-js' to make it easily identifiable.
    * @method log
    * @param ...objs {} The objects to log.
    */
  inline def log(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("log")().asInstanceOf[Any]
  
  /**
    * A cross browser compatible array map implementation.
    * @method map
    * @param {array} list
    * @param {function} func
    * @returns {array} Values from list transformed by func.
    */
  inline def map(list: js.Array[Any], funct: js.Function): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(list.asInstanceOf[js.Any], funct.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  /**
    * Returns the next unique sequential ID.
    * @method nextId
    * @returns {number} Unique sequential ID
    */
  inline def nextId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextId")().asInstanceOf[Double]
  
  /**
    * Returns the current timestamp since the time origin (e.g. from page load).
    * The result will be high-resolution including decimal places if available.
    * @method now
    * @returns {number} the current timestamp
    */
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  /**
    * Returns a random value between a minimum and a maximum value inclusive.
    * The function uses a seeded random generator.
    * @method random
    * @param {number} min
    * @param {number} max
    * @returns {number} A random number between min and max inclusive
    */
  inline def random(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[Double]
  inline def random(min: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def random(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def random(min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Sets a value on `base` relative to the given `path` string.
    * @method set
    * @param {any} obj The base object
    * @param {string} path The path relative to `base`, e.g. 'Foo.Bar.baz'
    * @param {} val The value to set
    * @param {number} [begin] Path slice begin
    * @param {number} [end] Path slice end
    * @returns {} Pass through `val` for chaining
    */
  inline def set(obj: Any, path: String, `val`: Any, begin: Double, end: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Provide the [poly-decomp](https://github.com/schteppe/poly-decomp.js) library module to enable
    * concave vertex decomposition support when using `Bodies.fromVertices` e.g. `Common.setDecomp(require('poly-decomp'))`.
    * @method setDecomp
    * @param {} decomp The [poly-decomp](https://github.com/schteppe/poly-decomp.js) library module.
    */
  inline def setDecomp(decomp: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDecomp")(decomp.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Shuffles the given array in-place.
    * The function uses a seeded random generator.
    * @method shuffle
    * @param {array} array
    * @returns {array} array shuffled randomly
    */
  inline def shuffle(array: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  /**
    * Returns the sign of the given value.
    * @method sign
    * @param {number} value
    * @returns {number} -1 if negative, +1 if 0 or positive
    */
  inline def sign(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sign")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Takes a directed graph and returns the partially ordered set of vertices in topological order.
    * Circular dependencies are allowed.
    * @method topologicalSort
    * @param {any} graph
    * @returns {array} Partially ordered set of vertices in topological order.
    */
  inline def topologicalSort(graph: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("topologicalSort")(graph.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  /**
    * Returns the list of values for the given object.
    * @method values
    * @param {any} obj
    * @returns {array} Array of the objects property values
    */
  inline def values(obj: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  /**
    * Shows a `console.warn` message only if the current `Common.logLevel` allows it.
    * The message will be prefixed with 'matter-js' to make it easily identifiable.
    * @method warn
    * @param ...objs {} The objects to log.
    */
  inline def warn(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")().asInstanceOf[Any]
  
  /**
    * Uses `Common.warn` to log the given message one time only.
    * @method warnOnce
    * @param ...objs {} The objects to log.
    */
  inline def warnOnce(objs: (Record[String, Any])*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnOnce")(objs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
