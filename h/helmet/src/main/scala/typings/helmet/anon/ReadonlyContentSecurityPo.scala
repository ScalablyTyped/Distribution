package typings.helmet.anon

import typings.helmet.contentSecurityPolicyMod.ContentSecurityPolicyDirectives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<helmet.helmet/dist/middlewares/content-security-policy.ContentSecurityPolicyOptions> */
@js.native
trait ReadonlyContentSecurityPo extends js.Object {
  
  val directives: js.UndefOr[ContentSecurityPolicyDirectives] = js.native
  
  val reportOnly: js.UndefOr[Boolean] = js.native
}
object ReadonlyContentSecurityPo {
  
  @scala.inline
  def apply(): ReadonlyContentSecurityPo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyContentSecurityPo]
  }
  
  @scala.inline
  implicit class ReadonlyContentSecurityPoOps[Self <: ReadonlyContentSecurityPo] (val x: Self) extends AnyVal {
    
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
    def setDirectives(value: ContentSecurityPolicyDirectives): Self = this.set("directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    
    @scala.inline
    def setReportOnly(value: Boolean): Self = this.set("reportOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportOnly: Self = this.set("reportOnly", js.undefined)
  }
}
