package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLiveStreamSnippet extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the channel that is
    * transmitting the stream.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The stream&#39;s description. The value cannot be longer than 10000
    * characters.
    */
  var description: js.UndefOr[String] = js.native
  var isDefaultStream: js.UndefOr[Boolean] = js.native
  /**
    * The date and time that the stream was created. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * The stream&#39;s title. The value must be between 1 and 128 characters
    * long.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaLiveStreamSnippet {
  @scala.inline
  def apply(): SchemaLiveStreamSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveStreamSnippet]
  }
  @scala.inline
  implicit class SchemaLiveStreamSnippetOps[Self <: SchemaLiveStreamSnippet] (val x: Self) extends AnyVal {
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIsDefaultStream(value: Boolean): Self = this.set("isDefaultStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefaultStream: Self = this.set("isDefaultStream", js.undefined)
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

