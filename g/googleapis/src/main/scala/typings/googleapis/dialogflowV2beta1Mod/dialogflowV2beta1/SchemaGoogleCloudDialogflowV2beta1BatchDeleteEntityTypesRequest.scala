package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request message for EntityTypes.BatchDeleteEntityTypes.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest extends StObject {
  
  /**
    * Required. The names entity types to delete. All names must point to the
    * same agent as `parent`.
    */
  var entityTypeNames: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequestMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypeNames(value: js.Array[String]): Self = StObject.set(x, "entityTypeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeNamesUndefined: Self = StObject.set(x, "entityTypeNames", js.undefined)
    
    @scala.inline
    def setEntityTypeNamesVarargs(value: String*): Self = StObject.set(x, "entityTypeNames", js.Array(value :_*))
  }
}
