package typings
package kdbushLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kdbushMod {
  type ArrayType = stdLib.Int8ArrayConstructor | stdLib.Int16ArrayConstructor | stdLib.Int32ArrayConstructor | stdLib.Float32ArrayConstructor | stdLib.Float64ArrayConstructor | stdLib.ArrayConstructor
  type Get[T] = js.Function1[/* point */ T, scala.Double]
}
