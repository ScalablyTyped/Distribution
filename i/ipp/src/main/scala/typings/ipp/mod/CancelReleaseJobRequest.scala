package typings.ipp.mod

import typings.ipp.anon.Attributescharset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelReleaseJobRequest extends StObject {
  
  var `operation-attributes-tag`: Attributescharset
}
object CancelReleaseJobRequest {
  
  inline def apply(`operation-attributes-tag`: Attributescharset): CancelReleaseJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReleaseJobRequest]
  }
  
  extension [Self <: CancelReleaseJobRequest](x: Self) {
    
    inline def `setOperation-attributes-tag`(value: Attributescharset): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
