package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFeaturesResponse extends StObject {
  
  /**
    * A token to request the next page of resources from the `ListFeatures` method. The value of an empty string means that there are no more resources to return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of matching Features
    */
  var resources: js.UndefOr[js.Array[SchemaFeature]] = js.undefined
}
object SchemaListFeaturesResponse {
  
  inline def apply(): SchemaListFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFeaturesResponse]
  }
  
  extension [Self <: SchemaListFeaturesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[SchemaFeature]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaFeature*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
