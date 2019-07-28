package typings.json2csv.jSON2CSVBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object json2csvNs {
  type FieldValueCallback[T] = FieldValueCallbackWithoutField[T] | FieldValueCallbackWithField[T]
  type FieldValueCallbackWithField[T] = js.Function2[/* row */ T, /* field */ FieldValueCallbackInfo, js.Any]
  type FieldValueCallbackWithoutField[T] = js.Function1[/* row */ T, js.Any]
}
