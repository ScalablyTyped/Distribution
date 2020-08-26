package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the cluster auto-delete schedule configuration.
  */
@js.native
trait SchemaLifecycleConfig extends js.Object {
  /**
    * Optional. The time when cluster will be auto-deleted.
    */
  var autoDeleteTime: js.UndefOr[String] = js.native
  /**
    * Optional. The lifetime duration of cluster. The cluster will be
    * auto-deleted at the end of this period. Valid range: 10m, 14d.Example:
    * &quot;1d&quot;, to delete the cluster 1 day after its creation..
    */
  var autoDeleteTtl: js.UndefOr[String] = js.native
  /**
    * Optional. The duration to keep the cluster alive while idling. Passing
    * this threshold will cause the cluster to be deleted. Valid range: 10m,
    * 14d.Example: &quot;10m&quot;, the minimum value, to delete the cluster
    * when it has had no jobs running for 10 minutes.
    */
  var idleDeleteTtl: js.UndefOr[String] = js.native
}

object SchemaLifecycleConfig {
  @scala.inline
  def apply(): SchemaLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLifecycleConfig]
  }
  @scala.inline
  implicit class SchemaLifecycleConfigOps[Self <: SchemaLifecycleConfig] (val x: Self) extends AnyVal {
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
    def setAutoDeleteTime(value: String): Self = this.set("autoDeleteTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDeleteTime: Self = this.set("autoDeleteTime", js.undefined)
    @scala.inline
    def setAutoDeleteTtl(value: String): Self = this.set("autoDeleteTtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoDeleteTtl: Self = this.set("autoDeleteTtl", js.undefined)
    @scala.inline
    def setIdleDeleteTtl(value: String): Self = this.set("idleDeleteTtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdleDeleteTtl: Self = this.set("idleDeleteTtl", js.undefined)
  }
  
}

