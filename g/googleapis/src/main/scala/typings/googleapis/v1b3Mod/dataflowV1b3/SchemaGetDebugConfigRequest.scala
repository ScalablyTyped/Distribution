package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to get updated debug configuration for component.
  */
trait SchemaGetDebugConfigRequest extends StObject {
  
  /**
    * The internal component id for which debug configuration is requested.
    */
  var componentId: js.UndefOr[String] = js.undefined
  
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the job specified by job_id.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The worker id, i.e., VM hostname.
    */
  var workerId: js.UndefOr[String] = js.undefined
}
object SchemaGetDebugConfigRequest {
  
  @scala.inline
  def apply(): SchemaGetDebugConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetDebugConfigRequest]
  }
  
  @scala.inline
  implicit class SchemaGetDebugConfigRequestMutableBuilder[Self <: SchemaGetDebugConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
