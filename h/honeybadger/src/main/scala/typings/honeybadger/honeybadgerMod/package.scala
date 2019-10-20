package typings.honeybadger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object honeybadgerMod {
  import typings.std.Error

  type CallbackFunction = js.Function2[/* err */ Error | Null, /* notice */ js.Object | Null, Unit]
  type LambdaHandler = js.Function2[/* event */ js.Object, /* context */ js.Object, Unit]
}
