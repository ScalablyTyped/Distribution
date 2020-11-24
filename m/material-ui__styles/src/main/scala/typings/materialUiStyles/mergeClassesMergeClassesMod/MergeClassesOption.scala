package typings.materialUiStyles.mergeClassesMergeClassesMod

import typings.react.mod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeClassesOption extends js.Object {
  
  var Component: ElementType[_] = js.native
  
  var baseClasses: Classes = js.native
  
  var newClasses: Classes = js.native
}
object MergeClassesOption {
  
  @scala.inline
  def apply(Component: ElementType[_], baseClasses: Classes, newClasses: Classes): MergeClassesOption = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], baseClasses = baseClasses.asInstanceOf[js.Any], newClasses = newClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeClassesOption]
  }
  
  @scala.inline
  implicit class MergeClassesOptionOps[Self <: MergeClassesOption] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: ElementType[_]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseClasses(value: Classes): Self = this.set("baseClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewClasses(value: Classes): Self = this.set("newClasses", value.asInstanceOf[js.Any])
  }
}
