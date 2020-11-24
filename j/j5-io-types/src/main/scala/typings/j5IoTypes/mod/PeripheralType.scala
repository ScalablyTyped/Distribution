package typings.j5IoTypes.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PeripheralType extends js.Object
@JSImport("j5-io-types", "PeripheralType")
@js.native
object PeripheralType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PeripheralType with String] = js.native
  
  @js.native
  sealed trait GPIO extends PeripheralType
  /* "gpio" */ @js.native
  object GPIO extends TopLevel[GPIO with String]
  
  @js.native
  sealed trait I2C extends PeripheralType
  /* "i2c" */ @js.native
  object I2C extends TopLevel[I2C with String]
  
  @js.native
  sealed trait PWM extends PeripheralType
  /* "pwm" */ @js.native
  object PWM extends TopLevel[PWM with String]
  
  @js.native
  sealed trait SPI extends PeripheralType
  /* "spi" */ @js.native
  object SPI extends TopLevel[SPI with String]
  
  @js.native
  sealed trait UART extends PeripheralType
  /* "uart" */ @js.native
  object UART extends TopLevel[UART with String]
}
