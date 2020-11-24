package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppTrackInfo extends js.Object {
  
  /** The track name associated with the trackId, set in the Play Console. The name is modifiable from Play Console. */
  var trackAlias: js.UndefOr[String] = js.native
  
  /** The unmodifiable unique track identifier, taken from the releaseTrackId in the URL of the Play Console page that displays the app’s track information. */
  var trackId: js.UndefOr[String] = js.native
}
object AppTrackInfo {
  
  @scala.inline
  def apply(): AppTrackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppTrackInfo]
  }
  
  @scala.inline
  implicit class AppTrackInfoOps[Self <: AppTrackInfo] (val x: Self) extends AnyVal {
    
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
