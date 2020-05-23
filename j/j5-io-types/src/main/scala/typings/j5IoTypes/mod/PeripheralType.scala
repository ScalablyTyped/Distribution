package typings.j5IoTypes.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PeripheralType extends js.Object

@JSImport("j5-io-types", "PeripheralType")
@js.native
object PeripheralType extends js.Object {
  @js.native
  sealed trait GPIO extends PeripheralType
  
  @js.native
  sealed trait I2C extends PeripheralType
  
  @js.native
  sealed trait PWM extends PeripheralType
  
  @js.native
  sealed trait SPI extends PeripheralType
  
  @js.native
  sealed trait UART extends PeripheralType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PeripheralType with String] = js.native
  /* "gpio" */ @js.native
  object GPIO extends TopLevel[GPIO with String]
  
  /* "i2c" */ @js.native
  object I2C extends TopLevel[I2C with String]
  
  /* "pwm" */ @js.native
  object PWM extends TopLevel[PWM with String]
  
  /* "spi" */ @js.native
  object SPI extends TopLevel[SPI with String]
  
  /* "uart" */ @js.native
  object UART extends TopLevel[UART with String]
  
}

