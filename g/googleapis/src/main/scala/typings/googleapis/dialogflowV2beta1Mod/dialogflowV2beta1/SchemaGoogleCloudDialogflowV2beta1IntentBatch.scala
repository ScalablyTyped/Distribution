package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This message is a wrapper around a collection of intents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentBatch extends StObject {
  
  /**
    * A collection of intents.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Intent]] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1IntentBatch {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1IntentBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentBatch]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1IntentBatchMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1IntentBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntents(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: SchemaGoogleCloudDialogflowV2beta1Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
  }
}
