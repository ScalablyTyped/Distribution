package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to search the resources in the specified FHIR store.
  */
trait SchemaSearchResourcesRequest extends StObject {
  
  /**
    * The type of the resource to search.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}
object SchemaSearchResourcesRequest {
  
  @scala.inline
  def apply(): SchemaSearchResourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchResourcesRequest]
  }
  
  @scala.inline
  implicit class SchemaSearchResourcesRequestMutableBuilder[Self <: SchemaSearchResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
