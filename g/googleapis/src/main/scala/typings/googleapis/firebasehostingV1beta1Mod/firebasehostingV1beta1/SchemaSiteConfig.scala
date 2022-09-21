package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSiteConfig extends StObject {
  
  /**
    * Whether or not web requests made by site visitors are logged via Cloud Logging.
    */
  var cloudLoggingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The number of FINALIZED versions that will be held for a site before automatic deletion. When a new version is deployed, content for versions in storage in excess of this number will be deleted, and will no longer be billed for storage usage. Oldest versions will be deleted first; sites are created with an unlimited number of max_versions by default.
    */
  var maxVersions: js.UndefOr[String | Null] = js.undefined
}
object SchemaSiteConfig {
  
  inline def apply(): SchemaSiteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteConfig]
  }
  
  extension [Self <: SchemaSiteConfig](x: Self) {
    
    inline def setCloudLoggingEnabled(value: Boolean): Self = StObject.set(x, "cloudLoggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCloudLoggingEnabledNull: Self = StObject.set(x, "cloudLoggingEnabled", null)
    
    inline def setCloudLoggingEnabledUndefined: Self = StObject.set(x, "cloudLoggingEnabled", js.undefined)
    
    inline def setMaxVersions(value: String): Self = StObject.set(x, "maxVersions", value.asInstanceOf[js.Any])
    
    inline def setMaxVersionsNull: Self = StObject.set(x, "maxVersions", null)
    
    inline def setMaxVersionsUndefined: Self = StObject.set(x, "maxVersions", js.undefined)
  }
}
