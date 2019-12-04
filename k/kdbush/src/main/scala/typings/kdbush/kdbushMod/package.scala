package typings.kdbush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kdbushMod {
  import typings.std.ArrayConstructor
  import typings.std.Float32ArrayConstructor
  import typings.std.Float64ArrayConstructor
  import typings.std.Int16ArrayConstructor
  import typings.std.Int32ArrayConstructor
  import typings.std.Int8ArrayConstructor

  type ArrayType = Int8ArrayConstructor | Int16ArrayConstructor | Int32ArrayConstructor | Float32ArrayConstructor | Float64ArrayConstructor | ArrayConstructor
  type Get[T] = js.Function1[/* point */ T, Double]
  type Points = js.Array[js.Array[Double]]
}
