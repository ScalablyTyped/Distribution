package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Field Assignment.
  */
trait SchemaCreativeFieldAssignment extends StObject {
  
  /**
    * ID of the creative field.
    */
  var creativeFieldId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the creative field value.
    */
  var creativeFieldValueId: js.UndefOr[String] = js.undefined
}
object SchemaCreativeFieldAssignment {
  
  @scala.inline
  def apply(): SchemaCreativeFieldAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeFieldAssignment]
  }
  
  @scala.inline
  implicit class SchemaCreativeFieldAssignmentMutableBuilder[Self <: SchemaCreativeFieldAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeFieldId(value: String): Self = StObject.set(x, "creativeFieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFieldIdUndefined: Self = StObject.set(x, "creativeFieldId", js.undefined)
    
    @scala.inline
    def setCreativeFieldValueId(value: String): Self = StObject.set(x, "creativeFieldValueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeFieldValueIdUndefined: Self = StObject.set(x, "creativeFieldValueId", js.undefined)
  }
}
