package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesList
  extends StObject
     with StandardParameters {
  
  /**
    * Include services consumed by the specified consumer. The Google Service Management implementation accepts the following forms: - project:
    */
  var consumerId: js.UndefOr[String] = js.undefined
  
  /**
    * The max number of items to include in the response list. Page size is 50 if not specified. Maximum value is 500.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token identifying which result to start with; returned by a previous list call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Include services produced by the specified project.
    */
  var producerProjectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesList {
  
  inline def apply(): ParamsResourceServicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesList]
  }
  
  extension [Self <: ParamsResourceServicesList](x: Self) {
    
    inline def setConsumerId(value: String): Self = StObject.set(x, "consumerId", value.asInstanceOf[js.Any])
    
    inline def setConsumerIdUndefined: Self = StObject.set(x, "consumerId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProducerProjectId(value: String): Self = StObject.set(x, "producerProjectId", value.asInstanceOf[js.Any])
    
    inline def setProducerProjectIdUndefined: Self = StObject.set(x, "producerProjectId", js.undefined)
  }
}
