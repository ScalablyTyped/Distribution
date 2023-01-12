package typings.hyperdeckJsLib

import org.scalablytyped.runtime.StringDictionary
import typings.hyperdeckJsLib.anon.Connected
import typings.hyperdeckJsLib.anon.Ip
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.`false`
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.`true`
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.asynchronousEvent
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.connectionLost
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.connectionStateChange
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.empty
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.error
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.forward
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.jog
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.mounted
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.mounting
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.play
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.preview
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.record
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.rewind
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.shuttle
import typings.hyperdeckJsLib.hyperdeckJsLibStrings.stopped
import typings.hyperdeckJsLib.mod.Hyperdeck.ClipList
import typings.hyperdeckJsLib.mod.Hyperdeck.Config
import typings.hyperdeckJsLib.mod.Hyperdeck.Notifier
import typings.hyperdeckJsLib.mod.Hyperdeck.Response
import typings.hyperdeckJsLib.mod.Hyperdeck.SlotInfo
import typings.hyperdeckJsLib.mod.Hyperdeck.Timecode
import typings.hyperdeckJsLib.mod.Hyperdeck.TransportInfo
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hyperdeck-js-lib", "Hyperdeck")
  @js.native
  open class Hyperdeck protected () extends HyperdeckCore {
    def this(config: Config) = this()
    
    def clipsGet(): js.Promise[Response[ClipList]] = js.native
    
    def format(format: String): js.Promise[Response[Any]] = js.native
    
    def goTo(timecode: Timecode): js.Promise[Response[Any]] = js.native
    
    def jogBackwards(timecode: Timecode): js.Promise[Response[Any]] = js.native
    
    def jogForward(timecode: Timecode): js.Promise[Response[Any]] = js.native
    
    def jogTo(timecode: Timecode): js.Promise[Response[Any]] = js.native
    
    def nextClip(): js.Promise[Response[Any]] = js.native
    
    def play(): js.Promise[Response[Any]] = js.native
    def play(speed: Double): js.Promise[Response[Any]] = js.native
    
    def prevClip(): js.Promise[Response[Any]] = js.native
    
    def record(): js.Promise[Response[Any]] = js.native
    
    def slotInfo(): js.Promise[Response[SlotInfo]] = js.native
    def slotInfo(id: Double): js.Promise[Response[SlotInfo]] = js.native
    
    def slotSelect(): js.Promise[Response[Any]] = js.native
    def slotSelect(id: Double): js.Promise[Response[Any]] = js.native
    
    def stop(): js.Promise[Response[Any]] = js.native
    
    def transportInfo(): js.Promise[Response[TransportInfo]] = js.native
  }
  object Hyperdeck {
    
    @JSImport("hyperdeck-js-lib", "Hyperdeck.Notifier")
    @js.native
    open class Notifier () extends EventEmitter {
      def this(options: EventEmitterOptions) = this()
      
      @JSName("on")
      def on_asynchronousEvent(event: asynchronousEvent, callback: js.Function1[/* response */ Response[Any], Unit]): this.type = js.native
      @JSName("on")
      def on_connectionLost(event: connectionLost, callback: js.Function0[Unit]): this.type = js.native
      @JSName("on")
      def on_connectionStateChange(event: connectionStateChange, callback: js.Function1[/* response */ Connected, Unit]): this.type = js.native
      
      @JSName("once")
      def once_asynchronousEvent(event: asynchronousEvent, callback: js.Function1[/* response */ Response[Any], Unit]): this.type = js.native
      @JSName("once")
      def once_connectionLost(event: connectionLost, callback: js.Function0[Unit]): this.type = js.native
      @JSName("once")
      def once_connectionStateChange(event: connectionStateChange, callback: js.Function1[/* response */ Connected, Unit]): this.type = js.native
    }
    
    type ClipList = StringDictionary[/* template literal string: ${string} ${Timecode} ${Timecode} */ String]
    
    type Config = String | Ip
    
    trait DeviceInfo extends StObject {
      
      var model: String
      
      var `protocol version`: String
      
      var `unique id`: String
    }
    object DeviceInfo {
      
      inline def apply(model: String, `protocol version`: String, `unique id`: String): DeviceInfo = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.updateDynamic("protocol version")((`protocol version`).asInstanceOf[js.Any])
        __obj.updateDynamic("unique id")((`unique id`).asInstanceOf[js.Any])
        __obj.asInstanceOf[DeviceInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DeviceInfo] (val x: Self) extends AnyVal {
        
        inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def `setProtocol version`(value: String): Self = StObject.set(x, "protocol version", value.asInstanceOf[js.Any])
        
        inline def `setUnique id`(value: String): Self = StObject.set(x, "unique id", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeUncompressed
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResHQ
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProRes
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResLT
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResProxy
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD220
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD220
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHR_HQX
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_HQX
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Low
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Medium
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`HDot264High `
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHD45 `
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD45
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD145
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD145
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHR_SQ `
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_SQ
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuicktimeDNxHR_LB
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_LB
    */
    trait FileFormat extends StObject
    object FileFormat {
      
      inline def DNxHD145: typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD145 = "DNxHD145".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD145]
      
      inline def DNxHD220: typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD220 = "DNxHD220".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD220]
      
      inline def DNxHD45: typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD45 = "DNxHD45".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD45]
      
      inline def DNxHR_HQX: typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_HQX = "DNxHR_HQX".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_HQX]
      
      inline def DNxHR_LB: typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_LB = "DNxHR_LB".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_LB]
      
      inline def DNxHR_SQ: typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_SQ = "DNxHR_SQ".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_SQ]
      
      inline def `HDot264High `: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`HDot264High ` = ("H.264High ").asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`HDot264High `]
      
      inline def HDot264Low: typings.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Low = "H.264Low".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Low]
      
      inline def HDot264Medium: typings.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Medium = "H.264Medium".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Medium]
      
      inline def QuickTimeDNxHD145: typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD145 = "QuickTimeDNxHD145".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD145]
      
      inline def QuickTimeDNxHD220: typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD220 = "QuickTimeDNxHD220".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD220]
      
      inline def `QuickTimeDNxHD45 `: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHD45 ` = ("QuickTimeDNxHD45 ").asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHD45 `]
      
      inline def QuickTimeDNxHR_HQX: typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHR_HQX = "QuickTimeDNxHR_HQX".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHR_HQX]
      
      inline def `QuickTimeDNxHR_SQ `: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHR_SQ ` = ("QuickTimeDNxHR_SQ ").asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHR_SQ `]
      
      inline def QuickTimeProRes: typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProRes = "QuickTimeProRes".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProRes]
      
      inline def QuickTimeProResHQ: typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResHQ = "QuickTimeProResHQ".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResHQ]
      
      inline def QuickTimeProResLT: typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResLT = "QuickTimeProResLT".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResLT]
      
      inline def QuickTimeProResProxy: typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResProxy = "QuickTimeProResProxy".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResProxy]
      
      inline def QuickTimeUncompressed: typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeUncompressed = "QuickTimeUncompressed".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeUncompressed]
      
      inline def QuicktimeDNxHR_LB: typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuicktimeDNxHR_LB = "QuicktimeDNxHR_LB".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.QuicktimeDNxHR_LB]
    }
    
    trait Response[T] extends StObject {
      
      var code: Double
      
      var params: T
      
      var text: String
    }
    object Response {
      
      inline def apply[T](code: Double, params: T, text: String): Response[T] = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[Response[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Response[?], T] (val x: Self & Response[T]) extends AnyVal {
        
        inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
    
    trait SlotInfo extends StObject {
      
      var `recording time`: String
      
      var `slot id`: String
      
      var status: empty | mounting | mounted | error
      
      var `video format`: VideoFormat
      
      var `volume name`: String
    }
    object SlotInfo {
      
      inline def apply(
        `recording time`: String,
        `slot id`: String,
        status: empty | mounting | mounted | error,
        `video format`: VideoFormat,
        `volume name`: String
      ): SlotInfo = {
        val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("recording time")((`recording time`).asInstanceOf[js.Any])
        __obj.updateDynamic("slot id")((`slot id`).asInstanceOf[js.Any])
        __obj.updateDynamic("video format")((`video format`).asInstanceOf[js.Any])
        __obj.updateDynamic("volume name")((`volume name`).asInstanceOf[js.Any])
        __obj.asInstanceOf[SlotInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SlotInfo] (val x: Self) extends AnyVal {
        
        inline def `setRecording time`(value: String): Self = StObject.set(x, "recording time", value.asInstanceOf[js.Any])
        
        inline def `setSlot id`(value: String): Self = StObject.set(x, "slot id", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: empty | mounting | mounted | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def `setVideo format`(value: VideoFormat): Self = StObject.set(x, "video format", value.asInstanceOf[js.Any])
        
        inline def `setVolume name`(value: String): Self = StObject.set(x, "volume name", value.asInstanceOf[js.Any])
      }
    }
    
    /** Format is `hours:minutes:seconds:frames` */
    type Timecode = /* template literal string: ${number}:${number}:${number}:${number} */ String
    
    trait TransportInfo extends StObject {
      
      /** could be "none" */
      var `clip id`: String
      
      var `display timecode`: Timecode
      
      var loop: `true` | `false`
      
      /** could be "none" */
      var `slot id`: String
      
      var speed: String
      
      var status: preview | stopped | play | forward | rewind | jog | shuttle | record
      
      var timecode: Timecode
      
      var `video format`: VideoFormat
    }
    object TransportInfo {
      
      inline def apply(
        `clip id`: String,
        `display timecode`: Timecode,
        loop: `true` | `false`,
        `slot id`: String,
        speed: String,
        status: preview | stopped | play | forward | rewind | jog | shuttle | record,
        timecode: Timecode,
        `video format`: VideoFormat
      ): TransportInfo = {
        val __obj = js.Dynamic.literal(loop = loop.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timecode = timecode.asInstanceOf[js.Any])
        __obj.updateDynamic("clip id")((`clip id`).asInstanceOf[js.Any])
        __obj.updateDynamic("display timecode")((`display timecode`).asInstanceOf[js.Any])
        __obj.updateDynamic("slot id")((`slot id`).asInstanceOf[js.Any])
        __obj.updateDynamic("video format")((`video format`).asInstanceOf[js.Any])
        __obj.asInstanceOf[TransportInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TransportInfo] (val x: Self) extends AnyVal {
        
        inline def `setClip id`(value: String): Self = StObject.set(x, "clip id", value.asInstanceOf[js.Any])
        
        inline def `setDisplay timecode`(value: Timecode): Self = StObject.set(x, "display timecode", value.asInstanceOf[js.Any])
        
        inline def setLoop(value: `true` | `false`): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
        
        inline def `setSlot id`(value: String): Self = StObject.set(x, "slot id", value.asInstanceOf[js.Any])
        
        inline def setSpeed(value: String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: preview | stopped | play | forward | rewind | jog | shuttle | record): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setTimecode(value: Timecode): Self = StObject.set(x, "timecode", value.asInstanceOf[js.Any])
        
        inline def `setVideo format`(value: VideoFormat): Self = StObject.set(x, "video format", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.NTSC
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.PAL
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.NTSCp
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.PALp
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`720p50`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`720p5994`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`720p60`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p23976`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p24`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p25`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p2997`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p30`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i50`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i5994`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i60`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp23976`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp24`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp25`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp2997`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp30`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp50`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp5994`
      - typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp60`
    */
    trait VideoFormat extends StObject
    object VideoFormat {
      
      inline def `1080i50`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i50` = "1080i50".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i50`]
      
      inline def `1080i5994`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i5994` = "1080i5994".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i5994`]
      
      inline def `1080i60`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i60` = "1080i60".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i60`]
      
      inline def `1080p23976`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p23976` = "1080p23976".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p23976`]
      
      inline def `1080p24`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p24` = "1080p24".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p24`]
      
      inline def `1080p25`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p25` = "1080p25".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p25`]
      
      inline def `1080p2997`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p2997` = "1080p2997".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p2997`]
      
      inline def `1080p30`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p30` = "1080p30".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p30`]
      
      inline def `4Kp23976`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp23976` = "4Kp23976".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp23976`]
      
      inline def `4Kp24`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp24` = "4Kp24".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp24`]
      
      inline def `4Kp25`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp25` = "4Kp25".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp25`]
      
      inline def `4Kp2997`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp2997` = "4Kp2997".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp2997`]
      
      inline def `4Kp30`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp30` = "4Kp30".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp30`]
      
      inline def `4Kp50`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp50` = "4Kp50".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp50`]
      
      inline def `4Kp5994`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp5994` = "4Kp5994".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp5994`]
      
      inline def `4Kp60`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp60` = "4Kp60".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp60`]
      
      inline def `720p50`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`720p50` = "720p50".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`720p50`]
      
      inline def `720p5994`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`720p5994` = "720p5994".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`720p5994`]
      
      inline def `720p60`: typings.hyperdeckJsLib.hyperdeckJsLibStrings.`720p60` = "720p60".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.`720p60`]
      
      inline def NTSC: typings.hyperdeckJsLib.hyperdeckJsLibStrings.NTSC = "NTSC".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.NTSC]
      
      inline def NTSCp: typings.hyperdeckJsLib.hyperdeckJsLibStrings.NTSCp = "NTSCp".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.NTSCp]
      
      inline def PAL: typings.hyperdeckJsLib.hyperdeckJsLibStrings.PAL = "PAL".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.PAL]
      
      inline def PALp: typings.hyperdeckJsLib.hyperdeckJsLibStrings.PALp = "PALp".asInstanceOf[typings.hyperdeckJsLib.hyperdeckJsLibStrings.PALp]
    }
  }
  
  @JSImport("hyperdeck-js-lib", "HyperdeckCore")
  @js.native
  open class HyperdeckCore () extends StObject {
    
    /**
      * Destroy the hyperdeck instance, and disconnect if connected.
      */
    def destroy(): Unit = js.native
    
    /**
      * Get the notifier.
      * Events with id 'asynchronousEvent' will be emitted from this for asynchronous events
      * from the hyperdeck.
      * 'connectionLost' is emitted if the hyperdeck connection is lost (or fails to connect)
      */
    def getNotifier(): Notifier = js.native
    
    /**
      * Determine if currently connected to the hyperdeck.
      * @return boolean true if connected, false otherwise.
      */
    def isConnected(): Boolean = js.native
    
    /**
      * Make a request to the hyperdeck.
      * - If the hyperdeck returns a success response the promise will be resolved
      *   with the payload.
      * - If the hyperdeck returns a failure response the promise will be rejected
      *   with the payload.
      * - If the hyperdeck looses connection or is not connected the promise will be
      *   rejected and the payload will be `null`.
      * @return The promise which will resolve/reject when a response has been received
      *         (or connection lost).
      */
    // tslint:disable-next-line:no-unnecessary-generics
    def makeRequest[T](command: String): js.Promise[Response[T]] = js.native
    
    /**
      * Returns a promise that resolves when they hyperdeck is connected,
      * or rejected if the connection fails.
      */
    def onConnected(): js.Promise[Unit] = js.native
  }
  
  @JSImport("hyperdeck-js-lib", "Logger")
  @js.native
  val Logger: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalLogger */ Any = js.native
}
