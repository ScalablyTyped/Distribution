package typings.hlsJs.mod

import typings.hlsJs.hlsJsBooleans.`true`
import typings.std.TimeRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentTracker
  extends StObject
     with ComponentAPI {
  
  /* private */ var _registerListeners: Any = js.native
  
  /* private */ var _unregisterListeners: Any = js.native
  
  /* private */ var activePartLists: Any = js.native
  
  /* private */ var bufferPadding: Any = js.native
  
  /**
    * Partial fragments effected by coded frame eviction will be removed
    * The browser will unload parts of the buffer to free up memory for new buffer data
    * Fragments will need to be reloaded when the buffer is freed up, removing partial fragments will allow them to reload(since there might be parts that are still playable)
    */
  def detectEvictedFragments(elementaryStream: SourceBufferName, timeRange: TimeRanges, playlistType: PlaylistLevelType): Unit = js.native
  def detectEvictedFragments(
    elementaryStream: SourceBufferName,
    timeRange: TimeRanges,
    playlistType: PlaylistLevelType,
    appendedPart: Part
  ): Unit = js.native
  
  /**
    * Checks if the fragment passed in is loaded in the buffer properly
    * Partially loaded fragments will be registered as a partial fragment
    */
  def detectPartialFragments(data: FragBufferedData): Unit = js.native
  
  /* private */ var endListFragments: Any = js.native
  
  def fragBuffered(frag: Fragment): Unit = js.native
  @JSName("fragBuffered")
  def fragBuffered_true(frag: Fragment, force: `true`): Unit = js.native
  
  /* private */ var fragments: Any = js.native
  
  /**
    * Return a Fragment or Part with an appended range that matches the position and levelType
    * Otherwise, return null
    */
  def getAppendedFrag(position: Double, levelType: PlaylistLevelType): Fragment | Part | Null = js.native
  
  /**
    * Return a buffered Fragment that matches the position and levelType.
    * A buffered Fragment is one whose loading, parsing and appending is done (completed or "partial" meaning aborted).
    * If not found any Fragment, return null
    */
  def getBufferedFrag(position: Double, levelType: PlaylistLevelType): Fragment | Null = js.native
  
  /* private */ var getBufferedTimes: Any = js.native
  
  /**
    * Gets the partial fragment for a certain time
    */
  def getPartialFragment(time: Double): Fragment | Null = js.native
  
  def getState(fragment: Fragment): FragmentState = js.native
  
  /* private */ var hasFragment: Any = js.native
  
  /* private */ var hasGaps: Any = js.native
  
  def hasParts(`type`: PlaylistLevelType): Boolean = js.native
  
  /* private */ var hls: Any = js.native
  
  def isEndListAppended(`type`: PlaylistLevelType): Boolean = js.native
  
  /* private */ var isTimeBuffered: Any = js.native
  
  /* private */ var onBufferAppended: Any = js.native
  
  /* private */ var onFragBuffered: Any = js.native
  
  /* private */ var onFragLoaded: Any = js.native
  
  def removeAllFragments(): Unit = js.native
  
  def removeFragment(fragment: Fragment): Unit = js.native
  
  def removeFragmentsInRange(start: Double, end: Double, playlistType: PlaylistLevelType): Unit = js.native
  def removeFragmentsInRange(start: Double, end: Double, playlistType: PlaylistLevelType, withGapOnly: Boolean): Unit = js.native
  def removeFragmentsInRange(
    start: Double,
    end: Double,
    playlistType: PlaylistLevelType,
    withGapOnly: Boolean,
    unbufferedOnly: Boolean
  ): Unit = js.native
  def removeFragmentsInRange(
    start: Double,
    end: Double,
    playlistType: PlaylistLevelType,
    withGapOnly: Unit,
    unbufferedOnly: Boolean
  ): Unit = js.native
  
  /* private */ var removeParts: Any = js.native
  
  /* private */ var timeRanges: Any = js.native
}
