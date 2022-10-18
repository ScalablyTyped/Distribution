package typings.jssip.libUAMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UAStatus extends StObject
@JSImport("jssip/lib/UA", "UAStatus")
@js.native
object UAStatus extends StObject {
  
  // UA error codes.
  @js.native
  sealed trait CONFIGURATION_ERROR
    extends StObject
       with UAStatus
  
  @js.native
  sealed trait NETWORK_ERROR
    extends StObject
       with UAStatus
  
  // UA status codes.
  @js.native
  sealed trait STATUS_INIT
    extends StObject
       with UAStatus
  
  @js.native
  sealed trait STATUS_NOT_READY
    extends StObject
       with UAStatus
  
  @js.native
  sealed trait STATUS_READY
    extends StObject
       with UAStatus
  
  @js.native
  sealed trait STATUS_USER_CLOSED
    extends StObject
       with UAStatus
}
