package typings.ibmCloudSdkCore.baseServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseServiceOptions extends UserOptions {
  @JSName("headers")
  var headers_BaseServiceOptions: HeaderOptions = js.native
  var qs: js.Any = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  @JSName("url")
  var url_BaseServiceOptions: String = js.native
}

object BaseServiceOptions {
  @scala.inline
  def apply(headers: HeaderOptions, qs: js.Any, url: String): BaseServiceOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], qs = qs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseServiceOptions]
  }
  @scala.inline
  implicit class BaseServiceOptionsOps[Self <: BaseServiceOptions] (val x: Self) extends AnyVal {
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
    def setHeaders(value: HeaderOptions): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setQs(value: js.Any): Self = this.set("qs", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
  }
  
}

