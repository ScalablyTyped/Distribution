package typings.instagramPrivateApi.topicalExploreFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseExplore extends js.Object {
  
  var actor_id: js.UndefOr[Double] = js.native
  
  var explanation: String = js.native
  
  var source_token: js.UndefOr[String] = js.native
}
object TopicalExploreFeedResponseExplore {
  
  @scala.inline
  def apply(explanation: String): TopicalExploreFeedResponseExplore = {
    val __obj = js.Dynamic.literal(explanation = explanation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseExplore]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseExploreOps[Self <: TopicalExploreFeedResponseExplore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExplanation(value: String): Self = this.set("explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActor_id(value: Double): Self = this.set("actor_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActor_id: Self = this.set("actor_id", js.undefined)
    
    @scala.inline
    def setSource_token(value: String): Self = this.set("source_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource_token: Self = this.set("source_token", js.undefined)
  }
}
