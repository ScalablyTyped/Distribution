package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the Annotation store that is being created. The string must match the following regex: `[\p{L\}\p{N\}_\-\.]{1,256\}`.
    */
  var annotationStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the dataset this Annotation store belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnnotationStore] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsAnnotationstoresCreate](x: Self) {
    
    inline def setAnnotationStoreId(value: String): Self = StObject.set(x, "annotationStoreId", value.asInstanceOf[js.Any])
    
    inline def setAnnotationStoreIdUndefined: Self = StObject.set(x, "annotationStoreId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAnnotationStore): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
