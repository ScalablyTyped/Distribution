package typings.jenkins.anon

import typings.jenkins.jenkinsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrumbIssuer extends js.Object {
  var baseUrl: js.UndefOr[String] = js.native
  var crumbIssuer: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var promisify: `true` = js.native
}

object CrumbIssuer {
  @scala.inline
  def apply(promisify: `true`): CrumbIssuer = {
    val __obj = js.Dynamic.literal(promisify = promisify.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrumbIssuer]
  }
  @scala.inline
  implicit class CrumbIssuerOps[Self <: CrumbIssuer] (val x: Self) extends AnyVal {
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
    def setPromisify(value: `true`): Self = this.set("promisify", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setCrumbIssuer(value: Boolean): Self = this.set("crumbIssuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrumbIssuer: Self = this.set("crumbIssuer", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

