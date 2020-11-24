package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Directory Site Contact Assignment
  */
@js.native
trait SchemaDirectorySiteContactAssignment extends js.Object {
  
  /**
    * ID of this directory site contact. This is a read-only, auto-generated
    * field.
    */
  var contactId: js.UndefOr[String] = js.native
  
  /**
    * Visibility of this directory site contact assignment. When set to PUBLIC
    * this contact assignment is visible to all account and agency users; when
    * set to PRIVATE it is visible only to the site.
    */
  var visibility: js.UndefOr[String] = js.native
}
object SchemaDirectorySiteContactAssignment {
  
  @scala.inline
  def apply(): SchemaDirectorySiteContactAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySiteContactAssignment]
  }
  
  @scala.inline
  implicit class SchemaDirectorySiteContactAssignmentOps[Self <: SchemaDirectorySiteContactAssignment] (val x: Self) extends AnyVal {
    
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
    def setContactId(value: String): Self = this.set("contactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactId: Self = this.set("contactId", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
