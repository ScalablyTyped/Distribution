package typings.instabugDashReactnative.instabugDashReactnativeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IBGPosition extends js.Object

@JSImport("instabug-reactnative", "IBGPosition")
@js.native
object IBGPosition extends js.Object {
  @js.native
  sealed trait bottomLeft extends IBGPosition
  
  @js.native
  sealed trait bottomRight extends IBGPosition
  
  @js.native
  sealed trait topLeft extends IBGPosition
  
  @js.native
  sealed trait topRight extends IBGPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IBGPosition with Double] = js.native
  /* 2 */ @js.native
  object bottomLeft extends TopLevel[bottomLeft with Double]
  
  /* 0 */ @js.native
  object bottomRight extends TopLevel[bottomRight with Double]
  
  /* 3 */ @js.native
  object topLeft extends TopLevel[topLeft with Double]
  
  /* 1 */ @js.native
  object topRight extends TopLevel[topRight with Double]
  
}

