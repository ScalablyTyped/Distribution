package typings.json2csv.jSON2CSVBaseMod.json2csv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var doubleQuote: js.UndefOr[String] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var excelStrings: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[js.Array[String | FieldInfo[T]]] = js.undefined
  var flatten: js.UndefOr[Boolean] = js.undefined
  var flattenSeparator: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[Boolean] = js.undefined
  var includeEmptyRows: js.UndefOr[Boolean] = js.undefined
  var ndjson: js.UndefOr[Boolean] = js.undefined
  var quote: js.UndefOr[String] = js.undefined
  var unwind: js.UndefOr[String | js.Array[String]] = js.undefined
  var unwindBlank: js.UndefOr[Boolean] = js.undefined
  var withBOM: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    defaultValue: String = null,
    delimiter: String = null,
    doubleQuote: String = null,
    eol: String = null,
    excelStrings: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String | FieldInfo[T]] = null,
    flatten: js.UndefOr[Boolean] = js.undefined,
    flattenSeparator: String = null,
    header: js.UndefOr[Boolean] = js.undefined,
    includeEmptyRows: js.UndefOr[Boolean] = js.undefined,
    ndjson: js.UndefOr[Boolean] = js.undefined,
    quote: String = null,
    unwind: String | js.Array[String] = null,
    unwindBlank: js.UndefOr[Boolean] = js.undefined,
    withBOM: js.UndefOr[Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (doubleQuote != null) __obj.updateDynamic("doubleQuote")(doubleQuote.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (!js.isUndefined(excelStrings)) __obj.updateDynamic("excelStrings")(excelStrings.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.asInstanceOf[js.Any])
    if (flattenSeparator != null) __obj.updateDynamic("flattenSeparator")(flattenSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEmptyRows)) __obj.updateDynamic("includeEmptyRows")(includeEmptyRows.asInstanceOf[js.Any])
    if (!js.isUndefined(ndjson)) __obj.updateDynamic("ndjson")(ndjson.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (unwind != null) __obj.updateDynamic("unwind")(unwind.asInstanceOf[js.Any])
    if (!js.isUndefined(unwindBlank)) __obj.updateDynamic("unwindBlank")(unwindBlank.asInstanceOf[js.Any])
    if (!js.isUndefined(withBOM)) __obj.updateDynamic("withBOM")(withBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

