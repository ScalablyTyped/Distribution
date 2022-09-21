package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListConnectionProfilesResponse extends StObject {
  
  /**
    * List of connection profiles.
    */
  var connectionProfiles: js.UndefOr[js.Array[SchemaConnectionProfile]] = js.undefined
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListConnectionProfilesResponse {
  
  inline def apply(): SchemaListConnectionProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListConnectionProfilesResponse]
  }
  
  extension [Self <: SchemaListConnectionProfilesResponse](x: Self) {
    
    inline def setConnectionProfiles(value: js.Array[SchemaConnectionProfile]): Self = StObject.set(x, "connectionProfiles", value.asInstanceOf[js.Any])
    
    inline def setConnectionProfilesUndefined: Self = StObject.set(x, "connectionProfiles", js.undefined)
    
    inline def setConnectionProfilesVarargs(value: SchemaConnectionProfile*): Self = StObject.set(x, "connectionProfiles", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
