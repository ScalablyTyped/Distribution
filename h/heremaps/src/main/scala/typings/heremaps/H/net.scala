package typings.heremaps.H

import org.scalablytyped.runtime.TopLevel
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
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[State with Double] = js.native
      /* 2 */ @js.native
      object DONE extends TopLevel[DONE with Double]
      
      /* 1 */ @js.native
      object OPENED extends TopLevel[OPENED with Double]
      
      /* 0 */ @js.native
      object UNSENT extends TopLevel[UNSENT with Double]
      
    }
    
    // TODO no idea how this interface is set up, investigate
    type Priority = js.Any
  }
  
}

