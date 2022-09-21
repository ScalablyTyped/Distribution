package typings.googleapis.datafusionV1Mod.datafusionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersion extends StObject {
  
  /**
    * Represents a list of available feature names for a given version.
    */
  var availableFeatures: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether this is currently the default version for Cloud Data Fusion
    */
  var defaultVersion: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Type represents the release availability of the version
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version number of the Data Fusion instance, such as '6.0.1.0'.
    */
  var versionNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaVersion {
  
  inline def apply(): SchemaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersion]
  }
  
  extension [Self <: SchemaVersion](x: Self) {
    
    inline def setAvailableFeatures(value: js.Array[String]): Self = StObject.set(x, "availableFeatures", value.asInstanceOf[js.Any])
    
    inline def setAvailableFeaturesNull: Self = StObject.set(x, "availableFeatures", null)
    
    inline def setAvailableFeaturesUndefined: Self = StObject.set(x, "availableFeatures", js.undefined)
    
    inline def setAvailableFeaturesVarargs(value: String*): Self = StObject.set(x, "availableFeatures", js.Array(value*))
    
    inline def setDefaultVersion(value: Boolean): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionNull: Self = StObject.set(x, "defaultVersion", null)
    
    inline def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersionNumber(value: String): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberNull: Self = StObject.set(x, "versionNumber", null)
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
