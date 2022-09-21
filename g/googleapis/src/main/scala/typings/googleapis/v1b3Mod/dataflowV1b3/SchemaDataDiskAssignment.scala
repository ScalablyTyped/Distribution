package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataDiskAssignment extends StObject {
  
  /**
    * Mounted data disks. The order is important a data disk's 0-based index in this list defines which persistent directory the disk is mounted to, for example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" \}, { "myproject-1014-104817-4c2-harness-0-disk-1" \}.
    */
  var dataDisks: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * VM instance name the data disks mounted to, for example "myproject-1014-104817-4c2-harness-0".
    */
  var vmInstance: js.UndefOr[String | Null] = js.undefined
}
object SchemaDataDiskAssignment {
  
  inline def apply(): SchemaDataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataDiskAssignment]
  }
  
  extension [Self <: SchemaDataDiskAssignment](x: Self) {
    
    inline def setDataDisks(value: js.Array[String]): Self = StObject.set(x, "dataDisks", value.asInstanceOf[js.Any])
    
    inline def setDataDisksNull: Self = StObject.set(x, "dataDisks", null)
    
    inline def setDataDisksUndefined: Self = StObject.set(x, "dataDisks", js.undefined)
    
    inline def setDataDisksVarargs(value: String*): Self = StObject.set(x, "dataDisks", js.Array(value*))
    
    inline def setVmInstance(value: String): Self = StObject.set(x, "vmInstance", value.asInstanceOf[js.Any])
    
    inline def setVmInstanceNull: Self = StObject.set(x, "vmInstance", null)
    
    inline def setVmInstanceUndefined: Self = StObject.set(x, "vmInstance", js.undefined)
  }
}
