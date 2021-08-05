package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvBrowseFeedResponseAdditionalCandidates extends StObject {
  
  var igtv_first_frame: IgtvBrowseFeedResponseIgtvFirstFrame
}
object IgtvBrowseFeedResponseAdditionalCandidates {
  
  inline def apply(igtv_first_frame: IgtvBrowseFeedResponseIgtvFirstFrame): IgtvBrowseFeedResponseAdditionalCandidates = {
    val __obj = js.Dynamic.literal(igtv_first_frame = igtv_first_frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseAdditionalCandidates]
  }
  
  extension [Self <: IgtvBrowseFeedResponseAdditionalCandidates](x: Self) {
    
    inline def setIgtv_first_frame(value: IgtvBrowseFeedResponseIgtvFirstFrame): Self = StObject.set(x, "igtv_first_frame", value.asInstanceOf[js.Any])
  }
}
