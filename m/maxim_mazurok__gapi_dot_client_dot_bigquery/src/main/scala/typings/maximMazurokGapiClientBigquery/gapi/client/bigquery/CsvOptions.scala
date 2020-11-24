package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CsvOptions extends js.Object {
  
  /**
    * [Optional] Indicates if BigQuery should accept rows that are missing trailing optional columns. If true, BigQuery treats missing trailing columns as null values. If false, records
    * with missing trailing columns are treated as bad records, and if there are too many bad records, an invalid error is returned in the job result. The default value is false.
    */
  var allowJaggedRows: js.UndefOr[Boolean] = js.native
  
  /** [Optional] Indicates if BigQuery should allow quoted data sections that contain newline characters in a CSV file. The default value is false. */
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.native
  
  /**
    * [Optional] The character encoding of the data. The supported values are UTF-8 or ISO-8859-1. The default value is UTF-8. BigQuery decodes the data after the raw, binary data has
    * been split using the values of the quote and fieldDelimiter properties.
    */
  var encoding: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The separator for fields in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to split the data in its
    * raw, binary state. BigQuery also supports the escape sequence "\t" to specify a tab separator. The default value is a comma (',').
    */
  var fieldDelimiter: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The value that is used to quote data sections in a CSV file. BigQuery converts the string to ISO-8859-1 encoding, and then uses the first byte of the encoded string to
    * split the data in its raw, binary state. The default value is a double-quote ('"'). If your data does not contain quoted sections, set the property value to an empty string. If your
    * data contains quoted newline characters, you must also set the allowQuotedNewlines property to true.
    */
  var quote: js.UndefOr[String] = js.native
  
  /**
    * [Optional] The number of rows at the top of a CSV file that BigQuery will skip when reading the data. The default value is 0. This property is useful if you have header rows in the
    * file that should be skipped. When autodetect is on, the behavior is the following: * skipLeadingRows unspecified - Autodetect tries to detect headers in the first row. If they are
    * not detected, the row is read as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 - Instructs autodetect that there are no headers and data should
    * be read starting from the first row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row N. If headers are not detected, row N is just skipped.
    * Otherwise row N is used to extract column names for the detected schema.
    */
  var skipLeadingRows: js.UndefOr[String] = js.native
}
object CsvOptions {
  
  @scala.inline
  def apply(): CsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvOptions]
  }
  
  @scala.inline
  implicit class CsvOptionsOps[Self <: CsvOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowJaggedRows(value: Boolean): Self = this.set("allowJaggedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowJaggedRows: Self = this.set("allowJaggedRows", js.undefined)
    
    @scala.inline
    def setAllowQuotedNewlines(value: Boolean): Self = this.set("allowQuotedNewlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowQuotedNewlines: Self = this.set("allowQuotedNewlines", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFieldDelimiter(value: String): Self = this.set("fieldDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldDelimiter: Self = this.set("fieldDelimiter", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setSkipLeadingRows(value: String): Self = this.set("skipLeadingRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipLeadingRows: Self = this.set("skipLeadingRows", js.undefined)
  }
}
