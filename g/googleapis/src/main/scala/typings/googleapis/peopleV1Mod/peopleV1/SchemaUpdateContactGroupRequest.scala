package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to update an existing user contact group. All updated fields will
  * be replaced.
  */
@js.native
trait SchemaUpdateContactGroupRequest extends js.Object {
  
  /**
    * The contact group to update.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.native
}
object SchemaUpdateContactGroupRequest {
  
  @scala.inline
  def apply(): SchemaUpdateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateContactGroupRequest]
  }
  
  @scala.inline
  implicit class SchemaUpdateContactGroupRequestOps[Self <: SchemaUpdateContactGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setContactGroup(value: SchemaContactGroup): Self = this.set("contactGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactGroup: Self = this.set("contactGroup", js.undefined)
  }
}
