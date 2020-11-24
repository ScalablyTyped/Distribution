package typings.materialUiCore.hiddenHiddenMod

import typings.materialUiCore.createBreakpointsMod.Breakpoint
import typings.materialUiCore.materialUiCoreStrings.css
import typings.materialUiCore.materialUiCoreStrings.js_
import typings.materialUiCore.withStylesMod.ClassNameMap
import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, never, never> */
@js.native
trait HiddenProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[Partial[ClassNameMap[scala.Nothing]]] = js.native
  
  var implementation: js.UndefOr[js_ | css] = js.native
  
  var initialWidth: js.UndefOr[Breakpoint] = js.native
  
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
  
  var lgDown: js.UndefOr[Boolean] = js.native
  
  var lgUp: js.UndefOr[Boolean] = js.native
  
  var mdDown: js.UndefOr[Boolean] = js.native
  
  var mdUp: js.UndefOr[Boolean] = js.native
  
  var only: js.UndefOr[Breakpoint | js.Array[Breakpoint]] = js.native
  
  var smDown: js.UndefOr[Boolean] = js.native
  
  var smUp: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var xlDown: js.UndefOr[Boolean] = js.native
  
  var xlUp: js.UndefOr[Boolean] = js.native
  
  var xsDown: js.UndefOr[Boolean] = js.native
  
  var xsUp: js.UndefOr[Boolean] = js.native
}
object HiddenProps {
  
  @scala.inline
  def apply(): HiddenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenProps]
  }
  
  @scala.inline
  implicit class HiddenPropsOps[Self <: HiddenProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClasses(value: Partial[ClassNameMap[scala.Nothing]]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setImplementation(value: js_ | css): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplementation: Self = this.set("implementation", js.undefined)
    
    @scala.inline
    def setInitialWidth(value: Breakpoint): Self = this.set("initialWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialWidth: Self = this.set("initialWidth", js.undefined)
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[_] | RefObject[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
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
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
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
