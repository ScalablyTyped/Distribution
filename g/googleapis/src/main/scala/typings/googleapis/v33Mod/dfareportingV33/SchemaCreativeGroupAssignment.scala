package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Group Assignment.
  */
@js.native
trait SchemaCreativeGroupAssignment extends StObject {
  
  /**
    * ID of the creative group to be assigned.
    */
  var creativeGroupId: js.UndefOr[String] = js.native
  
  /**
    * Creative group number of the creative group assignment.
    */
  var creativeGroupNumber: js.UndefOr[String] = js.native
}
object SchemaCreativeGroupAssignment {
  
  @scala.inline
  def apply(): SchemaCreativeGroupAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeGroupAssignment]
  }
  
  @scala.inline
  implicit class SchemaCreativeGroupAssignmentMutableBuilder[Self <: SchemaCreativeGroupAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeGroupId(value: String): Self = StObject.set(x, "creativeGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeGroupIdUndefined: Self = StObject.set(x, "creativeGroupId", js.undefined)
    
    @scala.inline
    def setCreativeGroupNumber(value: String): Self = StObject.set(x, "creativeGroupNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeGroupNumberUndefined: Self = StObject.set(x, "creativeGroupNumber", js.undefined)
  }
}
