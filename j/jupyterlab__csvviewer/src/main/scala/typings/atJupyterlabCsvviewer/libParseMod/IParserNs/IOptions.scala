package typings.atJupyterlabCsvviewer.libParseMod.IParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for a parser.
  */
trait IOptions extends js.Object {
  /**
    * Whether to return column offsets in the offsets array.
    *
    * #### Notes
    * If false, the returned offsets array contains just the row offsets. If
    * true, the returned offsets array contains all column offsets for each
    * column in the rows (i.e., it has nrows*ncols entries). Individual rows
    * will have empty columns added or extra columns merged into the last
    * column if they do not have exactly ncols columns.
    */
  var columnOffsets: Boolean
  /**
    * The data to parse.
    */
  var data: String
  /**
    * The delimiter to use. Defaults to ','.
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * Maximum number of rows to parse.
    *
    * If this is not given, parsing proceeds to the end of the data.
    */
  var maxRows: js.UndefOr[Double] = js.undefined
  /**
    * Number of columns in each row to parse.
    *
    * #### Notes
    * If this is not given, the ncols defaults to the number of columns in the
    * first row.
    */
  var ncols: js.UndefOr[Double] = js.undefined
  /**
    * The quote character for quoting fields. Defaults to the double quote (").
    *
    * #### Notes
    * As specified in [RFC 4180](https://tools.ietf.org/html/rfc4180), quotes
    * are escaped in a quoted field by doubling them (for example, "a""b" is the field
    * a"b).
    */
  var quote: js.UndefOr[String] = js.undefined
  /**
    * The row delimiter to use. Defaults to '\r\n'.
    */
  var rowDelimiter: js.UndefOr[String] = js.undefined
  /**
    * The starting index in the string for processing. Defaults to 0. This
    * index should be the first character of a new row. This must be less than
    * data.length.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    columnOffsets: Boolean,
    data: String,
    delimiter: String = null,
    maxRows: Int | Double = null,
    ncols: Int | Double = null,
    quote: String = null,
    rowDelimiter: String = null,
    startIndex: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(columnOffsets = columnOffsets, data = data)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (ncols != null) __obj.updateDynamic("ncols")(ncols.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (rowDelimiter != null) __obj.updateDynamic("rowDelimiter")(rowDelimiter)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

