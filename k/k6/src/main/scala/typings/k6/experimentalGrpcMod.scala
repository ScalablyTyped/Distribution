package typings.k6

import typings.k6.experimentalGrpcMod.grpc.StreamEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object experimentalGrpcMod {
  
  /**
    * This module provides classes for Remote Procedure Calls over HTTP/2.
    * https://k6.io/docs/javascript-api/k6-experimental/grpc/
    */
  object default {
    
    /**
      * gRPC client to interact with a gRPC server.
      * https://k6.io/docs/javascript-api/k6-experimental/grpc/client/
      */
    @JSImport("k6/experimental/grpc", "default.Client")
    @js.native
    open class Client ()
      extends StObject
         with typings.k6.experimentalGrpcMod.grpc.Client
    
    @JSImport("k6/experimental/grpc", "default.StatusAborted")
    @js.native
    val StatusAborted: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusAlreadyExists")
    @js.native
    val StatusAlreadyExists: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusCanceled")
    @js.native
    val StatusCanceled: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusDataLoss")
    @js.native
    val StatusDataLoss: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusDeadlineExceeded")
    @js.native
    val StatusDeadlineExceeded: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusFailedPrecondition")
    @js.native
    val StatusFailedPrecondition: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusInternal")
    @js.native
    val StatusInternal: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusInvalidArgument")
    @js.native
    val StatusInvalidArgument: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusNotFound")
    @js.native
    val StatusNotFound: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusOK")
    @js.native
    val StatusOK: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusOutOfRange")
    @js.native
    val StatusOutOfRange: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusPermissionDenied")
    @js.native
    val StatusPermissionDenied: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusResourceExhausted")
    @js.native
    val StatusResourceExhausted: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusUnauthenticated")
    @js.native
    val StatusUnauthenticated: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusUnavailable")
    @js.native
    val StatusUnavailable: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusUnimplemented")
    @js.native
    val StatusUnimplemented: Double = js.native
    
    @JSImport("k6/experimental/grpc", "default.StatusUnknown")
    @js.native
    val StatusUnknown: Double = js.native
    
    /**
      * Stream allows you to use streaming RPCs.
      */
    @JSImport("k6/experimental/grpc", "default.Stream")
    @js.native
    open class Stream protected ()
      extends StObject
         with typings.k6.experimentalGrpcMod.grpc.Stream {
      /**
        * The gRPC stream constructor, representing a single gRPC stream.
        *
        * @param client - the gRPC client to use, it must be connected.
        * @param url - the RPC method to call.
        * @param params - the parameters to use for the RPC call.
        */
      def this(client: typings.k6.experimentalGrpcMod.grpc.Client, url: String) = this()
      def this(client: typings.k6.experimentalGrpcMod.grpc.Client, url: String, params: Params) = this()
      
      /**
        * Signals to the server that the client has finished sending messages.
        */
      /* CompleteClass */
      override def end(): Unit = js.native
      
      /**
        * Set up handler functions for various events on the gRPC stream.
        *
        * @param event - the event to listen for
        * @param listener - the callback to invoke when the event is emitted
        */
      /* CompleteClass */
      override def on(event: StreamEvent, listener: js.Function1[/* data */ js.UndefOr[js.Object | GrpcError], Unit]): Unit = js.native
      
      /**
        * Writes a request to the stream.
        *
        * @param request - the request (message) to send to the server
        */
      /* CompleteClass */
      override def write(request: js.Object): Unit = js.native
    }
    
    /**
      * StreamEvent describes the possible events that can be emitted
      * by a gRPC stream.
      */
    @JSImport("k6/experimental/grpc", "default.StreamEvent")
    @js.native
    object StreamEvent extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.k6.experimentalGrpcMod.grpc.StreamEvent & String] = js.native
      
      /* "data" */ val Data: typings.k6.experimentalGrpcMod.grpc.StreamEvent.Data & String = js.native
      
      /* "end" */ val End: typings.k6.experimentalGrpcMod.grpc.StreamEvent.End & String = js.native
      
      /* "error" */ val Error: typings.k6.experimentalGrpcMod.grpc.StreamEvent.Error & String = js.native
    }
  }
  
  /**
    * This module provides classes for Remote Procedure Calls over HTTP/2.
    * https://k6.io/docs/javascript-api/k6-experimental/grpc/
    */
  object grpc {
    
    @js.native
    sealed trait StreamEvent extends StObject
    /**
      * StreamEvent describes the possible events that can be emitted
      * by a gRPC stream.
      */
    @JSImport("k6/experimental/grpc", "grpc.StreamEvent")
    @js.native
    object StreamEvent extends StObject {
      
      /**
        * Event fired when data has been received from the server.
        */
      @js.native
      sealed trait Data
        extends StObject
           with StreamEvent
      
      /**
        * Event fired when the stream closes.
        */
      @js.native
      sealed trait End
        extends StObject
           with StreamEvent
      
      /**
        * Event fired when a stream has been closed due to an error.
        */
      @js.native
      sealed trait Error
        extends StObject
           with StreamEvent
    }
    
    /**
      * gRPC client to interact with a gRPC server.
      * https://k6.io/docs/javascript-api/k6-experimental/grpc/client/
      */
    @js.native
    trait Client extends StObject {
      
      /** Close the connection. */
      def close(): Unit = js.native
      
      /** Opens a connection to a gRPC server. */
      def connect(address: String): Unit = js.native
      def connect(address: String, params: ConnectParams): Unit = js.native
      
      /** Invokes an unary RPC request. */
      def invoke(url: String, request: js.Object): Response = js.native
      def invoke(url: String, request: js.Object, params: Params): Response = js.native
      
      /** Loads and parses the protocol buffer descriptors. */
      def load(importPaths: js.Array[String], protoFiles: String*): Unit = js.native
      
      /** Loads a protoset and parses the protocol buffer descriptors */
      def loadProtoset(protosetPath: String): Unit = js.native
    }
    
    /**
      * Stream allows you to use streaming RPCs.
      */
    trait Stream extends StObject {
      
      /**
        * Signals to the server that the client has finished sending messages.
        */
      def end(): Unit
      
      /**
        * Set up handler functions for various events on the gRPC stream.
        *
        * @param event - the event to listen for
        * @param listener - the callback to invoke when the event is emitted
        */
      def on(event: StreamEvent, listener: js.Function1[/* data */ js.UndefOr[js.Object | GrpcError], Unit]): Unit
      
      /**
        * Writes a request to the stream.
        *
        * @param request - the request (message) to send to the server
        */
      def write(request: js.Object): Unit
    }
    object Stream {
      
      inline def apply(
        end: () => Unit,
        on: (StreamEvent, js.Function1[/* data */ js.UndefOr[js.Object | GrpcError], Unit]) => Unit,
        write: js.Object => Unit
      ): Stream = {
        val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), on = js.Any.fromFunction2(on), write = js.Any.fromFunction1(write))
        __obj.asInstanceOf[Stream]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
        
        inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
        
        inline def setOn(value: (StreamEvent, js.Function1[/* data */ js.UndefOr[js.Object | GrpcError], Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
        
        inline def setWrite(value: js.Object => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      }
    }
  }
  
  trait ConnectParams extends StObject {
    
    var maxReceiveSize: js.UndefOr[Double] = js.undefined
    
    var maxSendSize: js.UndefOr[Double] = js.undefined
    
    var plaintext: js.UndefOr[Boolean] = js.undefined
    
    var reflect: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[String | Double] = js.undefined
  }
  object ConnectParams {
    
    inline def apply(): ConnectParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectParams] (val x: Self) extends AnyVal {
      
      inline def setMaxReceiveSize(value: Double): Self = StObject.set(x, "maxReceiveSize", value.asInstanceOf[js.Any])
      
      inline def setMaxReceiveSizeUndefined: Self = StObject.set(x, "maxReceiveSize", js.undefined)
      
      inline def setMaxSendSize(value: Double): Self = StObject.set(x, "maxSendSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSendSizeUndefined: Self = StObject.set(x, "maxSendSize", js.undefined)
      
      inline def setPlaintext(value: Boolean): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      inline def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
      
      inline def setReflect(value: Boolean): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
      
      inline def setReflectUndefined: Self = StObject.set(x, "reflect", js.undefined)
      
      inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait GrpcError extends StObject {
    
    var code: Double
    
    var details: js.Array[js.Object | String]
    
    var message: String
  }
  object GrpcError {
    
    inline def apply(code: Double, details: js.Array[js.Object | String], message: String): GrpcError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[GrpcError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrpcError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: js.Array[js.Object | String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsVarargs(value: (js.Object | String)*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params extends StObject {
    
    /**
      * @deprecated Use metadata instead.
      */
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var metadata: js.UndefOr[js.Object] = js.undefined
    
    var tags: js.UndefOr[js.Object] = js.undefined
    
    var timeout: js.UndefOr[String | Double] = js.undefined
  }
  object Params {
    
    inline def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMetadata(value: js.Object): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setTags(value: js.Object): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Response extends StObject {
    
    var error: js.Object
    
    var headers: js.Object
    
    var message: js.Object
    
    var status: Double
    
    var trailers: js.Object
  }
  object Response {
    
    inline def apply(error: js.Object, headers: js.Object, message: js.Object, status: Double, trailers: js.Object): Response = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Object): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: js.Object): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTrailers(value: js.Object): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
    }
  }
}
