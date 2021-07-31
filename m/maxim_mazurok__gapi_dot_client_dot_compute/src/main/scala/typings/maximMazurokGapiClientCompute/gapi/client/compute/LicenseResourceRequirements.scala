package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseResourceRequirements extends StObject {
  
  /** Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start. */
  var minGuestCpuCount: js.UndefOr[Double] = js.undefined
  
  /** Minimum memory required to use the Instance. Enforced at Instance creation and Instance start. */
  var minMemoryMb: js.UndefOr[Double] = js.undefined
}
object LicenseResourceRequirements {
  
  @scala.inline
  def apply(): LicenseResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseResourceRequirements]
  }
  
  @scala.inline
  implicit class LicenseResourceRequirementsMutableBuilder[Self <: LicenseResourceRequirements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinGuestCpuCount(value: Double): Self = StObject.set(x, "minGuestCpuCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinGuestCpuCountUndefined: Self = StObject.set(x, "minGuestCpuCount", js.undefined)
    
    @scala.inline
    def setMinMemoryMb(value: Double): Self = StObject.set(x, "minMemoryMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinMemoryMbUndefined: Self = StObject.set(x, "minMemoryMb", js.undefined)
  }
}
