package typings.honeybadger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackFunction = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* notice */ js.Object | scala.Null, 
    scala.Unit
  ]
  type LambdaHandler = js.Function2[/* event */ js.Object, /* context */ js.Object, scala.Unit]
}
