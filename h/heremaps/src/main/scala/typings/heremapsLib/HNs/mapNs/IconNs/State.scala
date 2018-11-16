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
  
  val ERROR: ERROR with java.lang.String = js.native
  val LOADING: LOADING with java.lang.String = js.native
  val READY: READY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heremapsLib.HNs.mapNs.IconNs.State with java.lang.String] = js.native
}

