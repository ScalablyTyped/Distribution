package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGroupItemResource extends js.Object {
  /**
    * The channel, video, playlist, or asset ID that YouTube uses to uniquely
    * identify the item that is being added to the group.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies the type of resource being added to the group.  Valid values
    * for this property are:  * `youtube#channel`  * `youtube#playlist`  *
    * `youtube#video`  * `youtubePartner#asset`
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaGroupItemResource {
  @scala.inline
  def apply(): SchemaGroupItemResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupItemResource]
  }
  @scala.inline
  implicit class SchemaGroupItemResourceOps[Self <: SchemaGroupItemResource] (val x: Self) extends AnyVal {
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
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

