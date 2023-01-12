package typings.jsonpathPlus

import typings.jsonpathPlus.anon.Callback
import typings.jsonpathPlus.jsonpathPlusBooleans.`false`
import typings.jsonpathPlus.jsonpathPlusStrings.all
import typings.jsonpathPlus.jsonpathPlusStrings.parent
import typings.jsonpathPlus.jsonpathPlusStrings.parentProperty
import typings.jsonpathPlus.jsonpathPlusStrings.path
import typings.jsonpathPlus.jsonpathPlusStrings.pointer
import typings.jsonpathPlus.jsonpathPlusStrings.value
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonpath-plus", "JSONPath")
  @js.native
  val JSONPath: JSONPathType = js.native
  
  @js.native
  trait JSONPathCallable extends StObject {
    
    def apply[T](options: JSONPathOptions): T = js.native
    def apply[T](options: JSONPathOptionsAutoStart): JSONPathClass = js.native
    def apply[T](path: String): T = js.native
    def apply[T](path: String, json: String): T = js.native
    def apply[T](path: String, json: String, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: String, json: String, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: String,
      json: String,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: String, json: js.Array[Any]): T = js.native
    def apply[T](path: String, json: js.Array[Any], callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: String, json: js.Array[Any], callback: JSONPathCallback): T = js.native
    def apply[T](
      path: String,
      json: js.Array[Any],
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: String, json: js.Object): T = js.native
    def apply[T](path: String, json: js.Object, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: String, json: js.Object, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: String,
      json: js.Object,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: String, json: Boolean): T = js.native
    def apply[T](path: String, json: Boolean, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: String, json: Boolean, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: String,
      json: Boolean,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: String, json: Double): T = js.native
    def apply[T](path: String, json: Double, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: String, json: Double, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: String,
      json: Double,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: String, json: Null, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: String, json: Null, callback: JSONPathCallback): T = js.native
    def apply[T](path: String, json: Null, callback: JSONPathCallback, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: js.Array[Any]): T = js.native
    def apply[T](path: js.Array[Any], json: String): T = js.native
    def apply[T](path: js.Array[Any], json: String, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: js.Array[Any], json: String, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[Any],
      json: String,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[Any], json: js.Array[Any]): T = js.native
    def apply[T](
      path: js.Array[Any],
      json: js.Array[Any],
      callback: Unit,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[Any], json: js.Array[Any], callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[Any],
      json: js.Array[Any],
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[Any], json: js.Object): T = js.native
    def apply[T](path: js.Array[Any], json: js.Object, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: js.Array[Any], json: js.Object, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[Any],
      json: js.Object,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[Any], json: Boolean): T = js.native
    def apply[T](path: js.Array[Any], json: Boolean, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: js.Array[Any], json: Boolean, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[Any],
      json: Boolean,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[Any], json: Double): T = js.native
    def apply[T](path: js.Array[Any], json: Double, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: js.Array[Any], json: Double, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[Any],
      json: Double,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[Any], json: Null, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: js.Array[Any], json: Null, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[Any],
      json: Null,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
  }
  
  type JSONPathCallback = js.Function3[/* payload */ Any, /* payloadType */ Any, /* fullPayload */ Any, Any]
  
  @js.native
  trait JSONPathClass extends StObject {
    
    /**
      * Exposes the cache object for those who wish to preserve and reuse
      *   it for optimization purposes.
      */
    var cache: Any = js.native
    
    def evaluate(options: Callback): Any = js.native
    def evaluate(path: String): Any = js.native
    def evaluate(path: String, json: String): Any = js.native
    def evaluate(path: String, json: String, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: String, json: String, callback: JSONPathCallback): Any = js.native
    def evaluate(
      path: String,
      json: String,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    def evaluate(path: String, json: js.Array[Any]): Any = js.native
    def evaluate(path: String, json: js.Array[Any], callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: String, json: js.Array[Any], callback: JSONPathCallback): Any = js.native
    def evaluate(
      path: String,
      json: js.Array[Any],
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    def evaluate(path: String, json: js.Object): Any = js.native
    def evaluate(path: String, json: js.Object, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: String, json: js.Object, callback: JSONPathCallback): Any = js.native
    def evaluate(
      path: String,
      json: js.Object,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    def evaluate(path: String, json: Boolean): Any = js.native
    def evaluate(path: String, json: Boolean, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: String, json: Boolean, callback: JSONPathCallback): Any = js.native
    def evaluate(
      path: String,
      json: Boolean,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    def evaluate(path: String, json: Double): Any = js.native
    def evaluate(path: String, json: Double, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: String, json: Double, callback: JSONPathCallback): Any = js.native
    def evaluate(
      path: String,
      json: Double,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    def evaluate(path: String, json: Null, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: String, json: Null, callback: JSONPathCallback): Any = js.native
    def evaluate(path: String, json: Null, callback: JSONPathCallback, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: js.Array[Any]): Any = js.native
    def evaluate(path: js.Array[Any], json: String): Any = js.native
    def evaluate(path: js.Array[Any], json: String, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: js.Array[Any], json: String, callback: JSONPathCallback): Any = js.native
    def evaluate(
      path: js.Array[Any],
      json: String,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    def evaluate(path: js.Array[Any], json: js.Array[Any]): Any = js.native
    def evaluate(
      path: js.Array[Any],
      json: js.Array[Any],
      callback: Unit,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    def evaluate(path: js.Array[Any], json: js.Array[Any], callback: JSONPathCallback): Any = js.native
    def evaluate(
      path: js.Array[Any],
      json: js.Array[Any],
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    def evaluate(path: js.Array[Any], json: js.Object): Any = js.native
    def evaluate(path: js.Array[Any], json: js.Object, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: js.Array[Any], json: js.Object, callback: JSONPathCallback): Any = js.native
    def evaluate(
      path: js.Array[Any],
      json: js.Object,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    def evaluate(path: js.Array[Any], json: Boolean): Any = js.native
    def evaluate(path: js.Array[Any], json: Boolean, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: js.Array[Any], json: Boolean, callback: JSONPathCallback): Any = js.native
    def evaluate(
      path: js.Array[Any],
      json: Boolean,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    def evaluate(path: js.Array[Any], json: Double): Any = js.native
    def evaluate(path: js.Array[Any], json: Double, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: js.Array[Any], json: Double, callback: JSONPathCallback): Any = js.native
    def evaluate(
      path: js.Array[Any],
      json: Double,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    def evaluate(path: js.Array[Any], json: Null, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): Any = js.native
    def evaluate(path: js.Array[Any], json: Null, callback: JSONPathCallback): Any = js.native
    def evaluate(
      path: js.Array[Any],
      json: Null,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): Any = js.native
    
    /**
      * Accepts a normalized or unnormalized path as string and
      * converts to an array: for example,
      * `['$', 'aProperty', 'anotherProperty']`.
      */
    def toPathArray(path: String): js.Array[String] = js.native
    
    /**
      * Accepts a path array and converts to a normalized path string.
      * The string will be in a form like:
      *   `$['aProperty']['anotherProperty][0]`.
      * The JSONPath terminal constructions `~` and `^` and type operators
      *   like `@string()` are silently stripped.
      */
    def toPathString(path: js.Array[String]): String = js.native
    
    /**
      * Accepts a path array and converts to a JSON Pointer.
      *
      * The string will be in a form like: `/aProperty/anotherProperty/0`
      * (with any `~` and `/` internal characters escaped as per the JSON
      * Pointer spec).
      *
      * The JSONPath terminal constructions `~` and `^` and type operators
      *   like `@string()` are silently stripped.
      */
    def toPointer(path: js.Array[String]): Any = js.native
  }
  
  trait JSONPathOptions extends StObject {
    
    /**
      * If this is supplied as false, one may call the evaluate method
      *  manually.
      *
      * @default true
      */
    var autostart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If supplied, a callback will be called immediately upon retrieval of
      * an end point value.
      *
      * The three arguments supplied will be the value of the payload
      * (according to `resultType`), the type of the payload (whether it is
      * a normal "value" or a "property" name), and a full payload object
      * (with all `resultType`s).
      *
      * @default undefined
      */
    var callback: js.UndefOr[JSONPathCallback] = js.undefined
    
    /**
      * Whether the returned array of results will be flattened to a
      *   single dimension array.
      *
      * @default false
      */
    var flatten: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The JSON object to evaluate (whether of null, boolean, number,
      *   string, object, or array type).
      */
    var json: Null | Boolean | Double | String | js.Object | js.Array[Any]
    
    /**
      * In the current absence of JSON Schema support,
      * one can determine types beyond the built-in types by adding the
      * perator `@other()` at the end of one's query.
      *
      * If such a path is encountered, the `otherTypeCallback` will be invoked
      * with the value of the item, its path, its parent, and its parent's
      * property name, and it should return a boolean indicating whether the
      * supplied value belongs to the "other" type or not (or it may handle
      * transformations and return false).
      *
      * @default undefined
      *   <A function that throws an error when `@other()` is encountered>
      */
    var otherTypeCallback: js.UndefOr[JSONPathOtherTypeCallback] = js.undefined
    
    /**
      * In the event that a query could be made to return the root node,
      * this allows the parent of that root node to be returned within results.
      *
      * @default null
      */
    var parent: js.UndefOr[Null | Any] = js.undefined
    
    /**
      * In the event that a query could be made to return the root node,
      * this allows the parentProperty of that root node to be returned within
      * results.
      *
      * @default null
      */
    var parentProperty: js.UndefOr[Null | Any] = js.undefined
    
    /**
      * The JSONPath expression as a (normalized or unnormalized) string or
      *   array.
      */
    var path: String | js.Array[Any]
    
    /**
      * Although JavaScript evaluation expressions are allowed by default,
      * for security reasons (if one is operating on untrusted user input,
      * for example), one may wish to set this option to true to throw
      * exceptions when these expressions are attempted.
      *
      * @default false
      */
    var preventEval: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Can be case-insensitive form of "value", "path", "pointer", "parent",
      *   or "parentProperty" to determine respectively whether to return
      *   results as the values of the found items, as their absolute paths,
      *   as JSON Pointers to the absolute paths, as their parent objects,
      *   or as their parent's property name.
      *
      * If set to "all", all of these types will be returned on an object with
      *   the type as key name.
      *
      * @default 'value'
      */
    var resultType: js.UndefOr[value | path | pointer | parent | parentProperty | all] = js.undefined
    
    /**
      * Key-value map of variables to be available to code evaluations such
      *   as filtering expressions.
      * (Note that the current path and value will also be available to those
      *   expressions; see the Syntax section for details.)
      */
    var sandbox: js.UndefOr[Map[String, Any]] = js.undefined
    
    /**
      * Whether or not to wrap the results in an array.
      *
      * If wrap is set to false, and no results are found, undefined will be
      *   returned (as opposed to an empty array when wrap is set to true).
      *
      * If wrap is set to false and a single non-array result is found, that
      *   result will be the only item returned (not within an array).
      *
      * An array will still be returned if multiple results are found, however.
      * To avoid ambiguities (in the case where it is necessary to distinguish
      * between a result which is a failure and one which is an empty array),
      * it is recommended to switch the default to false.
      *
      * @default true
      */
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object JSONPathOptions {
    
    inline def apply(path: String | js.Array[Any]): JSONPathOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], json = null)
      __obj.asInstanceOf[JSONPathOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONPathOptions] (val x: Self) extends AnyVal {
      
      inline def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
      
      inline def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
      
      inline def setCallback(value: (/* payload */ Any, /* payloadType */ Any, /* fullPayload */ Any) => Any): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      inline def setJson(value: Boolean | Double | String | js.Object | js.Array[Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonNull: Self = StObject.set(x, "json", null)
      
      inline def setJsonVarargs(value: Any*): Self = StObject.set(x, "json", js.Array(value*))
      
      inline def setOtherTypeCallback(value: JSONPathOtherTypeCallback): Self = StObject.set(x, "otherTypeCallback", value.asInstanceOf[js.Any])
      
      inline def setOtherTypeCallbackUndefined: Self = StObject.set(x, "otherTypeCallback", js.undefined)
      
      inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentProperty(value: Any): Self = StObject.set(x, "parentProperty", value.asInstanceOf[js.Any])
      
      inline def setParentPropertyNull: Self = StObject.set(x, "parentProperty", null)
      
      inline def setParentPropertyUndefined: Self = StObject.set(x, "parentProperty", js.undefined)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: String | js.Array[Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: Any*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setPreventEval(value: Boolean): Self = StObject.set(x, "preventEval", value.asInstanceOf[js.Any])
      
      inline def setPreventEvalUndefined: Self = StObject.set(x, "preventEval", js.undefined)
      
      inline def setResultType(value: value | path | pointer | parent | parentProperty | all): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
      
      inline def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
      
      inline def setSandbox(value: Map[String, Any]): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait JSONPathOptionsAutoStart
    extends StObject
       with JSONPathOptions {
    
    @JSName("autostart")
    var autostart_JSONPathOptionsAutoStart: `false`
  }
  object JSONPathOptionsAutoStart {
    
    inline def apply(path: String | js.Array[Any]): JSONPathOptionsAutoStart = {
      val __obj = js.Dynamic.literal(autostart = false, path = path.asInstanceOf[js.Any], json = null)
      __obj.asInstanceOf[JSONPathOptionsAutoStart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONPathOptionsAutoStart] (val x: Self) extends AnyVal {
      
      inline def setAutostart(value: `false`): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JSONPathOtherTypeCallback extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  @js.native
  trait JSONPathType
    extends StObject
       with JSONPathCallable
       with JSONPathClass
}
