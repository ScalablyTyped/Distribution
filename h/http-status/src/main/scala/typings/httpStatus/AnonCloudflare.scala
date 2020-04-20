package typings.httpStatus

import typings.httpStatus.mod.HttpStatusCloudfare
import typings.httpStatus.mod.HttpStatusIis
import typings.httpStatus.mod.HttpStatusNginx
import typings.httpStatus.mod.HttpStatusUnofficial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloudflare extends js.Object {
  var cloudflare: HttpStatusCloudfare
  var iis: HttpStatusIis
  var nginx: HttpStatusNginx
  var unofficial: HttpStatusUnofficial
}

object AnonCloudflare {
  @scala.inline
  def apply(
    cloudflare: HttpStatusCloudfare,
    iis: HttpStatusIis,
    nginx: HttpStatusNginx,
    unofficial: HttpStatusUnofficial
  ): AnonCloudflare = {
    val __obj = js.Dynamic.literal(cloudflare = cloudflare.asInstanceOf[js.Any], iis = iis.asInstanceOf[js.Any], nginx = nginx.asInstanceOf[js.Any], unofficial = unofficial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloudflare]
  }
}

