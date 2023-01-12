package typings.hapiBourne

import typings.hapiBourne.hapiBourneStrings.error
import typings.hapiBourne.hapiBourneStrings.ignore
import typings.hapiBourne.hapiBourneStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/bourne", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(text: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def parse(text: String, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: String, reviver: Reviver): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def parse(text: String, reviver: Reviver, options: ParseOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def safeParse(text: String): Any | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(text.asInstanceOf[js.Any]).asInstanceOf[Any | Null]
  inline def safeParse(text: String, reviver: Reviver): Any | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("safeParse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[Any | Null]
  
  inline def scan(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def scan(obj: Any, options: ScanOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ParseOptions extends StObject {
    
    /**
      * - `'error'` - throw a `SyntaxError` when a `__proto__` key is found. This is the default value.
      * - `'remove'` - deletes any `__proto__` keys from the result object.
      * - `'ignore'` - skips all validation (same as calling `JSON.parse()` directly).
      */
    var protoAction: js.UndefOr[error | remove | ignore] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setProtoAction(value: error | remove | ignore): Self = StObject.set(x, "protoAction", value.asInstanceOf[js.Any])
      
      inline def setProtoActionUndefined: Self = StObject.set(x, "protoAction", js.undefined)
    }
  }
  
  type Reviver = js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]
  
  trait ScanOptions extends StObject {
    
    /**
      * - `'error'` - throw a `SyntaxError` when a `__proto__` key is found. This is the default value.
      * - `'remove'` - deletes any `__proto__` keys from the input `obj`.
      */
    var protoAction: js.UndefOr[error | remove] = js.undefined
  }
  object ScanOptions {
    
    inline def apply(): ScanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScanOptions] (val x: Self) extends AnyVal {
      
      inline def setProtoAction(value: error | remove): Self = StObject.set(x, "protoAction", value.asInstanceOf[js.Any])
      
      inline def setProtoActionUndefined: Self = StObject.set(x, "protoAction", js.undefined)
    }
  }
}
