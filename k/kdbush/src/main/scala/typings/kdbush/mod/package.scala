package typings.kdbush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArrayType = typings.std.Int8ArrayConstructor | typings.std.Int16ArrayConstructor | typings.std.Int32ArrayConstructor | typings.std.Float32ArrayConstructor | typings.std.Float64ArrayConstructor | typings.std.ArrayConstructor
  type Get[T] = js.Function1[/* point */ T, scala.Double]
  type Points = js.Array[js.Array[scala.Double]]
}
