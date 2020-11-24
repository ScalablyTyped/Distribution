package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MachineTypesScopedList extends js.Object {
  
  /** [Output Only] A list of machine types contained in this scope. */
  var machineTypes: js.UndefOr[js.Array[MachineType]] = js.native
  
  /** [Output Only] An informational warning that appears when the machine types list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object MachineTypesScopedList {
  
  @scala.inline
  def apply(): MachineTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MachineTypesScopedList]
  }
  
  @scala.inline
  implicit class MachineTypesScopedListOps[Self <: MachineTypesScopedList] (val x: Self) extends AnyVal {
    
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
    def setMachineTypesVarargs(value: MachineType*): Self = this.set("machineTypes", js.Array(value :_*))
    
    @scala.inline
    def setMachineTypes(value: js.Array[MachineType]): Self = this.set("machineTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineTypes: Self = this.set("machineTypes", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
