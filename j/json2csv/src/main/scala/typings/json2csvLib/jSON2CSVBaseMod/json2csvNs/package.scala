package typings
package json2csvLib.jSON2CSVBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object json2csvNs {
  type FieldValueCallback[T] = js.Function2[/* row */ T, /* field */ java.lang.String, java.lang.String]
}
