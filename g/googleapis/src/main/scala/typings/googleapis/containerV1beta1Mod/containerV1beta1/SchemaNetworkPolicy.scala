package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for the NetworkPolicy feature.
  * https://kubernetes.io/docs/concepts/services-networking/networkpolicies/
  */
@js.native
trait SchemaNetworkPolicy extends js.Object {
  /**
    * Whether network policy is enabled on the cluster.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The selected network policy provider.
    */
  var provider: js.UndefOr[String] = js.native
}

object SchemaNetworkPolicy {
  @scala.inline
  def apply(): SchemaNetworkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkPolicy]
  }
  @scala.inline
  implicit class SchemaNetworkPolicyOps[Self <: SchemaNetworkPolicy] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
  
}

