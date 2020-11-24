package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotGridMessagesFieldMenuOperators extends js.Object {
  
  var contains: js.UndefOr[String] = js.native
  
  var doesnotcontain: js.UndefOr[String] = js.native
  
  var endswith: js.UndefOr[String] = js.native
  
  @JSName("eq")
  var eq_FPivotGridMessagesFieldMenuOperators: js.UndefOr[String] = js.native
  
  var neq: js.UndefOr[String] = js.native
  
  var startswith: js.UndefOr[String] = js.native
}
object PivotGridMessagesFieldMenuOperators {
  
  @scala.inline
  def apply(): PivotGridMessagesFieldMenuOperators = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridMessagesFieldMenuOperators]
  }
  
  @scala.inline
  implicit class PivotGridMessagesFieldMenuOperatorsOps[Self <: PivotGridMessagesFieldMenuOperators] (val x: Self) extends AnyVal {
    
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
    def setContains(value: String): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setDoesnotcontain(value: String): Self = this.set("doesnotcontain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoesnotcontain: Self = this.set("doesnotcontain", js.undefined)
    
    @scala.inline
    def setEndswith(value: String): Self = this.set("endswith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndswith: Self = this.set("endswith", js.undefined)
    
    @scala.inline
    def setEq(value: String): Self = this.set("eq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEq: Self = this.set("eq", js.undefined)
    
    @scala.inline
    def setNeq(value: String): Self = this.set("neq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeq: Self = this.set("neq", js.undefined)
    
    @scala.inline
    def setStartswith(value: String): Self = this.set("startswith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartswith: Self = this.set("startswith", js.undefined)
  }
}
