package typings.materialUiStyles.withStylesWithStylesMod

import typings.react.mod.Ref
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyledComponentProps[ClassKey /* <: String */] extends js.Object {
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[Partial[ClassNameMap[ClassKey]]] = js.native
  
  var innerRef: js.UndefOr[Ref[_]] = js.native
}
object StyledComponentProps {
  
  @scala.inline
  def apply[ClassKey /* <: String */](): StyledComponentProps[ClassKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyledComponentProps[ClassKey]]
  }
  
  @scala.inline
  implicit class StyledComponentPropsOps[Self <: StyledComponentProps[_], ClassKey /* <: String */] (val x: Self with StyledComponentProps[ClassKey]) extends AnyVal {
    
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
    def setClasses(value: Partial[ClassNameMap[ClassKey]]): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInnerRef(value: Ref[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
  }
}
