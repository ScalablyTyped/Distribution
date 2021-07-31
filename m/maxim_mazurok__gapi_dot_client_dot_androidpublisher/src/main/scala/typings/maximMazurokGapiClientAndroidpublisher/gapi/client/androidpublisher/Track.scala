package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Track extends StObject {
  
  /** In a read request, represents all active releases in the track. In an update request, represents desired changes. */
  var releases: js.UndefOr[js.Array[TrackRelease]] = js.undefined
  
  /** Identifier of the track. */
  var track: js.UndefOr[String] = js.undefined
}
object Track {
  
  @scala.inline
  def apply(): Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Track]
  }
  
  @scala.inline
  implicit class TrackMutableBuilder[Self <: Track] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReleases(value: js.Array[TrackRelease]): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleasesUndefined: Self = StObject.set(x, "releases", js.undefined)
    
    @scala.inline
    def setReleasesVarargs(value: TrackRelease*): Self = StObject.set(x, "releases", js.Array(value :_*))
    
    @scala.inline
    def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
