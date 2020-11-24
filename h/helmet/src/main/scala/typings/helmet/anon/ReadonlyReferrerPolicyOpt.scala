package typings.helmet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<helmet.helmet/dist/middlewares/referrer-policy.ReferrerPolicyOptions> */
@js.native
trait ReadonlyReferrerPolicyOpt extends js.Object {
  
  val policy: js.UndefOr[String | js.Array[String]] = js.native
}
object ReadonlyReferrerPolicyOpt {
  
  @scala.inline
  def apply(): ReadonlyReferrerPolicyOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyReferrerPolicyOpt]
  }
  
  @scala.inline
  implicit class ReadonlyReferrerPolicyOptOps[Self <: ReadonlyReferrerPolicyOpt] (val x: Self) extends AnyVal {
    
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
    def setPolicyVarargs(value: String*): Self = this.set("policy", js.Array(value :_*))
    
    @scala.inline
    def setPolicy(value: String | js.Array[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
}
