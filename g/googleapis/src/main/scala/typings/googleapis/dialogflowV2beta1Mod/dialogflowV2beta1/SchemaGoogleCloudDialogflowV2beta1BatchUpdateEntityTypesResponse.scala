package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response message for EntityTypes.BatchUpdateEntityTypes.
  */
trait SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse extends StObject {
  
  /**
    * The collection of updated or created entity types.
    */
  var entityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponseMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1BatchUpdateEntityTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityType]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2beta1EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
  }
}
