package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A request to update an existing user contact group. All updated fields will
  * be replaced.
  */
@js.native
trait SchemaUpdateContactGroupRequest extends StObject {
  
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
  implicit class SchemaUpdateContactGroupRequestMutableBuilder[Self <: SchemaUpdateContactGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactGroup(value: SchemaContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
  }
}
