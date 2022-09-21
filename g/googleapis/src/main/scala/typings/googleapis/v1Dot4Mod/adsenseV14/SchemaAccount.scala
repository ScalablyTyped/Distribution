package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccount extends StObject {
  
  var creation_time: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier of this account.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of resource this is, in this case adsense#account.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this account.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this account is premium.
    */
  var premium: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Sub accounts of the this account.
    */
  var subAccounts: js.UndefOr[js.Array[SchemaAccount]] = js.undefined
  
  /**
    * AdSense timezone of this account.
    */
  var timezone: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccount {
  
  inline def apply(): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccount]
  }
  
  extension [Self <: SchemaAccount](x: Self) {
    
    inline def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    
    inline def setCreation_timeNull: Self = StObject.set(x, "creation_time", null)
    
    inline def setCreation_timeUndefined: Self = StObject.set(x, "creation_time", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPremium(value: Boolean): Self = StObject.set(x, "premium", value.asInstanceOf[js.Any])
    
    inline def setPremiumNull: Self = StObject.set(x, "premium", null)
    
    inline def setPremiumUndefined: Self = StObject.set(x, "premium", js.undefined)
    
    inline def setSubAccounts(value: js.Array[SchemaAccount]): Self = StObject.set(x, "subAccounts", value.asInstanceOf[js.Any])
    
    inline def setSubAccountsUndefined: Self = StObject.set(x, "subAccounts", js.undefined)
    
    inline def setSubAccountsVarargs(value: SchemaAccount*): Self = StObject.set(x, "subAccounts", js.Array(value*))
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneNull: Self = StObject.set(x, "timezone", null)
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
  }
}
