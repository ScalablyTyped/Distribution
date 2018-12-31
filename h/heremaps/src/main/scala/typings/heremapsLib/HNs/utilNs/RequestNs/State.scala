package typings
package heremapsLib.HNs.utilNs.RequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

/**
  * The supported states of an request
  */
@JSGlobal("H.util.Request.State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait CANCELLED
    extends heremapsLib.HNs.utilNs.RequestNs.State
  
  @js.native
  sealed trait COMPLETE
    extends heremapsLib.HNs.utilNs.RequestNs.State
  
  @js.native
  sealed trait ERROR
    extends heremapsLib.HNs.utilNs.RequestNs.State
  
  @js.native
  sealed trait PENDING
    extends heremapsLib.HNs.utilNs.RequestNs.State
  
  @js.native
  sealed trait PROCESSING
    extends heremapsLib.HNs.utilNs.RequestNs.State
  
  val CANCELLED: CANCELLED with java.lang.String = js.native
  val COMPLETE: COMPLETE with java.lang.String = js.native
  val ERROR: ERROR with java.lang.String = js.native
  val PENDING: PENDING with java.lang.String = js.native
  val PROCESSING: PROCESSING with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heremapsLib.HNs.utilNs.RequestNs.State with java.lang.String] = js.native
}

