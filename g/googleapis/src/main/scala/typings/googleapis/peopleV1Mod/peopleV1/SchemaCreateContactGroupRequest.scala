package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to create a new contact group.
  */
trait SchemaCreateContactGroupRequest extends StObject {
  
  /**
    * The contact group to create.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.undefined
}
object SchemaCreateContactGroupRequest {
  
  inline def apply(): SchemaCreateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateContactGroupRequest]
  }
  
  extension [Self <: SchemaCreateContactGroupRequest](x: Self) {
    
    inline def setContactGroup(value: SchemaContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    inline def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
  }
}
