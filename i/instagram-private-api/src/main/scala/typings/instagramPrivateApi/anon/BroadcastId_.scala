package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastId_ extends js.Object {
  
  var broadcastId: String = js.native
  
  var commentsRequested: js.UndefOr[Double] = js.native
  
  var lastCommentTs: js.UndefOr[String | Double] = js.native
}
object BroadcastId_ {
  
  @scala.inline
  def apply(broadcastId: String): BroadcastId_ = {
    val __obj = js.Dynamic.literal(broadcastId = broadcastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastId_]
  }
  
  @scala.inline
  implicit class BroadcastId_Ops[Self <: BroadcastId_] (val x: Self) extends AnyVal {
    
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
    def setBroadcastId(value: String): Self = this.set("broadcastId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsRequested(value: Double): Self = this.set("commentsRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsRequested: Self = this.set("commentsRequested", js.undefined)
    
    @scala.inline
    def setLastCommentTs(value: String | Double): Self = this.set("lastCommentTs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastCommentTs: Self = this.set("lastCommentTs", js.undefined)
  }
}
