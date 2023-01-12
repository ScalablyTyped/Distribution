package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelReference extends StObject {
  
  /** [Required] The ID of the dataset containing this model. */
  var datasetId: js.UndefOr[String] = js.undefined
  
  /** [Required] The ID of the model. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters. */
  var modelId: js.UndefOr[String] = js.undefined
  
  /** [Required] The ID of the project containing this model. */
  var projectId: js.UndefOr[String] = js.undefined
}
object ModelReference {
  
  inline def apply(): ModelReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelReference] (val x: Self) extends AnyVal {
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
    
    inline def setModelId(value: String): Self = StObject.set(x, "modelId", value.asInstanceOf[js.Any])
    
    inline def setModelIdUndefined: Self = StObject.set(x, "modelId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
