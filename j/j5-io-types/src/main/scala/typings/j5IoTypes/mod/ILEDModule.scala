package typings.j5IoTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILEDModule extends js.Object {
  def createLED(): ILED
}

object ILEDModule {
  @scala.inline
  def apply(createLED: () => ILED): ILEDModule = {
    val __obj = js.Dynamic.literal(createLED = js.Any.fromFunction0(createLED))
    __obj.asInstanceOf[ILEDModule]
  }
}

