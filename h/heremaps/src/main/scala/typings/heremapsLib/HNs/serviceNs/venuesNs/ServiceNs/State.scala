package typings
package heremapsLib.HNs.serviceNs.venuesNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

/**
  * The state types of the H.service.venues.Service. Possible states are:
  */
@JSGlobal("H.service.venues.Service.State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait ERROR
    extends heremapsLib.HNs.serviceNs.venuesNs.ServiceNs.State
  
  @js.native
  sealed trait INIT
    extends heremapsLib.HNs.serviceNs.venuesNs.ServiceNs.State
  
  @js.native
  sealed trait READY
    extends heremapsLib.HNs.serviceNs.venuesNs.ServiceNs.State
  
  val ERROR: ERROR with java.lang.String = js.native
  val INIT: INIT with java.lang.String = js.native
  val READY: READY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heremapsLib.HNs.serviceNs.venuesNs.ServiceNs.State with java.lang.String] = js.native
}

