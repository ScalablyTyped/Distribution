package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVmwareVmsDetails extends StObject {
  
  /**
    * The details of the vmware VMs.
    */
  var details: js.UndefOr[js.Array[SchemaVmwareVmDetails]] = js.undefined
}
object SchemaVmwareVmsDetails {
  
  inline def apply(): SchemaVmwareVmsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmwareVmsDetails]
  }
  
  extension [Self <: SchemaVmwareVmsDetails](x: Self) {
    
    inline def setDetails(value: js.Array[SchemaVmwareVmDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: SchemaVmwareVmDetails*): Self = StObject.set(x, "details", js.Array(value*))
  }
}
