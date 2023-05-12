package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PinMode extends StObject
@JSImport("johnny-five", "PinMode")
@js.native
object PinMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PinMode & Double] = js.native
  
  @js.native
  sealed trait ANALOG
    extends StObject
       with PinMode
  /* 2 */ val ANALOG: typings.johnnyFive.mod.PinMode.ANALOG & Double = js.native
  
  @js.native
  sealed trait INPUT
    extends StObject
       with PinMode
  /* 0 */ val INPUT: typings.johnnyFive.mod.PinMode.INPUT & Double = js.native
  
  @js.native
  sealed trait OUTPUT
    extends StObject
       with PinMode
  /* 1 */ val OUTPUT: typings.johnnyFive.mod.PinMode.OUTPUT & Double = js.native
  
  @js.native
  sealed trait PWM
    extends StObject
       with PinMode
  /* 3 */ val PWM: typings.johnnyFive.mod.PinMode.PWM & Double = js.native
  
  @js.native
  sealed trait SERVO
    extends StObject
       with PinMode
  /* 4 */ val SERVO: typings.johnnyFive.mod.PinMode.SERVO & Double = js.native
}
