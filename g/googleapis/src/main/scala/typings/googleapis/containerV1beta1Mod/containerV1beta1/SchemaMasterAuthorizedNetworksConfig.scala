package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the master authorized networks feature. Enabled
  * master authorized networks will disallow all external traffic to access
  * Kubernetes master through HTTPS except traffic from the given CIDR blocks,
  * Google Compute Engine Public IPs and Google Prod IPs.
  */
@js.native
trait SchemaMasterAuthorizedNetworksConfig extends js.Object {
  /**
    * cidr_blocks define up to 10 external networks that could access
    * Kubernetes master through HTTPS.
    */
  var cidrBlocks: js.UndefOr[js.Array[SchemaCidrBlock]] = js.native
  /**
    * Whether or not master authorized networks is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}

object SchemaMasterAuthorizedNetworksConfig {
  @scala.inline
  def apply(): SchemaMasterAuthorizedNetworksConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMasterAuthorizedNetworksConfig]
  }
  @scala.inline
  implicit class SchemaMasterAuthorizedNetworksConfigOps[Self <: SchemaMasterAuthorizedNetworksConfig] (val x: Self) extends AnyVal {
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
    def setCidrBlocksVarargs(value: SchemaCidrBlock*): Self = this.set("cidrBlocks", js.Array(value :_*))
    @scala.inline
    def setCidrBlocks(value: js.Array[SchemaCidrBlock]): Self = this.set("cidrBlocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlocks: Self = this.set("cidrBlocks", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

