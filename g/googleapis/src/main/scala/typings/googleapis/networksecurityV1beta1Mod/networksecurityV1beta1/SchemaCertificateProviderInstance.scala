package typings.googleapis.networksecurityV1beta1Mod.networksecurityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateProviderInstance extends StObject {
  
  /**
    * Required. Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
    */
  var pluginInstance: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertificateProviderInstance {
  
  inline def apply(): SchemaCertificateProviderInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateProviderInstance]
  }
  
  extension [Self <: SchemaCertificateProviderInstance](x: Self) {
    
    inline def setPluginInstance(value: String): Self = StObject.set(x, "pluginInstance", value.asInstanceOf[js.Any])
    
    inline def setPluginInstanceNull: Self = StObject.set(x, "pluginInstance", null)
    
    inline def setPluginInstanceUndefined: Self = StObject.set(x, "pluginInstance", js.undefined)
  }
}
