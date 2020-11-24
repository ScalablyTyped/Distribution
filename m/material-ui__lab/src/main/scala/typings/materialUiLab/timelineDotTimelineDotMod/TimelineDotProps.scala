package typings.materialUiLab.timelineDotTimelineDotMod

import typings.materialUiLab.anon.PartialClassNameMapTimeliDefaultDefault
import typings.materialUiLab.materialUiLabStrings.grey
import typings.materialUiLab.materialUiLabStrings.inherit
import typings.materialUiLab.materialUiLabStrings.outlined
import typings.materialUiLab.materialUiLabStrings.primary
import typings.materialUiLab.materialUiLabStrings.secondary
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/TimelineDot/TimelineDot.TimelineDotClassKey, never> */
@js.native
trait TimelineDotProps extends js.Object {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var classes: js.UndefOr[PartialClassNameMapTimeliDefaultDefault] = js.native
  
  /**
    * The dot can have a different colors.
    */
  var color: js.UndefOr[inherit | primary | secondary | grey] = js.native
  
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  /**
    * The dot can appear filled or outlined.
    */
  var variant: js.UndefOr[typings.materialUiLab.materialUiLabStrings.default | outlined] = js.native
}
object TimelineDotProps {
  
  @scala.inline
  def apply(): TimelineDotProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineDotProps]
  }
  
  @scala.inline
  implicit class TimelineDotPropsOps[Self <: TimelineDotProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClasses(value: PartialClassNameMapTimeliDefaultDefault): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setColor(value: inherit | primary | secondary | grey): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[_] | RefObject[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setVariant(value: typings.materialUiLab.materialUiLabStrings.default | outlined): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
