package typings.ipp.mod

import typings.ipp.anon.Requestedattributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobAttributesRequest extends StObject {
  
  var `operation-attributes-tag`: Requestedattributes
}
object GetJobAttributesRequest {
  
  inline def apply(`operation-attributes-tag`: Requestedattributes): GetJobAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobAttributesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobAttributesRequest] (val x: Self) extends AnyVal {
    
    inline def `setOperation-attributes-tag`(value: Requestedattributes): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
