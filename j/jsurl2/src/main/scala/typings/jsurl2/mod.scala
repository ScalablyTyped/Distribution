package typings.jsurl2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsurl2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse[T /* <: js.Object */](urlFragment: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlFragment.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def parse[T /* <: js.Object */](urlFragment: String, options: ParseOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlFragment.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def stringify(`object`: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(`object`: js.Object, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def tryParse[T /* <: js.Object */](urlFragment: String, defaultValue: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(urlFragment.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def tryParse[T /* <: js.Object */](urlFragment: String, defaultValue: T, options: ParseOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(urlFragment.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait ParseOptions extends StObject {
    
    /**
      * Remove URI encoding and whitespace
      */
    var deURI: js.UndefOr[Boolean] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setDeURI(value: Boolean): Self = StObject.set(x, "deURI", value.asInstanceOf[js.Any])
      
      inline def setDeURIUndefined: Self = StObject.set(x, "deURI", js.undefined)
    }
  }
  
  trait StringifyOptions extends StObject {
    
    /**
      * `rich`: encode Date, `undefined`, `Infinity`
      */
    var rich: js.UndefOr[Boolean] = js.undefined
    
    /**
      * `short`: remove optional trailing delimiters
      */
    var short: js.UndefOr[Boolean] = js.undefined
  }
  object StringifyOptions {
    
    inline def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    extension [Self <: StringifyOptions](x: Self) {
      
      inline def setRich(value: Boolean): Self = StObject.set(x, "rich", value.asInstanceOf[js.Any])
      
      inline def setRichUndefined: Self = StObject.set(x, "rich", js.undefined)
      
      inline def setShort(value: Boolean): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    }
  }
}
