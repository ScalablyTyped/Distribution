package typings.hlsParser

import typings.hlsParser.anon.AssocLanguage
import typings.hlsParser.anon.Attributes
import typings.hlsParser.anon.Audio
import typings.hlsParser.anon.AverageBandwidth
import typings.hlsParser.anon.BasePlaylistConstructorPr
import typings.hlsParser.anon.BasePlaylistConstructorPrCurrentVariant
import typings.hlsParser.anon.BasePlaylistConstructorPrDiscontinuitySequenceBase
import typings.hlsParser.anon.Format
import typings.hlsParser.anon.Height
import typings.hlsParser.anon.Id
import typings.hlsParser.anon.Offset
import typings.hlsParser.anon.PartialOptions
import typings.hlsParser.anon.Uri
import typings.hlsParser.hlsParserStrings.AUDIO
import typings.hlsParser.hlsParserStrings.EVENT
import typings.hlsParser.hlsParserStrings.SUBTITLES
import typings.hlsParser.hlsParserStrings.VIDEO
import typings.hlsParser.hlsParserStrings.VOD
import typings.hlsParser.hlsParserStrings.`CLOSED-CAPTIONS`
import typings.hlsParser.hlsParserStrings.playlist
import typings.hlsParser.hlsParserStrings.segment
import typings.hlsParser.mod.types.MasterPlaylist
import typings.hlsParser.mod.types.MediaPlaylist
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hls-parser", "Data")
  @js.native
  class Data () extends StObject {
    
    var `type`: playlist | segment = js.native
  }
  
  @JSImport("hls-parser", "getOptions")
  @js.native
  def getOptions(): Options = js.native
  
  @JSImport("hls-parser", "parse")
  @js.native
  def parse(manifest: String): MasterPlaylist | MediaPlaylist = js.native
  
  @JSImport("hls-parser", "setOptions")
  @js.native
  def setOptions(overrides: PartialOptions): Unit = js.native
  
  @JSImport("hls-parser", "stringify")
  @js.native
  def stringify(playlist: MasterPlaylist): String = js.native
  @JSImport("hls-parser", "stringify")
  @js.native
  def stringify(playlist: MediaPlaylist): String = js.native
  
  object types {
    
    @JSImport("hls-parser", "types.DateRange")
    @js.native
    class DateRange protected () extends StObject {
      def this(properties: Attributes) = this()
      
      var attributes: js.UndefOr[js.Object] = js.native
      
      var classId: js.UndefOr[String] = js.native
      
      var duration: js.UndefOr[Double] = js.native
      
      var end: js.UndefOr[Date] = js.native
      
      var endOnNext: js.UndefOr[Boolean] = js.native
      
      var id: String = js.native
      
      var plannedDuration: js.UndefOr[Double] = js.native
      
      var start: Date = js.native
    }
    
    @JSImport("hls-parser", "types.Key")
    @js.native
    class Key protected () extends StObject {
      def this(properties: Format) = this()
      
      var format: js.UndefOr[String] = js.native
      
      var formatVersion: js.UndefOr[String] = js.native
      
      var iv: js.UndefOr[Buffer] = js.native
      
      var method: String = js.native
      
      var uri: js.UndefOr[String] = js.native
    }
    
    @JSImport("hls-parser", "types.MasterPlaylist")
    @js.native
    class MasterPlaylist protected () extends Playlist {
      def this(properties: BasePlaylistConstructorPrCurrentVariant) = this()
      
      var currentVariant: js.UndefOr[Double] = js.native
      
      var sessionDataList: js.Array[SessionData] = js.native
      
      var sessionKeyList: js.Array[Key] = js.native
      
      var variants: js.Array[Variant] = js.native
    }
    
    @JSImport("hls-parser", "types.MediaInitializationSection")
    @js.native
    class MediaInitializationSection protected () extends StObject {
      def this(properties: Uri) = this()
      
      var byterange: js.UndefOr[Byterange] = js.native
      
      var uri: String = js.native
    }
    
    @JSImport("hls-parser", "types.MediaPlaylist")
    @js.native
    class MediaPlaylist protected () extends Playlist {
      def this(properties: BasePlaylistConstructorPrDiscontinuitySequenceBase) = this()
      
      var discontinuitySequenceBase: js.UndefOr[Double] = js.native
      
      var endlist: Boolean = js.native
      
      var isIFrame: Boolean = js.native
      
      var mediaSequenceBase: js.UndefOr[Double] = js.native
      
      var playlistType: js.UndefOr[EVENT | VOD] = js.native
      
      var segments: js.Array[Segment] = js.native
      
      var targetDuration: Double = js.native
    }
    
    @JSImport("hls-parser", "types.Playlist")
    @js.native
    class Playlist protected () extends Data {
      def this(properties: BasePlaylistConstructorPr) = this()
      
      var independentSegments: Boolean = js.native
      
      var isMasterPlaylist: Boolean = js.native
      
      var source: js.UndefOr[String] = js.native
      
      var start: js.UndefOr[Offset] = js.native
      
      var uri: js.UndefOr[String] = js.native
      
      var version: js.UndefOr[Double] = js.native
    }
    
    @JSImport("hls-parser", "types.Rendition")
    @js.native
    class Rendition[T] protected () extends StObject {
      def this(properties: AssocLanguage[T]) = this()
      
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
    
    @JSImport("hls-parser", "types.Segment")
    @js.native
    class Segment protected () extends Data {
      def this(properties: typings.hlsParser.anon.Byterange) = this()
      
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
    
    @JSImport("hls-parser", "types.SessionData")
    @js.native
    class SessionData protected () extends StObject {
      def this(properties: Id) = this()
      
      var id: String = js.native
      
      var language: js.UndefOr[String] = js.native
      
      var uri: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    
    @JSImport("hls-parser", "types.Variant")
    @js.native
    class Variant protected () extends StObject {
      def this(properties: AverageBandwidth) = this()
      
      var audio: js.Array[Rendition[AUDIO]] = js.native
      
      var averageBandwidth: js.UndefOr[Double] = js.native
      
      var bandwidth: Double = js.native
      
      var closedCaptions: js.Array[Rendition[`CLOSED-CAPTIONS`]] = js.native
      
      var codecs: js.UndefOr[String] = js.native
      
      var currentRenditions: Audio = js.native
      
      var frameRate: js.UndefOr[Double] = js.native
      
      var hdcpLevel: js.UndefOr[String] = js.native
      
      var isIFrameOnly: js.UndefOr[Boolean] = js.native
      
      var resolution: js.UndefOr[Height] = js.native
      
      var subtitles: js.Array[Rendition[SUBTITLES]] = js.native
      
      var uri: String = js.native
      
      var video: js.Array[Rendition[VIDEO]] = js.native
    }
    
    @js.native
    trait BasePlaylistConstructorProperties extends StObject {
      
      var independentSegments: js.UndefOr[Boolean] = js.native
      
      var source: js.UndefOr[String] = js.native
      
      var start: js.UndefOr[Offset] = js.native
      
      var uri: js.UndefOr[String] = js.native
      
      var version: js.UndefOr[Double] = js.native
    }
    object BasePlaylistConstructorProperties {
      
      @scala.inline
      def apply(): BasePlaylistConstructorProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BasePlaylistConstructorProperties]
      }
      
      @scala.inline
      implicit class BasePlaylistConstructorPropertiesMutableBuilder[Self <: BasePlaylistConstructorProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIndependentSegments(value: Boolean): Self = StObject.set(x, "independentSegments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIndependentSegmentsUndefined: Self = StObject.set(x, "independentSegments", js.undefined)
        
        @scala.inline
        def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        @scala.inline
        def setStart(value: Offset): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        @scala.inline
        def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
        
        @scala.inline
        def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
  }
  
  @js.native
  trait Byterange extends StObject {
    
    var length: Double = js.native
    
    var offset: Double = js.native
  }
  object Byterange {
    
    @scala.inline
    def apply(length: Double, offset: Double): Byterange = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Byterange]
    }
    
    @scala.inline
    implicit class ByterangeMutableBuilder[Self <: Byterange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var strictMode: Boolean = js.native
  }
  object Options {
    
    @scala.inline
    def apply(strictMode: Boolean): Options = {
      val __obj = js.Dynamic.literal(strictMode = strictMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    }
  }
}
