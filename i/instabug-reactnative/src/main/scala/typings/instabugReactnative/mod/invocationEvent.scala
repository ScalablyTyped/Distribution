package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait invocationEvent extends StObject
@JSImport("instabug-reactnative", "invocationEvent")
@js.native
object invocationEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[invocationEvent & Double] = js.native
  
  @js.native
  sealed trait floatingButton
    extends StObject
       with invocationEvent
  /* 4 */ val floatingButton: typings.instabugReactnative.mod.invocationEvent.floatingButton & Double = js.native
  
  @js.native
  sealed trait none
    extends StObject
       with invocationEvent
  /* 0 */ val none: typings.instabugReactnative.mod.invocationEvent.none & Double = js.native
  
  @js.native
  sealed trait screenshot
    extends StObject
       with invocationEvent
  /* 2 */ val screenshot: typings.instabugReactnative.mod.invocationEvent.screenshot & Double = js.native
  
  @js.native
  sealed trait shake
    extends StObject
       with invocationEvent
  /* 1 */ val shake: typings.instabugReactnative.mod.invocationEvent.shake & Double = js.native
  
  @js.native
  sealed trait twoFingersSwipe
    extends StObject
       with invocationEvent
  /* 3 */ val twoFingersSwipe: typings.instabugReactnative.mod.invocationEvent.twoFingersSwipe & Double = js.native
}
