package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait floatingButtonEdge extends js.Object

@JSImport("instabug-reactnative", "floatingButtonEdge")
@js.native
object floatingButtonEdge extends js.Object {
  @js.native
  sealed trait left extends floatingButtonEdge
  
  @js.native
  sealed trait right extends floatingButtonEdge
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[floatingButtonEdge with Double] = js.native
  /* 0 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 1 */ @js.native
  object right extends TopLevel[right with Double]
  
}

