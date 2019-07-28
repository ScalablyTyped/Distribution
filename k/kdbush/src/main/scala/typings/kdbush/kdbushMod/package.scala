package typings.kdbush

import typings.std.ArrayConstructor
import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kdbushMod {
  type ArrayType = Int8ArrayConstructor | Int16ArrayConstructor | Int32ArrayConstructor | Float32ArrayConstructor | Float64ArrayConstructor | ArrayConstructor
  type Get[T] = js.Function1[/* point */ T, Double]
}
