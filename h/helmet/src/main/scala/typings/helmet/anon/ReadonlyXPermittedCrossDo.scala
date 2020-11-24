package typings.helmet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<helmet.helmet/dist/middlewares/x-permitted-cross-domain-policies.XPermittedCrossDomainPoliciesOptions> */
@js.native
trait ReadonlyXPermittedCrossDo extends js.Object {
  
  val permittedPolicies: js.UndefOr[String] = js.native
}
object ReadonlyXPermittedCrossDo {
  
  @scala.inline
  def apply(): ReadonlyXPermittedCrossDo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyXPermittedCrossDo]
  }
  
  @scala.inline
  implicit class ReadonlyXPermittedCrossDoOps[Self <: ReadonlyXPermittedCrossDo] (val x: Self) extends AnyVal {
    
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
