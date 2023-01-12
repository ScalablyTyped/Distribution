package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1TimeSegment extends StObject {
  
  /** End of the time segment (exclusive), represented as the duration since the example start. */
  var endTimeOffset: js.UndefOr[String] = js.undefined
  
  /** Start of the time segment (inclusive), represented as the duration since the example start. */
  var startTimeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1TimeSegment {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1TimeSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1TimeSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1TimeSegment] (val x: Self) extends AnyVal {
    
    inline def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    inline def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    inline def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
