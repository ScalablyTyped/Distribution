package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CancelOperationRequest cancels a single operation.
  */
trait SchemaCancelOperationRequest extends StObject {
  
  /**
    * The name (project, location, operation id) of the operation to cancel.
    * Specified in the format &#39;projects/x/locations/x/operations/ *&#39;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The server-assigned `name` of the operation. This field has
    * been deprecated and replaced by the name field.
    */
  var operationId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The Google Developers Console [project ID or project
    * number](https://support.google.com/cloud/answer/6158840). This field has
    * been deprecated and replaced by the name field.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the operation resides.
    * This field has been deprecated and replaced by the name field.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaCancelOperationRequest {
  
  @scala.inline
  def apply(): SchemaCancelOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCancelOperationRequest]
  }
  
  @scala.inline
  implicit class SchemaCancelOperationRequestMutableBuilder[Self <: SchemaCancelOperationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
