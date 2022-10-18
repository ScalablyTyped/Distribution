package typings.grpcGrpcJs

import typings.grpcGrpcJs.buildSrcChannelzMod.TraceSeverity
import typings.grpcGrpcJs.buildSrcLoadBalancingCallMod.RpcProgress
import typings.grpcGrpcJs.buildSrcServerCallMod.HandlerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grpcGrpcJsStrings {
  
  @js.native
  sealed trait CT_ERROR
    extends StObject
       with TraceSeverity
  inline def CT_ERROR: CT_ERROR = "CT_ERROR".asInstanceOf[CT_ERROR]
  
  @js.native
  sealed trait CT_INFO
    extends StObject
       with TraceSeverity
  inline def CT_INFO: CT_INFO = "CT_INFO".asInstanceOf[CT_INFO]
  
  @js.native
  sealed trait CT_UNKNOWN
    extends StObject
       with TraceSeverity
  inline def CT_UNKNOWN: CT_UNKNOWN = "CT_UNKNOWN".asInstanceOf[CT_UNKNOWN]
  
  @js.native
  sealed trait CT_WARNING
    extends StObject
       with TraceSeverity
  inline def CT_WARNING: CT_WARNING = "CT_WARNING".asInstanceOf[CT_WARNING]
  
  @js.native
  sealed trait DROP
    extends StObject
       with RpcProgress
  inline def DROP: DROP = "DROP".asInstanceOf[DROP]
  
  @js.native
  sealed trait ERROR extends StObject
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait NONE extends StObject
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait NOT_STARTED
    extends StObject
       with RpcProgress
  inline def NOT_STARTED: NOT_STARTED = "NOT_STARTED".asInstanceOf[NOT_STARTED]
  
  @js.native
  sealed trait PROCESSED
    extends StObject
       with RpcProgress
  inline def PROCESSED: PROCESSED = "PROCESSED".asInstanceOf[PROCESSED]
  
  @js.native
  sealed trait REFUSED
    extends StObject
       with RpcProgress
  inline def REFUSED: REFUSED = "REFUSED".asInstanceOf[REFUSED]
  
  @js.native
  sealed trait SUCCESS extends StObject
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait bidi
    extends StObject
       with HandlerType
  inline def bidi: bidi = "bidi".asInstanceOf[bidi]
  
  @js.native
  sealed trait channel extends StObject
  inline def channel: channel = "channel".asInstanceOf[channel]
  
  @js.native
  sealed trait clientStream
    extends StObject
       with HandlerType
  inline def clientStream: clientStream = "clientStream".asInstanceOf[clientStream]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait metadata extends StObject
  inline def metadata: metadata = "metadata".asInstanceOf[metadata]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
  
  @js.native
  sealed trait serverStream
    extends StObject
       with HandlerType
  inline def serverStream: serverStream = "serverStream".asInstanceOf[serverStream]
  
  @js.native
  sealed trait socket extends StObject
  inline def socket: socket = "socket".asInstanceOf[socket]
  
  @js.native
  sealed trait status extends StObject
  inline def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait subchannel extends StObject
  inline def subchannel: subchannel = "subchannel".asInstanceOf[subchannel]
  
  @js.native
  sealed trait unary
    extends StObject
       with HandlerType
  inline def unary: unary = "unary".asInstanceOf[unary]
}
