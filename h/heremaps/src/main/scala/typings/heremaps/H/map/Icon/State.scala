package typings.heremaps.H.map.Icon

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
  sealed trait ERROR extends State
  
  @js.native
  sealed trait LOADING extends State
  
  @js.native
  sealed trait READY extends State
  
}

