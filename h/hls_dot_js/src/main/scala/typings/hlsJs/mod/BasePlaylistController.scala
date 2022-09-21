package typings.hlsJs.mod

import typings.hlsJs.mod.Events.ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePlaylistController
  extends StObject
     with NetworkComponentAPI {
  
  /* protected */ var canLoad: Boolean = js.native
  
  /* protected */ def clearTimer(): Unit = js.native
  
  /* private */ var getDeliveryDirectives: Any = js.native
  
  /* protected */ var hls: Hls = js.native
  
  /* protected */ def loadPlaylist(): Unit = js.native
  /* protected */ def loadPlaylist(hlsUrlParameters: HlsUrlParameters): Unit = js.native
  
  /* protected */ def log(msg: Any): Unit = js.native
  
  /* protected */ def onError(event: ERROR, data: ErrorData): Unit = js.native
  
  /* protected */ def playlistLoaded(index: Double, data: AudioTrackLoadedData | TrackLoadedData): Unit = js.native
  /* protected */ def playlistLoaded(index: Double, data: AudioTrackLoadedData | TrackLoadedData, previousDetails: LevelDetails): Unit = js.native
  /* protected */ def playlistLoaded(index: Double, data: LevelLoadedData): Unit = js.native
  /* protected */ def playlistLoaded(index: Double, data: LevelLoadedData, previousDetails: LevelDetails): Unit = js.native
  
  /* protected */ var retryCount: Double = js.native
  
  /* protected */ def retryLoadingOrFail(errorEvent: ErrorData): Boolean = js.native
  
  /* protected */ def shouldLoadTrack(track: MediaPlaylist): Boolean = js.native
  
  def startLoad(): Unit = js.native
  
  /* protected */ def switchParams(playlistUri: String): js.UndefOr[HlsUrlParameters] = js.native
  /* protected */ def switchParams(playlistUri: String, previous: LevelDetails): js.UndefOr[HlsUrlParameters] = js.native
  
  /* protected */ var timer: Double = js.native
  
  /* protected */ def warn(msg: Any): Unit = js.native
}
