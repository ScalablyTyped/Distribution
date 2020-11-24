package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IBGPosition extends js.Object
@JSImport("instabug-reactnative", "IBGPosition")
@js.native
object IBGPosition extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IBGPosition with Double] = js.native
  
  @js.native
  sealed trait bottomLeft extends IBGPosition
  /* 2 */ @js.native
  object bottomLeft extends TopLevel[bottomLeft with Double]
  
  @js.native
  sealed trait bottomRight extends IBGPosition
  /* 0 */ @js.native
  object bottomRight extends TopLevel[bottomRight with Double]
  
  @js.native
  sealed trait topLeft extends IBGPosition
  /* 3 */ @js.native
  object topLeft extends TopLevel[topLeft with Double]
  
  @js.native
  sealed trait topRight extends IBGPosition
  /* 1 */ @js.native
  object topRight extends TopLevel[topRight with Double]
}
