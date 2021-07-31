package typings.instagramPrivateApi.igtvChannelFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvChannelFeedResponseAdditionalCandidates extends StObject {
  
  var igtv_first_frame: IgtvChannelFeedResponseIgtvFirstFrame
}
object IgtvChannelFeedResponseAdditionalCandidates {
  
  @scala.inline
  def apply(igtv_first_frame: IgtvChannelFeedResponseIgtvFirstFrame): IgtvChannelFeedResponseAdditionalCandidates = {
    val __obj = js.Dynamic.literal(igtv_first_frame = igtv_first_frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvChannelFeedResponseAdditionalCandidates]
  }
  
  @scala.inline
  implicit class IgtvChannelFeedResponseAdditionalCandidatesMutableBuilder[Self <: IgtvChannelFeedResponseAdditionalCandidates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgtv_first_frame(value: IgtvChannelFeedResponseIgtvFirstFrame): Self = StObject.set(x, "igtv_first_frame", value.asInstanceOf[js.Any])
  }
}
