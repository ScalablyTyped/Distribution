package typings.httpDashStatus

import typings.httpDashStatus.httpDashStatusMod.HttpStatusCloudfare
import typings.httpDashStatus.httpDashStatusMod.HttpStatusIis
import typings.httpDashStatus.httpDashStatusMod.HttpStatusNginx
import typings.httpDashStatus.httpDashStatusMod.HttpStatusUnofficial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cloudflare extends js.Object {
  var cloudflare: HttpStatusCloudfare
  var iis: HttpStatusIis
  var nginx: HttpStatusNginx
  var unofficial: HttpStatusUnofficial
}

object Anon_Cloudflare {
  @scala.inline
  def apply(
    cloudflare: HttpStatusCloudfare,
    iis: HttpStatusIis,
    nginx: HttpStatusNginx,
    unofficial: HttpStatusUnofficial
  ): Anon_Cloudflare = {
    val __obj = js.Dynamic.literal(cloudflare = cloudflare, iis = iis, nginx = nginx, unofficial = unofficial)
  
    __obj.asInstanceOf[Anon_Cloudflare]
  }
}

