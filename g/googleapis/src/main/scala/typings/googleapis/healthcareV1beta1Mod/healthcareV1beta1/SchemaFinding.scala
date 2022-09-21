package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFinding extends StObject {
  
  /**
    * Zero-based ending index of the found text, exclusively.
    */
  var end: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of information stored in this text range. For example, HumanName, BirthDate, or Address.
    */
  var infoType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The snippet of the sensitive text. This field is only populated during deidentification if `store_quote` is set to true in DeidentifyConfig.
    */
  var quote: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Zero-based starting index of the found text, inclusively.
    */
  var start: js.UndefOr[String | Null] = js.undefined
}
object SchemaFinding {
  
  inline def apply(): SchemaFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFinding]
  }
  
  extension [Self <: SchemaFinding](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setInfoType(value: String): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeNull: Self = StObject.set(x, "infoType", null)
    
    inline def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteNull: Self = StObject.set(x, "quote", null)
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
