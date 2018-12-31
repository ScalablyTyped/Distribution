package typings
package json2csvLib.json2csvbaseMod.json2csvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var doubleQuote: js.UndefOr[java.lang.String] = js.undefined
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var excelStrings: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.UndefOr[js.Array[java.lang.String | FieldInfo[T]]] = js.undefined
  var flatten: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[scala.Boolean] = js.undefined
  var includeEmptyRows: js.UndefOr[scala.Boolean] = js.undefined
  var ndjson: js.UndefOr[scala.Boolean] = js.undefined
  var quote: js.UndefOr[java.lang.String] = js.undefined
  var unwind: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var unwindBlank: js.UndefOr[scala.Boolean] = js.undefined
  var withBOM: js.UndefOr[scala.Boolean] = js.undefined
}

