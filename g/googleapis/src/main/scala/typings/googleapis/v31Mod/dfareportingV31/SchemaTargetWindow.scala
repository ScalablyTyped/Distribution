package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Target Window.
  */
trait SchemaTargetWindow extends StObject {
  
  /**
    * User-entered value.
    */
  var customHtml: js.UndefOr[String] = js.undefined
  
  /**
    * Type of browser window for which the backup image of the flash creative
    * can be displayed.
    */
  var targetWindowOption: js.UndefOr[String] = js.undefined
}
object SchemaTargetWindow {
  
  inline def apply(): SchemaTargetWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetWindow]
  }
  
  extension [Self <: SchemaTargetWindow](x: Self) {
    
    inline def setCustomHtml(value: String): Self = StObject.set(x, "customHtml", value.asInstanceOf[js.Any])
    
    inline def setCustomHtmlUndefined: Self = StObject.set(x, "customHtml", js.undefined)
    
    inline def setTargetWindowOption(value: String): Self = StObject.set(x, "targetWindowOption", value.asInstanceOf[js.Any])
    
    inline def setTargetWindowOptionUndefined: Self = StObject.set(x, "targetWindowOption", js.undefined)
  }
}
