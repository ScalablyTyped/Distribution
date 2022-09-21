package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAvailableVersionsResponse extends StObject {
  
  /**
    * Represents a list of versions that are supported.
    */
  var availableVersions: js.UndefOr[js.Array[SchemaVersion]] = js.undefined
  
  /**
    * Token to retrieve the next page of results or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAvailableVersionsResponse {
  
  inline def apply(): SchemaListAvailableVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAvailableVersionsResponse]
  }
  
  extension [Self <: SchemaListAvailableVersionsResponse](x: Self) {
    
    inline def setAvailableVersions(value: js.Array[SchemaVersion]): Self = StObject.set(x, "availableVersions", value.asInstanceOf[js.Any])
    
    inline def setAvailableVersionsUndefined: Self = StObject.set(x, "availableVersions", js.undefined)
    
    inline def setAvailableVersionsVarargs(value: SchemaVersion*): Self = StObject.set(x, "availableVersions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
