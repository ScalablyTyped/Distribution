package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdWordsAccount extends StObject {
  
  /**
    * True if auto-tagging is enabled on the Google Ads account. Read-only after the insert operation.
    */
  var autoTaggingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Customer ID. This field is required when creating a Google Ads link.
    */
  var customerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for Google Ads account.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaAdWordsAccount {
  
  inline def apply(): SchemaAdWordsAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdWordsAccount]
  }
  
  extension [Self <: SchemaAdWordsAccount](x: Self) {
    
    inline def setAutoTaggingEnabled(value: Boolean): Self = StObject.set(x, "autoTaggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoTaggingEnabledNull: Self = StObject.set(x, "autoTaggingEnabled", null)
    
    inline def setAutoTaggingEnabledUndefined: Self = StObject.set(x, "autoTaggingEnabled", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdNull: Self = StObject.set(x, "customerId", null)
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
