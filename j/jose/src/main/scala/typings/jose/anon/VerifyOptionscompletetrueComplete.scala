package typings.jose.anon

import typings.jose.joseBooleans.`true`
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jose.jose.JWT.VerifyOptions & {  complete :true} & jose.jose.JWT.AccessTokenVerifyOptions */
@js.native
trait VerifyOptionscompletetrueComplete extends js.Object {
  
  var algorithms: js.UndefOr[js.Array[String]] = js.native
  
  var audience: (js.UndefOr[String | js.Array[String]]) with (String | js.Array[String]) = js.native
  
  var clockTolerance: js.UndefOr[String] = js.native
  
  var complete: js.UndefOr[Boolean] with `true` = js.native
  
  var crit: js.UndefOr[js.Array[String]] = js.native
  
  var ignoreExp: js.UndefOr[Boolean] = js.native
  
  var ignoreIat: js.UndefOr[Boolean] = js.native
  
  var ignoreNbf: js.UndefOr[Boolean] = js.native
  
  var issuer: (js.UndefOr[String | js.Array[String]]) with (String | js.Array[String]) = js.native
  
  var jti: js.UndefOr[String] = js.native
  
  var maxAuthAge: js.UndefOr[String] = js.native
  
  var maxTokenAge: js.UndefOr[String] = js.native
  
  var now: js.UndefOr[Date] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var typ: js.UndefOr[String] = js.native
}
object VerifyOptionscompletetrueComplete {
  
  @scala.inline
  def apply(
    audience: (js.UndefOr[String | js.Array[String]]) with (String | js.Array[String]),
    complete: js.UndefOr[Boolean] with `true`,
    issuer: (js.UndefOr[String | js.Array[String]]) with (String | js.Array[String])
  ): VerifyOptionscompletetrueComplete = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptionscompletetrueComplete]
  }
  
  @scala.inline
  implicit class VerifyOptionscompletetrueCompleteOps[Self <: VerifyOptionscompletetrueComplete] (val x: Self) extends AnyVal {
    
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
    def setAudience(value: (js.UndefOr[String | js.Array[String]]) with (String | js.Array[String])): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: js.UndefOr[Boolean] with `true`): Self = this.set("complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: (js.UndefOr[String | js.Array[String]]) with (String | js.Array[String])): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmsVarargs(value: String*): Self = this.set("algorithms", js.Array(value :_*))
    
    @scala.inline
    def setAlgorithms(value: js.Array[String]): Self = this.set("algorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithms: Self = this.set("algorithms", js.undefined)
    
    @scala.inline
    def setClockTolerance(value: String): Self = this.set("clockTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClockTolerance: Self = this.set("clockTolerance", js.undefined)
    
    @scala.inline
    def setCritVarargs(value: String*): Self = this.set("crit", js.Array(value :_*))
    
    @scala.inline
    def setCrit(value: js.Array[String]): Self = this.set("crit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrit: Self = this.set("crit", js.undefined)
    
    @scala.inline
    def setIgnoreExp(value: Boolean): Self = this.set("ignoreExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreExp: Self = this.set("ignoreExp", js.undefined)
    
    @scala.inline
    def setIgnoreIat(value: Boolean): Self = this.set("ignoreIat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreIat: Self = this.set("ignoreIat", js.undefined)
    
    @scala.inline
    def setIgnoreNbf(value: Boolean): Self = this.set("ignoreNbf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreNbf: Self = this.set("ignoreNbf", js.undefined)
    
    @scala.inline
    def setJti(value: String): Self = this.set("jti", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJti: Self = this.set("jti", js.undefined)
    
    @scala.inline
    def setMaxAuthAge(value: String): Self = this.set("maxAuthAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAuthAge: Self = this.set("maxAuthAge", js.undefined)
    
    @scala.inline
    def setMaxTokenAge(value: String): Self = this.set("maxTokenAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTokenAge: Self = this.set("maxTokenAge", js.undefined)
    
    @scala.inline
    def setNow(value: Date): Self = this.set("now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNow: Self = this.set("now", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTyp(value: String): Self = this.set("typ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTyp: Self = this.set("typ", js.undefined)
  }
}
