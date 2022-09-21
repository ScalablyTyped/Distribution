package typings.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListTensorFlowVersionsResponse extends StObject {
  
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The listed nodes.
    */
  var tensorflowVersions: js.UndefOr[js.Array[SchemaTensorFlowVersion]] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListTensorFlowVersionsResponse {
  
  inline def apply(): SchemaListTensorFlowVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTensorFlowVersionsResponse]
  }
  
  extension [Self <: SchemaListTensorFlowVersionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTensorflowVersions(value: js.Array[SchemaTensorFlowVersion]): Self = StObject.set(x, "tensorflowVersions", value.asInstanceOf[js.Any])
    
    inline def setTensorflowVersionsUndefined: Self = StObject.set(x, "tensorflowVersions", js.undefined)
    
    inline def setTensorflowVersionsVarargs(value: SchemaTensorFlowVersion*): Self = StObject.set(x, "tensorflowVersions", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
