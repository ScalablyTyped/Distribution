package typings
package heremapsLib.HNs.mapNs.IconNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

/**
  * The state types of an Icon
  */
@JSGlobal("H.map.Icon.State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait ERROR
    extends heremapsLib.HNs.mapNs.IconNs.State
  
  @js.native
  sealed trait LOADING
    extends heremapsLib.HNs.mapNs.IconNs.State
  
  @js.native
  sealed trait READY
    extends heremapsLib.HNs.mapNs.IconNs.State
  
  /* 0 */ val ERROR: ERROR with scala.Double = js.native
  /* 1 */ val LOADING: LOADING with scala.Double = js.native
  /* 2 */ val READY: READY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[heremapsLib.HNs.mapNs.IconNs.State with scala.Double] = js.native
}

