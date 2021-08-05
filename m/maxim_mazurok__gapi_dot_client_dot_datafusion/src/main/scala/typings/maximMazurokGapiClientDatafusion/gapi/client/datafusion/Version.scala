package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  /** Represents a list of available feature names for a given version. */
  var availableFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether this is currently the default version for Cloud Data Fusion */
  var defaultVersion: js.UndefOr[Boolean] = js.undefined
  
  /** The version number of the Data Fusion instance, such as '6.0.1.0'. */
  var versionNumber: js.UndefOr[String] = js.undefined
}
object Version {
  
  inline def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  
  extension [Self <: Version](x: Self) {
    
    inline def setAvailableFeatures(value: js.Array[String]): Self = StObject.set(x, "availableFeatures", value.asInstanceOf[js.Any])
    
    inline def setAvailableFeaturesUndefined: Self = StObject.set(x, "availableFeatures", js.undefined)
    
    inline def setAvailableFeaturesVarargs(value: String*): Self = StObject.set(x, "availableFeatures", js.Array(value :_*))
    
    inline def setDefaultVersion(value: Boolean): Self = StObject.set(x, "defaultVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultVersionUndefined: Self = StObject.set(x, "defaultVersion", js.undefined)
    
    inline def setVersionNumber(value: String): Self = StObject.set(x, "versionNumber", value.asInstanceOf[js.Any])
    
    inline def setVersionNumberUndefined: Self = StObject.set(x, "versionNumber", js.undefined)
  }
}
