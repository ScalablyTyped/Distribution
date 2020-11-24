package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait floatingButtonEdge extends js.Object
@JSImport("instabug-reactnative", "floatingButtonEdge")
@js.native
object floatingButtonEdge extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[floatingButtonEdge with Double] = js.native
  
  @js.native
  sealed trait left extends floatingButtonEdge
  /* 0 */ @js.native
  object left extends TopLevel[left with Double]
  
  @js.native
  sealed trait right extends floatingButtonEdge
  /* 1 */ @js.native
  object right extends TopLevel[right with Double]
}
