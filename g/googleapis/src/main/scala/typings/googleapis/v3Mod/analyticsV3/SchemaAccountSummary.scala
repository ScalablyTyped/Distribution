package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountSummary extends StObject {
  
  /**
    * Account ID.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource type for Analytics AccountSummary.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Account name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates whether this account is starred or not.
    */
  var starred: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * List of web properties under this account.
    */
  var webProperties: js.UndefOr[js.Array[SchemaWebPropertySummary]] = js.undefined
}
object SchemaAccountSummary {
  
  inline def apply(): SchemaAccountSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountSummary]
  }
  
  extension [Self <: SchemaAccountSummary](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStarred(value: Boolean): Self = StObject.set(x, "starred", value.asInstanceOf[js.Any])
    
    inline def setStarredNull: Self = StObject.set(x, "starred", null)
    
    inline def setStarredUndefined: Self = StObject.set(x, "starred", js.undefined)
    
    inline def setWebProperties(value: js.Array[SchemaWebPropertySummary]): Self = StObject.set(x, "webProperties", value.asInstanceOf[js.Any])
    
    inline def setWebPropertiesUndefined: Self = StObject.set(x, "webProperties", js.undefined)
    
    inline def setWebPropertiesVarargs(value: SchemaWebPropertySummary*): Self = StObject.set(x, "webProperties", js.Array(value*))
  }
}
