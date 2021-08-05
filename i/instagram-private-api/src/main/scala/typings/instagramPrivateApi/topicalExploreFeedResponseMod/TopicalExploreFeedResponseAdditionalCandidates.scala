package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseAdditionalCandidates extends StObject {
  
  var first_frame: TopicalExploreFeedResponseFirstFrame
  
  var igtv_first_frame: TopicalExploreFeedResponseIgtvFirstFrame
}
object TopicalExploreFeedResponseAdditionalCandidates {
  
  inline def apply(
    first_frame: TopicalExploreFeedResponseFirstFrame,
    igtv_first_frame: TopicalExploreFeedResponseIgtvFirstFrame
  ): TopicalExploreFeedResponseAdditionalCandidates = {
    val __obj = js.Dynamic.literal(first_frame = first_frame.asInstanceOf[js.Any], igtv_first_frame = igtv_first_frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseAdditionalCandidates]
  }
  
  extension [Self <: TopicalExploreFeedResponseAdditionalCandidates](x: Self) {
    
    inline def setFirst_frame(value: TopicalExploreFeedResponseFirstFrame): Self = StObject.set(x, "first_frame", value.asInstanceOf[js.Any])
    
    inline def setIgtv_first_frame(value: TopicalExploreFeedResponseIgtvFirstFrame): Self = StObject.set(x, "igtv_first_frame", value.asInstanceOf[js.Any])
  }
}
