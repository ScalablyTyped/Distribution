package typings.jsontoxml

import typings.jsontoxml.anon.Standalone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(data: js.Any): String = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(data: js.Any, options: JsonToXmlOptions): String = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("jsontoxml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cdata(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cdata")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def escape(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
    
    @scala.inline
    def apply(): JsonToXmlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonToXmlOptions]
    }
    
    @scala.inline
    implicit class JsonToXmlOptionsMutableBuilder[Self <: JsonToXmlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocType(value: String): Self = StObject.set(x, "docType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocTypeUndefined: Self = StObject.set(x, "docType", js.undefined)
      
      @scala.inline
      def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setRemoveIllegalNameCharacters(value: Boolean): Self = StObject.set(x, "removeIllegalNameCharacters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIllegalNameCharactersUndefined: Self = StObject.set(x, "removeIllegalNameCharacters", js.undefined)
      
      @scala.inline
      def setXmlHeader(value: Boolean | Standalone): Self = StObject.set(x, "xmlHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlHeaderUndefined: Self = StObject.set(x, "xmlHeader", js.undefined)
    }
  }
}
