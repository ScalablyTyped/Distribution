package typings.ipp.mod

import typings.ipp.anon.Jobid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobAttributesRequest extends StObject {
  
  var `operation-attributes-tag`: Jobid
}
object GetJobAttributesRequest {
  
  inline def apply(`operation-attributes-tag`: Jobid): GetJobAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobAttributesRequest]
  }
  
  extension [Self <: GetJobAttributesRequest](x: Self) {
    
    inline def `setOperation-attributes-tag`(value: Jobid): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
