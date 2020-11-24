package typings.materialUiCore.hiddenJsMod

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HiddenJsProps extends js.Object {
  
  var initialWidth: js.UndefOr[Breakpoint] = js.native
  
  var lgDown: js.UndefOr[Boolean] = js.native
  
  var lgUp: js.UndefOr[Boolean] = js.native
  
  var mdDown: js.UndefOr[Boolean] = js.native
  
  var mdUp: js.UndefOr[Boolean] = js.native
  
  var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.native
  
  var smDown: js.UndefOr[Boolean] = js.native
  
  var smUp: js.UndefOr[Boolean] = js.native
  
  var xlDown: js.UndefOr[Boolean] = js.native
  
  var xlUp: js.UndefOr[Boolean] = js.native
  
  var xsDown: js.UndefOr[Boolean] = js.native
  
  var xsUp: js.UndefOr[Boolean] = js.native
}
object HiddenJsProps {
  
  @scala.inline
  def apply(): HiddenJsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenJsProps]
  }
  
  @scala.inline
  implicit class HiddenJsPropsOps[Self <: HiddenJsProps] (val x: Self) extends AnyVal {
    
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
    def setInitialWidth(value: Breakpoint): Self = this.set("initialWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialWidth: Self = this.set("initialWidth", js.undefined)
    
    @scala.inline
    def setLgDown(value: Boolean): Self = this.set("lgDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLgDown: Self = this.set("lgDown", js.undefined)
    
    @scala.inline
    def setLgUp(value: Boolean): Self = this.set("lgUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLgUp: Self = this.set("lgUp", js.undefined)
    
    @scala.inline
    def setMdDown(value: Boolean): Self = this.set("mdDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMdDown: Self = this.set("mdDown", js.undefined)
    
    @scala.inline
    def setMdUp(value: Boolean): Self = this.set("mdUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMdUp: Self = this.set("mdUp", js.undefined)
    
    @scala.inline
    def setOnlyVarargs(value: Breakpoint*): Self = this.set("only", js.Array(value :_*))
    
    @scala.inline
    def setOnly(value: Breakpoint | js.Array[Breakpoint]): Self = this.set("only", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
    
    @scala.inline
    def setSmDown(value: Boolean): Self = this.set("smDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmDown: Self = this.set("smDown", js.undefined)
    
    @scala.inline
    def setSmUp(value: Boolean): Self = this.set("smUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmUp: Self = this.set("smUp", js.undefined)
    
    @scala.inline
    def setXlDown(value: Boolean): Self = this.set("xlDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlDown: Self = this.set("xlDown", js.undefined)
    
    @scala.inline
    def setXlUp(value: Boolean): Self = this.set("xlUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXlUp: Self = this.set("xlUp", js.undefined)
    
    @scala.inline
    def setXsDown(value: Boolean): Self = this.set("xsDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXsDown: Self = this.set("xsDown", js.undefined)
    
    @scala.inline
    def setXsUp(value: Boolean): Self = this.set("xsUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXsUp: Self = this.set("xsUp", js.undefined)
  }
}
