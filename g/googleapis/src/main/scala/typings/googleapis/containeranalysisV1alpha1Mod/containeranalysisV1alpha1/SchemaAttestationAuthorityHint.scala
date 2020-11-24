package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This submessage provides human-readable hints about the purpose of the
  * AttestationAuthority.  Because the name of a Note acts as its resource
  * reference, it is important to disambiguate the canonical name of the Note
  * (which might be a UUID for security purposes) from &quot;readable&quot;
  * names more suitable for debug output.  Note that these hints should NOT be
  * used to look up AttestationAuthorities in security sensitive contexts, such
  * as when looking up Attestations to verify.
  */
@js.native
trait SchemaAttestationAuthorityHint extends js.Object {
  
  /**
    * The human readable name of this Attestation Authority, for example
    * &quot;qa&quot;.
    */
  var humanReadableName: js.UndefOr[String] = js.native
}
object SchemaAttestationAuthorityHint {
  
  @scala.inline
  def apply(): SchemaAttestationAuthorityHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestationAuthorityHint]
  }
  
  @scala.inline
  implicit class SchemaAttestationAuthorityHintOps[Self <: SchemaAttestationAuthorityHint] (val x: Self) extends AnyVal {
    
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
    def setHumanReadableName(value: String): Self = this.set("humanReadableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanReadableName: Self = this.set("humanReadableName", js.undefined)
  }
}
