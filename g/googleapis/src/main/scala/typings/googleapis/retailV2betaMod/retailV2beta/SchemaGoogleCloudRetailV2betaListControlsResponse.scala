package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaListControlsResponse extends StObject {
  
  /**
    * All the Controls for a given catalog.
    */
  var controls: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaControl]] = js.undefined
  
  /**
    * Pagination token, if not returned indicates the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaListControlsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaListControlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaListControlsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaListControlsResponse](x: Self) {
    
    inline def setControls(value: js.Array[SchemaGoogleCloudRetailV2betaControl]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlsVarargs(value: SchemaGoogleCloudRetailV2betaControl*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
