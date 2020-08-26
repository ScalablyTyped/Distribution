package typings.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSchedulingConfig extends js.Object {
  var preemptible: js.UndefOr[Boolean] = js.native
}

object SchemaSchedulingConfig {
  @scala.inline
  def apply(): SchemaSchedulingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedulingConfig]
  }
  @scala.inline
  implicit class SchemaSchedulingConfigOps[Self <: SchemaSchedulingConfig] (val x: Self) extends AnyVal {
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
    def setPreemptible(value: Boolean): Self = this.set("preemptible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreemptible: Self = this.set("preemptible", js.undefined)
  }
  
}

