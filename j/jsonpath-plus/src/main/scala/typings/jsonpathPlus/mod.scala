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
    def apply[T](path: String, json: js.Array[js.Any]): T = js.native
    def apply[T](path: String, json: js.Array[js.Any], callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: String, json: js.Array[js.Any], callback: JSONPathCallback): T = js.native
    def apply[T](
      path: String,
      json: js.Array[js.Any],
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
    def apply[T](path: js.Array[js.Any]): T = js.native
    def apply[T](path: js.Array[js.Any], json: String): T = js.native
    def apply[T](path: js.Array[js.Any], json: String, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: js.Array[js.Any], json: String, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[js.Any],
      json: String,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[js.Any], json: js.Array[js.Any]): T = js.native
    def apply[T](
      path: js.Array[js.Any],
      json: js.Array[js.Any],
      callback: Unit,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[js.Any], json: js.Array[js.Any], callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[js.Any],
      json: js.Array[js.Any],
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[js.Any], json: js.Object): T = js.native
    def apply[T](
      path: js.Array[js.Any],
      json: js.Object,
      callback: Unit,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[js.Any], json: js.Object, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[js.Any],
      json: js.Object,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[js.Any], json: Boolean): T = js.native
    def apply[T](
      path: js.Array[js.Any],
      json: Boolean,
      callback: Unit,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[js.Any], json: Boolean, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[js.Any],
      json: Boolean,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[js.Any], json: Double): T = js.native
    def apply[T](path: js.Array[js.Any], json: Double, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: js.Array[js.Any], json: Double, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[js.Any],
      json: Double,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
    def apply[T](path: js.Array[js.Any], json: Null, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): T = js.native
    def apply[T](path: js.Array[js.Any], json: Null, callback: JSONPathCallback): T = js.native
    def apply[T](
      path: js.Array[js.Any],
      json: Null,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): T = js.native
  }
  
  type JSONPathCallback = js.Function3[/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any, js.Any]
  
  @js.native
  trait JSONPathClass extends StObject {
    
    def evaluate(options: Callback): js.Any = js.native
    def evaluate(path: String): js.Any = js.native
    def evaluate(path: String, json: String): js.Any = js.native
    def evaluate(path: String, json: String, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): js.Any = js.native
    def evaluate(path: String, json: String, callback: JSONPathCallback): js.Any = js.native
    def evaluate(
      path: String,
      json: String,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: String, json: js.Array[js.Any]): js.Any = js.native
    def evaluate(path: String, json: js.Array[js.Any], callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): js.Any = js.native
    def evaluate(path: String, json: js.Array[js.Any], callback: JSONPathCallback): js.Any = js.native
    def evaluate(
      path: String,
      json: js.Array[js.Any],
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: String, json: js.Object): js.Any = js.native
    def evaluate(path: String, json: js.Object, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): js.Any = js.native
    def evaluate(path: String, json: js.Object, callback: JSONPathCallback): js.Any = js.native
    def evaluate(
      path: String,
      json: js.Object,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: String, json: Boolean): js.Any = js.native
    def evaluate(path: String, json: Boolean, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): js.Any = js.native
    def evaluate(path: String, json: Boolean, callback: JSONPathCallback): js.Any = js.native
    def evaluate(
      path: String,
      json: Boolean,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: String, json: Double): js.Any = js.native
    def evaluate(path: String, json: Double, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): js.Any = js.native
    def evaluate(path: String, json: Double, callback: JSONPathCallback): js.Any = js.native
    def evaluate(
      path: String,
      json: Double,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: String, json: Null, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): js.Any = js.native
    def evaluate(path: String, json: Null, callback: JSONPathCallback): js.Any = js.native
    def evaluate(path: String, json: Null, callback: JSONPathCallback, otherTypeCallback: JSONPathOtherTypeCallback): js.Any = js.native
    def evaluate(path: js.Array[js.Any]): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: String): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: String, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: String, callback: JSONPathCallback): js.Any = js.native
    def evaluate(
      path: js.Array[js.Any],
      json: String,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: js.Array[js.Any]): js.Any = js.native
    def evaluate(
      path: js.Array[js.Any],
      json: js.Array[js.Any],
      callback: Unit,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: js.Array[js.Any], callback: JSONPathCallback): js.Any = js.native
    def evaluate(
      path: js.Array[js.Any],
      json: js.Array[js.Any],
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: js.Object): js.Any = js.native
    def evaluate(
      path: js.Array[js.Any],
      json: js.Object,
      callback: Unit,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: js.Object, callback: JSONPathCallback): js.Any = js.native
    def evaluate(
      path: js.Array[js.Any],
      json: js.Object,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: Boolean): js.Any = js.native
    def evaluate(
      path: js.Array[js.Any],
      json: Boolean,
      callback: Unit,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: Boolean, callback: JSONPathCallback): js.Any = js.native
    def evaluate(
      path: js.Array[js.Any],
      json: Boolean,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: Double): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: Double, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: Double, callback: JSONPathCallback): js.Any = js.native
    def evaluate(
      path: js.Array[js.Any],
      json: Double,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: Null, callback: Unit, otherTypeCallback: JSONPathOtherTypeCallback): js.Any = js.native
    def evaluate(path: js.Array[js.Any], json: Null, callback: JSONPathCallback): js.Any = js.native
    def evaluate(
      path: js.Array[js.Any],
      json: Null,
      callback: JSONPathCallback,
      otherTypeCallback: JSONPathOtherTypeCallback
    ): js.Any = js.native
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
    var json: Null | Boolean | Double | String | js.Object | js.Array[js.Any]
    
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
    var parent: js.UndefOr[Null | js.Any] = js.undefined
    
    /**
      * In the event that a query could be made to return the root node,
      * this allows the parentProperty of that root node to be returned within
      * results.
      *
      * @default null
      */
    var parentProperty: js.UndefOr[Null | js.Any] = js.undefined
    
    /**
      * The JSONPath expression as a (normalized or unnormalized) string or
      *   array.
      */
    var path: String | js.Array[js.Any]
    
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
    var sandbox: js.UndefOr[Map[String, js.Any]] = js.undefined
    
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
    
    @scala.inline
    def apply(path: String | js.Array[js.Any]): JSONPathOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], json = null)
      __obj.asInstanceOf[JSONPathOptions]
    }
    
    @scala.inline
    implicit class JSONPathOptionsMutableBuilder[Self <: JSONPathOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
      
      @scala.inline
      def setCallback(value: (/* payload */ js.Any, /* payloadType */ js.Any, /* fullPayload */ js.Any) => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean | Double | String | js.Object | js.Array[js.Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonNull: Self = StObject.set(x, "json", null)
      
      @scala.inline
      def setJsonVarargs(value: js.Any*): Self = StObject.set(x, "json", js.Array(value :_*))
      
      @scala.inline
      def setOtherTypeCallback(value: JSONPathOtherTypeCallback): Self = StObject.set(x, "otherTypeCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOtherTypeCallbackUndefined: Self = StObject.set(x, "otherTypeCallback", js.undefined)
      
      @scala.inline
      def setParent(value: js.Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNull: Self = StObject.set(x, "parent", null)
      
      @scala.inline
      def setParentProperty(value: js.Any): Self = StObject.set(x, "parentProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentPropertyNull: Self = StObject.set(x, "parentProperty", null)
      
      @scala.inline
      def setParentPropertyUndefined: Self = StObject.set(x, "parentProperty", js.undefined)
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPath(value: String | js.Array[js.Any]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: js.Any*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setPreventEval(value: Boolean): Self = StObject.set(x, "preventEval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventEvalUndefined: Self = StObject.set(x, "preventEval", js.undefined)
      
      @scala.inline
      def setResultType(value: value | path | pointer | parent | parentProperty | all): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
      
      @scala.inline
      def setSandbox(value: Map[String, js.Any]): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait JSONPathOptionsAutoStart
    extends StObject
       with JSONPathOptions {
    
    @JSName("autostart")
    var autostart_JSONPathOptionsAutoStart: `false`
  }
  object JSONPathOptionsAutoStart {
    
    @scala.inline
    def apply(path: String | js.Array[js.Any]): JSONPathOptionsAutoStart = {
      val __obj = js.Dynamic.literal(autostart = false, path = path.asInstanceOf[js.Any], json = null)
      __obj.asInstanceOf[JSONPathOptionsAutoStart]
    }
    
    @scala.inline
    implicit class JSONPathOptionsAutoStartMutableBuilder[Self <: JSONPathOptionsAutoStart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutostart(value: `false`): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JSONPathOtherTypeCallback extends StObject {
    
    def apply(args: js.Any*): Unit = js.native
  }
  
  @js.native
  trait JSONPathType
    extends StObject
       with JSONPathCallable
       with JSONPathClass
}
