package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDisksScopedList extends js.Object {
  
  /**
    * [Output Only] A list of disks contained in this scope.
    */
  var disks: js.UndefOr[js.Array[SchemaDisk]] = js.native
  
  /**
    * [Output Only] Informational warning which replaces the list of disks when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaDisksScopedList {
  
  @scala.inline
  def apply(): SchemaDisksScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisksScopedList]
  }
  
  @scala.inline
  implicit class SchemaDisksScopedListOps[Self <: SchemaDisksScopedList] (val x: Self) extends AnyVal {
    
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
    def setDisksVarargs(value: SchemaDisk*): Self = this.set("disks", js.Array(value :_*))
    
    @scala.inline
    def setDisks(value: js.Array[SchemaDisk]): Self = this.set("disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisks: Self = this.set("disks", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
