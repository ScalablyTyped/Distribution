package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1StorageFormatCsvOptions extends StObject {
  
  /**
    * Optional. The delimiter used to separate values. Defaults to ','.
    */
  var delimiter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The character encoding of the data. Accepts "US-ASCII", "UTF-8", and "ISO-8859-1". Defaults to UTF-8 if unspecified.
    */
  var encoding: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The number of rows to interpret as header rows that should be skipped when reading data rows. Defaults to 0.
    */
  var headerRows: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. The character used to quote column values. Accepts '"' (double quotation mark) or ''' (single quotation mark). Defaults to '"' (double quotation mark) if unspecified.
    */
  var quote: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1StorageFormatCsvOptions {
  
  inline def apply(): SchemaGoogleCloudDataplexV1StorageFormatCsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1StorageFormatCsvOptions]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1StorageFormatCsvOptions](x: Self) {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterNull: Self = StObject.set(x, "delimiter", null)
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setHeaderRows(value: Double): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowsNull: Self = StObject.set(x, "headerRows", null)
    
    inline def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteNull: Self = StObject.set(x, "quote", null)
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
  }
}
