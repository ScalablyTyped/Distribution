package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecStep extends StObject {
  
  /**
    * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
    */
  var linuxExecStepConfig: js.UndefOr[SchemaExecStepConfig] = js.undefined
  
  /**
    * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
    */
  var windowsExecStepConfig: js.UndefOr[SchemaExecStepConfig] = js.undefined
}
object SchemaExecStep {
  
  inline def apply(): SchemaExecStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecStep]
  }
  
  extension [Self <: SchemaExecStep](x: Self) {
    
    inline def setLinuxExecStepConfig(value: SchemaExecStepConfig): Self = StObject.set(x, "linuxExecStepConfig", value.asInstanceOf[js.Any])
    
    inline def setLinuxExecStepConfigUndefined: Self = StObject.set(x, "linuxExecStepConfig", js.undefined)
    
    inline def setWindowsExecStepConfig(value: SchemaExecStepConfig): Self = StObject.set(x, "windowsExecStepConfig", value.asInstanceOf[js.Any])
    
    inline def setWindowsExecStepConfigUndefined: Self = StObject.set(x, "windowsExecStepConfig", js.undefined)
  }
}
