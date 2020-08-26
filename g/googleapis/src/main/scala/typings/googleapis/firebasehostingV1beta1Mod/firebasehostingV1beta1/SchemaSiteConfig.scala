package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `SiteConfig` contains metadata associated with a specific site that
  * controls Firebase Hosting serving behavior
  */
@js.native
trait SchemaSiteConfig extends js.Object {
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
  implicit class SchemaSiteConfigOps[Self <: SchemaSiteConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxVersions(value: String): Self = this.set("maxVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVersions: Self = this.set("maxVersions", js.undefined)
  }
  
}

