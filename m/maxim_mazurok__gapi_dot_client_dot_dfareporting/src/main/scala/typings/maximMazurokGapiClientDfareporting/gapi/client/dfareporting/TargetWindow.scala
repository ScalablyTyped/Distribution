package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetWindow extends StObject {
  
  /** User-entered value. */
  var customHtml: js.UndefOr[String] = js.undefined
  
  /** Type of browser window for which the backup image of the flash creative can be displayed. */
  var targetWindowOption: js.UndefOr[String] = js.undefined
}
object TargetWindow {
  
  inline def apply(): TargetWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetWindow] (val x: Self) extends AnyVal {
    
    inline def setCustomHtml(value: String): Self = StObject.set(x, "customHtml", value.asInstanceOf[js.Any])
    
    inline def setCustomHtmlUndefined: Self = StObject.set(x, "customHtml", js.undefined)
    
    inline def setTargetWindowOption(value: String): Self = StObject.set(x, "targetWindowOption", value.asInstanceOf[js.Any])
    
    inline def setTargetWindowOptionUndefined: Self = StObject.set(x, "targetWindowOption", js.undefined)
  }
}
