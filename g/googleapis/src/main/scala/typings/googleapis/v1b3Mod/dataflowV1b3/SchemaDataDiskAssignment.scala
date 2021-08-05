package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data disk assignment for a given VM instance.
  */
trait SchemaDataDiskAssignment extends StObject {
  
  /**
    * Mounted data disks. The order is important a data disk&#39;s 0-based
    * index in this list defines which persistent directory the disk is mounted
    * to, for example the list of {
    * &quot;myproject-1014-104817-4c2-harness-0-disk-0&quot; }, {
    * &quot;myproject-1014-104817-4c2-harness-0-disk-1&quot; }.
    */
  var dataDisks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * VM instance name the data disks mounted to, for example
    * &quot;myproject-1014-104817-4c2-harness-0&quot;.
    */
  var vmInstance: js.UndefOr[String] = js.undefined
}
object SchemaDataDiskAssignment {
  
  inline def apply(): SchemaDataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataDiskAssignment]
  }
  
  extension [Self <: SchemaDataDiskAssignment](x: Self) {
    
    inline def setDataDisks(value: js.Array[String]): Self = StObject.set(x, "dataDisks", value.asInstanceOf[js.Any])
    
    inline def setDataDisksUndefined: Self = StObject.set(x, "dataDisks", js.undefined)
    
    inline def setDataDisksVarargs(value: String*): Self = StObject.set(x, "dataDisks", js.Array(value :_*))
    
    inline def setVmInstance(value: String): Self = StObject.set(x, "vmInstance", value.asInstanceOf[js.Any])
    
    inline def setVmInstanceUndefined: Self = StObject.set(x, "vmInstance", js.undefined)
  }
}
