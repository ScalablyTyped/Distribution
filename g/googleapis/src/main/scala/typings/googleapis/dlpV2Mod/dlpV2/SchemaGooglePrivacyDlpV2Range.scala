package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2Range extends StObject {
  
  /**
    * Index of the last character of the range (exclusive).
    */
  var end: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Index of the first character of the range (inclusive).
    */
  var start: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2Range {
  
  inline def apply(): SchemaGooglePrivacyDlpV2Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2Range]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2Range](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartNull: Self = StObject.set(x, "start", null)
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
