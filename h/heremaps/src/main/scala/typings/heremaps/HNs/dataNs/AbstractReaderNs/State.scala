package typings.heremaps.HNs.dataNs.AbstractReaderNs

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
  sealed trait ERROR extends State
  
  @js.native
  sealed trait LOADING extends State
  
  @js.native
  sealed trait READY extends State
  
  @js.native
  sealed trait VISIT extends State
  
  /* 0 */ val ERROR: typings.heremaps.HNs.dataNs.AbstractReaderNs.State.ERROR with Double = js.native
  /* 1 */ val LOADING: typings.heremaps.HNs.dataNs.AbstractReaderNs.State.LOADING with Double = js.native
  /* 3 */ val READY: typings.heremaps.HNs.dataNs.AbstractReaderNs.State.READY with Double = js.native
  /* 2 */ val VISIT: typings.heremaps.HNs.dataNs.AbstractReaderNs.State.VISIT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[State with Double] = js.native
}

