package typings.hlsJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hlsJs.hlsJsStrings.initSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "Fragment")
@js.native
open class Fragment protected () extends BaseSegment {
  def this(`type`: PlaylistLevelType, baseurl: String) = this()
  
  /* private */ var _decryptdata: Any = js.native
  
  def abortRequests(): Unit = js.native
  
  var bitrateTest: Boolean = js.native
  
  var cc: Double = js.native
  
  def clearElementaryStreamInfo(): Unit = js.native
  
  var data: js.UndefOr[js.typedarray.Uint8Array] = js.native
  
  def decryptdata: LevelKey | Null = js.native
  
  var deltaPTS: js.UndefOr[Double] = js.native
  
  var duration: Double = js.native
  
  def encrypted: Boolean = js.native
  
  def end: Double = js.native
  
  var endDTS: Double = js.native
  
  var endList: js.UndefOr[Boolean] = js.native
  
  var endPTS: js.UndefOr[Double] = js.native
  
  def endProgramDateTime: Double | Null = js.native
  
  var gap: js.UndefOr[Boolean] = js.native
  
  var initSegment: Fragment | Null = js.native
  
  var keyLoader: Loader[KeyLoaderContext] | Null = js.native
  
  var level: Double = js.native
  
  var levelkeys: js.UndefOr[StringDictionary[LevelKey]] = js.native
  
  var loader: Loader[FragmentLoaderContext] | Null = js.native
  
  var maxStartPTS: js.UndefOr[Double] = js.native
  
  var minEndPTS: js.UndefOr[Double] = js.native
  
  var programDateTime: Double | Null = js.native
  
  var rawProgramDateTime: String | Null = js.native
  
  def setElementaryStreamInfo(`type`: ElementaryStreamTypes, startPTS: Double, endPTS: Double, startDTS: Double, endDTS: Double): Unit = js.native
  def setElementaryStreamInfo(
    `type`: ElementaryStreamTypes,
    startPTS: Double,
    endPTS: Double,
    startDTS: Double,
    endDTS: Double,
    partial: Boolean
  ): Unit = js.native
  
  def setKeyFormat(keyFormat: KeySystemFormats): Unit = js.native
  
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
