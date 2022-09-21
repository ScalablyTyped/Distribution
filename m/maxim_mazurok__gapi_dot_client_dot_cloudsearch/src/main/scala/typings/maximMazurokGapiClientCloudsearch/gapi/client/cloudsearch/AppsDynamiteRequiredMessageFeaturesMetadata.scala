package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteRequiredMessageFeaturesMetadata extends StObject {
  
  var requiredFeatures: js.UndefOr[js.Array[String]] = js.undefined
}
object AppsDynamiteRequiredMessageFeaturesMetadata {
  
  inline def apply(): AppsDynamiteRequiredMessageFeaturesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteRequiredMessageFeaturesMetadata]
  }
  
  extension [Self <: AppsDynamiteRequiredMessageFeaturesMetadata](x: Self) {
    
    inline def setRequiredFeatures(value: js.Array[String]): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    inline def setRequiredFeaturesVarargs(value: String*): Self = StObject.set(x, "requiredFeatures", js.Array(value*))
  }
}
