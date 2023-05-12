package typings.jsonfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("jsonfile/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(obj: Any, options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stripBom(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripBom")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait StringifyOptions extends StObject {
    
    var EOL: js.UndefOr[String] = js.undefined
    
    var finalEOL: js.UndefOr[Boolean] = js.undefined
    
    var replacer: js.UndefOr[js.Function2[/* key */ String, /* value */ Any, Any]] = js.undefined
    
    var spaces: js.UndefOr[String | Double] = js.undefined
  }
  object StringifyOptions {
    
    inline def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringifyOptions] (val x: Self) extends AnyVal {
      
      inline def setEOL(value: String): Self = StObject.set(x, "EOL", value.asInstanceOf[js.Any])
      
      inline def setEOLUndefined: Self = StObject.set(x, "EOL", js.undefined)
      
      inline def setFinalEOL(value: Boolean): Self = StObject.set(x, "finalEOL", value.asInstanceOf[js.Any])
      
      inline def setFinalEOLUndefined: Self = StObject.set(x, "finalEOL", js.undefined)
      
      inline def setReplacer(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setSpaces(value: String | Double): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    }
  }
}
