package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Splits a column of text into multiple columns, based on a delimiter in each
  * cell.
  */
@js.native
trait SchemaTextToColumnsRequest extends StObject {
  
  /**
    * The delimiter to use. Used only if delimiterType is CUSTOM.
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /**
    * The delimiter type to use.
    */
  var delimiterType: js.UndefOr[String] = js.native
  
  /**
    * The source data range.  This must span exactly one column.
    */
  var source: js.UndefOr[SchemaGridRange] = js.native
}
object SchemaTextToColumnsRequest {
  
  @scala.inline
  def apply(): SchemaTextToColumnsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextToColumnsRequest]
  }
  
  @scala.inline
  implicit class SchemaTextToColumnsRequestMutableBuilder[Self <: SchemaTextToColumnsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterType(value: String): Self = StObject.set(x, "delimiterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterTypeUndefined: Self = StObject.set(x, "delimiterType", js.undefined)
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaGridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
