package typings
package heremapsLib.HNs.dataNs.AbstractReaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

/**
  * The state types of an Reader. Possible states are:
  */
@JSGlobal("H.data.AbstractReader.State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait ERROR
    extends heremapsLib.HNs.dataNs.AbstractReaderNs.State
  
  @js.native
  sealed trait LOADING
    extends heremapsLib.HNs.dataNs.AbstractReaderNs.State
  
  @js.native
  sealed trait READY
    extends heremapsLib.HNs.dataNs.AbstractReaderNs.State
  
  @js.native
  sealed trait VISIT
    extends heremapsLib.HNs.dataNs.AbstractReaderNs.State
  
  val ERROR: ERROR with java.lang.String = js.native
  val LOADING: LOADING with java.lang.String = js.native
  val READY: READY with java.lang.String = js.native
  val VISIT: VISIT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[heremapsLib.HNs.dataNs.AbstractReaderNs.State with java.lang.String] = js.native
}

