package typings.kdbush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ArrayType = (typings.std.Int8ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Int8Array])) | (typings.std.Int16ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Int16Array])) | (typings.std.Int32ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Int32Array])) | (typings.std.Float32ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Float32Array])) | (typings.std.Float64ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* elements */ typings.std.Iterable[scala.Double], typings.std.global.Float64Array])) | (typings.std.ArrayConstructor with (org.scalablytyped.runtime.Instantiable1[/* arrayLength */ scala.Double, typings.std.global.Array[js.Object]]))
  type Get[T] = js.Function1[/* point */ T, scala.Double]
  type Points = js.Array[js.Array[scala.Double]]
}
