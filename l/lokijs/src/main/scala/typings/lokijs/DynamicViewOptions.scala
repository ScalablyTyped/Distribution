package typings.lokijs

import typings.lokijs.lokijsStrings.active
import typings.lokijs.lokijsStrings.passive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicViewOptions extends js.Object {
  var minRebuildInterval: Double = js.native
  var persistent: Boolean = js.native
  var sortPriority: active | passive = js.native
}

object DynamicViewOptions {
  @scala.inline
  def apply(minRebuildInterval: Double, persistent: Boolean, sortPriority: active | passive): DynamicViewOptions = {
    val __obj = js.Dynamic.literal(minRebuildInterval = minRebuildInterval.asInstanceOf[js.Any], persistent = persistent.asInstanceOf[js.Any], sortPriority = sortPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicViewOptions]
  }
  @scala.inline
  implicit class DynamicViewOptionsOps[Self <: DynamicViewOptions] (val x: Self) extends AnyVal {
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
    def setMinRebuildInterval(value: Double): Self = this.set("minRebuildInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortPriority(value: active | passive): Self = this.set("sortPriority", value.asInstanceOf[js.Any])
  }
  
}

