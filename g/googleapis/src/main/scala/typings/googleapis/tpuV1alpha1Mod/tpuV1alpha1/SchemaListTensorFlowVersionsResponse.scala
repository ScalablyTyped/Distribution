package typings.googleapis.tpuV1alpha1Mod.tpuV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for ListTensorFlowVersions.
  */
trait SchemaListTensorFlowVersionsResponse extends StObject {
  
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The listed nodes.
    */
  var tensorflowVersions: js.UndefOr[js.Array[SchemaTensorFlowVersion]] = js.undefined
}
object SchemaListTensorFlowVersionsResponse {
  
  inline def apply(): SchemaListTensorFlowVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTensorFlowVersionsResponse]
  }
  
  extension [Self <: SchemaListTensorFlowVersionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTensorflowVersions(value: js.Array[SchemaTensorFlowVersion]): Self = StObject.set(x, "tensorflowVersions", value.asInstanceOf[js.Any])
    
    inline def setTensorflowVersionsUndefined: Self = StObject.set(x, "tensorflowVersions", js.undefined)
    
    inline def setTensorflowVersionsVarargs(value: SchemaTensorFlowVersion*): Self = StObject.set(x, "tensorflowVersions", js.Array(value :_*))
  }
}
