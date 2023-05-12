package typings.hlsJs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "LevelDetails")
@js.native
open class LevelDetails protected () extends StObject {
  def this(baseUrl: Any) = this()
  
  var PTSKnown: Boolean = js.native
  
  var advanced: Boolean = js.native
  
  var advancedDateTime: js.UndefOr[Double] = js.native
  
  def age: Double = js.native
  
  var ageHeader: Double = js.native
  
  var alignedSliding: Boolean = js.native
  
  var availabilityDelay: js.UndefOr[Double] = js.native
  
  var averagetargetduration: js.UndefOr[Double] = js.native
  
  var canBlockReload: Boolean = js.native
  
  var canSkipDateRanges: Boolean = js.native
  
  var canSkipUntil: Double = js.native
  
  var dateRanges: Record[String, DateRange] = js.native
  
  var deltaUpdateFailed: js.UndefOr[Boolean] = js.native
  
  def drift: Double = js.native
  
  var driftEnd: Double = js.native
  
  var driftEndTime: Double = js.native
  
  var driftStart: Double = js.native
  
  var driftStartTime: Double = js.native
  
  def edge: Double = js.native
  
  var encryptedFragments: js.Array[Fragment] = js.native
  
  var endCC: Double = js.native
  
  var endSN: Double = js.native
  
  def fragmentEnd: Double = js.native
  
  var fragmentHint: js.UndefOr[Fragment] = js.native
  
  var fragments: js.Array[Fragment] = js.native
  
  def hasProgramDateTime: Boolean = js.native
  
  var hasVariableRefs: Boolean = js.native
  
  var holdBack: Double = js.native
  
  def lastPartIndex: Double = js.native
  
  def lastPartSn: Double = js.native
  
  def levelTargetDuration: Double = js.native
  
  var live: Boolean = js.native
  
  var m3u8: String = js.native
  
  var misses: Double = js.native
  
  def partEnd: Double = js.native
  
  var partHoldBack: Double = js.native
  
  var partList: js.Array[Part] | Null = js.native
  
  var partTarget: Double = js.native
  
  var playlistParsingError: js.Error | Null = js.native
  
  var preloadHint: js.UndefOr[AttrList] = js.native
  
  var recentlyRemovedDateranges: js.UndefOr[js.Array[String]] = js.native
  
  def reloaded(): Unit = js.native
  def reloaded(previous: LevelDetails): Unit = js.native
  
  var renditionReports: js.UndefOr[js.Array[AttrList]] = js.native
  
  var skippedSegments: Double = js.native
  
  var startCC: Double = js.native
  
  var startSN: Double = js.native
  
  var startTimeOffset: Double | Null = js.native
  
  var targetduration: Double = js.native
  
  var totalduration: Double = js.native
  
  var tuneInGoal: Double = js.native
  
  var `type`: String | Null = js.native
  
  var updated: Boolean = js.native
  
  var url: String = js.native
  
  var variableList: VariableMap | Null = js.native
  
  var version: Double | Null = js.native
}
