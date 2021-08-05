package typings.ipp.mod

import typings.ipp.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobsRequest extends StObject {
  
  var `operation-attributes-tag`: Limit
}
object GetJobsRequest {
  
  inline def apply(`operation-attributes-tag`: Limit): GetJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobsRequest]
  }
  
  extension [Self <: GetJobsRequest](x: Self) {
    
    inline def `setOperation-attributes-tag`(value: Limit): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
