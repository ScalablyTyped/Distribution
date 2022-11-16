package typings.loadJsonFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("load-json-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadJsonFile[ReturnValueType](filePath: String): js.Promise[ReturnValueType] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadJsonFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnValueType]]
  inline def loadJsonFile[ReturnValueType](filePath: String, options: Options): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadJsonFile")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  
  inline def loadJsonFileSync[ReturnValueType](filePath: String): ReturnValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("loadJsonFileSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[ReturnValueType]
  inline def loadJsonFileSync[ReturnValueType](filePath: String, options: Options): ReturnValueType = (^.asInstanceOf[js.Dynamic].applyDynamic("loadJsonFileSync")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnValueType]
  
  type BeforeParse = js.Function1[/* data */ String, String]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonValue = string | number | boolean | null | {[ Key in string ]:? load-json-file.load-json-file.JsonValue} | std.Array<load-json-file.load-json-file.JsonValue>
  }}}
  to avoid circular code involving: 
  - load-json-file.load-json-file.JsonValue
  */
  type JsonValue = String | Double | Boolean | Null | (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? any} */ js.Any) | js.Array[Any]
  
  trait Options extends StObject {
    
    /**
    	Applies a function to the JSON string before parsing.
    	*/
    val beforeParse: js.UndefOr[BeforeParse] = js.undefined
    
    /**
    	Prescribes how the value originally produced by parsing is transformed, before being returned.
    	See the [`JSON.parse` docs](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse#Using_the_reviver_parameter) for more.
    	*/
    val reviver: js.UndefOr[Reviver] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBeforeParse(value: /* data */ String => String): Self = StObject.set(x, "beforeParse", js.Any.fromFunction1(value))
      
      inline def setBeforeParseUndefined: Self = StObject.set(x, "beforeParse", js.undefined)
      
      inline def setReviver(value: Reviver): Self = StObject.set(x, "reviver", value.asInstanceOf[js.Any])
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    }
  }
  
  type Reviver = js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]
}
