package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterOptions extends StObject {
  
  var charset: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var uri: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[IPPVersion] = js.undefined
}
object PrinterOptions {
  
  @scala.inline
  def apply(): PrinterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterOptions]
  }
  
  @scala.inline
  implicit class PrinterOptionsMutableBuilder[Self <: PrinterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setVersion(value: IPPVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
