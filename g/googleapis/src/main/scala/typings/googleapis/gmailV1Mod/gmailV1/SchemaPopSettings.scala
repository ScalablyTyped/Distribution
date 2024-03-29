package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPopSettings extends StObject {
  
  /**
    * The range of messages which are accessible via POP.
    */
  var accessWindow: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The action that will be executed on a message after it has been fetched via POP.
    */
  var disposition: js.UndefOr[String | Null] = js.undefined
}
object SchemaPopSettings {
  
  inline def apply(): SchemaPopSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPopSettings]
  }
  
  extension [Self <: SchemaPopSettings](x: Self) {
    
    inline def setAccessWindow(value: String): Self = StObject.set(x, "accessWindow", value.asInstanceOf[js.Any])
    
    inline def setAccessWindowNull: Self = StObject.set(x, "accessWindow", null)
    
    inline def setAccessWindowUndefined: Self = StObject.set(x, "accessWindow", js.undefined)
    
    inline def setDisposition(value: String): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionNull: Self = StObject.set(x, "disposition", null)
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
  }
}
