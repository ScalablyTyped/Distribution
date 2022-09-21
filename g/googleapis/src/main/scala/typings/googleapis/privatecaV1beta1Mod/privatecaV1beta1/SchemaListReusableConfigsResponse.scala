package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListReusableConfigsResponse extends StObject {
  
  /**
    * A token to retrieve next page of results. Pass this value in ListReusableConfigsRequest.next_page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of ReusableConfigs.
    */
  var reusableConfigs: js.UndefOr[js.Array[SchemaReusableConfig]] = js.undefined
  
  /**
    * A list of locations (e.g. "us-west1") that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListReusableConfigsResponse {
  
  inline def apply(): SchemaListReusableConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListReusableConfigsResponse]
  }
  
  extension [Self <: SchemaListReusableConfigsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReusableConfigs(value: js.Array[SchemaReusableConfig]): Self = StObject.set(x, "reusableConfigs", value.asInstanceOf[js.Any])
    
    inline def setReusableConfigsUndefined: Self = StObject.set(x, "reusableConfigs", js.undefined)
    
    inline def setReusableConfigsVarargs(value: SchemaReusableConfig*): Self = StObject.set(x, "reusableConfigs", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
