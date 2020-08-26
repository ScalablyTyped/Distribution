package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Desktop related attributes to the Dynamic Link.
  */
@js.native
trait SchemaDesktopInfo extends js.Object {
  /**
    * Link to open on desktop.
    */
  var desktopFallbackLink: js.UndefOr[String] = js.native
}

object SchemaDesktopInfo {
  @scala.inline
  def apply(): SchemaDesktopInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDesktopInfo]
  }
  @scala.inline
  implicit class SchemaDesktopInfoOps[Self <: SchemaDesktopInfo] (val x: Self) extends AnyVal {
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
    def setDesktopFallbackLink(value: String): Self = this.set("desktopFallbackLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopFallbackLink: Self = this.set("desktopFallbackLink", js.undefined)
  }
  
}

