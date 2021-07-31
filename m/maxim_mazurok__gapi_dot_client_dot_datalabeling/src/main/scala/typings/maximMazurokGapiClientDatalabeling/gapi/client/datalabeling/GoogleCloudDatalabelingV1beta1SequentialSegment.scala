package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1SequentialSegment extends StObject {
  
  /** End position (exclusive). */
  var end: js.UndefOr[Double] = js.undefined
  
  /** Start position (inclusive). */
  var start: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatalabelingV1beta1SequentialSegment {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1SequentialSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1SequentialSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1SequentialSegmentMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1SequentialSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
