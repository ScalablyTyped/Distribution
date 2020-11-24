package typings.libp2pGossipsub.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubOpts extends js.Object {
  
  /**
    * Whether to subscribe of unsubscribe
    * true for subscribe, false for unsubscribe
    */
  var subscribe: js.UndefOr[Boolean] = js.native
  
  /**
    * Topic ID
    */
  var topicID: js.UndefOr[String] = js.native
}
object SubOpts {
  
  @scala.inline
  def apply(): SubOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubOpts]
  }
  
  @scala.inline
  implicit class SubOptsOps[Self <: SubOpts] (val x: Self) extends AnyVal {
    
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
    def setSubscribe(value: Boolean): Self = this.set("subscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
    
    @scala.inline
    def setTopicID(value: String): Self = this.set("topicID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicID: Self = this.set("topicID", js.undefined)
  }
}
