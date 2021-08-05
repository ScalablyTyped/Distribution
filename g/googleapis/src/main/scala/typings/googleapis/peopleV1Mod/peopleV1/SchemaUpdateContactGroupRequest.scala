package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to update an existing user contact group. All updated fields will
  * be replaced.
  */
trait SchemaUpdateContactGroupRequest extends StObject {
  
  /**
    * The contact group to update.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.undefined
}
object SchemaUpdateContactGroupRequest {
  
  inline def apply(): SchemaUpdateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateContactGroupRequest]
  }
  
  extension [Self <: SchemaUpdateContactGroupRequest](x: Self) {
    
    inline def setContactGroup(value: SchemaContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
  }
}
