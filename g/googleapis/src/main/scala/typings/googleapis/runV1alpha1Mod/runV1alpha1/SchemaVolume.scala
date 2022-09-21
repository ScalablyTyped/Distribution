package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVolume extends StObject {
  
  var configMap: js.UndefOr[SchemaConfigMapVolumeSource] = js.undefined
  
  /**
    * Volume's name. In Cloud Run Fully Managed, the name 'cloudsql' is reserved.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  var secret: js.UndefOr[SchemaSecretVolumeSource] = js.undefined
}
object SchemaVolume {
  
  inline def apply(): SchemaVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolume]
  }
  
  extension [Self <: SchemaVolume](x: Self) {
    
    inline def setConfigMap(value: SchemaConfigMapVolumeSource): Self = StObject.set(x, "configMap", value.asInstanceOf[js.Any])
    
    inline def setConfigMapUndefined: Self = StObject.set(x, "configMap", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSecret(value: SchemaSecretVolumeSource): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
  }
}
