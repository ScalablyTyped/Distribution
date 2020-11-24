package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Failinfo extends js.Object {
  
  var failinfo: js.UndefOr[NameParam | IntegerParam] = js.native
  
  var statstr: js.UndefOr[ArrayParam[String]] = js.native
  
  var status: NameParam = js.native
}
object Failinfo {
  
  @scala.inline
  def apply(status: NameParam): Failinfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failinfo]
  }
  
  @scala.inline
  implicit class FailinfoOps[Self <: Failinfo] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: NameParam): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailinfo(value: NameParam | IntegerParam): Self = this.set("failinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailinfo: Self = this.set("failinfo", js.undefined)
    
    @scala.inline
    def setStatstr(value: ArrayParam[String]): Self = this.set("statstr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatstr: Self = this.set("statstr", js.undefined)
  }
}
