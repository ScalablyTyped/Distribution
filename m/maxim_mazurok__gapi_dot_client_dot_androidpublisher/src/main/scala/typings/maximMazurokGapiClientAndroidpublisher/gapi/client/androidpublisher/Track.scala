package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Track extends js.Object {
  
  /** In a read request, represents all active releases in the track. In an update request, represents desired changes. */
  var releases: js.UndefOr[js.Array[TrackRelease]] = js.native
  
  /** Identifier of the track. */
  var track: js.UndefOr[String] = js.native
}
object Track {
  
  @scala.inline
  def apply(): Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Track]
  }
  
  @scala.inline
  implicit class TrackOps[Self <: Track] (val x: Self) extends AnyVal {
    
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
    def setReleasesVarargs(value: TrackRelease*): Self = this.set("releases", js.Array(value :_*))
    
    @scala.inline
    def setReleases(value: js.Array[TrackRelease]): Self = this.set("releases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleases: Self = this.set("releases", js.undefined)
    
    @scala.inline
    def setTrack(value: String): Self = this.set("track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
  }
}
