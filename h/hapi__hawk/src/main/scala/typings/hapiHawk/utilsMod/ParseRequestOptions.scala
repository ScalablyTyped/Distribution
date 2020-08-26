package typings.hapiHawk.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseRequestOptions extends js.Object {
  var host: js.UndefOr[String] = js.native
  var hostHeaderName: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
}

object ParseRequestOptions {
  @scala.inline
  def apply(): ParseRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseRequestOptions]
  }
  @scala.inline
  implicit class ParseRequestOptionsOps[Self <: ParseRequestOptions] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setHostHeaderName(value: String): Self = this.set("hostHeaderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostHeaderName: Self = this.set("hostHeaderName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

