package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for the status part of a channel.
  */
@js.native
trait SchemaChannelStatus extends js.Object {
  
  /**
    * If true, then the user is linked to either a YouTube username or G+
    * account. Otherwise, the user doesn&#39;t have a public YouTube identity.
    */
  var isLinked: js.UndefOr[Boolean] = js.native
  
  /**
    * The long uploads status of this channel. See
    */
  var longUploadsStatus: js.UndefOr[String] = js.native
  
  /**
    * Privacy status of the channel.
    */
  var privacyStatus: js.UndefOr[String] = js.native
}
object SchemaChannelStatus {
  
  @scala.inline
  def apply(): SchemaChannelStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelStatus]
  }
  
  @scala.inline
  implicit class SchemaChannelStatusOps[Self <: SchemaChannelStatus] (val x: Self) extends AnyVal {
    
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
    def setIsLinked(value: Boolean): Self = this.set("isLinked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsLinked: Self = this.set("isLinked", js.undefined)
    
    @scala.inline
    def setLongUploadsStatus(value: String): Self = this.set("longUploadsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongUploadsStatus: Self = this.set("longUploadsStatus", js.undefined)
    
    @scala.inline
    def setPrivacyStatus(value: String): Self = this.set("privacyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivacyStatus: Self = this.set("privacyStatus", js.undefined)
  }
}
