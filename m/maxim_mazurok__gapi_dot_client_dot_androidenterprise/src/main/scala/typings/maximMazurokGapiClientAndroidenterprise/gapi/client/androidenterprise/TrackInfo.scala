package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackInfo extends js.Object {
  
  /** A modifiable name for a track. This is the visible name in the play developer console. */
  var trackAlias: js.UndefOr[String] = js.native
  
  /** Unmodifiable, unique track identifier. This identifier is the releaseTrackId in the url of the play developer console page that displays the track information. */
  var trackId: js.UndefOr[String] = js.native
}
object TrackInfo {
  
  @scala.inline
  def apply(): TrackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackInfo]
  }
  
  @scala.inline
  implicit class TrackInfoOps[Self <: TrackInfo] (val x: Self) extends AnyVal {
    
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
    def setTrackAlias(value: String): Self = this.set("trackAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackAlias: Self = this.set("trackAlias", js.undefined)
    
    @scala.inline
    def setTrackId(value: String): Self = this.set("trackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackId: Self = this.set("trackId", js.undefined)
  }
}
