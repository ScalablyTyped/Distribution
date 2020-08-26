package typings.googleapis.securitycenterV1Mod.securitycenterV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration used for Asset Discovery runs.
  */
@js.native
trait SchemaAssetDiscoveryConfig extends js.Object {
  /**
    * The mode to use for filtering asset discovery.
    */
  var inclusionMode: js.UndefOr[String] = js.native
  /**
    * The project ids to use for filtering asset discovery.
    */
  var projectIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAssetDiscoveryConfig {
  @scala.inline
  def apply(): SchemaAssetDiscoveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssetDiscoveryConfig]
  }
  @scala.inline
  implicit class SchemaAssetDiscoveryConfigOps[Self <: SchemaAssetDiscoveryConfig] (val x: Self) extends AnyVal {
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
    def setInclusionMode(value: String): Self = this.set("inclusionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclusionMode: Self = this.set("inclusionMode", js.undefined)
    @scala.inline
    def setProjectIdsVarargs(value: String*): Self = this.set("projectIds", js.Array(value :_*))
    @scala.inline
    def setProjectIds(value: js.Array[String]): Self = this.set("projectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectIds: Self = this.set("projectIds", js.undefined)
  }
  
}

