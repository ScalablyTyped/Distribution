package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data disk assignment for a given VM instance.
  */
@js.native
trait SchemaDataDiskAssignment extends js.Object {
  
  /**
    * Mounted data disks. The order is important a data disk&#39;s 0-based
    * index in this list defines which persistent directory the disk is mounted
    * to, for example the list of {
    * &quot;myproject-1014-104817-4c2-harness-0-disk-0&quot; }, {
    * &quot;myproject-1014-104817-4c2-harness-0-disk-1&quot; }.
    */
  var dataDisks: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * VM instance name the data disks mounted to, for example
    * &quot;myproject-1014-104817-4c2-harness-0&quot;.
    */
  var vmInstance: js.UndefOr[String] = js.native
}
object SchemaDataDiskAssignment {
  
  @scala.inline
  def apply(): SchemaDataDiskAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataDiskAssignment]
  }
  
  @scala.inline
  implicit class SchemaDataDiskAssignmentOps[Self <: SchemaDataDiskAssignment] (val x: Self) extends AnyVal {
    
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
    def setDataDisksVarargs(value: String*): Self = this.set("dataDisks", js.Array(value :_*))
    
    @scala.inline
    def setDataDisks(value: js.Array[String]): Self = this.set("dataDisks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataDisks: Self = this.set("dataDisks", js.undefined)
    
    @scala.inline
    def setVmInstance(value: String): Self = this.set("vmInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmInstance: Self = this.set("vmInstance", js.undefined)
  }
}
