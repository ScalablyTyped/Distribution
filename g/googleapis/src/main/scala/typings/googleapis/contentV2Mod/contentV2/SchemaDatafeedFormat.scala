package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedFormat extends StObject {
  
  /**
    * Delimiter for the separation of values in a delimiter-separated values
    * feed. If not specified, the delimiter will be auto-detected. Ignored for
    * non-DSV data feeds.
    */
  var columnDelimiter: js.UndefOr[String] = js.undefined
  
  /**
    * Character encoding scheme of the data feed. If not specified, the
    * encoding will be auto-detected.
    */
  var fileEncoding: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how double quotes are interpreted. If not specified, the mode
    * will be auto-detected. Ignored for non-DSV data feeds.
    */
  var quotingMode: js.UndefOr[String] = js.undefined
}
object SchemaDatafeedFormat {
  
  inline def apply(): SchemaDatafeedFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedFormat]
  }
  
  extension [Self <: SchemaDatafeedFormat](x: Self) {
    
    inline def setColumnDelimiter(value: String): Self = StObject.set(x, "columnDelimiter", value.asInstanceOf[js.Any])
    
    inline def setColumnDelimiterUndefined: Self = StObject.set(x, "columnDelimiter", js.undefined)
    
    inline def setFileEncoding(value: String): Self = StObject.set(x, "fileEncoding", value.asInstanceOf[js.Any])
    
    inline def setFileEncodingUndefined: Self = StObject.set(x, "fileEncoding", js.undefined)
    
    inline def setQuotingMode(value: String): Self = StObject.set(x, "quotingMode", value.asInstanceOf[js.Any])
    
    inline def setQuotingModeUndefined: Self = StObject.set(x, "quotingMode", js.undefined)
  }
}
