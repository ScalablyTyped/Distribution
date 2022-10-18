package typings.lightship

import typings.lightship.distSrcTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightshipStrings {
  
  @js.native
  sealed trait SERVER_IS_NOT_READY
    extends StObject
       with State
  inline def SERVER_IS_NOT_READY: SERVER_IS_NOT_READY = "SERVER_IS_NOT_READY".asInstanceOf[SERVER_IS_NOT_READY]
  
  @js.native
  sealed trait SERVER_IS_NOT_SHUTTING_DOWN
    extends StObject
       with State
  inline def SERVER_IS_NOT_SHUTTING_DOWN: SERVER_IS_NOT_SHUTTING_DOWN = "SERVER_IS_NOT_SHUTTING_DOWN".asInstanceOf[SERVER_IS_NOT_SHUTTING_DOWN]
  
  @js.native
  sealed trait SERVER_IS_READY
    extends StObject
       with State
  inline def SERVER_IS_READY: SERVER_IS_READY = "SERVER_IS_READY".asInstanceOf[SERVER_IS_READY]
  
  @js.native
  sealed trait SERVER_IS_SHUTTING_DOWN
    extends StObject
       with State
  inline def SERVER_IS_SHUTTING_DOWN: SERVER_IS_SHUTTING_DOWN = "SERVER_IS_SHUTTING_DOWN".asInstanceOf[SERVER_IS_SHUTTING_DOWN]
}
