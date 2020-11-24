package typings.httpStatus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpStatusExtra extends js.Object {
  
  val cloudflare: HttpStatusCloudfare = js.native
  
  val iis: HttpStatusIis = js.native
  
  val nginx: HttpStatusNginx = js.native
  
  val unofficial: HttpStatusUnofficial = js.native
}
object HttpStatusExtra {
  
  @scala.inline
  def apply(
    cloudflare: HttpStatusCloudfare,
    iis: HttpStatusIis,
    nginx: HttpStatusNginx,
    unofficial: HttpStatusUnofficial
  ): HttpStatusExtra = {
    val __obj = js.Dynamic.literal(cloudflare = cloudflare.asInstanceOf[js.Any], iis = iis.asInstanceOf[js.Any], nginx = nginx.asInstanceOf[js.Any], unofficial = unofficial.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpStatusExtra]
  }
  
  @scala.inline
  implicit class HttpStatusExtraOps[Self <: HttpStatusExtra] (val x: Self) extends AnyVal {
    
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
