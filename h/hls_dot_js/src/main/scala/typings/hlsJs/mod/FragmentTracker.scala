package typings.hlsJs.mod

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
  
  /* private */ var activeFragment: Any = js.native
  
  /* private */ var activeParts: Any = js.native
  
  /* private */ var bufferPadding: Any = js.native
  
  /**
    * Partial fragments effected by coded frame eviction will be removed
    * The browser will unload parts of the buffer to free up memory for new buffer data
    * Fragments will need to be reloaded when the buffer is freed up, removing partial fragments will allow them to reload(since there might be parts that are still playable)
    */
  def detectEvictedFragments(elementaryStream: SourceBufferName, timeRange: TimeRanges): Unit = js.native
  def detectEvictedFragments(elementaryStream: SourceBufferName, timeRange: TimeRanges, playlistType: PlaylistLevelType): Unit = js.native
  
  /**
    * Checks if the fragment passed in is loaded in the buffer properly
    * Partially loaded fragments will be registered as a partial fragment
    */
  /* private */ var detectPartialFragments: Any = js.native
  
  def fragBuffered(frag: Fragment): Unit = js.native
  
  /* private */ var fragments: Any = js.native
  
  /**
    * Return a Fragment with an appended range that matches the position and levelType.
    * If not found any Fragment, return null
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
  
  /* private */ var hls: Any = js.native
  
  /* private */ var isTimeBuffered: Any = js.native
  
  /* private */ var onBufferAppended: Any = js.native
  
  /* private */ var onFragBuffered: Any = js.native
  
  /* private */ var onFragLoaded: Any = js.native
  
  def removeAllFragments(): Unit = js.native
  
  def removeFragment(fragment: Fragment): Unit = js.native
  
  def removeFragmentsInRange(start: Double, end: Double, playlistType: PlaylistLevelType): Unit = js.native
  
  /* private */ var timeRanges: Any = js.native
}
