package typings.json2csv.json2csvbaseMod.json2csv

import typings.json2csv.baseMod.Json2CsvTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var escapedQuote: js.UndefOr[String] = js.undefined
  var excelStrings: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[js.Array[String | FieldInfo[T]]] = js.undefined
  var header: js.UndefOr[Boolean] = js.undefined
  var includeEmptyRows: js.UndefOr[Boolean] = js.undefined
  var ndjson: js.UndefOr[Boolean] = js.undefined
  var quote: js.UndefOr[String] = js.undefined
  var transforms: js.UndefOr[js.Array[Json2CsvTransform[_, _]]] = js.undefined
  var withBOM: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    defaultValue: String = null,
    delimiter: String = null,
    eol: String = null,
    escapedQuote: String = null,
    excelStrings: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String | FieldInfo[T]] = null,
    header: js.UndefOr[Boolean] = js.undefined,
    includeEmptyRows: js.UndefOr[Boolean] = js.undefined,
    ndjson: js.UndefOr[Boolean] = js.undefined,
    quote: String = null,
    transforms: js.Array[Json2CsvTransform[_, _]] = null,
    withBOM: js.UndefOr[Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (escapedQuote != null) __obj.updateDynamic("escapedQuote")(escapedQuote.asInstanceOf[js.Any])
    if (!js.isUndefined(excelStrings)) __obj.updateDynamic("excelStrings")(excelStrings.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEmptyRows)) __obj.updateDynamic("includeEmptyRows")(includeEmptyRows.asInstanceOf[js.Any])
    if (!js.isUndefined(ndjson)) __obj.updateDynamic("ndjson")(ndjson.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    if (!js.isUndefined(withBOM)) __obj.updateDynamic("withBOM")(withBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

