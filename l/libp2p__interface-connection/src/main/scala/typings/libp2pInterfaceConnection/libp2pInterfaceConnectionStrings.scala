package typings.libp2pInterfaceConnection

import typings.libp2pInterfaceConnection.mod.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pInterfaceConnectionStrings {
  
  @js.native
  sealed trait CLOSED extends StObject
  inline def CLOSED: CLOSED = "CLOSED".asInstanceOf[CLOSED]
  
  @js.native
  sealed trait CLOSING extends StObject
  inline def CLOSING: CLOSING = "CLOSING".asInstanceOf[CLOSING]
  
  @js.native
  sealed trait OPEN extends StObject
  inline def OPEN: OPEN = "OPEN".asInstanceOf[OPEN]
  
  @js.native
  sealed trait inbound
    extends StObject
       with Direction
  inline def inbound: inbound = "inbound".asInstanceOf[inbound]
  
  @js.native
  sealed trait outbound
    extends StObject
       with Direction
  inline def outbound: outbound = "outbound".asInstanceOf[outbound]
}
