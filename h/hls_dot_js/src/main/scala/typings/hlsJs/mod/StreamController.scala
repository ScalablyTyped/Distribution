package typings.hlsJs.mod

import typings.hlsJs.mod.Events.MEDIA_ATTACHED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamController
  extends StObject
     with BaseStreamController {
  
  /* private */ var _bufferInitSegment: Any = js.native
  
  /* private */ var _forceStartLoad: Any = js.native
  
  /* private */ var _getAudioCodec: Any = js.native
  
  /* private */ var _handleTransmuxComplete: Any = js.native
  
  /* private */ var _loadBitrateTestFrag: Any = js.native
  
  /* private */ var _registerListeners: Any = js.native
  
  /* protected */ def _unregisterListeners(): Unit = js.native
  
  /* private */ var abortCurrentFrag: Any = js.native
  
  /* private */ var altAudio: Any = js.native
  
  /* private */ var audioCodecSwap: Any = js.native
  
  /* private */ var audioCodecSwitch: Any = js.native
  
  /* private */ var audioOnly: Any = js.native
  
  /* private */ var backtrack: Any = js.native
  
  /* private */ var backtrackFragment: Any = js.native
  
  /* private */ var checkBuffer: Any = js.native
  
  /* private */ var checkFragmentChanged: Any = js.native
  
  /* private */ var couldBacktrack: Any = js.native
  
  def currentFrag: Fragment | Null = js.native
  
  def currentLevel: Double = js.native
  
  def currentProgramDateTime: js.Date | Null = js.native
  
  /* InferMemberOverrides */
  override def destroy(): Unit = js.native
  
  /* private */ var doTickIdle: Any = js.native
  
  /* private */ var followingBufferedFrag: Any = js.native
  
  def forceStartLoad: Boolean = js.native
  
  /* private */ var fragLastKbps: Any = js.native
  
  /* private */ var fragPlaying: Any = js.native
  
  /* private */ var gapController: Any = js.native
  
  /* private */ var getAppendedFrag: Any = js.native
  
  /* private */ var getBufferedFrag: Any = js.native
  
  /* private */ var getMainFwdBufferInfo: Any = js.native
  
  def immediateLevelSwitch(): Unit = js.native
  
  /* private */ var level: Any = js.native
  
  def nextBufferedFrag: Fragment | Null = js.native
  
  def nextLevel: Double = js.native
  
  /**
    * try to switch ASAP without breaking video playback:
    * in order to ensure smooth but quick level switching,
    * we need to find the next flushable buffer range
    * we should take into account new segment fetch time
    */
  def nextLevelSwitch(): Unit = js.native
  
  /* private */ var onAudioTrackSwitched: Any = js.native
  
  /* private */ var onAudioTrackSwitching: Any = js.native
  
  /* private */ var onBufferCreated: Any = js.native
  
  /* private */ var onBufferFlushed: Any = js.native
  
  /* private */ var onError: Any = js.native
  
  /* private */ var onFragBuffered: Any = js.native
  
  /* private */ var onFragLoadEmergencyAborted: Any = js.native
  
  /* private */ var onLevelLoaded: Any = js.native
  
  /* private */ var onLevelLoading: Any = js.native
  
  /* private */ var onLevelsUpdated: Any = js.native
  
  /* private */ var onManifestLoading: Any = js.native
  
  /* private */ var onManifestParsed: Any = js.native
  
  /* protected */ def onMediaAttached(event: MEDIA_ATTACHED, data: MediaAttachedData): Unit = js.native
  
  /* private */ var onMediaPlaying: Any = js.native
  
  /* private */ var onMediaSeeked: Any = js.native
  
  /* private */ var onvplaying: Any = js.native
  
  /* private */ var onvseeked: Any = js.native
  
  def swapAudioCodec(): Unit = js.native
  
  /* private */ var videoBuffer: Any = js.native
}
