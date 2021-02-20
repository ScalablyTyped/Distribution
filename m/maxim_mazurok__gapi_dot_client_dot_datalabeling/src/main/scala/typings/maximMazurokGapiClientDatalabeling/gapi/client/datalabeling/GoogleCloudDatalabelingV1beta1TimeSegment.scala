package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1TimeSegment extends StObject {
  
  /** End of the time segment (exclusive), represented as the duration since the example start. */
  var endTimeOffset: js.UndefOr[String] = js.native
  
  /** Start of the time segment (inclusive), represented as the duration since the example start. */
  var startTimeOffset: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1TimeSegment {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1TimeSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1TimeSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1TimeSegmentMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1TimeSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTimeOffset(value: String): Self = StObject.set(x, "endTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeOffsetUndefined: Self = StObject.set(x, "endTimeOffset", js.undefined)
    
    @scala.inline
    def setStartTimeOffset(value: String): Self = StObject.set(x, "startTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeOffsetUndefined: Self = StObject.set(x, "startTimeOffset", js.undefined)
  }
}
