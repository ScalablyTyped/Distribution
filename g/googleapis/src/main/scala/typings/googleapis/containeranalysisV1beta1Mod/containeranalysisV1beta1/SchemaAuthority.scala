package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Note kind that represents a logical attestation &quot;role&quot; or
  * &quot;authority&quot;. For example, an organization might have one
  * `Authority` for &quot;QA&quot; and one for &quot;build&quot;. This note is
  * intended to act strictly as a grouping mechanism for the attached
  * occurrences (Attestations). This grouping mechanism also provides a
  * security boundary, since IAM ACLs gate the ability for a principle to
  * attach an occurrence to a given note. It also provides a single point of
  * lookup to find all attached attestation occurrences, even if they don&#39;t
  * all live in the same project.
  */
@js.native
trait SchemaAuthority extends js.Object {
  
  /**
    * Hint hints at the purpose of the attestation authority.
    */
  var hint: js.UndefOr[SchemaHint] = js.native
}
object SchemaAuthority {
  
  @scala.inline
  def apply(): SchemaAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthority]
  }
  
  @scala.inline
  implicit class SchemaAuthorityOps[Self <: SchemaAuthority] (val x: Self) extends AnyVal {
    
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
    def setHint(value: SchemaHint): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
  }
}
