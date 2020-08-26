package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMachineTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of machine types contained in this scope.
    */
  var machineTypes: js.UndefOr[js.Array[SchemaMachineType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the machine
    * types list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaMachineTypesScopedList {
  @scala.inline
  def apply(): SchemaMachineTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMachineTypesScopedList]
  }
  @scala.inline
  implicit class SchemaMachineTypesScopedListOps[Self <: SchemaMachineTypesScopedList] (val x: Self) extends AnyVal {
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
    def setMachineTypesVarargs(value: SchemaMachineType*): Self = this.set("machineTypes", js.Array(value :_*))
    @scala.inline
    def setMachineTypes(value: js.Array[SchemaMachineType]): Self = this.set("machineTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMachineTypes: Self = this.set("machineTypes", js.undefined)
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

