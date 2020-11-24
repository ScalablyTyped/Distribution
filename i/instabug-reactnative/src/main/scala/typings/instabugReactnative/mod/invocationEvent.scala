package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait invocationEvent extends js.Object
@JSImport("instabug-reactnative", "invocationEvent")
@js.native
object invocationEvent extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[invocationEvent with Double] = js.native
  
  @js.native
  sealed trait floatingButton extends invocationEvent
  /* 4 */ @js.native
  object floatingButton extends TopLevel[floatingButton with Double]
  
  @js.native
  sealed trait none extends invocationEvent
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  @js.native
  sealed trait screenshot extends invocationEvent
  /* 2 */ @js.native
  object screenshot extends TopLevel[screenshot with Double]
  
  @js.native
  sealed trait shake extends invocationEvent
  /* 1 */ @js.native
  object shake extends TopLevel[shake with Double]
  
  @js.native
  sealed trait twoFingersSwipe extends invocationEvent
  /* 3 */ @js.native
  object twoFingersSwipe extends TopLevel[twoFingersSwipe with Double]
}
