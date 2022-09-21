package typings.hlsJs.mod

import typings.hlsJs.hlsJsStrings.initSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "Fragment")
@js.native
open class Fragment protected () extends BaseSegment {
  def this(`type`: PlaylistLevelType, baseurl: String) = this()
  
  /* private */ var _decryptdata: Any = js.native
  
  var appendedPTS: js.UndefOr[Double] = js.native
  
  var bitrateTest: Boolean = js.native
  
  var cc: Double = js.native
  
  def clearElementaryStreamInfo(): Unit = js.native
  
  /**
    * Utility method for parseLevelPlaylist to create an initialization vector for a given segment
    * @param {number} segmentNumber - segment number to generate IV with
    * @returns {Uint8Array}
    */
  def createInitializationVector(segmentNumber: Double): js.typedarray.Uint8Array = js.native
  
  var data: js.UndefOr[js.typedarray.Uint8Array] = js.native
  
  def decryptdata: LevelKey | Null = js.native
  
  var deltaPTS: js.UndefOr[Double] = js.native
  
  var duration: Double = js.native
  
  def encrypted: Boolean = js.native
  
  def end: Double = js.native
  
  var endDTS: Double = js.native
  
  var endPTS: js.UndefOr[Double] = js.native
  
  def endProgramDateTime: Double | Null = js.native
  
  var initSegment: Fragment | Null = js.native
  
  var level: Double = js.native
  
  var levelkey: js.UndefOr[LevelKey] = js.native
  
  var loader: Loader[FragmentLoaderContext] | Null = js.native
  
  var maxStartPTS: js.UndefOr[Double] = js.native
  
  var minEndPTS: js.UndefOr[Double] = js.native
  
  var programDateTime: Double | Null = js.native
  
  var rawProgramDateTime: String | Null = js.native
  
  /**
    * Utility method for parseLevelPlaylist to get a fragment's decryption data from the currently parsed encryption key data
    * @param levelkey - a playlist's encryption info
    * @param segmentNumber - the fragment's segment number
    * @returns {LevelKey} - an object to be applied as a fragment's decryptdata
    */
  def setDecryptDataFromLevelKey(levelkey: LevelKey, segmentNumber: Double): LevelKey = js.native
  
  def setElementaryStreamInfo(`type`: ElementaryStreamTypes, startPTS: Double, endPTS: Double, startDTS: Double, endDTS: Double): Unit = js.native
  def setElementaryStreamInfo(
    `type`: ElementaryStreamTypes,
    startPTS: Double,
    endPTS: Double,
    startDTS: Double,
    endDTS: Double,
    partial: Boolean
  ): Unit = js.native
  
  var sn: Double | initSegment = js.native
  
  var start: Double = js.native
  
  var startDTS: Double = js.native
  
  var startPTS: js.UndefOr[Double] = js.native
  
  var stats: LoadStats = js.native
  
  var tagList: js.Array[js.Array[String]] = js.native
  
  var title: String | Null = js.native
  
  val `type`: PlaylistLevelType = js.native
  
  var urlId: Double = js.native
}
