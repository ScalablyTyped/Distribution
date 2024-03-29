package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLicenseResourceRequirements extends StObject {
  
  /**
    * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
    */
  var minGuestCpuCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
    */
  var minMemoryMb: js.UndefOr[Double | Null] = js.undefined
}
object SchemaLicenseResourceRequirements {
  
  inline def apply(): SchemaLicenseResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseResourceRequirements]
  }
  
  extension [Self <: SchemaLicenseResourceRequirements](x: Self) {
    
    inline def setMinGuestCpuCount(value: Double): Self = StObject.set(x, "minGuestCpuCount", value.asInstanceOf[js.Any])
    
    inline def setMinGuestCpuCountNull: Self = StObject.set(x, "minGuestCpuCount", null)
    
    inline def setMinGuestCpuCountUndefined: Self = StObject.set(x, "minGuestCpuCount", js.undefined)
    
    inline def setMinMemoryMb(value: Double): Self = StObject.set(x, "minMemoryMb", value.asInstanceOf[js.Any])
    
    inline def setMinMemoryMbNull: Self = StObject.set(x, "minMemoryMb", null)
    
    inline def setMinMemoryMbUndefined: Self = StObject.set(x, "minMemoryMb", js.undefined)
  }
}
