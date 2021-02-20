package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Directory Site Contact Assignment
  */
@js.native
trait SchemaDirectorySiteContactAssignment extends StObject {
  
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
  implicit class SchemaDirectorySiteContactAssignmentMutableBuilder[Self <: SchemaDirectorySiteContactAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactIdUndefined: Self = StObject.set(x, "contactId", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
