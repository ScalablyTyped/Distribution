package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait invocationEvent extends StObject
@JSImport("instabug-reactnative", "invocationEvent")
@js.native
object invocationEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[invocationEvent with Double] = js.native
  
  @js.native
  sealed trait floatingButton extends invocationEvent
  /* 4 */ val floatingButton: typings.instabugReactnative.mod.invocationEvent.floatingButton with Double = js.native
  
  @js.native
  sealed trait none extends invocationEvent
  /* 0 */ val none: typings.instabugReactnative.mod.invocationEvent.none with Double = js.native
  
  @js.native
  sealed trait screenshot extends invocationEvent
  /* 2 */ val screenshot: typings.instabugReactnative.mod.invocationEvent.screenshot with Double = js.native
  
  @js.native
  sealed trait shake extends invocationEvent
  /* 1 */ val shake: typings.instabugReactnative.mod.invocationEvent.shake with Double = js.native
  
  @js.native
  sealed trait twoFingersSwipe extends invocationEvent
  /* 3 */ val twoFingersSwipe: typings.instabugReactnative.mod.invocationEvent.twoFingersSwipe with Double = js.native
}
