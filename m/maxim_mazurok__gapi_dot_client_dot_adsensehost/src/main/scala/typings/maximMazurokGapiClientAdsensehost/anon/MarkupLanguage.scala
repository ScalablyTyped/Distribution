package typings.maximMazurokGapiClientAdsensehost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkupLanguage extends StObject {
  
  /** The markup language to use for this ad unit. */
  var markupLanguage: js.UndefOr[String] = js.undefined
  
  /** The scripting language to use for this ad unit. */
  var scriptingLanguage: js.UndefOr[String] = js.undefined
  
  /** Size of this ad unit. */
  var size: js.UndefOr[String] = js.undefined
  
  /** Type of this ad unit. */
  var `type`: js.UndefOr[String] = js.undefined
}
object MarkupLanguage {
  
  inline def apply(): MarkupLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkupLanguage]
  }
  
  extension [Self <: MarkupLanguage](x: Self) {
    
    inline def setMarkupLanguage(value: String): Self = StObject.set(x, "markupLanguage", value.asInstanceOf[js.Any])
    
    inline def setMarkupLanguageUndefined: Self = StObject.set(x, "markupLanguage", js.undefined)
    
    inline def setScriptingLanguage(value: String): Self = StObject.set(x, "scriptingLanguage", value.asInstanceOf[js.Any])
    
    inline def setScriptingLanguageUndefined: Self = StObject.set(x, "scriptingLanguage", js.undefined)
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
