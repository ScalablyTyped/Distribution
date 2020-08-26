package typings.kikBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  var browser: Name = js.native
  var os: Name = js.native
  var version: Name = js.native
}

object Browser {
  @scala.inline
  def apply(browser: Name, os: Name, version: Name): Browser = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Browser]
  }
  @scala.inline
  implicit class BrowserOps[Self <: Browser] (val x: Self) extends AnyVal {
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
    def setBrowser(value: Name): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: Name): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Name): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

