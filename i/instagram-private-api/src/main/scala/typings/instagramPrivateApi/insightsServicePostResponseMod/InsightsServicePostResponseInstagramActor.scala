package typings.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseInstagramActor extends js.Object {
  
  var id: String = js.native
  
  var instagram_actor_id: String = js.native
}
object InsightsServicePostResponseInstagramActor {
  
  @scala.inline
  def apply(id: String, instagram_actor_id: String): InsightsServicePostResponseInstagramActor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], instagram_actor_id = instagram_actor_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseInstagramActor]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseInstagramActorOps[Self <: InsightsServicePostResponseInstagramActor] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstagram_actor_id(value: String): Self = this.set("instagram_actor_id", value.asInstanceOf[js.Any])
  }
}
