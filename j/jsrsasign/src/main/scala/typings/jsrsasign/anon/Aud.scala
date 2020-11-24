package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aud extends js.Object {
  
  var alg: js.UndefOr[js.Array[String]] = js.native
  
  var aud: js.UndefOr[js.Array[String]] = js.native
  
  var iss: js.UndefOr[js.Array[String]] = js.native
  
  var jti: js.UndefOr[String] = js.native
  
  var sub: js.UndefOr[js.Array[String]] = js.native
  
  var verifyAt: js.UndefOr[String | Double] = js.native
}
object Aud {
  
  @scala.inline
  def apply(): Aud = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aud]
  }
  
  @scala.inline
  implicit class AudOps[Self <: Aud] (val x: Self) extends AnyVal {
    
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
    def setAlgVarargs(value: String*): Self = this.set("alg", js.Array(value :_*))
    
    @scala.inline
    def setAlg(value: js.Array[String]): Self = this.set("alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlg: Self = this.set("alg", js.undefined)
    
    @scala.inline
    def setAudVarargs(value: String*): Self = this.set("aud", js.Array(value :_*))
    
    @scala.inline
    def setAud(value: js.Array[String]): Self = this.set("aud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAud: Self = this.set("aud", js.undefined)
    
    @scala.inline
    def setIssVarargs(value: String*): Self = this.set("iss", js.Array(value :_*))
    
    @scala.inline
    def setIss(value: js.Array[String]): Self = this.set("iss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIss: Self = this.set("iss", js.undefined)
    
    @scala.inline
    def setJti(value: String): Self = this.set("jti", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJti: Self = this.set("jti", js.undefined)
    
    @scala.inline
    def setSubVarargs(value: String*): Self = this.set("sub", js.Array(value :_*))
    
    @scala.inline
    def setSub(value: js.Array[String]): Self = this.set("sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSub: Self = this.set("sub", js.undefined)
    
    @scala.inline
    def setVerifyAt(value: String | Double): Self = this.set("verifyAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyAt: Self = this.set("verifyAt", js.undefined)
  }
}
