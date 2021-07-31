package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for a specific contact group.
  */
trait SchemaContactGroupResponse extends StObject {
  
  /**
    * The contact group.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.undefined
  
  /**
    * The original requested resource name.
    */
  var requestedResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the response.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaContactGroupResponse {
  
  @scala.inline
  def apply(): SchemaContactGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactGroupResponse]
  }
  
  @scala.inline
  implicit class SchemaContactGroupResponseMutableBuilder[Self <: SchemaContactGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactGroup(value: SchemaContactGroup): Self = StObject.set(x, "contactGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactGroupUndefined: Self = StObject.set(x, "contactGroup", js.undefined)
    
    @scala.inline
    def setRequestedResourceName(value: String): Self = StObject.set(x, "requestedResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedResourceNameUndefined: Self = StObject.set(x, "requestedResourceName", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
