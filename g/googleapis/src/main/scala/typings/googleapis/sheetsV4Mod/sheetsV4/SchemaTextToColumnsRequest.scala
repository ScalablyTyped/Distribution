package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTextToColumnsRequest extends StObject {
  
  /**
    * The delimiter to use. Used only if delimiterType is CUSTOM.
    */
  var delimiter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The delimiter type to use.
    */
  var delimiterType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The source data range. This must span exactly one column.
    */
  var source: js.UndefOr[SchemaGridRange] = js.undefined
}
object SchemaTextToColumnsRequest {
  
  inline def apply(): SchemaTextToColumnsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextToColumnsRequest]
  }
  
  extension [Self <: SchemaTextToColumnsRequest](x: Self) {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterNull: Self = StObject.set(x, "delimiter", null)
    
    inline def setDelimiterType(value: String): Self = StObject.set(x, "delimiterType", value.asInstanceOf[js.Any])
    
    inline def setDelimiterTypeNull: Self = StObject.set(x, "delimiterType", null)
    
    inline def setDelimiterTypeUndefined: Self = StObject.set(x, "delimiterType", js.undefined)
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setSource(value: SchemaGridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
