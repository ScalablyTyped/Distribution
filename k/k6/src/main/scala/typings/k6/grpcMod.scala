package typings.k6

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grpcMod {
  
  /**
    * This module provides a gRPC client for Remote Procedure Calls over HTTP/2.
    * https://k6.io/docs/javascript-api/k6-net-grpc/
    */
  object default {
    
    /**
      * gRPC client to interact with a gRPC server.
      * https://k6.io/docs/javascript-api/k6-net-grpc/client/
      */
    @JSImport("k6/net/grpc", "default.Client")
    @js.native
    open class Client ()
      extends StObject
         with typings.k6.grpcMod.grpc.Client
    
    @JSImport("k6/net/grpc", "default.StatusAborted")
    @js.native
    val StatusAborted: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusAlreadyExists")
    @js.native
    val StatusAlreadyExists: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusCanceled")
    @js.native
    val StatusCanceled: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusDataLoss")
    @js.native
    val StatusDataLoss: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusDeadlineExceeded")
    @js.native
    val StatusDeadlineExceeded: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusFailedPrecondition")
    @js.native
    val StatusFailedPrecondition: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusInternal")
    @js.native
    val StatusInternal: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusInvalidArgument")
    @js.native
    val StatusInvalidArgument: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusNotFound")
    @js.native
    val StatusNotFound: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusOK")
    @js.native
    val StatusOK: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusOutOfRange")
    @js.native
    val StatusOutOfRange: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusPermissionDenied")
    @js.native
    val StatusPermissionDenied: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusResourceExhausted")
    @js.native
    val StatusResourceExhausted: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusUnauthenticated")
    @js.native
    val StatusUnauthenticated: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusUnavailable")
    @js.native
    val StatusUnavailable: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusUnimplemented")
    @js.native
    val StatusUnimplemented: Double = js.native
    
    @JSImport("k6/net/grpc", "default.StatusUnknown")
    @js.native
    val StatusUnknown: Double = js.native
  }
  
  trait ConnectParams extends StObject {
    
    var plaintext: js.UndefOr[Boolean] = js.undefined
    
    var reflect: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[String | Double] = js.undefined
  }
  object ConnectParams {
    
    inline def apply(): ConnectParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectParams]
    }
    
    extension [Self <: ConnectParams](x: Self) {
      
      inline def setPlaintext(value: Boolean): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      inline def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
      
      inline def setReflect(value: Boolean): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
      
      inline def setReflectUndefined: Self = StObject.set(x, "reflect", js.undefined)
      
      inline def setTimeout(value: String | Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
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
    
    extension [Self <: Params](x: Self) {
      
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
    
    extension [Self <: Response](x: Self) {
      
      inline def setError(value: js.Object): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: js.Object): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTrailers(value: js.Object): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This module provides a gRPC client for Remote Procedure Calls over HTTP/2.
    * https://k6.io/docs/javascript-api/k6-net-grpc/
    */
  object grpc {
    
    /**
      * gRPC client to interact with a gRPC server.
      * https://k6.io/docs/javascript-api/k6-net-grpc/client/
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
    }
  }
}
