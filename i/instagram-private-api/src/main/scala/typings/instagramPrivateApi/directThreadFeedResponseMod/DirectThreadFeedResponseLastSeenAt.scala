package typings.instagramPrivateApi.directThreadFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectThreadFeedResponseLastSeenAt extends js.Object {
  
  var `300687565`: DirectThreadFeedResponse300687565 = js.native
}
object DirectThreadFeedResponseLastSeenAt {
  
  @scala.inline
  def apply(`300687565`: DirectThreadFeedResponse300687565): DirectThreadFeedResponseLastSeenAt = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("300687565")(`300687565`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectThreadFeedResponseLastSeenAt]
  }
  
  @scala.inline
  implicit class DirectThreadFeedResponseLastSeenAtOps[Self <: DirectThreadFeedResponseLastSeenAt] (val x: Self) extends AnyVal {
    
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
    def set300687565(value: DirectThreadFeedResponse300687565): Self = this.set("300687565", value.asInstanceOf[js.Any])
  }
}
