package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ListNotificationChannels response.
  */
@js.native
trait SchemaListNotificationChannelsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more results that match the
    * request. Use the value in the page_token field in a subsequent request to
    * fetch the next set of results. If empty, all results have been returned.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The notification channels defined for the specified project.
    */
  var notificationChannels: js.UndefOr[js.Array[SchemaNotificationChannel]] = js.native
}

object SchemaListNotificationChannelsResponse {
  @scala.inline
  def apply(): SchemaListNotificationChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNotificationChannelsResponse]
  }
  @scala.inline
  implicit class SchemaListNotificationChannelsResponseOps[Self <: SchemaListNotificationChannelsResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setNotificationChannelsVarargs(value: SchemaNotificationChannel*): Self = this.set("notificationChannels", js.Array(value :_*))
    @scala.inline
    def setNotificationChannels(value: js.Array[SchemaNotificationChannel]): Self = this.set("notificationChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationChannels: Self = this.set("notificationChannels", js.undefined)
  }
  
}

