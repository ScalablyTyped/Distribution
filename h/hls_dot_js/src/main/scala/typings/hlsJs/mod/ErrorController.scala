package typings.hlsJs.mod

import typings.hlsJs.mod.Events.ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "ErrorController")
@js.native
open class ErrorController protected ()
  extends StObject
     with NetworkComponentAPI {
  def this(hls: Hls) = this()
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* private */ var error: Any = js.native
  
  /* private */ var getFragRetryOrSwitchAction: Any = js.native
  
  /* private */ var getLevelSwitchAction: Any = js.native
  
  /* private */ var getPlaylistRetryOrSwitchAction: Any = js.native
  
  /* private */ var getVariantLevelIndex: Any = js.native
  
  /* private */ val hls: Any = js.native
  
  /* private */ var log: Any = js.native
  
  /* private */ var onError: Any = js.native
  
  def onErrorOut(event: ERROR, data: ErrorData): Unit = js.native
  
  /* private */ var onLevelUpdated: Any = js.native
  
  /* private */ var onManifestLoading: Any = js.native
  
  /* private */ var penalizeRendition: Any = js.native
  
  /* private */ var penalizedRenditions: Any = js.native
  
  /* private */ var playlistError: Any = js.native
  
  /* private */ var redundantFailover: Any = js.native
  
  /* private */ var registerListeners: Any = js.native
  
  /* private */ var sendAlternateToPenaltyBox: Any = js.native
  
  /* CompleteClass */
  override def startLoad(startPosition: Double): Unit = js.native
  
  /* CompleteClass */
  override def stopLoad(): Unit = js.native
  
  /* private */ var switchLevel: Any = js.native
  
  /* private */ var unregisterListeners: Any = js.native
  
  /* private */ var warn: Any = js.native
}
