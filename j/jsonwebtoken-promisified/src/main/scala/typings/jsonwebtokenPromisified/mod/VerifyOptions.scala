package typings.jsonwebtokenPromisified.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyOptions extends js.Object {
  
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  
  var audience: js.UndefOr[String | js.Array[String]] = js.native
  
  var clockTimestamp: js.UndefOr[Double] = js.native
  
  var clockTolerance: js.UndefOr[Double] = js.native
  
  var ignoreExpiration: js.UndefOr[Boolean] = js.native
  
  var ignoreNotBefore: js.UndefOr[Boolean] = js.native
  
  var issuer: js.UndefOr[String | js.Array[String]] = js.native
  
  var jwtid: js.UndefOr[String] = js.native
  
  /**
    * @deprecated
    * {string} - Max age of token
    */
  var maxAge: js.UndefOr[String] = js.native
  
  var subject: js.UndefOr[String] = js.native
}
object VerifyOptions {
  
  @scala.inline
  def apply(): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyOptions]
  }
  
  @scala.inline
  implicit class VerifyOptionsOps[Self <: VerifyOptions] (val x: Self) extends AnyVal {
    
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
    def setAlgorithmsVarargs(value: String*): Self = this.set("algorithms", js.Array(value :_*))
    
    @scala.inline
    def setAlgorithms(value: js.Array[String]): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    
    @scala.inline
    def setAudienceVarargs(value: String*): Self = this.set("audience", js.Array(value :_*))
    
    @scala.inline
    def setAudience(value: String | js.Array[String]): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setClockTimestamp(value: Double): Self = this.set("clockTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockTimestamp: Self = this.set("clockTimestamp", js.undefined)
    
    @scala.inline
    def setClockTolerance(value: Double): Self = this.set("clockTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockTolerance: Self = this.set("clockTolerance", js.undefined)
    
    @scala.inline
    def setIgnoreExpiration(value: Boolean): Self = this.set("ignoreExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreExpiration: Self = this.set("ignoreExpiration", js.undefined)
    
    @scala.inline
    def setIgnoreNotBefore(value: Boolean): Self = this.set("ignoreNotBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreNotBefore: Self = this.set("ignoreNotBefore", js.undefined)
    
    @scala.inline
    def setIssuerVarargs(value: String*): Self = this.set("issuer", js.Array(value :_*))
    
    @scala.inline
    def setIssuer(value: String | js.Array[String]): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setJwtid(value: String): Self = this.set("jwtid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwtid: Self = this.set("jwtid", js.undefined)
    
    @scala.inline
    def setMaxAge(value: String): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
