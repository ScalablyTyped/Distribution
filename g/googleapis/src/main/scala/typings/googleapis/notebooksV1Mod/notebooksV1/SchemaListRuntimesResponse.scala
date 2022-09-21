package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListRuntimesResponse extends StObject {
  
  /**
    * Page token that can be used to continue listing from the last result in the next list call.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of returned Runtimes.
    */
  var runtimes: js.UndefOr[js.Array[SchemaRuntime]] = js.undefined
  
  /**
    * Locations that could not be reached. For example, ['us-west1', 'us-central1']. A ListRuntimesResponse will only contain either runtimes or unreachables,
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListRuntimesResponse {
  
  inline def apply(): SchemaListRuntimesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListRuntimesResponse]
  }
  
  extension [Self <: SchemaListRuntimesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRuntimes(value: js.Array[SchemaRuntime]): Self = StObject.set(x, "runtimes", value.asInstanceOf[js.Any])
    
    inline def setRuntimesUndefined: Self = StObject.set(x, "runtimes", js.undefined)
    
    inline def setRuntimesVarargs(value: SchemaRuntime*): Self = StObject.set(x, "runtimes", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
