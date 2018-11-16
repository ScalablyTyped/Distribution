package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kdbushLib {
  type ArrayType = stdLib.Int8ArrayConstructor | stdLib.Int16ArrayConstructor | stdLib.Int32ArrayConstructor | stdLib.Float32ArrayConstructor | stdLib.Float64ArrayConstructor | stdLib.ArrayConstructor
  type Get[T] = js.Function1[/* point */ T, scala.Double]
  type Points = js.Array[js.Array[scala.Double]]
}
