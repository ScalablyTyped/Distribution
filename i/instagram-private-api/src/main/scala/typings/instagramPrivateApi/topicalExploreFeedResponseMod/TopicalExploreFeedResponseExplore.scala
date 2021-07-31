package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicalExploreFeedResponseExplore extends StObject {
  
  var actor_id: js.UndefOr[Double] = js.undefined
  
  var explanation: String
  
  var source_token: js.UndefOr[String] = js.undefined
}
object TopicalExploreFeedResponseExplore {
  
  @scala.inline
  def apply(explanation: String): TopicalExploreFeedResponseExplore = {
    val __obj = js.Dynamic.literal(explanation = explanation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseExplore]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseExploreMutableBuilder[Self <: TopicalExploreFeedResponseExplore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActor_id(value: Double): Self = StObject.set(x, "actor_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActor_idUndefined: Self = StObject.set(x, "actor_id", js.undefined)
    
    @scala.inline
    def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_token(value: String): Self = StObject.set(x, "source_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_tokenUndefined: Self = StObject.set(x, "source_token", js.undefined)
  }
}
