package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for Intents.BatchDeleteIntents.
  */
trait SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequest extends StObject {
  
  /**
    * Required. The collection of intents to delete. Only intent `name` must be
    * filled in.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Intent]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequestMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2BatchDeleteIntentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntents(value: js.Array[SchemaGoogleCloudDialogflowV2Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: SchemaGoogleCloudDialogflowV2Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
  }
}
