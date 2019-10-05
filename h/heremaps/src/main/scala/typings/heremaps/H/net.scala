package typings.heremaps.H

import typings.heremaps.H.net.Request.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** net *****/
@JSGlobal("H.net")
@js.native
object net extends js.Object {
  @js.native
  object Request extends js.Object {
    @js.native
    sealed trait State extends js.Object
    
    @js.native
    object State extends js.Object {
      @js.native
      sealed trait DONE extends State
      
      @js.native
      sealed trait OPENED extends State
      
      @js.native
      sealed trait UNSENT extends State
      
      /* 2 */ val DONE: typings.heremaps.H.net.Request.State.DONE with Double = js.native
      /* 1 */ val OPENED: typings.heremaps.H.net.Request.State.OPENED with Double = js.native
      /* 0 */ val UNSENT: typings.heremaps.H.net.Request.State.UNSENT with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[State with Double] = js.native
    }
    
    // TODO no idea how this interface is set up, investigate
    type Priority = js.Any
  }
  
}

