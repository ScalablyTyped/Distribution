package typings.jsdom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceLoaderConstructorOptions extends js.Object {
  var proxy: js.UndefOr[String] = js.native
  var strictSSL: js.UndefOr[Boolean] = js.native
  var userAgent: js.UndefOr[String] = js.native
}

object ResourceLoaderConstructorOptions {
  @scala.inline
  def apply(): ResourceLoaderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceLoaderConstructorOptions]
  }
  @scala.inline
  implicit class ResourceLoaderConstructorOptionsOps[Self <: ResourceLoaderConstructorOptions] (val x: Self) extends AnyVal {
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
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setStrictSSL(value: Boolean): Self = this.set("strictSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictSSL: Self = this.set("strictSSL", js.undefined)
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
  
}

