package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateSshScriptRequest extends StObject {
  
  /**
    * Required. Bastion VM Instance name to use or to create.
    */
  var vm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The VM creation configuration
    */
  var vmCreationConfig: js.UndefOr[SchemaVmCreationConfig] = js.undefined
  
  /**
    * The port that will be open on the bastion host
    */
  var vmPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The VM selection configuration
    */
  var vmSelectionConfig: js.UndefOr[SchemaVmSelectionConfig] = js.undefined
}
object SchemaGenerateSshScriptRequest {
  
  inline def apply(): SchemaGenerateSshScriptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateSshScriptRequest]
  }
  
  extension [Self <: SchemaGenerateSshScriptRequest](x: Self) {
    
    inline def setVm(value: String): Self = StObject.set(x, "vm", value.asInstanceOf[js.Any])
    
    inline def setVmCreationConfig(value: SchemaVmCreationConfig): Self = StObject.set(x, "vmCreationConfig", value.asInstanceOf[js.Any])
    
    inline def setVmCreationConfigUndefined: Self = StObject.set(x, "vmCreationConfig", js.undefined)
    
    inline def setVmNull: Self = StObject.set(x, "vm", null)
    
    inline def setVmPort(value: Double): Self = StObject.set(x, "vmPort", value.asInstanceOf[js.Any])
    
    inline def setVmPortNull: Self = StObject.set(x, "vmPort", null)
    
    inline def setVmPortUndefined: Self = StObject.set(x, "vmPort", js.undefined)
    
    inline def setVmSelectionConfig(value: SchemaVmSelectionConfig): Self = StObject.set(x, "vmSelectionConfig", value.asInstanceOf[js.Any])
    
    inline def setVmSelectionConfigUndefined: Self = StObject.set(x, "vmSelectionConfig", js.undefined)
    
    inline def setVmUndefined: Self = StObject.set(x, "vm", js.undefined)
  }
}
