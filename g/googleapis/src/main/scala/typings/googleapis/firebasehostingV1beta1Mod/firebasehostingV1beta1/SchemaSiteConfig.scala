package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `SiteConfig` contains metadata associated with a specific site that
  * controls Firebase Hosting serving behavior
  */
@js.native
trait SchemaSiteConfig extends StObject {
  
  /**
    * The number of FINALIZED versions that will be held for a site before
    * automatic deletion. When a new version is deployed, content for versions
    * in storage in excess of this number will be deleted, and will no longer
    * be billed for storage usage. Oldest versions will be deleted first; sites
    * are created with an unlimited number of max_versions by default.
    */
  var maxVersions: js.UndefOr[String] = js.native
}
object SchemaSiteConfig {
  
  @scala.inline
  def apply(): SchemaSiteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteConfig]
  }
  
  @scala.inline
  implicit class SchemaSiteConfigMutableBuilder[Self <: SchemaSiteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxVersions(value: String): Self = StObject.set(x, "maxVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVersionsUndefined: Self = StObject.set(x, "maxVersions", js.undefined)
  }
}
