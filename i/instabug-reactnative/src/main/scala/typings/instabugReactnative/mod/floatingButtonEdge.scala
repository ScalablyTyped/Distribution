package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait floatingButtonEdge extends StObject
@JSImport("instabug-reactnative", "floatingButtonEdge")
@js.native
object floatingButtonEdge extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[floatingButtonEdge with Double] = js.native
  
  @js.native
  sealed trait left extends floatingButtonEdge
  /* 0 */ val left: typings.instabugReactnative.mod.floatingButtonEdge.left with Double = js.native
  
  @js.native
  sealed trait right extends floatingButtonEdge
  /* 1 */ val right: typings.instabugReactnative.mod.floatingButtonEdge.right with Double = js.native
}
