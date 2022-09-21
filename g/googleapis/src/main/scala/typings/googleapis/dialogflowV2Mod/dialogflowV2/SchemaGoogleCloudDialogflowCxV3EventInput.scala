package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3EventInput extends StObject {
  
  /**
    * Name of the event.
    */
  var event: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3EventInput {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3EventInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3EventInput]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3EventInput](x: Self) {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
