package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequiredMessageFeaturesMetadata extends StObject {
  
  var requiredFeatures: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRequiredMessageFeaturesMetadata {
  
  inline def apply(): SchemaRequiredMessageFeaturesMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequiredMessageFeaturesMetadata]
  }
  
  extension [Self <: SchemaRequiredMessageFeaturesMetadata](x: Self) {
    
    inline def setRequiredFeatures(value: js.Array[String]): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    inline def setRequiredFeaturesNull: Self = StObject.set(x, "requiredFeatures", null)
    
    inline def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    inline def setRequiredFeaturesVarargs(value: String*): Self = StObject.set(x, "requiredFeatures", js.Array(value*))
  }
}
