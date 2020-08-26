package typings.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mounted extends js.Object {
  var mounted: Double = js.native
  var unmounted: Double = js.native
}

object Mounted {
  @scala.inline
  def apply(mounted: Double, unmounted: Double): Mounted = {
    val __obj = js.Dynamic.literal(mounted = mounted.asInstanceOf[js.Any], unmounted = unmounted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mounted]
  }
  @scala.inline
  implicit class MountedOps[Self <: Mounted] (val x: Self) extends AnyVal {
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
    def setMounted(value: Double): Self = this.set("mounted", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnmounted(value: Double): Self = this.set("unmounted", value.asInstanceOf[js.Any])
  }
  
}

