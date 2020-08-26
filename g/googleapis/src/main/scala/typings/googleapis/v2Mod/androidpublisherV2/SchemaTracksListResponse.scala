package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTracksListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidpublisher#tracksListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  var tracks: js.UndefOr[js.Array[SchemaTrack]] = js.native
}

object SchemaTracksListResponse {
  @scala.inline
  def apply(): SchemaTracksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTracksListResponse]
  }
  @scala.inline
  implicit class SchemaTracksListResponseOps[Self <: SchemaTracksListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setTracksVarargs(value: SchemaTrack*): Self = this.set("tracks", js.Array(value :_*))
    @scala.inline
    def setTracks(value: js.Array[SchemaTrack]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
  }
  
}

