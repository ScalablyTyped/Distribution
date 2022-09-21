package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentRevisionHumanReview extends StObject {
  
  /**
    * Human review state. e.g. `requested`, `succeeded`, `rejected`.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A message providing more details about the current state of processing. For example, the rejection reason when the state is `rejected`.
    */
  var stateMessage: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentRevisionHumanReview {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentRevisionHumanReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentRevisionHumanReview]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentRevisionHumanReview](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: String): Self = StObject.set(x, "stateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageNull: Self = StObject.set(x, "stateMessage", null)
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "stateMessage", js.undefined)
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
