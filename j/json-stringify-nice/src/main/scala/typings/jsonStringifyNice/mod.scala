package typings.jsonStringifyNice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Stringify an object sorting scalars before objects, and defaulting to 2-space indent.
    *
    * @example
    * import stringify = require('json-stringify-nice');
    * const obj = {
    *   z: 1,
    *   y: 'z',
    *   obj: { a: {}, b: 'x' },
    *   a: { b: 1, a: { nested: true} },
    *   yy: 'a',
    * };
    *
    * console.log(stringify(obj));
    *
    * // output:
    * // {
    * //   "y": "z", <-- alphabetical sorting like whoa!
    * //   "yy": "a",
    * //   "z": 1,
    * //   "a": { <-- a sorted before obj, because alphabetical, and both objects
    * //     "b": 1,
    * //     "a": {  <-- note that a comes after b, because it's an object
    * //       "nested": true
    * //     }
    * //   },
    * //   "obj": {
    * //     "b": "x",
    * //     "a": {}
    * //   }
    * // }
    */
  inline def apply(value: Any): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: Any, replacer: js.Array[Double | String]): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: js.Array[Double | String], space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: js.Array[Double | String], space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
    space: String
  ): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    value: Any,
    replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any],
    space: Double
  ): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Null, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Null, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(value: Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("json-stringify-nice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
