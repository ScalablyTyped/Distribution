package typings.hlsJs.mod

import typings.hlsJs.anon.Frag
import typings.hlsJs.hlsJsInts.`0`
import typings.hlsJs.mod.Events.KEY_LOADED
import typings.hlsJs.mod.Events.LEVEL_SWITCHING
import typings.hlsJs.mod.Events.MEDIA_ATTACHED
import typings.std.EventListener
import typings.std.HTMLMediaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseStreamController
  extends StObject
     with TaskLoop
     with NetworkComponentAPI {
  
  /* protected */ def _doFragLoad(frag: Fragment): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(frag: Fragment, details: Unit, targetBufferTime: Double): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(
    frag: Fragment,
    details: Unit,
    targetBufferTime: Double,
    progressCallback: FragmentLoadProgressCallback
  ): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(
    frag: Fragment,
    details: Unit,
    targetBufferTime: Null,
    progressCallback: FragmentLoadProgressCallback
  ): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(
    frag: Fragment,
    details: Unit,
    targetBufferTime: Unit,
    progressCallback: FragmentLoadProgressCallback
  ): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(frag: Fragment, details: LevelDetails): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(frag: Fragment, details: LevelDetails, targetBufferTime: Double): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(
    frag: Fragment,
    details: LevelDetails,
    targetBufferTime: Double,
    progressCallback: FragmentLoadProgressCallback
  ): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(
    frag: Fragment,
    details: LevelDetails,
    targetBufferTime: Null,
    progressCallback: FragmentLoadProgressCallback
  ): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(
    frag: Fragment,
    details: LevelDetails,
    targetBufferTime: Unit,
    progressCallback: FragmentLoadProgressCallback
  ): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  
  /* protected */ def _handleFragmentLoadComplete(fragLoadedEndData: PartsLoadedData): Unit = js.native
  
  /* protected */ def _handleFragmentLoadProgress(frag: FragLoadedData): Unit = js.native
  
  /* protected */ def _handleTransmuxerFlush(chunkMeta: ChunkMetadata): Unit = js.native
  
  /* private */ var _loadFragForPlayback: Any = js.native
  
  /* protected */ def _loadInitSegment(frag: Fragment): Unit = js.native
  
  /* protected */ var _state: String = js.native
  
  /* protected */ def _streamEnded(bufferInfo: Any, levelDetails: LevelDetails): Boolean = js.native
  
  /* protected */ def afterBufferFlushed(media: Bufferable, bufferType: SourceBufferName, playlistType: PlaylistLevelType): Unit = js.native
  
  /* protected */ def alignPlaylists(details: LevelDetails): Double = js.native
  /* protected */ def alignPlaylists(details: LevelDetails, previousDetails: LevelDetails): Double = js.native
  
  /* protected */ var bitrateTest: Boolean = js.native
  
  /* protected */ def bufferFragmentData(data: RemuxedTrack, frag: Fragment, part: Null, chunkMeta: ChunkMetadata): Unit = js.native
  /* protected */ def bufferFragmentData(data: RemuxedTrack, frag: Fragment, part: Part, chunkMeta: ChunkMetadata): Unit = js.native
  
  /* protected */ var config: HlsConfig = js.native
  
  /* protected */ var decrypter: Decrypter = js.native
  
  /* InferMemberOverrides */
  override def destroy(): Unit = js.native
  
  /* private */ var doFragPartsLoad: Any = js.native
  
  /* protected */ def flushBufferGap(frag: Fragment): Unit = js.native
  
  /* protected */ def flushMainBuffer(startOffset: Double, endOffset: Double): Unit = js.native
  /* protected */ def flushMainBuffer(startOffset: Double, endOffset: Double, `type`: SourceBufferName): Unit = js.native
  
  /* protected */ def fragBufferedComplete(frag: Fragment): Unit = js.native
  /* protected */ def fragBufferedComplete(frag: Fragment, part: Part): Unit = js.native
  
  /* protected */ def fragContextChanged(): Boolean = js.native
  /* protected */ def fragContextChanged(frag: Fragment): Boolean = js.native
  
  /* protected */ var fragCurrent: Fragment | Null = js.native
  
  /* protected */ var fragLoadError: Double = js.native
  
  /* protected */ var fragPrevious: Fragment | Null = js.native
  
  /* protected */ var fragmentLoader: FragmentLoader = js.native
  
  /* protected */ var fragmentTracker: FragmentTracker = js.native
  
  /* protected */ def getCurrentContext(chunkMeta: ChunkMetadata): Frag | Null = js.native
  
  /* protected */ def getFragmentAtPosition(bufferEnd: Double, end: Double, levelDetails: LevelDetails): Fragment | Null = js.native
  
  /* protected */ def getFwdBufferInfo(bufferable: Null, `type`: PlaylistLevelType): BufferInfo | Null = js.native
  /* protected */ def getFwdBufferInfo(bufferable: Bufferable, `type`: PlaylistLevelType): BufferInfo | Null = js.native
  
  /* protected */ def getInitialLiveFragment(levelDetails: LevelDetails, fragments: js.Array[Fragment]): Fragment | Null = js.native
  
  /* protected */ def getLoadPosition(): Double = js.native
  
  /* protected */ def getMaxBufferLength(): Double = js.native
  /* protected */ def getMaxBufferLength(levelBitrate: Double): Double = js.native
  
  /* protected */ def getNextFragment(pos: Double, levelDetails: LevelDetails): Fragment | Null = js.native
  
  def getNextPart(partList: js.Array[Part], frag: Fragment, targetBufferTime: Double): Double = js.native
  
  /* private */ var handleFragLoadAborted: Any = js.native
  
  /* private */ var handleFragLoadError: Any = js.native
  
  /* protected */ var hls: Hls = js.native
  
  /* protected */ var initPTS: js.Array[Double] = js.native
  
  /* protected */ var lastCurrentTime: Double = js.native
  
  /* protected */ var levelLastLoaded: Double | Null = js.native
  
  /* protected */ var levels: js.Array[Level] | Null = js.native
  
  /* protected */ def loadFragment(frag: Fragment, levelDetails: LevelDetails, targetBufferTime: Double): Unit = js.native
  
  /* protected */ def loadKey(frag: Fragment, details: LevelDetails): Unit = js.native
  
  /* private */ var loadedEndOfParts: Any = js.native
  
  /* protected */ var loadedmetadata: Boolean = js.native
  
  /* protected */ def log(msg: Any): Unit = js.native
  
  /* private */ val logPrefix: Any = js.native
  
  def mapToInitFragWhenRequired(): Any = js.native
  def mapToInitFragWhenRequired(frag: Fragment): Any = js.native
  
  /* protected */ var media: HTMLMediaElement | Null = js.native
  
  /* protected */ var mediaBuffer: Bufferable | Null = js.native
  
  /* protected */ var nextLoadPosition: Double = js.native
  
  /* protected */ def onFragmentOrKeyLoadError(filterType: PlaylistLevelType, data: ErrorData): Unit = js.native
  
  def onKeyLoaded(event: KEY_LOADED, data: KeyLoadedData): Unit = js.native
  
  /* protected */ def onLevelSwitching(event: LEVEL_SWITCHING, data: LevelSwitchingData): Unit = js.native
  
  /* protected */ def onMediaAttached(event: MEDIA_ATTACHED, data: MediaAttachingData): Unit = js.native
  
  /* protected */ def onMediaDetaching(): Unit = js.native
  
  /* protected */ def onMediaEnded(): Unit = js.native
  
  /* protected */ def onMediaSeeking(): Unit = js.native
  
  /* protected */ def onTickEnd(): Unit = js.native
  
  /* protected */ var onvended: EventListener | Null = js.native
  
  /* protected */ var onvseeking: EventListener | Null = js.native
  
  /* protected */ def reduceMaxBufferLength(): Boolean = js.native
  /* protected */ def reduceMaxBufferLength(threshold: Double): Boolean = js.native
  
  /* protected */ def resetFragmentLoading(frag: Fragment): Unit = js.native
  
  /* protected */ def resetLoadingState(): Unit = js.native
  
  /* protected */ def resetStartWhenNotLoaded(level: Double): Unit = js.native
  
  /* protected */ def resetTransmuxer(): Unit = js.native
  
  /* protected */ var retryDate: Double = js.native
  
  /* protected */ def seekToStartPos(): Unit = js.native
  
  /* protected */ def setStartPosition(details: LevelDetails, sliding: Double): Unit = js.native
  
  /* protected */ var startFragRequested: Boolean = js.native
  
  /* protected */ var startPosition: Double = js.native
  
  def state: String = js.native
  def state_=(nextState: String): Unit = js.native
  
  /* protected */ def synchronizeToLiveEdge(levelDetails: LevelDetails): Unit = js.native
  
  /* protected */ var transmuxer: TransmuxerInterface | Null = js.native
  
  /* private */ var updateLevelTiming: Any = js.native
  
  /* protected */ def waitForCdnTuneIn(details: LevelDetails): Boolean | `0` = js.native
  
  /* protected */ def warn(msg: Any): Unit = js.native
}
