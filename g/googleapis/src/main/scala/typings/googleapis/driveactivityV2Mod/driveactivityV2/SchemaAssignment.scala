package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAssignment extends StObject {
  
  /**
    * The user to whom the comment was assigned.
    */
  var assignedUser: js.UndefOr[SchemaUser] = js.undefined
  
  /**
    * The sub-type of this event.
    */
  var subtype: js.UndefOr[String | Null] = js.undefined
}
object SchemaAssignment {
  
  inline def apply(): SchemaAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignment]
  }
  
  extension [Self <: SchemaAssignment](x: Self) {
    
    inline def setAssignedUser(value: SchemaUser): Self = StObject.set(x, "assignedUser", value.asInstanceOf[js.Any])
    
    inline def setAssignedUserUndefined: Self = StObject.set(x, "assignedUser", js.undefined)
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeNull: Self = StObject.set(x, "subtype", null)
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
  }
}
