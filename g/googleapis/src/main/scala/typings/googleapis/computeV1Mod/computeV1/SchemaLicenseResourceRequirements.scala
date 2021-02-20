package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLicenseResourceRequirements extends StObject {
  
  /**
    * Minimum number of guest cpus required to use the Instance. Enforced at
    * Instance creation and Instance start.
    */
  var minGuestCpuCount: js.UndefOr[Double] = js.native
  
  /**
    * Minimum memory required to use the Instance. Enforced at Instance
    * creation and Instance start.
    */
  var minMemoryMb: js.UndefOr[Double] = js.native
}
object SchemaLicenseResourceRequirements {
  
  @scala.inline
  def apply(): SchemaLicenseResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseResourceRequirements]
  }
  
  @scala.inline
  implicit class SchemaLicenseResourceRequirementsMutableBuilder[Self <: SchemaLicenseResourceRequirements] (val x: Self) extends AnyVal {
    
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
