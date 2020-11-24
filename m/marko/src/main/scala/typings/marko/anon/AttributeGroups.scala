package typings.marko.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeGroups extends js.Object {
  
  var attributeGroups: js.Any = js.native
}
object AttributeGroups {
  
  @scala.inline
  def apply(attributeGroups: js.Any): AttributeGroups = {
    val __obj = js.Dynamic.literal(attributeGroups = attributeGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeGroups]
  }
  
  @scala.inline
  implicit class AttributeGroupsOps[Self <: AttributeGroups] (val x: Self) extends AnyVal {
    
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
    def setAttributeGroups(value: js.Any): Self = this.set("attributeGroups", value.asInstanceOf[js.Any])
  }
}
