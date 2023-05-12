package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "BasePlaylistController")
@js.native
open class BasePlaylistController protected ()
  extends StObject
     with NetworkComponentAPI {
  def this(hls: Hls, logPrefix: String) = this()
  
  /* protected */ var canLoad: Boolean = js.native
  
  /* protected */ def checkRetry(errorEvent: ErrorData): Boolean = js.native
  
  /* protected */ def clearTimer(): Unit = js.native
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* private */ var getDeliveryDirectives: Any = js.native
  
  /* protected */ var hls: Hls = js.native
  
  /* protected */ def loadPlaylist(): Unit = js.native
  /* protected */ def loadPlaylist(hlsUrlParameters: HlsUrlParameters): Unit = js.native
  
  /* protected */ def log(msg: Any): Unit = js.native
  
  /* protected */ def playlistLoaded(index: Double, data: AudioTrackLoadedData | TrackLoadedData): Unit = js.native
  /* protected */ def playlistLoaded(index: Double, data: AudioTrackLoadedData | TrackLoadedData, previousDetails: LevelDetails): Unit = js.native
  /* protected */ def playlistLoaded(index: Double, data: LevelLoadedData): Unit = js.native
  /* protected */ def playlistLoaded(index: Double, data: LevelLoadedData, previousDetails: LevelDetails): Unit = js.native
  
  /* protected */ var requestScheduled: Double = js.native
  
  /* protected */ def shouldLoadPlaylist(): Boolean = js.native
  /* protected */ def shouldLoadPlaylist(playlist: Level): Boolean = js.native
  /* protected */ def shouldLoadPlaylist(playlist: MediaPlaylist): Boolean = js.native
  
  /* protected */ def shouldReloadPlaylist(): Boolean = js.native
  /* protected */ def shouldReloadPlaylist(playlist: Level): Boolean = js.native
  /* protected */ def shouldReloadPlaylist(playlist: MediaPlaylist): Boolean = js.native
  
  def startLoad(): Unit = js.native
  /* CompleteClass */
  override def startLoad(startPosition: Double): Unit = js.native
  
  /* CompleteClass */
  override def stopLoad(): Unit = js.native
  
  /* protected */ def switchParams(playlistUri: String): js.UndefOr[HlsUrlParameters] = js.native
  /* protected */ def switchParams(playlistUri: String, previous: LevelDetails): js.UndefOr[HlsUrlParameters] = js.native
  
  /* protected */ var timer: Double = js.native
  
  /* protected */ def warn(msg: Any): Unit = js.native
}
