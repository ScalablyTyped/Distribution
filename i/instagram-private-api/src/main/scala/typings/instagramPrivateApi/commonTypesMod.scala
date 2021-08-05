package typings.instagramPrivateApi

import typings.caseless.mod.Caseless
import typings.instagramPrivateApi.instagramPrivateApiStrings.close
import typings.node.BufferEncoding
import typings.node.NodeJS.Dict
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.netMod.Socket
import typings.request.anon.Connect
import typings.request.anon.Dns
import typings.request.mod.Request
import typings.request.mod.ResponseAsJSON
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.instagramPrivateApi.instagramPrivateApiStrings.feed_timeline
    - typings.instagramPrivateApi.instagramPrivateApiStrings.newsfeed
    - typings.instagramPrivateApi.instagramPrivateApiStrings.profile
    - typings.instagramPrivateApi.instagramPrivateApiStrings.media_view_profile
    - typings.instagramPrivateApi.instagramPrivateApiStrings.video_view_profile
    - typings.instagramPrivateApi.instagramPrivateApiStrings.photo_view_profile
    - typings.instagramPrivateApi.instagramPrivateApiStrings.followers
    - typings.instagramPrivateApi.instagramPrivateApiStrings.following
    - typings.instagramPrivateApi.instagramPrivateApiStrings.self_followers
    - typings.instagramPrivateApi.instagramPrivateApiStrings.self_following
    - typings.instagramPrivateApi.instagramPrivateApiStrings.comment_likers
    - typings.instagramPrivateApi.instagramPrivateApiStrings.comment_owner
    - typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_post
    - typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_hashtag
    - typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_location
    - typings.instagramPrivateApi.instagramPrivateApiStrings.feed_contextual_newsfeed_multi_media_liked
    - typings.instagramPrivateApi.instagramPrivateApiStrings.likers_likers_media_view_profile
    - typings.instagramPrivateApi.instagramPrivateApiStrings.likers_likers_photo_view_profile
    - typings.instagramPrivateApi.instagramPrivateApiStrings.likers_likers_video_view_profile
    - typings.instagramPrivateApi.instagramPrivateApiStrings.self_likers_self_likers_media_view_profile
    - typings.instagramPrivateApi.instagramPrivateApiStrings.self_likers_self_likers_photo_view_profile
    - typings.instagramPrivateApi.instagramPrivateApiStrings.self_likers_self_likers_video_view_profile
    - typings.instagramPrivateApi.instagramPrivateApiStrings.story_camera_music_overlay_post_capture
    - typings.instagramPrivateApi.instagramPrivateApiStrings.story_camera_music_overlay_pre_capture
    - typings.instagramPrivateApi.instagramPrivateApiStrings.story_viewer_profile
    - typings.instagramPrivateApi.instagramPrivateApiStrings.story_viewer_default
    - typings.instagramPrivateApi.instagramPrivateApiStrings.find_friends_contacts
    - typings.instagramPrivateApi.instagramPrivateApiStrings.explore_people
    - typings.instagramPrivateApi.instagramPrivateApiStrings.igtv_feed_timeline
    - java.lang.String
  */
  type IgAppModule = _IgAppModule | String
  
  /* Inlined std.Pick<request.request.Response, std.Exclude<keyof request.request.Response, 'body'>> & {  body :Body} */
  trait IgResponse[Body] extends StObject {
    
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit
    @JSName("_destroy")
    var _destroy_Original: js.Function2[
        /* error */ Error, 
        /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
        Unit
      ]
    
    def _read(size: Double): Unit
    @JSName("_read")
    var _read_Original: js.Function1[/* size */ Double, Unit]
    
    var aborted: Boolean
    
    @JSName("addListener")
    var addListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type]
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type
    
    var body: Body
    
    var caseless: Caseless
    
    var complete: Boolean
    
    var connection: Socket
    
    @JSName("constructor")
    var constructor_Original: js.Function1[/* socket */ Socket, js.Any]
    
    def destroy(): Unit
    @JSName("destroy")
    var destroy_Original: js.Function0[Unit]
    
    var destroyed: Boolean
    
    var elapsedTime: js.UndefOr[Double] = js.undefined
    
    @JSName("emit")
    var emit_Original: js.Function1[close, Boolean]
    @JSName("emit")
    def emit_close(event: close): Boolean
    
    def eventNames(): js.Array[String | js.Symbol]
    @JSName("eventNames")
    var eventNames_Original: js.Function0[js.Array[String | js.Symbol]]
    
    def getMaxListeners(): Double
    @JSName("getMaxListeners")
    var getMaxListeners_Original: js.Function0[Double]
    
    var headers: IncomingHttpHeaders
    
    var httpVersion: String
    
    var httpVersionMajor: Double
    
    var httpVersionMinor: Double
    
    def isPaused(): Boolean
    @JSName("isPaused")
    var isPaused_Original: js.Function0[Boolean]
    
    def listenerCount(event: String): Double
    @JSName("listenerCount")
    var listenerCount_Original: js.Function1[/* event */ String, Double]
    
    def listeners(event: String): js.Array[js.Function]
    @JSName("listeners")
    var listeners_Original: js.Function1[/* event */ String, js.Array[js.Function]]
    
    var method: js.UndefOr[String] = js.undefined
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type
    @JSName("off")
    var off_Original: js.Function2[
        /* event */ String, 
        /* listener */ js.Function1[/* repeated */ js.Any, Unit], 
        this.type
      ]
    
    @JSName("on")
    var on_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type]
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type
    
    @JSName("once")
    var once_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type]
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type
    
    def pause(): this.type
    @JSName("pause")
    var pause_Original: js.Function0[this.type]
    
    def pipe[T /* <: WritableStream */](destination: T): T
    @JSName("pipe")
    var pipe_Original: js.Function1[/* destination */ WritableStream, WritableStream]
    
    @JSName("prependListener")
    var prependListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type]
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type
    
    @JSName("prependOnceListener")
    var prependOnceListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type]
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type
    
    def push(chunk: js.Any): Boolean
    @JSName("push")
    var push_Original: js.Function1[/* chunk */ js.Any, Boolean]
    
    var rawHeaders: js.Array[String]
    
    def rawListeners(event: String): js.Array[js.Function]
    @JSName("rawListeners")
    var rawListeners_Original: js.Function1[/* event */ String, js.Array[js.Function]]
    
    var rawTrailers: js.Array[String]
    
    def read(): js.Any
    @JSName("read")
    var read_Original: js.Function0[js.Any]
    
    var readable: Boolean
    
    var readableEncoding: js.UndefOr[BufferEncoding | Null] = js.undefined
    
    var readableEnded: Boolean
    
    var readableFlowing: js.UndefOr[Boolean | Null] = js.undefined
    
    var readableHighWaterMark: Double
    
    var readableLength: Double
    
    var readableObjectMode: Boolean
    
    def removeAllListeners(): this.type
    @JSName("removeAllListeners")
    var removeAllListeners_Original: js.Function0[this.type]
    
    @JSName("removeListener")
    var removeListener_Original: js.Function2[close, /* listener */ js.Function0[Unit], this.type]
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type
    
    var request: Request
    
    def resume(): this.type
    @JSName("resume")
    var resume_Original: js.Function0[this.type]
    
    def setEncoding(encoding: BufferEncoding): this.type
    @JSName("setEncoding")
    var setEncoding_Original: js.Function1[/* encoding */ BufferEncoding, this.type]
    
    def setMaxListeners(n: Double): this.type
    @JSName("setMaxListeners")
    var setMaxListeners_Original: js.Function1[/* n */ Double, this.type]
    
    def setTimeout(msecs: Double): this.type
    @JSName("setTimeout")
    var setTimeout_Original: js.Function1[/* msecs */ Double, this.type]
    
    var socket: Socket
    
    var statusCode: Double
    
    var statusMessage: String
    
    var timingPhases: js.UndefOr[Dns] = js.undefined
    
    var timingStart: js.UndefOr[Double] = js.undefined
    
    var timings: js.UndefOr[Connect] = js.undefined
    
    def toJSON(): ResponseAsJSON
    @JSName("toJSON")
    var toJSON_Original: js.Function0[ResponseAsJSON]
    
    var trailers: Dict[String]
    
    def unpipe(): this.type
    @JSName("unpipe")
    var unpipe_Original: js.Function0[this.type]
    
    def unshift(chunk: js.Any): Unit
    @JSName("unshift")
    var unshift_Original: js.Function1[/* chunk */ js.Any, Unit]
    
    var url: js.UndefOr[String] = js.undefined
    
    def wrap(oldStream: ReadableStream): this.type
    @JSName("wrap")
    var wrap_Original: js.Function1[/* oldStream */ ReadableStream, this.type]
  }
  object IgResponse {
    
    inline def apply[Body](
      _destroy: (/* error */ Error, /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) => Unit,
      _read: /* size */ Double => Unit,
      aborted: Boolean,
      addListener: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body],
      body: Body,
      caseless: Caseless,
      complete: Boolean,
      connection: Socket,
      constructor: /* socket */ Socket => js.Any,
      destroy: () => Unit,
      destroyed: Boolean,
      emit: close => Boolean,
      eventNames: () => js.Array[String | js.Symbol],
      getMaxListeners: () => Double,
      headers: IncomingHttpHeaders,
      httpVersion: String,
      httpVersionMajor: Double,
      httpVersionMinor: Double,
      isPaused: () => Boolean,
      listenerCount: /* event */ String => Double,
      listeners: /* event */ String => js.Array[js.Function],
      off: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => IgResponse[Body],
      on: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body],
      once: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body],
      pause: () => IgResponse[Body],
      pipe: /* destination */ WritableStream => WritableStream,
      prependListener: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body],
      prependOnceListener: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body],
      push: /* chunk */ js.Any => Boolean,
      rawHeaders: js.Array[String],
      rawListeners: /* event */ String => js.Array[js.Function],
      rawTrailers: js.Array[String],
      read: () => js.Any,
      readable: Boolean,
      readableEnded: Boolean,
      readableHighWaterMark: Double,
      readableLength: Double,
      readableObjectMode: Boolean,
      removeAllListeners: () => IgResponse[Body],
      removeListener: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body],
      request: Request,
      resume: () => IgResponse[Body],
      setEncoding: /* encoding */ BufferEncoding => IgResponse[Body],
      setMaxListeners: /* n */ Double => IgResponse[Body],
      setTimeout: /* msecs */ Double => IgResponse[Body],
      socket: Socket,
      statusCode: Double,
      statusMessage: String,
      toJSON: () => ResponseAsJSON,
      trailers: Dict[String],
      unpipe: () => IgResponse[Body],
      unshift: /* chunk */ js.Any => Unit,
      wrap: /* oldStream */ ReadableStream => IgResponse[Body]
    ): IgResponse[Body] = {
      val __obj = js.Dynamic.literal(_destroy = js.Any.fromFunction2(_destroy), _read = js.Any.fromFunction1(_read), aborted = aborted.asInstanceOf[js.Any], addListener = js.Any.fromFunction2(addListener), body = body.asInstanceOf[js.Any], caseless = caseless.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], constructor = js.Any.fromFunction1(constructor), destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], emit = js.Any.fromFunction1(emit), eventNames = js.Any.fromFunction0(eventNames), getMaxListeners = js.Any.fromFunction0(getMaxListeners), headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], httpVersionMajor = httpVersionMajor.asInstanceOf[js.Any], httpVersionMinor = httpVersionMinor.asInstanceOf[js.Any], isPaused = js.Any.fromFunction0(isPaused), listenerCount = js.Any.fromFunction1(listenerCount), listeners = js.Any.fromFunction1(listeners), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), pause = js.Any.fromFunction0(pause), pipe = js.Any.fromFunction1(pipe), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener), push = js.Any.fromFunction1(push), rawHeaders = rawHeaders.asInstanceOf[js.Any], rawListeners = js.Any.fromFunction1(rawListeners), rawTrailers = rawTrailers.asInstanceOf[js.Any], read = js.Any.fromFunction0(read), readable = readable.asInstanceOf[js.Any], readableEnded = readableEnded.asInstanceOf[js.Any], readableHighWaterMark = readableHighWaterMark.asInstanceOf[js.Any], readableLength = readableLength.asInstanceOf[js.Any], readableObjectMode = readableObjectMode.asInstanceOf[js.Any], removeAllListeners = js.Any.fromFunction0(removeAllListeners), removeListener = js.Any.fromFunction2(removeListener), request = request.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), setEncoding = js.Any.fromFunction1(setEncoding), setMaxListeners = js.Any.fromFunction1(setMaxListeners), setTimeout = js.Any.fromFunction1(setTimeout), socket = socket.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trailers = trailers.asInstanceOf[js.Any], unpipe = js.Any.fromFunction0(unpipe), unshift = js.Any.fromFunction1(unshift), wrap = js.Any.fromFunction1(wrap))
      __obj.asInstanceOf[IgResponse[Body]]
    }
    
    extension [Self <: IgResponse[?], Body](x: Self & IgResponse[Body]) {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setAddListener(value: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body]): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCaseless(value: Caseless): Self = StObject.set(x, "caseless", value.asInstanceOf[js.Any])
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Socket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConstructor(value: /* socket */ Socket => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
      
      inline def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
      
      inline def setEmit(value: close => Boolean): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      inline def setEventNames(value: () => js.Array[String | js.Symbol]): Self = StObject.set(x, "eventNames", js.Any.fromFunction0(value))
      
      inline def setGetMaxListeners(value: () => Double): Self = StObject.set(x, "getMaxListeners", js.Any.fromFunction0(value))
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      inline def setHttpVersionMajor(value: Double): Self = StObject.set(x, "httpVersionMajor", value.asInstanceOf[js.Any])
      
      inline def setHttpVersionMinor(value: Double): Self = StObject.set(x, "httpVersionMinor", value.asInstanceOf[js.Any])
      
      inline def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
      
      inline def setListenerCount(value: /* event */ String => Double): Self = StObject.set(x, "listenerCount", js.Any.fromFunction1(value))
      
      inline def setListeners(value: /* event */ String => js.Array[js.Function]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOff(
        value: (/* event */ String, /* listener */ js.Function1[/* repeated */ js.Any, Unit]) => IgResponse[Body]
      ): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(value: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(value: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body]): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
      
      inline def setPause(value: () => IgResponse[Body]): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPipe(value: /* destination */ WritableStream => WritableStream): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
      
      inline def setPrependListener(value: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body]): Self = StObject.set(x, "prependListener", js.Any.fromFunction2(value))
      
      inline def setPrependOnceListener(value: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body]): Self = StObject.set(x, "prependOnceListener", js.Any.fromFunction2(value))
      
      inline def setPush(value: /* chunk */ js.Any => Boolean): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setRawHeaders(value: js.Array[String]): Self = StObject.set(x, "rawHeaders", value.asInstanceOf[js.Any])
      
      inline def setRawHeadersVarargs(value: String*): Self = StObject.set(x, "rawHeaders", js.Array(value :_*))
      
      inline def setRawListeners(value: /* event */ String => js.Array[js.Function]): Self = StObject.set(x, "rawListeners", js.Any.fromFunction1(value))
      
      inline def setRawTrailers(value: js.Array[String]): Self = StObject.set(x, "rawTrailers", value.asInstanceOf[js.Any])
      
      inline def setRawTrailersVarargs(value: String*): Self = StObject.set(x, "rawTrailers", js.Array(value :_*))
      
      inline def setRead(value: () => js.Any): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setReadableEncoding(value: BufferEncoding): Self = StObject.set(x, "readableEncoding", value.asInstanceOf[js.Any])
      
      inline def setReadableEncodingNull: Self = StObject.set(x, "readableEncoding", null)
      
      inline def setReadableEncodingUndefined: Self = StObject.set(x, "readableEncoding", js.undefined)
      
      inline def setReadableEnded(value: Boolean): Self = StObject.set(x, "readableEnded", value.asInstanceOf[js.Any])
      
      inline def setReadableFlowing(value: Boolean): Self = StObject.set(x, "readableFlowing", value.asInstanceOf[js.Any])
      
      inline def setReadableFlowingNull: Self = StObject.set(x, "readableFlowing", null)
      
      inline def setReadableFlowingUndefined: Self = StObject.set(x, "readableFlowing", js.undefined)
      
      inline def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
      
      inline def setReadableLength(value: Double): Self = StObject.set(x, "readableLength", value.asInstanceOf[js.Any])
      
      inline def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      inline def setRemoveAllListeners(value: () => IgResponse[Body]): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction0(value))
      
      inline def setRemoveListener(value: (close, /* listener */ js.Function0[Unit]) => IgResponse[Body]): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResume(value: () => IgResponse[Body]): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setSetEncoding(value: /* encoding */ BufferEncoding => IgResponse[Body]): Self = StObject.set(x, "setEncoding", js.Any.fromFunction1(value))
      
      inline def setSetMaxListeners(value: /* n */ Double => IgResponse[Body]): Self = StObject.set(x, "setMaxListeners", js.Any.fromFunction1(value))
      
      inline def setSetTimeout(value: /* msecs */ Double => IgResponse[Body]): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1(value))
      
      inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setTimingPhases(value: Dns): Self = StObject.set(x, "timingPhases", value.asInstanceOf[js.Any])
      
      inline def setTimingPhasesUndefined: Self = StObject.set(x, "timingPhases", js.undefined)
      
      inline def setTimingStart(value: Double): Self = StObject.set(x, "timingStart", value.asInstanceOf[js.Any])
      
      inline def setTimingStartUndefined: Self = StObject.set(x, "timingStart", js.undefined)
      
      inline def setTimings(value: Connect): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
      
      inline def setTimingsUndefined: Self = StObject.set(x, "timings", js.undefined)
      
      inline def setToJSON(value: () => ResponseAsJSON): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setTrailers(value: Dict[String]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
      
      inline def setUnpipe(value: () => IgResponse[Body]): Self = StObject.set(x, "unpipe", js.Any.fromFunction0(value))
      
      inline def setUnshift(value: /* chunk */ js.Any => Unit): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWrap(value: /* oldStream */ ReadableStream => IgResponse[Body]): Self = StObject.set(x, "wrap", js.Any.fromFunction1(value))
      
      inline def set_destroy(
        value: (/* error */ Error, /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "_destroy", js.Any.fromFunction2(value))
      
      inline def set_read(value: /* size */ Double => Unit): Self = StObject.set(x, "_read", js.Any.fromFunction1(value))
    }
  }
  
  trait _IgAppModule extends StObject
}
