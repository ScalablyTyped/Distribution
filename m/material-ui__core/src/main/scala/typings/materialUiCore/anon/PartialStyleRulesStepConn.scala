package typings.materialUiCore.anon

import typings.materialUiCore.withStylesMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.StyleRules<@material-ui/core.@material-ui/core/StepConnector.StepConnectorClasskey>> */
@js.native
trait PartialStyleRulesStepConn extends js.Object {
  
  var active: js.UndefOr[CSSProperties] = js.native
  
  var alternativeLabel: js.UndefOr[CSSProperties] = js.native
  
  var completed: js.UndefOr[CSSProperties] = js.native
  
  var disabled: js.UndefOr[CSSProperties] = js.native
  
  var horizontal: js.UndefOr[CSSProperties] = js.native
  
  var line: js.UndefOr[CSSProperties] = js.native
  
  var lineHorizontal: js.UndefOr[CSSProperties] = js.native
  
  var lineVertical: js.UndefOr[CSSProperties] = js.native
  
  var root: js.UndefOr[CSSProperties] = js.native
  
  var vertical: js.UndefOr[CSSProperties] = js.native
}
object PartialStyleRulesStepConn {
  
  @scala.inline
  def apply(): PartialStyleRulesStepConn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyleRulesStepConn]
  }
  
  @scala.inline
  implicit class PartialStyleRulesStepConnOps[Self <: PartialStyleRulesStepConn] (val x: Self) extends AnyVal {
    
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
    def setActive(value: CSSProperties): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAlternativeLabel(value: CSSProperties): Self = this.set("alternativeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternativeLabel: Self = this.set("alternativeLabel", js.undefined)
    
    @scala.inline
    def setCompleted(value: CSSProperties): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompleted: Self = this.set("completed", js.undefined)
    
    @scala.inline
    def setDisabled(value: CSSProperties): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHorizontal(value: CSSProperties): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setLine(value: CSSProperties): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setLineHorizontal(value: CSSProperties): Self = this.set("lineHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHorizontal: Self = this.set("lineHorizontal", js.undefined)
    
    @scala.inline
    def setLineVertical(value: CSSProperties): Self = this.set("lineVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineVertical: Self = this.set("lineVertical", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSProperties): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setVertical(value: CSSProperties): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
