package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for Intents.BatchDeleteIntents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest extends StObject {
  
  /**
    * Required. The collection of intents to delete. Only intent `name` must be
    * filled in.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Intent]] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequestMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1BatchDeleteIntentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntents(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: SchemaGoogleCloudDialogflowV2beta1Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
  }
}
