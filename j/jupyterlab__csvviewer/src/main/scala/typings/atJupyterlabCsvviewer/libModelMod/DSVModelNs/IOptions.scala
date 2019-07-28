package typings.atJupyterlabCsvviewer.libModelMod.DSVModelNs

import typings.atJupyterlabCsvviewer.atJupyterlabCsvviewerStrings.BACKSLASHn
import typings.atJupyterlabCsvviewer.atJupyterlabCsvviewerStrings.BACKSLASHr
import typings.atJupyterlabCsvviewer.atJupyterlabCsvviewerStrings.BACKSLASHrBACKSLASHn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a delimiter-separated data model.
  */
trait IOptions extends js.Object {
  /**
    * The data source for the data model.
    */
  var data: String
  /**
    * The field delimiter, such as ',' or '\t'.
    *
    * #### Notes
    * The field delimiter must be a single character.
    */
  var delimiter: String
  /**
    * Whether the data has a one-row header.
    */
  var header: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of initial rows to parse before doing a asynchronous
    * full parse of the data. This should be greater than 0.
    */
  var initialRows: js.UndefOr[Double] = js.undefined
  /**
    * Quote character.
    *
    * #### Notes
    * Quotes are escaped by repeating them, as in RFC 4180. The quote must be a
    * single character.
    */
  var quote: js.UndefOr[String] = js.undefined
  /**
    * Whether to use the parser that can handle quoted delimiters.
    *
    * #### Notes
    * Setting this to false uses a much faster parser, but assumes there are
    * not any field or row delimiters that are quoted in fields. If this is not
    * set, it defaults to true if any quotes are found in the data, and false
    * otherwise.
    */
  var quoteParser: js.UndefOr[Boolean] = js.undefined
  /**
    * Row delimiter.
    *
    * #### Notes
    * Any carriage return or newline character that is not a delimiter should
    * be in a quoted field, regardless of the row delimiter setting.
    */
  var rowDelimiter: js.UndefOr[BACKSLASHrBACKSLASHn | BACKSLASHr | BACKSLASHn] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    data: String,
    delimiter: String,
    header: js.UndefOr[Boolean] = js.undefined,
    initialRows: Int | Double = null,
    quote: String = null,
    quoteParser: js.UndefOr[Boolean] = js.undefined,
    rowDelimiter: BACKSLASHrBACKSLASHn | BACKSLASHr | BACKSLASHn = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(data = data, delimiter = delimiter)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (initialRows != null) __obj.updateDynamic("initialRows")(initialRows.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (!js.isUndefined(quoteParser)) __obj.updateDynamic("quoteParser")(quoteParser)
    if (rowDelimiter != null) __obj.updateDynamic("rowDelimiter")(rowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

