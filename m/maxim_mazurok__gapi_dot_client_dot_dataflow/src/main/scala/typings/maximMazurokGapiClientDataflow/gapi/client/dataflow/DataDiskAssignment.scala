package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataDiskAssignment extends StObject {
  
  /**
    * Mounted data disks. The order is important a data disk's 0-based index in this list defines which persistent directory the disk is mounted to, for example the list of {
    * "myproject-1014-104817-4c2-harness-0-disk-0" }, { "myproject-1014-104817-4c2-harness-0-disk-1" }.
    */
  var dataDisks: js.UndefOr[js.Array[String]] = js.native
  
  /** VM instance name the data disks mounted to, for example "myproject-1014-104817-4c2-harness-0". */
  var vmInstance: js.UndefOr[String] = js.native
}
object DataDiskAssignment {
  
  @scala.inline
  def apply(): DataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataDiskAssignment]
  }
  
  @scala.inline
  implicit class DataDiskAssignmentMutableBuilder[Self <: DataDiskAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataDisks(value: js.Array[String]): Self = StObject.set(x, "dataDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDisksUndefined: Self = StObject.set(x, "dataDisks", js.undefined)
    
    @scala.inline
    def setDataDisksVarargs(value: String*): Self = StObject.set(x, "dataDisks", js.Array(value :_*))
    
    @scala.inline
    def setVmInstance(value: String): Self = StObject.set(x, "vmInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmInstanceUndefined: Self = StObject.set(x, "vmInstance", js.undefined)
  }
}
