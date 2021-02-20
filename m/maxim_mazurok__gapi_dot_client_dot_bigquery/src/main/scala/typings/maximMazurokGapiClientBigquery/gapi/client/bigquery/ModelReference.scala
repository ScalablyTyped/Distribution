package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelReference extends StObject {
  
  /** [Required] The ID of the dataset containing this model. */
  var datasetId: js.UndefOr[String] = js.native
  
  /** [Required] The ID of the model. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters. */
  var modelId: js.UndefOr[String] = js.native
  
  /** [Required] The ID of the project containing this model. */
  var projectId: js.UndefOr[String] = js.native
}
object ModelReference {
  
  @scala.inline
  def apply(): ModelReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelReference]
  }
  
  @scala.inline
  implicit class ModelReferenceMutableBuilder[Self <: ModelReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    @scala.inline
    def setModelId(value: String): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
