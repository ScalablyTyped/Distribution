package typings.instagramPrivateApi.timelineFeedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedsOptions extends js.Object {
  
  var latestStoryPk: js.UndefOr[String | Double] = js.native
  
  var pushDisabled: js.UndefOr[Boolean] = js.native
  
  var reason: js.UndefOr[TimelineFeedReason] = js.native
  
  var recoveredFromCrash: js.UndefOr[String] = js.native
}
object TimelineFeedsOptions {
  
  @scala.inline
  def apply(): TimelineFeedsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimelineFeedsOptions]
  }
  
  @scala.inline
  implicit class TimelineFeedsOptionsOps[Self <: TimelineFeedsOptions] (val x: Self) extends AnyVal {
    
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
    def setLatestStoryPk(value: String | Double): Self = this.set("latestStoryPk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestStoryPk: Self = this.set("latestStoryPk", js.undefined)
    
    @scala.inline
    def setPushDisabled(value: Boolean): Self = this.set("pushDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushDisabled: Self = this.set("pushDisabled", js.undefined)
    
    @scala.inline
    def setReason(value: TimelineFeedReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setRecoveredFromCrash(value: String): Self = this.set("recoveredFromCrash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecoveredFromCrash: Self = this.set("recoveredFromCrash", js.undefined)
  }
}
