package typings.heremaps.H.service.EnterpriseRoutingService

import typings.heremaps.H.service.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property subDomain {string=} - The sub-domain of the routing service relative to the platform's base URL (default is 'route')
  * @property path {string=} - The path of the map tile service, default is "routing/7.2"
  * @property baseUrl {H.service.Url=} - The base URL of the service, defaults to the the platform's base URL if instance was created using H.service.Platform#getEnterpriseRoutingService
  * method.
  */
@js.native
trait Options extends js.Object {
  var baseUrl: js.UndefOr[Url] = js.native
  var path: js.UndefOr[String] = js.native
  var subDomain: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setBaseUrl(value: Url): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSubDomain(value: String): Self = this.set("subDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubDomain: Self = this.set("subDomain", js.undefined)
  }
  
}

