package typings.lokijs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetainDirtyFlags
  extends /* collName */ StringDictionary[js.Any | Inflate] {
  var retainDirtyFlags: js.UndefOr[Boolean] = js.native
  var throttledSaves: js.UndefOr[Boolean] = js.native
}

object RetainDirtyFlags {
  @scala.inline
  def apply(): RetainDirtyFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetainDirtyFlags]
  }
  @scala.inline
  implicit class RetainDirtyFlagsOps[Self <: RetainDirtyFlags] (val x: Self) extends AnyVal {
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
    def setRetainDirtyFlags(value: Boolean): Self = this.set("retainDirtyFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainDirtyFlags: Self = this.set("retainDirtyFlags", js.undefined)
    @scala.inline
    def setThrottledSaves(value: Boolean): Self = this.set("throttledSaves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottledSaves: Self = this.set("throttledSaves", js.undefined)
  }
  
}

