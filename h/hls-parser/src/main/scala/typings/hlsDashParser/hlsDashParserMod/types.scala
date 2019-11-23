package typings.hlsDashParser.hlsDashParserMod

import typings.hlsDashParser.Anon_AUDIO
import typings.hlsDashParser.Anon_AssocLanguage
import typings.hlsDashParser.Anon_Attributes
import typings.hlsDashParser.Anon_Audio
import typings.hlsDashParser.Anon_Byterange
import typings.hlsDashParser.Anon_ByterangeUri
import typings.hlsDashParser.Anon_CurrentVariant
import typings.hlsDashParser.Anon_DiscontinuitySequenceBase
import typings.hlsDashParser.Anon_Format
import typings.hlsDashParser.Anon_Height
import typings.hlsDashParser.Anon_Id
import typings.hlsDashParser.Anon_IndependentSegments
import typings.hlsDashParser.Anon_Offset
import typings.hlsDashParser.hlsDashParserMod.types.DateRange
import typings.hlsDashParser.hlsDashParserMod.types.Key
import typings.hlsDashParser.hlsDashParserMod.types.MediaInitializationSection
import typings.hlsDashParser.hlsDashParserMod.types.Playlist
import typings.hlsDashParser.hlsDashParserMod.types.Rendition
import typings.hlsDashParser.hlsDashParserMod.types.Segment
import typings.hlsDashParser.hlsDashParserMod.types.SessionData
import typings.hlsDashParser.hlsDashParserMod.types.Variant
import typings.hlsDashParser.hlsDashParserStrings.AUDIO
import typings.hlsDashParser.hlsDashParserStrings.EVENT
import typings.hlsDashParser.hlsDashParserStrings.SUBTITLES
import typings.hlsDashParser.hlsDashParserStrings.VIDEO
import typings.hlsDashParser.hlsDashParserStrings.VOD
import typings.hlsDashParser.hlsDashParserStrings.`CLOSED-CAPTIONS`
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls-parser", "types")
@js.native
object types extends js.Object {
  @js.native
  class DateRange protected () extends js.Object {
    def this(properties: Anon_Attributes) = this()
    var attributes: js.UndefOr[js.Object] = js.native
    var classId: js.UndefOr[String] = js.native
    var duration: js.UndefOr[Double] = js.native
    var end: js.UndefOr[Date] = js.native
    var endOnNext: js.UndefOr[Boolean] = js.native
    var id: String = js.native
    var plannedDuration: js.UndefOr[Double] = js.native
    var start: Date = js.native
  }
  
  @js.native
  class Key protected () extends js.Object {
    def this(properties: Anon_Format) = this()
    var format: js.UndefOr[String] = js.native
    var formatVersion: js.UndefOr[String] = js.native
    var iv: js.UndefOr[Buffer] = js.native
    var method: String = js.native
    var uri: js.UndefOr[String] = js.native
  }
  
  @js.native
  class MasterPlaylist protected () extends Playlist {
    def this(properties: Anon_CurrentVariant) = this()
    var currentVariant: js.UndefOr[Double] = js.native
    var sessionDataList: js.Array[SessionData] = js.native
    var sessionKeyList: js.Array[Key] = js.native
    var variants: js.Array[Variant] = js.native
  }
  
  @js.native
  class MediaInitializationSection protected () extends js.Object {
    def this(properties: Anon_ByterangeUri) = this()
    var byterange: js.UndefOr[Byterange] = js.native
    var uri: String = js.native
  }
  
  @js.native
  class MediaPlaylist protected () extends Playlist {
    def this(properties: Anon_DiscontinuitySequenceBase) = this()
    var discontinuitySequenceBase: js.UndefOr[Double] = js.native
    var endlist: Boolean = js.native
    var isIFrame: Boolean = js.native
    var mediaSequenceBase: js.UndefOr[Double] = js.native
    var playlistType: js.UndefOr[EVENT | VOD] = js.native
    var segments: js.Array[Segment] = js.native
    var targetDuration: Double = js.native
  }
  
  @js.native
  class Playlist protected () extends Data {
    def this(properties: Anon_IndependentSegments) = this()
    var independentSegments: Boolean = js.native
    var isMasterPlaylist: Boolean = js.native
    var source: js.UndefOr[String] = js.native
    var start: js.UndefOr[Anon_Offset] = js.native
    var uri: js.UndefOr[String] = js.native
    var version: js.UndefOr[Double] = js.native
  }
  
  @js.native
  class Rendition[T] protected () extends js.Object {
    def this(properties: Anon_AssocLanguage[T]) = this()
    var assocLanguage: js.UndefOr[String] = js.native
    var autoselect: Boolean = js.native
    var channels: js.UndefOr[String] = js.native
    var characteristics: js.UndefOr[String] = js.native
    var forced: Boolean = js.native
    var groupId: String = js.native
    var instreamId: js.UndefOr[String] = js.native
    var isDefault: Boolean = js.native
    var language: js.UndefOr[String] = js.native
    var name: String = js.native
    var `type`: T = js.native
    var uri: js.UndefOr[String] = js.native
  }
  
  @js.native
  class Segment protected () extends Data {
    def this(properties: Anon_Byterange) = this()
    var byterange: js.UndefOr[Byterange] = js.native
    var dateRange: DateRange = js.native
    var discontinuity: js.UndefOr[Boolean] = js.native
    var discontinuitySequence: Double = js.native
    var duration: Double = js.native
    var key: js.UndefOr[Key] = js.native
    var map: js.UndefOr[MediaInitializationSection] = js.native
    var mediaSequenceNumber: Double = js.native
    var programDateTime: js.UndefOr[Date] = js.native
    var title: js.UndefOr[String] = js.native
    var uri: String = js.native
  }
  
  @js.native
  class SessionData protected () extends js.Object {
    def this(properties: Anon_Id) = this()
    var id: String = js.native
    var language: js.UndefOr[String] = js.native
    var uri: js.UndefOr[String] = js.native
    var value: js.UndefOr[String] = js.native
  }
  
  @js.native
  class Variant protected () extends js.Object {
    def this(properties: Anon_AUDIO) = this()
    var audio: js.Array[Rendition[AUDIO]] = js.native
    var averageBandwidth: js.UndefOr[Double] = js.native
    var bandwidth: Double = js.native
    var closedCaptions: js.Array[Rendition[`CLOSED-CAPTIONS`]] = js.native
    var codecs: js.UndefOr[String] = js.native
    var currentRenditions: Anon_Audio = js.native
    var frameRate: js.UndefOr[Double] = js.native
    var hdcpLevel: js.UndefOr[String] = js.native
    var isIFrameOnly: js.UndefOr[Boolean] = js.native
    var resolution: js.UndefOr[Anon_Height] = js.native
    var subtitles: js.Array[Rendition[SUBTITLES]] = js.native
    var uri: String = js.native
    var video: js.Array[Rendition[VIDEO]] = js.native
  }
  
}

