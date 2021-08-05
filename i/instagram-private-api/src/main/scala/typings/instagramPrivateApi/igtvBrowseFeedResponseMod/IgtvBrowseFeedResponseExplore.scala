package typings.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgtvBrowseFeedResponseExplore extends StObject {
  
  var explanation: String
}
object IgtvBrowseFeedResponseExplore {
  
  inline def apply(explanation: String): IgtvBrowseFeedResponseExplore = {
    val __obj = js.Dynamic.literal(explanation = explanation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseExplore]
  }
  
  extension [Self <: IgtvBrowseFeedResponseExplore](x: Self) {
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
  }
}
