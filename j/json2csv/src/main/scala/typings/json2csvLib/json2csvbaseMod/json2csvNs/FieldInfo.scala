package typings
package json2csvLib.json2csvbaseMod.json2csvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfo[T] extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var label: java.lang.String
  var value: js.UndefOr[java.lang.String | FieldValueCallback[T]] = js.undefined
}

