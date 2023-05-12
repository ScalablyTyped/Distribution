package typings.libp2pInterfaceConnectionManager

import typings.libp2pInterfaceConnectionManager.mod.PendingDialStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libp2pInterfaceConnectionManagerStrings {
  
  @js.native
  sealed trait active
    extends StObject
       with PendingDialStatus
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait error
    extends StObject
       with PendingDialStatus
  inline def error: error = "error".asInstanceOf[error]
  
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
