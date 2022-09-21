package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSendDebugCaptureRequest extends StObject {
  
  /**
    * The internal component id for which debug information is sent.
    */
  var componentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The encoded debug information.
    */
  var data: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Format for the data field above (id=5).
    */
  var dataFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The worker id, i.e., VM hostname.
    */
  var workerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSendDebugCaptureRequest {
  
  inline def apply(): SchemaSendDebugCaptureRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendDebugCaptureRequest]
  }
  
  extension [Self <: SchemaSendDebugCaptureRequest](x: Self) {
    
    inline def setComponentId(value: String): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setComponentIdNull: Self = StObject.set(x, "componentId", null)
    
    inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataFormat(value: String): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatNull: Self = StObject.set(x, "dataFormat", null)
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setWorkerId(value: String): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdNull: Self = StObject.set(x, "workerId", null)
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "workerId", js.undefined)
  }
}
