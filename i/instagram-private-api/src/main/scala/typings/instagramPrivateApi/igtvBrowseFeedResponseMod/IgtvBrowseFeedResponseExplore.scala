package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvBrowseFeedResponseExplore extends StObject {
  
  var explanation: String = js.native
}
object IgtvBrowseFeedResponseExplore {
  
  @scala.inline
  def apply(explanation: String): IgtvBrowseFeedResponseExplore = {
    val __obj = js.Dynamic.literal(explanation = explanation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseExplore]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseExploreMutableBuilder[Self <: IgtvBrowseFeedResponseExplore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
  }
}
