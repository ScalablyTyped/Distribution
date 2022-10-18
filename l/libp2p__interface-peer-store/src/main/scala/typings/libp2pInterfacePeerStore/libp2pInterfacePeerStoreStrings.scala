package typings.libp2pInterfacePeerStore

import typings.libp2pInterfacePeerStore.mod.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pInterfacePeerStoreStrings {
  
  @js.native
  sealed trait changeColonmetadata
    extends StObject
       with EventName
  inline def changeColonmetadata: changeColonmetadata = "change:metadata".asInstanceOf[changeColonmetadata]
  
  @js.native
  sealed trait changeColonmultiaddrs
    extends StObject
       with EventName
  inline def changeColonmultiaddrs: changeColonmultiaddrs = "change:multiaddrs".asInstanceOf[changeColonmultiaddrs]
  
  @js.native
  sealed trait changeColonprotocols
    extends StObject
       with EventName
  inline def changeColonprotocols: changeColonprotocols = "change:protocols".asInstanceOf[changeColonprotocols]
  
  @js.native
  sealed trait changeColonpubkey
    extends StObject
       with EventName
  inline def changeColonpubkey: changeColonpubkey = "change:pubkey".asInstanceOf[changeColonpubkey]
  
  @js.native
  sealed trait peer
    extends StObject
       with EventName
  inline def peer: peer = "peer".asInstanceOf[peer]
}
