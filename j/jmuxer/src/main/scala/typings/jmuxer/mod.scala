package typings.jmuxer

import typings.jmuxer.jmuxerStrings.audio
import typings.jmuxer.jmuxerStrings.both
import typings.jmuxer.jmuxerStrings.video
import typings.node.streamMod.Duplex
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jmuxer", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with JMuxer {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def createStream(): Duplex = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def feed(data: Feeder): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  trait Feeder extends StObject {
    
    var audio: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var video: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object Feeder {
    
    inline def apply(): Feeder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Feeder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Feeder] (val x: Self) extends AnyVal {
      
      inline def setAudio(value: js.typedarray.Uint8Array): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setVideo(value: js.typedarray.Uint8Array): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait JMuxer extends StObject {
    
    def createStream(): Duplex
    
    def destroy(): Unit
    
    def feed(data: Feeder): Unit
    
    def reset(): Unit
  }
  object JMuxer {
    
    inline def apply(createStream: () => Duplex, destroy: () => Unit, feed: Feeder => Unit, reset: () => Unit): JMuxer = {
      val __obj = js.Dynamic.literal(createStream = js.Any.fromFunction0(createStream), destroy = js.Any.fromFunction0(destroy), feed = js.Any.fromFunction1(feed), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[JMuxer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JMuxer] (val x: Self) extends AnyVal {
      
      inline def setCreateStream(value: () => Duplex): Self = StObject.set(x, "createStream", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setFeed(value: Feeder => Unit): Self = StObject.set(x, "feed", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    var clearBuffer: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var flushingTime: js.UndefOr[Double] = js.undefined
    
    var fps: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[both | audio | video] = js.undefined
    
    var node: String | HTMLVideoElement
    
    var onError: js.UndefOr[js.Function1[/* data */ Any, Unit]] = js.undefined
    
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(node: String | HTMLVideoElement): Options = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClearBuffer(value: Boolean): Self = StObject.set(x, "clearBuffer", value.asInstanceOf[js.Any])
      
      inline def setClearBufferUndefined: Self = StObject.set(x, "clearBuffer", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFlushingTime(value: Double): Self = StObject.set(x, "flushingTime", value.asInstanceOf[js.Any])
      
      inline def setFlushingTimeUndefined: Self = StObject.set(x, "flushingTime", js.undefined)
      
      inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      inline def setMode(value: both | audio | video): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNode(value: String | HTMLVideoElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: /* data */ Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    }
  }
}
