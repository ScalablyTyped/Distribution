package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaAttestationAuthority extends StObject {
  
  var hint: js.UndefOr[SchemaAttestationAuthorityHint] = js.native
}
object SchemaAttestationAuthority {
  
  @scala.inline
  def apply(): SchemaAttestationAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestationAuthority]
  }
  
  @scala.inline
  implicit class SchemaAttestationAuthorityMutableBuilder[Self <: SchemaAttestationAuthority] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHint(value: SchemaAttestationAuthorityHint): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
  }
}
