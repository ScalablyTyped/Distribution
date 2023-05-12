package typings.libp2p

import typings.libp2p.distSrcCircuitRelayTransportReservationStoreMod.RelayType
import typings.libp2p.distSrcConnectionManagerDialQueueMod.PendingDialStatus
import typings.libp2p.distSrcUpgraderMod.ConnectionDeniedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pStrings {
  
  @js.native
  sealed trait Connection extends StObject
  inline def Connection: Connection = "Connection".asInstanceOf[Connection]
  
  @js.native
  sealed trait active
    extends StObject
       with PendingDialStatus
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait configured
    extends StObject
       with RelayType
  inline def configured: configured = "configured".asInstanceOf[configured]
  
  @js.native
  sealed trait denyInboundEncryptedConnection
    extends StObject
       with ConnectionDeniedType
  inline def denyInboundEncryptedConnection: denyInboundEncryptedConnection = "denyInboundEncryptedConnection".asInstanceOf[denyInboundEncryptedConnection]
  
  @js.native
  sealed trait denyInboundUpgradedConnection
    extends StObject
       with ConnectionDeniedType
  inline def denyInboundUpgradedConnection: denyInboundUpgradedConnection = "denyInboundUpgradedConnection".asInstanceOf[denyInboundUpgradedConnection]
  
  @js.native
  sealed trait denyOutboundConnection
    extends StObject
       with ConnectionDeniedType
  inline def denyOutboundConnection: denyOutboundConnection = "denyOutboundConnection".asInstanceOf[denyOutboundConnection]
  
  @js.native
  sealed trait denyOutboundEncryptedConnection
    extends StObject
       with ConnectionDeniedType
  inline def denyOutboundEncryptedConnection: denyOutboundEncryptedConnection = "denyOutboundEncryptedConnection".asInstanceOf[denyOutboundEncryptedConnection]
  
  @js.native
  sealed trait denyOutboundUpgradedConnection
    extends StObject
       with ConnectionDeniedType
  inline def denyOutboundUpgradedConnection: denyOutboundUpgradedConnection = "denyOutboundUpgradedConnection".asInstanceOf[denyOutboundUpgradedConnection]
  
  @js.native
  sealed trait discovered
    extends StObject
       with RelayType
  inline def discovered: discovered = "discovered".asInstanceOf[discovered]
  
  @js.native
  sealed trait error
    extends StObject
       with PendingDialStatus
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait inbound extends StObject
  inline def inbound: inbound = "inbound".asInstanceOf[inbound]
  
  @js.native
  sealed trait outbound extends StObject
  inline def outbound: outbound = "outbound".asInstanceOf[outbound]
  
  @js.native
  sealed trait queued
    extends StObject
       with PendingDialStatus
  inline def queued: queued = "queued".asInstanceOf[queued]
  
  @js.native
  sealed trait success
    extends StObject
       with PendingDialStatus
  inline def success: success = "success".asInstanceOf[success]
}
