package typings.helmet.xPermittedCrossDomainPoliciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XPermittedCrossDomainPoliciesOptions extends js.Object {
  
  var permittedPolicies: js.UndefOr[String] = js.native
}
object XPermittedCrossDomainPoliciesOptions {
  
  @scala.inline
  def apply(): XPermittedCrossDomainPoliciesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XPermittedCrossDomainPoliciesOptions]
  }
  
  @scala.inline
  implicit class XPermittedCrossDomainPoliciesOptionsOps[Self <: XPermittedCrossDomainPoliciesOptions] (val x: Self) extends AnyVal {
    
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
    def setPermittedPolicies(value: String): Self = this.set("permittedPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermittedPolicies: Self = this.set("permittedPolicies", js.undefined)
  }
}
