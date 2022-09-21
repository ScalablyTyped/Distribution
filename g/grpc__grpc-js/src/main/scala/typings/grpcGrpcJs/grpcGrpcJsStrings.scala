package typings.grpcGrpcJs

import typings.grpcGrpcJs.channelzMod.TraceSeverity
import typings.grpcGrpcJs.serverCallMod.HandlerType
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
  sealed trait ServiceDefinition extends StObject
  inline def ServiceDefinition: ServiceDefinition = "ServiceDefinition".asInstanceOf[ServiceDefinition]
  
  @js.native
  sealed trait bidi
    extends StObject
       with HandlerType
  inline def bidi: bidi = "bidi".asInstanceOf[bidi]
  
  @js.native
  sealed trait channel extends StObject
  inline def channel: channel = "channel".asInstanceOf[channel]
  
  @js.native
  sealed trait channel_ref extends StObject
  inline def channel_ref: channel_ref = "channel_ref".asInstanceOf[channel_ref]
  
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
  sealed trait other extends StObject
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait other_address extends StObject
  inline def other_address: other_address = "other_address".asInstanceOf[other_address]
  
  @js.native
  sealed trait other_name extends StObject
  inline def other_name: other_name = "other_name".asInstanceOf[other_name]
  
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
  sealed trait standard_name extends StObject
  inline def standard_name: standard_name = "standard_name".asInstanceOf[standard_name]
  
  @js.native
  sealed trait status extends StObject
  inline def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait subchannel extends StObject
  inline def subchannel: subchannel = "subchannel".asInstanceOf[subchannel]
  
  @js.native
  sealed trait subchannel_ref extends StObject
  inline def subchannel_ref: subchannel_ref = "subchannel_ref".asInstanceOf[subchannel_ref]
  
  @js.native
  sealed trait tcpip_address extends StObject
  inline def tcpip_address: tcpip_address = "tcpip_address".asInstanceOf[tcpip_address]
  
  @js.native
  sealed trait tls extends StObject
  inline def tls: tls = "tls".asInstanceOf[tls]
  
  @js.native
  sealed trait uds_address extends StObject
  inline def uds_address: uds_address = "uds_address".asInstanceOf[uds_address]
  
  @js.native
  sealed trait unary
    extends StObject
       with HandlerType
  inline def unary: unary = "unary".asInstanceOf[unary]
}
