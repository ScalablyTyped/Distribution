package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note kind that represents a logical attestation &quot;role&quot; or
  * &quot;authority&quot;.  For example, an organization might have one
  * `AttestationAuthority` for &quot;QA&quot; and one for &quot;build&quot;.
  * This Note is intended to act strictly as a grouping mechanism for the
  * attached Occurrences (Attestations).  This grouping mechanism also provides
  * a security boundary, since IAM ACLs gate the ability for a principle to
  * attach an Occurrence to a given Note.  It also provides a single point of
  * lookup to find all attached Attestation Occurrences, even if they don&#39;t
  * all live in the same project.
  */
@js.native
trait SchemaAttestationAuthority extends js.Object {
  var hint: js.UndefOr[SchemaAttestationAuthorityHint] = js.native
}

object SchemaAttestationAuthority {
  @scala.inline
  def apply(): SchemaAttestationAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestationAuthority]
  }
  @scala.inline
  implicit class SchemaAttestationAuthorityOps[Self <: SchemaAttestationAuthority] (val x: Self) extends AnyVal {
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
    def setHint(value: SchemaAttestationAuthorityHint): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
  }
  
}

