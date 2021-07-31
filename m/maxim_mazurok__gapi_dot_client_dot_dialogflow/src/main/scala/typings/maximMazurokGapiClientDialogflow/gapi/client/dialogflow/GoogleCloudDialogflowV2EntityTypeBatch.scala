package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2EntityTypeBatch extends StObject {
  
  /** A collection of entity types. */
  var entityTypes: js.UndefOr[js.Array[GoogleCloudDialogflowV2EntityType]] = js.undefined
}
object GoogleCloudDialogflowV2EntityTypeBatch {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2EntityTypeBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2EntityTypeBatch]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2EntityTypeBatchMutableBuilder[Self <: GoogleCloudDialogflowV2EntityTypeBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: js.Array[GoogleCloudDialogflowV2EntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: GoogleCloudDialogflowV2EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
  }
}
