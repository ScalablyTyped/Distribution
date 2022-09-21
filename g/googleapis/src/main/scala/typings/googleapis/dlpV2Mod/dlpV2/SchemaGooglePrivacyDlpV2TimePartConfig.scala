package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2TimePartConfig extends StObject {
  
  /**
    * The part of the time to keep.
    */
  var partToExtract: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2TimePartConfig {
  
  inline def apply(): SchemaGooglePrivacyDlpV2TimePartConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TimePartConfig]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2TimePartConfig](x: Self) {
    
    inline def setPartToExtract(value: String): Self = StObject.set(x, "partToExtract", value.asInstanceOf[js.Any])
    
    inline def setPartToExtractNull: Self = StObject.set(x, "partToExtract", null)
    
    inline def setPartToExtractUndefined: Self = StObject.set(x, "partToExtract", js.undefined)
  }
}
