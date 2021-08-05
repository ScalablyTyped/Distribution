package typings.jsontoxml

import typings.jsontoxml.anon.Standalone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: js.Any): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(data: js.Any, options: JsonToXmlOptions): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("jsontoxml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cdata(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cdata")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait JsonToXmlOptions extends StObject {
    
    var docType: js.UndefOr[String] = js.undefined
    
    var escape: js.UndefOr[Boolean] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[String] = js.undefined
    
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    var removeIllegalNameCharacters: js.UndefOr[Boolean] = js.undefined
    
    var xmlHeader: js.UndefOr[Boolean | Standalone] = js.undefined
  }
  object JsonToXmlOptions {
    
    inline def apply(): JsonToXmlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonToXmlOptions]
    }
    
    extension [Self <: JsonToXmlOptions](x: Self) {
      
      inline def setDocType(value: String): Self = StObject.set(x, "docType", value.asInstanceOf[js.Any])
      
      inline def setDocTypeUndefined: Self = StObject.set(x, "docType", js.undefined)
      
      inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      inline def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      inline def setRemoveIllegalNameCharacters(value: Boolean): Self = StObject.set(x, "removeIllegalNameCharacters", value.asInstanceOf[js.Any])
      
      inline def setRemoveIllegalNameCharactersUndefined: Self = StObject.set(x, "removeIllegalNameCharacters", js.undefined)
      
      inline def setXmlHeader(value: Boolean | Standalone): Self = StObject.set(x, "xmlHeader", value.asInstanceOf[js.Any])
      
      inline def setXmlHeaderUndefined: Self = StObject.set(x, "xmlHeader", js.undefined)
    }
  }
}
