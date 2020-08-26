package typings.kikBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platform extends js.Object {
  var platform: Browser = js.native
}

object Platform {
  @scala.inline
  def apply(platform: Browser): Platform = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platform]
  }
  @scala.inline
  implicit class PlatformOps[Self <: Platform] (val x: Self) extends AnyVal {
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
    def setPlatform(value: Browser): Self = this.set("platform", value.asInstanceOf[js.Any])
  }
  
}

