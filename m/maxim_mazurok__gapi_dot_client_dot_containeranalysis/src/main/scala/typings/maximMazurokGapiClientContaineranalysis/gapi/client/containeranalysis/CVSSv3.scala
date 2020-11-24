package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CVSSv3 extends js.Object {
  
  var attackComplexity: js.UndefOr[String] = js.native
  
  /** Base Metrics Represents the intrinsic characteristics of a vulnerability that are constant over time and across user environments. */
  var attackVector: js.UndefOr[String] = js.native
  
  var availabilityImpact: js.UndefOr[String] = js.native
  
  /** The base score is a function of the base metric scores. */
  var baseScore: js.UndefOr[Double] = js.native
  
  var confidentialityImpact: js.UndefOr[String] = js.native
  
  var exploitabilityScore: js.UndefOr[Double] = js.native
  
  var impactScore: js.UndefOr[Double] = js.native
  
  var integrityImpact: js.UndefOr[String] = js.native
  
  var privilegesRequired: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var userInteraction: js.UndefOr[String] = js.native
}
object CVSSv3 {
  
  @scala.inline
  def apply(): CVSSv3 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CVSSv3]
  }
  
  @scala.inline
  implicit class CVSSv3Ops[Self <: CVSSv3] (val x: Self) extends AnyVal {
    
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
    def setAttackComplexity(value: String): Self = this.set("attackComplexity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttackComplexity: Self = this.set("attackComplexity", js.undefined)
    
    @scala.inline
    def setAttackVector(value: String): Self = this.set("attackVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttackVector: Self = this.set("attackVector", js.undefined)
    
    @scala.inline
    def setAvailabilityImpact(value: String): Self = this.set("availabilityImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityImpact: Self = this.set("availabilityImpact", js.undefined)
    
    @scala.inline
    def setBaseScore(value: Double): Self = this.set("baseScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseScore: Self = this.set("baseScore", js.undefined)
    
    @scala.inline
    def setConfidentialityImpact(value: String): Self = this.set("confidentialityImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidentialityImpact: Self = this.set("confidentialityImpact", js.undefined)
    
    @scala.inline
    def setExploitabilityScore(value: Double): Self = this.set("exploitabilityScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExploitabilityScore: Self = this.set("exploitabilityScore", js.undefined)
    
    @scala.inline
    def setImpactScore(value: Double): Self = this.set("impactScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpactScore: Self = this.set("impactScore", js.undefined)
    
    @scala.inline
    def setIntegrityImpact(value: String): Self = this.set("integrityImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegrityImpact: Self = this.set("integrityImpact", js.undefined)
    
    @scala.inline
    def setPrivilegesRequired(value: String): Self = this.set("privilegesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivilegesRequired: Self = this.set("privilegesRequired", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setUserInteraction(value: String): Self = this.set("userInteraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserInteraction: Self = this.set("userInteraction", js.undefined)
  }
}
