package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An activity resource contains information about an action that a particular
  * channel, or user, has taken on YouTube.The actions reported in activity
  * feeds include rating a video, sharing a video, marking a video as a
  * favorite, commenting on a video, uploading a video, and so forth. Each
  * activity resource identifies the type of action, the channel associated
  * with the action, and the resource(s) associated with the action, such as
  * the video that was rated or uploaded.
  */
@js.native
trait SchemaActivity extends js.Object {
  /**
    * The contentDetails object contains information about the content
    * associated with the activity. For example, if the snippet.type value is
    * videoRated, then the contentDetails object&#39;s content identifies the
    * rated video.
    */
  var contentDetails: js.UndefOr[SchemaActivityContentDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube uses to uniquely identify the activity.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#activity&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the activity, including
    * the activity&#39;s type and group ID.
    */
  var snippet: js.UndefOr[SchemaActivitySnippet] = js.native
}

object SchemaActivity {
  @scala.inline
  def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  @scala.inline
  implicit class SchemaActivityOps[Self <: SchemaActivity] (val x: Self) extends AnyVal {
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
    def setContentDetails(value: SchemaActivityContentDetails): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentDetails: Self = this.set("contentDetails", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSnippet(value: SchemaActivitySnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
  }
  
}

