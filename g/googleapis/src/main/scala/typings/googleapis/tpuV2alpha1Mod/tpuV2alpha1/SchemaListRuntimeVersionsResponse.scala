package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRuntimeVersionsResponse extends StObject {
  
  /**
    * The next page token or empty if none.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The listed nodes.
    */
  var runtimeVersions: js.UndefOr[js.Array[SchemaRuntimeVersion]] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListRuntimeVersionsResponse {
  
  inline def apply(): SchemaListRuntimeVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRuntimeVersionsResponse]
  }
  
  extension [Self <: SchemaListRuntimeVersionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRuntimeVersions(value: js.Array[SchemaRuntimeVersion]): Self = StObject.set(x, "runtimeVersions", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionsUndefined: Self = StObject.set(x, "runtimeVersions", js.undefined)
    
    inline def setRuntimeVersionsVarargs(value: SchemaRuntimeVersion*): Self = StObject.set(x, "runtimeVersions", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
