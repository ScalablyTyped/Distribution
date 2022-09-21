package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaListControlsResponse extends StObject {
  
  /**
    * All the Controls for a given catalog.
    */
  var controls: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaControl]] = js.undefined
  
  /**
    * Pagination token, if not returned indicates the last page.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaListControlsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaListControlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaListControlsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaListControlsResponse](x: Self) {
    
    inline def setControls(value: js.Array[SchemaGoogleCloudRetailV2alphaControl]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlsVarargs(value: SchemaGoogleCloudRetailV2alphaControl*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
