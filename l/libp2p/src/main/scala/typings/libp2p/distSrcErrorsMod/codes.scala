package typings.libp2p.distSrcErrorsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait codes extends StObject
@JSImport("libp2p/dist/src/errors", "codes")
@js.native
object codes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[codes & String] = js.native
  
  @js.native
  sealed trait CONN_ENCRYPTION_REQUIRED
    extends StObject
       with codes
  /* "ERR_CONN_ENCRYPTION_REQUIRED" */ val CONN_ENCRYPTION_REQUIRED: typings.libp2p.distSrcErrorsMod.codes.CONN_ENCRYPTION_REQUIRED & String = js.native
  
  @js.native
  sealed trait DHT_DISABLED
    extends StObject
       with codes
  /* "ERR_DHT_DISABLED" */ val DHT_DISABLED: typings.libp2p.distSrcErrorsMod.codes.DHT_DISABLED & String = js.native
  
  @js.native
  sealed trait DHT_NOT_STARTED
    extends StObject
       with codes
  /* "ERR_DHT_NOT_STARTED" */ val DHT_NOT_STARTED: typings.libp2p.distSrcErrorsMod.codes.DHT_NOT_STARTED & String = js.native
  
  @js.native
  sealed trait ERR_ALREADY_ABORTED
    extends StObject
       with codes
  /* "ERR_ALREADY_ABORTED" */ val ERR_ALREADY_ABORTED: typings.libp2p.distSrcErrorsMod.codes.ERR_ALREADY_ABORTED & String = js.native
  
  @js.native
  sealed trait ERR_ALREADY_SUCCEEDED
    extends StObject
       with codes
  /* "ERR_ALREADY_SUCCEEDED" */ val ERR_ALREADY_SUCCEEDED: typings.libp2p.distSrcErrorsMod.codes.ERR_ALREADY_SUCCEEDED & String = js.native
  
  @js.native
  sealed trait ERR_CANNOT_READ_KEY
    extends StObject
       with codes
  /* "ERR_CANNOT_READ_KEY" */ val ERR_CANNOT_READ_KEY: typings.libp2p.distSrcErrorsMod.codes.ERR_CANNOT_READ_KEY & String = js.native
  
  @js.native
  sealed trait ERR_CONNECTION_DENIED
    extends StObject
       with codes
  /* "ERR_CONNECTION_DENIED" */ val ERR_CONNECTION_DENIED: typings.libp2p.distSrcErrorsMod.codes.ERR_CONNECTION_DENIED & String = js.native
  
  @js.native
  sealed trait ERR_CONNECTION_ENDED
    extends StObject
       with codes
  /* "ERR_CONNECTION_ENDED" */ val ERR_CONNECTION_ENDED: typings.libp2p.distSrcErrorsMod.codes.ERR_CONNECTION_ENDED & String = js.native
  
  @js.native
  sealed trait ERR_CONNECTION_FAILED
    extends StObject
       with codes
  /* "ERR_CONNECTION_FAILED" */ val ERR_CONNECTION_FAILED: typings.libp2p.distSrcErrorsMod.codes.ERR_CONNECTION_FAILED & String = js.native
  
  @js.native
  sealed trait ERR_CONNECTION_INTERCEPTED
    extends StObject
       with codes
  /* "ERR_CONNECTION_INTERCEPTED" */ val ERR_CONNECTION_INTERCEPTED: typings.libp2p.distSrcErrorsMod.codes.ERR_CONNECTION_INTERCEPTED & String = js.native
  
  @js.native
  sealed trait ERR_CONNECTION_NOT_MULTIPLEXED
    extends StObject
       with codes
  /* "ERR_CONNECTION_NOT_MULTIPLEXED" */ val ERR_CONNECTION_NOT_MULTIPLEXED: typings.libp2p.distSrcErrorsMod.codes.ERR_CONNECTION_NOT_MULTIPLEXED & String = js.native
  
  @js.native
  sealed trait ERR_DIALED_SELF
    extends StObject
       with codes
  /* "ERR_DIALED_SELF" */ val ERR_DIALED_SELF: typings.libp2p.distSrcErrorsMod.codes.ERR_DIALED_SELF & String = js.native
  
  @js.native
  sealed trait ERR_DISCOVERED_SELF
    extends StObject
       with codes
  /* "ERR_DISCOVERED_SELF" */ val ERR_DISCOVERED_SELF: typings.libp2p.distSrcErrorsMod.codes.ERR_DISCOVERED_SELF & String = js.native
  
  @js.native
  sealed trait ERR_DUPLICATE_TRANSPORT
    extends StObject
       with codes
  /* "ERR_DUPLICATE_TRANSPORT" */ val ERR_DUPLICATE_TRANSPORT: typings.libp2p.distSrcErrorsMod.codes.ERR_DUPLICATE_TRANSPORT & String = js.native
  
  @js.native
  sealed trait ERR_ENCRYPTION_FAILED
    extends StObject
       with codes
  /* "ERR_ENCRYPTION_FAILED" */ val ERR_ENCRYPTION_FAILED: typings.libp2p.distSrcErrorsMod.codes.ERR_ENCRYPTION_FAILED & String = js.native
  
  @js.native
  sealed trait ERR_FIND_SELF
    extends StObject
       with codes
  /* "ERR_FIND_SELF" */ val ERR_FIND_SELF: typings.libp2p.distSrcErrorsMod.codes.ERR_FIND_SELF & String = js.native
  
  @js.native
  sealed trait ERR_HOP_REQUEST_FAILED
    extends StObject
       with codes
  /* "ERR_HOP_REQUEST_FAILED" */ val ERR_HOP_REQUEST_FAILED: typings.libp2p.distSrcErrorsMod.codes.ERR_HOP_REQUEST_FAILED & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_CMS
    extends StObject
       with codes
  /* "ERR_INVALID_CMS" */ val ERR_INVALID_CMS: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_CMS & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_KEY
    extends StObject
       with codes
  /* "ERR_INVALID_KEY" */ val ERR_INVALID_KEY: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_KEY & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_KEY_NAME
    extends StObject
       with codes
  /* "ERR_INVALID_KEY_NAME" */ val ERR_INVALID_KEY_NAME: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_KEY_NAME & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_KEY_SIZE
    extends StObject
       with codes
  /* "ERR_INVALID_KEY_SIZE" */ val ERR_INVALID_KEY_SIZE: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_KEY_SIZE & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_KEY_TYPE
    extends StObject
       with codes
  /* "ERR_INVALID_KEY_TYPE" */ val ERR_INVALID_KEY_TYPE: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_KEY_TYPE & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_MESSAGE
    extends StObject
       with codes
  /* "ERR_INVALID_MESSAGE" */ val ERR_INVALID_MESSAGE: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_MESSAGE & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_MULTIADDR
    extends StObject
       with codes
  /* "ERR_INVALID_MULTIADDR" */ val ERR_INVALID_MULTIADDR: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_MULTIADDR & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_NEW_PASS_TYPE
    extends StObject
       with codes
  /* "ERR_INVALID_NEW_PASS_TYPE" */ val ERR_INVALID_NEW_PASS_TYPE: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_NEW_PASS_TYPE & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_OLD_PASS_TYPE
    extends StObject
       with codes
  /* "ERR_INVALID_OLD_PASS_TYPE" */ val ERR_INVALID_OLD_PASS_TYPE: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_OLD_PASS_TYPE & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_PARAMETERS
    extends StObject
       with codes
  /* "ERR_INVALID_PARAMETERS" */ val ERR_INVALID_PARAMETERS: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_PARAMETERS & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_PASS_LENGTH
    extends StObject
       with codes
  /* "ERR_INVALID_PASS_LENGTH" */ val ERR_INVALID_PASS_LENGTH: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_PASS_LENGTH & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_PEER
    extends StObject
       with codes
  /* "ERR_INVALID_PEER" */ val ERR_INVALID_PEER: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_PEER & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_PROTOCOLS_FOR_STREAM
    extends StObject
       with codes
  /* "ERR_INVALID_PROTOCOLS_FOR_STREAM" */ val ERR_INVALID_PROTOCOLS_FOR_STREAM: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_PROTOCOLS_FOR_STREAM & String = js.native
  
  @js.native
  sealed trait ERR_INVALID_RECORD
    extends StObject
       with codes
  /* "ERR_INVALID_RECORD" */ val ERR_INVALID_RECORD: typings.libp2p.distSrcErrorsMod.codes.ERR_INVALID_RECORD & String = js.native
  
  @js.native
  sealed trait ERR_KEYCHAIN_REQUIRED
    extends StObject
       with codes
  /* "ERR_KEYCHAIN_REQUIRED" */ val ERR_KEYCHAIN_REQUIRED: typings.libp2p.distSrcErrorsMod.codes.ERR_KEYCHAIN_REQUIRED & String = js.native
  
  @js.native
  sealed trait ERR_KEY_ALREADY_EXISTS
    extends StObject
       with codes
  /* "ERR_KEY_ALREADY_EXISTS" */ val ERR_KEY_ALREADY_EXISTS: typings.libp2p.distSrcErrorsMod.codes.ERR_KEY_ALREADY_EXISTS & String = js.native
  
  @js.native
  sealed trait ERR_KEY_NOT_FOUND
    extends StObject
       with codes
  /* "ERR_KEY_NOT_FOUND" */ val ERR_KEY_NOT_FOUND: typings.libp2p.distSrcErrorsMod.codes.ERR_KEY_NOT_FOUND & String = js.native
  
  @js.native
  sealed trait ERR_MISSING_KEYS
    extends StObject
       with codes
  /* "ERR_MISSING_KEYS" */ val ERR_MISSING_KEYS: typings.libp2p.distSrcErrorsMod.codes.ERR_MISSING_KEYS & String = js.native
  
  @js.native
  sealed trait ERR_MISSING_PRIVATE_KEY
    extends StObject
       with codes
  /* "ERR_MISSING_PRIVATE_KEY" */ val ERR_MISSING_PRIVATE_KEY: typings.libp2p.distSrcErrorsMod.codes.ERR_MISSING_PRIVATE_KEY & String = js.native
  
  @js.native
  sealed trait ERR_MISSING_PUBLIC_KEY
    extends StObject
       with codes
  /* "ERR_MISSING_PUBLIC_KEY" */ val ERR_MISSING_PUBLIC_KEY: typings.libp2p.distSrcErrorsMod.codes.ERR_MISSING_PUBLIC_KEY & String = js.native
  
  @js.native
  sealed trait ERR_MUXER_UNAVAILABLE
    extends StObject
       with codes
  /* "ERR_MUXER_UNAVAILABLE" */ val ERR_MUXER_UNAVAILABLE: typings.libp2p.distSrcErrorsMod.codes.ERR_MUXER_UNAVAILABLE & String = js.native
  
  @js.native
  sealed trait ERR_NEW_KEY_NAME_INVALID
    extends StObject
       with codes
  /* "ERR_NEW_KEY_NAME_INVALID" */ val ERR_NEW_KEY_NAME_INVALID: typings.libp2p.distSrcErrorsMod.codes.ERR_NEW_KEY_NAME_INVALID & String = js.native
  
  @js.native
  sealed trait ERR_NODE_NOT_STARTED
    extends StObject
       with codes
  /* "ERR_NODE_NOT_STARTED" */ val ERR_NODE_NOT_STARTED: typings.libp2p.distSrcErrorsMod.codes.ERR_NODE_NOT_STARTED & String = js.native
  
  @js.native
  sealed trait ERR_NOT_FOUND
    extends StObject
       with codes
  /* "ERR_NOT_FOUND" */ val ERR_NOT_FOUND: typings.libp2p.distSrcErrorsMod.codes.ERR_NOT_FOUND & String = js.native
  
  @js.native
  sealed trait ERR_NOT_IMPLEMENTED
    extends StObject
       with codes
  /* "ERR_NOT_IMPLEMENTED" */ val ERR_NOT_IMPLEMENTED: typings.libp2p.distSrcErrorsMod.codes.ERR_NOT_IMPLEMENTED & String = js.native
  
  @js.native
  sealed trait ERR_NO_DIAL_TOKENS
    extends StObject
       with codes
  /* "ERR_NO_DIAL_TOKENS" */ val ERR_NO_DIAL_TOKENS: typings.libp2p.distSrcErrorsMod.codes.ERR_NO_DIAL_TOKENS & String = js.native
  
  @js.native
  sealed trait ERR_NO_HANDLER_FOR_PROTOCOL
    extends StObject
       with codes
  /* "ERR_NO_HANDLER_FOR_PROTOCOL" */ val ERR_NO_HANDLER_FOR_PROTOCOL: typings.libp2p.distSrcErrorsMod.codes.ERR_NO_HANDLER_FOR_PROTOCOL & String = js.native
  
  @js.native
  sealed trait ERR_NO_KEY
    extends StObject
       with codes
  /* "ERR_NO_KEY" */ val ERR_NO_KEY: typings.libp2p.distSrcErrorsMod.codes.ERR_NO_KEY & String = js.native
  
  @js.native
  sealed trait ERR_NO_ROUTERS_AVAILABLE
    extends StObject
       with codes
  /* "ERR_NO_ROUTERS_AVAILABLE" */ val ERR_NO_ROUTERS_AVAILABLE: typings.libp2p.distSrcErrorsMod.codes.ERR_NO_ROUTERS_AVAILABLE & String = js.native
  
  @js.native
  sealed trait ERR_NO_VALID_ADDRESSES
    extends StObject
       with codes
  /* "ERR_NO_VALID_ADDRESSES" */ val ERR_NO_VALID_ADDRESSES: typings.libp2p.distSrcErrorsMod.codes.ERR_NO_VALID_ADDRESSES & String = js.native
  
  @js.native
  sealed trait ERR_OLD_KEY_NAME_INVALID
    extends StObject
       with codes
  /* "ERR_OLD_KEY_NAME_INVALID" */ val ERR_OLD_KEY_NAME_INVALID: typings.libp2p.distSrcErrorsMod.codes.ERR_OLD_KEY_NAME_INVALID & String = js.native
  
  @js.native
  sealed trait ERR_PASSWORD_REQUIRED
    extends StObject
       with codes
  /* "ERR_PASSWORD_REQUIRED" */ val ERR_PASSWORD_REQUIRED: typings.libp2p.distSrcErrorsMod.codes.ERR_PASSWORD_REQUIRED & String = js.native
  
  @js.native
  sealed trait ERR_PEER_DIAL_INTERCEPTED
    extends StObject
       with codes
  /* "ERR_PEER_DIAL_INTERCEPTED" */ val ERR_PEER_DIAL_INTERCEPTED: typings.libp2p.distSrcErrorsMod.codes.ERR_PEER_DIAL_INTERCEPTED & String = js.native
  
  @js.native
  sealed trait ERR_PEM_REQUIRED
    extends StObject
       with codes
  /* "ERR_PEM_REQUIRED" */ val ERR_PEM_REQUIRED: typings.libp2p.distSrcErrorsMod.codes.ERR_PEM_REQUIRED & String = js.native
  
  @js.native
  sealed trait ERR_PROTECTOR_REQUIRED
    extends StObject
       with codes
  /* "ERR_PROTECTOR_REQUIRED" */ val ERR_PROTECTOR_REQUIRED: typings.libp2p.distSrcErrorsMod.codes.ERR_PROTECTOR_REQUIRED & String = js.native
  
  @js.native
  sealed trait ERR_PROTOCOL_HANDLER_ALREADY_REGISTERED
    extends StObject
       with codes
  /* "ERR_PROTOCOL_HANDLER_ALREADY_REGISTERED" */ val ERR_PROTOCOL_HANDLER_ALREADY_REGISTERED: typings.libp2p.distSrcErrorsMod.codes.ERR_PROTOCOL_HANDLER_ALREADY_REGISTERED & String = js.native
  
  @js.native
  sealed trait ERR_PUBSUB_DISABLED
    extends StObject
       with codes
  /* "ERR_PUBSUB_DISABLED" */ val ERR_PUBSUB_DISABLED: typings.libp2p.distSrcErrorsMod.codes.ERR_PUBSUB_DISABLED & String = js.native
  
  @js.native
  sealed trait ERR_RELAYED_DIAL
    extends StObject
       with codes
  /* "ERR_RELAYED_DIAL" */ val ERR_RELAYED_DIAL: typings.libp2p.distSrcErrorsMod.codes.ERR_RELAYED_DIAL & String = js.native
  
  @js.native
  sealed trait ERR_SIGNATURE_NOT_VALID
    extends StObject
       with codes
  /* "ERR_SIGNATURE_NOT_VALID" */ val ERR_SIGNATURE_NOT_VALID: typings.libp2p.distSrcErrorsMod.codes.ERR_SIGNATURE_NOT_VALID & String = js.native
  
  @js.native
  sealed trait ERR_TIMEOUT
    extends StObject
       with codes
  /* "ERR_TIMEOUT" */ val ERR_TIMEOUT: typings.libp2p.distSrcErrorsMod.codes.ERR_TIMEOUT & String = js.native
  
  @js.native
  sealed trait ERR_TOO_MANY_ADDRESSES
    extends StObject
       with codes
  /* "ERR_TOO_MANY_ADDRESSES" */ val ERR_TOO_MANY_ADDRESSES: typings.libp2p.distSrcErrorsMod.codes.ERR_TOO_MANY_ADDRESSES & String = js.native
  
  @js.native
  sealed trait ERR_TOO_MANY_INBOUND_PROTOCOL_STREAMS
    extends StObject
       with codes
  /* "ERR_TOO_MANY_INBOUND_PROTOCOL_STREAMS" */ val ERR_TOO_MANY_INBOUND_PROTOCOL_STREAMS: typings.libp2p.distSrcErrorsMod.codes.ERR_TOO_MANY_INBOUND_PROTOCOL_STREAMS & String = js.native
  
  @js.native
  sealed trait ERR_TOO_MANY_OUTBOUND_PROTOCOL_STREAMS
    extends StObject
       with codes
  /* "ERR_TOO_MANY_OUTBOUND_PROTOCOL_STREAMS" */ val ERR_TOO_MANY_OUTBOUND_PROTOCOL_STREAMS: typings.libp2p.distSrcErrorsMod.codes.ERR_TOO_MANY_OUTBOUND_PROTOCOL_STREAMS & String = js.native
  
  @js.native
  sealed trait ERR_TRANSPORTS_REQUIRED
    extends StObject
       with codes
  /* "ERR_TRANSPORTS_REQUIRED" */ val ERR_TRANSPORTS_REQUIRED: typings.libp2p.distSrcErrorsMod.codes.ERR_TRANSPORTS_REQUIRED & String = js.native
  
  @js.native
  sealed trait ERR_TRANSPORT_DIAL_FAILED
    extends StObject
       with codes
  /* "ERR_TRANSPORT_DIAL_FAILED" */ val ERR_TRANSPORT_DIAL_FAILED: typings.libp2p.distSrcErrorsMod.codes.ERR_TRANSPORT_DIAL_FAILED & String = js.native
  
  @js.native
  sealed trait ERR_TRANSPORT_UNAVAILABLE
    extends StObject
       with codes
  /* "ERR_TRANSPORT_UNAVAILABLE" */ val ERR_TRANSPORT_UNAVAILABLE: typings.libp2p.distSrcErrorsMod.codes.ERR_TRANSPORT_UNAVAILABLE & String = js.native
  
  @js.native
  sealed trait ERR_UNSUPPORTED_PROTOCOL
    extends StObject
       with codes
  /* "ERR_UNSUPPORTED_PROTOCOL" */ val ERR_UNSUPPORTED_PROTOCOL: typings.libp2p.distSrcErrorsMod.codes.ERR_UNSUPPORTED_PROTOCOL & String = js.native
  
  @js.native
  sealed trait ERR_WRONG_PING_ACK
    extends StObject
       with codes
  /* "ERR_WRONG_PING_ACK" */ val ERR_WRONG_PING_ACK: typings.libp2p.distSrcErrorsMod.codes.ERR_WRONG_PING_ACK & String = js.native
  
  @js.native
  sealed trait PUBSUB_NOT_STARTED
    extends StObject
       with codes
  /* "ERR_PUBSUB_NOT_STARTED" */ val PUBSUB_NOT_STARTED: typings.libp2p.distSrcErrorsMod.codes.PUBSUB_NOT_STARTED & String = js.native
}
