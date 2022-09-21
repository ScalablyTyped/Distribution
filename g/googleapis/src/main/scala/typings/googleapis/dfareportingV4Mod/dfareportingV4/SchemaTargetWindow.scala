package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetWindow extends StObject {
  
  /**
    * User-entered value.
    */
  var customHtml: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of browser window for which the backup image of the flash creative can be displayed.
    */
  var targetWindowOption: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetWindow {
  
  inline def apply(): SchemaTargetWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetWindow]
  }
  
  extension [Self <: SchemaTargetWindow](x: Self) {
    
    inline def setCustomHtml(value: String): Self = StObject.set(x, "customHtml", value.asInstanceOf[js.Any])
    
    inline def setCustomHtmlNull: Self = StObject.set(x, "customHtml", null)
    
    inline def setCustomHtmlUndefined: Self = StObject.set(x, "customHtml", js.undefined)
    
    inline def setTargetWindowOption(value: String): Self = StObject.set(x, "targetWindowOption", value.asInstanceOf[js.Any])
    
    inline def setTargetWindowOptionNull: Self = StObject.set(x, "targetWindowOption", null)
    
    inline def setTargetWindowOptionUndefined: Self = StObject.set(x, "targetWindowOption", js.undefined)
  }
}
