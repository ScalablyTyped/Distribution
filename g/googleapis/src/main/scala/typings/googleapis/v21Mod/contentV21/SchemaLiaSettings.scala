package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiaSettings extends StObject {
  
  /**
    * The ID of the account to which these LIA settings belong. Ignored upon update, always present in get request responses.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The LIA settings for each country.
    */
  var countrySettings: js.UndefOr[js.Array[SchemaLiaCountrySettings]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#liaSettings`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiaSettings {
  
  inline def apply(): SchemaLiaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaSettings]
  }
  
  extension [Self <: SchemaLiaSettings](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCountrySettings(value: js.Array[SchemaLiaCountrySettings]): Self = StObject.set(x, "countrySettings", value.asInstanceOf[js.Any])
    
    inline def setCountrySettingsUndefined: Self = StObject.set(x, "countrySettings", js.undefined)
    
    inline def setCountrySettingsVarargs(value: SchemaLiaCountrySettings*): Self = StObject.set(x, "countrySettings", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
