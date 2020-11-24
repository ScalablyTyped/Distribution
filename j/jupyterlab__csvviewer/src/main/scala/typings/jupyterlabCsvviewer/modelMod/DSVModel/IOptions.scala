package typings.jupyterlabCsvviewer.modelMod.DSVModel

import typings.jupyterlabCsvviewer.jupyterlabCsvviewerStrings.Carriagereturn
import typings.jupyterlabCsvviewer.jupyterlabCsvviewerStrings.CarriagereturnLinefeed
import typings.jupyterlabCsvviewer.jupyterlabCsvviewerStrings.Linefeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a delimiter-separated data model.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The data source for the data model.
    */
  var data: String = js.native
  
  /**
    * The field delimiter, such as ',' or '\t'.
    *
    * #### Notes
    * The field delimiter must be a single character.
    */
  var delimiter: String = js.native
  
  /**
    * Whether the data has a one-row header.
    */
  var header: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum number of initial rows to parse before doing a asynchronous
    * full parse of the data. This should be greater than 0.
    */
  var initialRows: js.UndefOr[Double] = js.native
  
  /**
    * Quote character.
    *
    * #### Notes
    * Quotes are escaped by repeating them, as in RFC 4180. The quote must be a
    * single character.
    */
  var quote: js.UndefOr[String] = js.native
  
  /**
    * Whether to use the parser that can handle quoted delimiters.
    *
    * #### Notes
    * Setting this to false uses a much faster parser, but assumes there are
    * not any field or row delimiters that are quoted in fields. If this is not
    * set, it defaults to true if any quotes are found in the data, and false
    * otherwise.
    */
  var quoteParser: js.UndefOr[Boolean] = js.native
  
  /**
    * Row delimiter.
    *
    * #### Notes
    * Any carriage return or newline character that is not a delimiter should
    * be in a quoted field, regardless of the row delimiter setting.
    */
  var rowDelimiter: js.UndefOr[CarriagereturnLinefeed | Carriagereturn | Linefeed] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(data: String, delimiter: String): IOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setInitialRows(value: Double): Self = this.set("initialRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRows: Self = this.set("initialRows", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setQuoteParser(value: Boolean): Self = this.set("quoteParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteParser: Self = this.set("quoteParser", js.undefined)
    
    @scala.inline
    def setRowDelimiter(value: CarriagereturnLinefeed | Carriagereturn | Linefeed): Self = this.set("rowDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDelimiter: Self = this.set("rowDelimiter", js.undefined)
  }
}
