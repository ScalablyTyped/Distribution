package typings.googleapis.networkconnectivityV1Mod.networkconnectivityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocationMetadata extends StObject {
  
  /**
    * List of supported features
    */
  var locationFeatures: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaLocationMetadata {
  
  inline def apply(): SchemaLocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationMetadata]
  }
  
  extension [Self <: SchemaLocationMetadata](x: Self) {
    
    inline def setLocationFeatures(value: js.Array[String]): Self = StObject.set(x, "locationFeatures", value.asInstanceOf[js.Any])
    
    inline def setLocationFeaturesNull: Self = StObject.set(x, "locationFeatures", null)
    
    inline def setLocationFeaturesUndefined: Self = StObject.set(x, "locationFeatures", js.undefined)
    
    inline def setLocationFeaturesVarargs(value: String*): Self = StObject.set(x, "locationFeatures", js.Array(value*))
  }
}
