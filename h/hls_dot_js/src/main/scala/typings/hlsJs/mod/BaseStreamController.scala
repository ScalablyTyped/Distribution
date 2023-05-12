package typings.hlsJs.mod

import typings.hlsJs.anon.Frag
import typings.hlsJs.hlsJsInts.`0`
import typings.hlsJs.mod.Events.MANIFEST_LOADED
import typings.hlsJs.mod.Events.MEDIA_ATTACHED
import typings.std.EventListener
import typings.std.HTMLMediaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "BaseStreamController")
@js.native
open class BaseStreamController protected ()
  extends StObject
     with TaskLoop
     with NetworkComponentAPI {
  def this(
    hls: Hls,
    fragmentTracker: FragmentTracker,
    keyLoader: KeyLoader,
    logPrefix: String,
    playlistType: PlaylistLevelType
  ) = this()
  
  /* private */ /* CompleteClass */
  override val _boundTick: Any = js.native
  
  /* protected */ def _doFragLoad(frag: Fragment, level: Level): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(frag: Fragment, level: Level, targetBufferTime: Double): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(
    frag: Fragment,
    level: Level,
    targetBufferTime: Double,
    progressCallback: FragmentLoadProgressCallback
  ): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(
    frag: Fragment,
    level: Level,
    targetBufferTime: Null,
    progressCallback: FragmentLoadProgressCallback
  ): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  /* protected */ def _doFragLoad(
    frag: Fragment,
    level: Level,
    targetBufferTime: Unit,
    progressCallback: FragmentLoadProgressCallback
  ): js.Promise[PartsLoadedData | FragLoadedData | Null] = js.native
  
  /* protected */ def _handleFragmentLoadComplete(fragLoadedEndData: PartsLoadedData): Unit = js.native
  
  /* protected */ def _handleFragmentLoadProgress(frag: FragLoadedData): Unit = js.native
  /* protected */ def _handleFragmentLoadProgress(frag: PartsLoadedData): Unit = js.native
  
  /* protected */ def _handleTransmuxerFlush(chunkMeta: ChunkMetadata): Unit = js.native
  
  /* private */ var _loadFragForPlayback: Any = js.native
  
  /* protected */ def _loadInitSegment(frag: Fragment, level: Level): Unit = js.native
  
  /* protected */ var _state: String = js.native
  
  /* protected */ def _streamEnded(bufferInfo: BufferInfo, levelDetails: LevelDetails): Boolean = js.native
  
  /* private */ /* CompleteClass */
  var _tickCallCount: Any = js.native
  
  /* private */ /* CompleteClass */
  var _tickInterval: Any = js.native
  
  /* private */ /* CompleteClass */
  var _tickTimer: Any = js.native
  
  /* protected */ def afterBufferFlushed(media: Bufferable, bufferType: SourceBufferName, playlistType: PlaylistLevelType): Unit = js.native
  
  /* protected */ def alignPlaylists(details: LevelDetails): Double = js.native
  /* protected */ def alignPlaylists(details: LevelDetails, previousDetails: LevelDetails): Double = js.native
  
  /* protected */ var bitrateTest: Boolean = js.native
  
  /* protected */ def bufferFragmentData(data: RemuxedTrack, frag: Fragment, part: Null, chunkMeta: ChunkMetadata): Unit = js.native
  /* protected */ def bufferFragmentData(data: RemuxedTrack, frag: Fragment, part: Part, chunkMeta: ChunkMetadata): Unit = js.native
  
  /**
    * @returns True when interval was cleared, false when none was set (no effect)
    */
  /* CompleteClass */
  override def clearInterval(): Boolean = js.native
  
  /**
    * @returns True when timeout was cleared, false when none was set (no effect)
    */
  /* CompleteClass */
  override def clearNextTick(): Boolean = js.native
  
  /* protected */ def clearTrackerIfNeeded(frag: Fragment): Unit = js.native
  
  /* protected */ var config: HlsConfig = js.native
  
  /* protected */ var decrypter: Decrypter = js.native
  
  /* InferMemberOverrides */
  override def destroy(): Unit = js.native
  
  /* private */ var doFragPartsLoad: Any = js.native
  
  /**
    * For subclass to implement task logic
    * @abstract
    */
  /* protected */ /* CompleteClass */
  override def doTick(): Unit = js.native
  
  /* protected */ def flushBufferGap(frag: Fragment): Unit = js.native
  
  /* protected */ def flushMainBuffer(startOffset: Double, endOffset: Double): Unit = js.native
  /* protected */ def flushMainBuffer(startOffset: Double, endOffset: Double, `type`: SourceBufferName): Unit = js.native
  
  /* protected */ def fragBufferedComplete(frag: Fragment): Unit = js.native
  /* protected */ def fragBufferedComplete(frag: Fragment, part: Part): Unit = js.native
  
  /* protected */ def fragContextChanged(): Boolean = js.native
  /* protected */ def fragContextChanged(frag: Fragment): Boolean = js.native
  
  /* protected */ var fragCurrent: Fragment | Null = js.native
  
  /* protected */ var fragPrevious: Fragment | Null = js.native
  
  /* protected */ var fragmentLoader: FragmentLoader = js.native
  
  /* protected */ var fragmentTracker: FragmentTracker = js.native
  
  /* protected */ def getAppendedFrag(position: Double): Fragment | Null = js.native
  /* protected */ def getAppendedFrag(position: Double, playlistType: PlaylistLevelType): Fragment | Null = js.native
  
  /* protected */ def getCurrentContext(chunkMeta: ChunkMetadata): Frag | Null = js.native
  
  /* protected */ def getFragmentAtPosition(bufferEnd: Double, end: Double, levelDetails: LevelDetails): Fragment | Null = js.native
  
  /* protected */ def getFwdBufferInfo(bufferable: Null, `type`: PlaylistLevelType): BufferInfo | Null = js.native
  /* protected */ def getFwdBufferInfo(bufferable: Bufferable, `type`: PlaylistLevelType): BufferInfo | Null = js.native
  
  /* protected */ def getFwdBufferInfoAtPos(bufferable: Null, pos: Double, `type`: PlaylistLevelType): BufferInfo | Null = js.native
  /* protected */ def getFwdBufferInfoAtPos(bufferable: Bufferable, pos: Double, `type`: PlaylistLevelType): BufferInfo | Null = js.native
  
  /* protected */ def getInitialLiveFragment(levelDetails: LevelDetails, fragments: js.Array[Fragment]): Fragment | Null = js.native
  
  /* protected */ def getLevelDetails(): js.UndefOr[LevelDetails] = js.native
  
  /* protected */ def getLoadPosition(): Double = js.native
  
  /* protected */ def getMaxBufferLength(): Double = js.native
  /* protected */ def getMaxBufferLength(levelBitrate: Double): Double = js.native
  
  /* protected */ def getNextFragment(pos: Double, levelDetails: LevelDetails): Fragment | Null = js.native
  
  /* protected */ def getNextFragmentLoopLoading(
    frag: Fragment,
    levelDetails: LevelDetails,
    bufferInfo: BufferInfo,
    playlistType: PlaylistLevelType,
    maxBufLen: Double
  ): Fragment | Null = js.native
  
  def getNextPart(partList: js.Array[Part], frag: Fragment, targetBufferTime: Double): Double = js.native
  
  /* private */ var handleFragLoadAborted: Any = js.native
  
  /* private */ var handleFragLoadError: Any = js.native
  
  /* CompleteClass */
  override def hasInterval(): Boolean = js.native
  
  /* CompleteClass */
  override def hasNextTick(): Boolean = js.native
  
  /* protected */ var hls: Hls = js.native
  
  /* protected */ var initPTS: js.Array[RationalTimestamp] = js.native
  
  /* protected */ def isLoopLoading(frag: Fragment, targetBufferTime: Double): Boolean = js.native
  
  /* protected */ var keyLoader: KeyLoader = js.native
  
  /* protected */ var lastCurrentTime: Double = js.native
  
  /* protected */ var levelLastLoaded: Double | Null = js.native
  
  /* protected */ var levels: js.Array[Level] | Null = js.native
  
  /* protected */ def loadFragment(frag: Fragment, level: Level, targetBufferTime: Double): Unit = js.native
  
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
  
  /* protected */ /* CompleteClass */
  override def onHandlerDestroyed(): Unit = js.native
  
  /* protected */ /* CompleteClass */
  override def onHandlerDestroying(): Unit = js.native
  
  /* protected */ def onManifestLoaded(event: MANIFEST_LOADED, data: ManifestLoadedData): Unit = js.native
  
  /* protected */ def onMediaAttached(event: MEDIA_ATTACHED, data: MediaAttachedData): Unit = js.native
  
  /* protected */ def onMediaDetaching(): Unit = js.native
  
  /* protected */ def onMediaEnded(): Unit = js.native
  
  /* protected */ def onMediaSeeking(): Unit = js.native
  
  /* protected */ def onTickEnd(): Unit = js.native
  
  /* protected */ var onvended: EventListener | Null = js.native
  
  /* protected */ var onvseeking: EventListener | Null = js.native
  
  /* protected */ var playlistType: PlaylistLevelType = js.native
  
  /* protected */ def recoverWorkerError(data: ErrorData): Unit = js.native
  
  /* protected */ def reduceLengthAndFlushBuffer(data: ErrorData): Boolean = js.native
  
  /* protected */ def reduceMaxBufferLength(threshold: Double): Boolean = js.native
  
  /* protected */ def removeUnbufferedFrags(): Unit = js.native
  /* protected */ def removeUnbufferedFrags(start: Double): Unit = js.native
  
  /* protected */ def resetFragmentErrors(filterType: PlaylistLevelType): Unit = js.native
  
  /* protected */ def resetFragmentLoading(frag: Fragment): Unit = js.native
  
  /* protected */ def resetLoadingState(): Unit = js.native
  
  /* protected */ def resetStartWhenNotLoaded(level: Double): Unit = js.native
  
  /* protected */ def resetTransmuxer(): Unit = js.native
  
  /* protected */ def resetWhenMissingContext(chunkMeta: ChunkMetadata): Unit = js.native
  
  /* protected */ var retryDate: Double = js.native
  
  /* protected */ def seekToStartPos(): Unit = js.native
  
  /**
    * @param millis - Interval time (ms)
    * @eturns True when interval has been scheduled, false when already scheduled (no effect)
    */
  /* CompleteClass */
  override def setInterval(millis: Double): Boolean = js.native
  
  /* protected */ def setStartPosition(details: LevelDetails, sliding: Double): Unit = js.native
  
  /* protected */ var startFragRequested: Boolean = js.native
  
  /* CompleteClass */
  override def startLoad(startPosition: Double): Unit = js.native
  
  /* protected */ var startPosition: Double = js.native
  
  /* protected */ var startTimeOffset: Double | Null = js.native
  
  def state: String = js.native
  def state_=(nextState: String): Unit = js.native
  
  /* CompleteClass */
  override def stopLoad(): Unit = js.native
  
  /* protected */ def synchronizeToLiveEdge(levelDetails: LevelDetails): Unit = js.native
  
  /**
    * Will call the subclass doTick implementation in this main loop tick
    * or in the next one (via setTimeout(,0)) in case it has already been called
    * in this tick (in case this is a re-entrant call).
    */
  /* CompleteClass */
  override def tick(): Unit = js.native
  
  /* CompleteClass */
  override def tickImmediate(): Unit = js.native
  
  /* protected */ var transmuxer: TransmuxerInterface | Null = js.native
  
  /* private */ var updateLevelTiming: Any = js.native
  
  /* protected */ def waitForCdnTuneIn(details: LevelDetails): Boolean | `0` = js.native
  
  /* protected */ def warn(msg: Any): Unit = js.native
}
