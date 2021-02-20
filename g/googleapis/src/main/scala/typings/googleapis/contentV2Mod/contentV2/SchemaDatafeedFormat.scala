package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDatafeedFormat extends StObject {
  
  /**
    * Delimiter for the separation of values in a delimiter-separated values
    * feed. If not specified, the delimiter will be auto-detected. Ignored for
    * non-DSV data feeds.
    */
  var columnDelimiter: js.UndefOr[String] = js.native
  
  /**
    * Character encoding scheme of the data feed. If not specified, the
    * encoding will be auto-detected.
    */
  var fileEncoding: js.UndefOr[String] = js.native
  
  /**
    * Specifies how double quotes are interpreted. If not specified, the mode
    * will be auto-detected. Ignored for non-DSV data feeds.
    */
  var quotingMode: js.UndefOr[String] = js.native
}
object SchemaDatafeedFormat {
  
  @scala.inline
  def apply(): SchemaDatafeedFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedFormat]
  }
  
  @scala.inline
  implicit class SchemaDatafeedFormatMutableBuilder[Self <: SchemaDatafeedFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnDelimiter(value: String): Self = StObject.set(x, "columnDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnDelimiterUndefined: Self = StObject.set(x, "columnDelimiter", js.undefined)
    
    @scala.inline
    def setFileEncoding(value: String): Self = StObject.set(x, "fileEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileEncodingUndefined: Self = StObject.set(x, "fileEncoding", js.undefined)
    
    @scala.inline
    def setQuotingMode(value: String): Self = StObject.set(x, "quotingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotingModeUndefined: Self = StObject.set(x, "quotingMode", js.undefined)
  }
}
