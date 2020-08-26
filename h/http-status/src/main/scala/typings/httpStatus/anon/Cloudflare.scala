package typings.httpStatus.anon

import typings.httpStatus.mod.HttpStatusCloudfare
import typings.httpStatus.mod.HttpStatusIis
import typings.httpStatus.mod.HttpStatusNginx
import typings.httpStatus.mod.HttpStatusUnofficial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cloudflare extends js.Object {
  var cloudflare: HttpStatusCloudfare = js.native
  var iis: HttpStatusIis = js.native
  var nginx: HttpStatusNginx = js.native
  var unofficial: HttpStatusUnofficial = js.native
}

object Cloudflare {
  @scala.inline
  def apply(
    cloudflare: HttpStatusCloudfare,
    iis: HttpStatusIis,
    nginx: HttpStatusNginx,
    unofficial: HttpStatusUnofficial
  ): Cloudflare = {
    val __obj = js.Dynamic.literal(cloudflare = cloudflare.asInstanceOf[js.Any], iis = iis.asInstanceOf[js.Any], nginx = nginx.asInstanceOf[js.Any], unofficial = unofficial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cloudflare]
  }
  @scala.inline
  implicit class CloudflareOps[Self <: Cloudflare] (val x: Self) extends AnyVal {
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
    def setCloudflare(value: HttpStatusCloudfare): Self = this.set("cloudflare", value.asInstanceOf[js.Any])
    @scala.inline
    def setIis(value: HttpStatusIis): Self = this.set("iis", value.asInstanceOf[js.Any])
    @scala.inline
    def setNginx(value: HttpStatusNginx): Self = this.set("nginx", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnofficial(value: HttpStatusUnofficial): Self = this.set("unofficial", value.asInstanceOf[js.Any])
  }
  
}

