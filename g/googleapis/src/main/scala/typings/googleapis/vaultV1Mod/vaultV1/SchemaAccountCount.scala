package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountCount extends StObject {
  
  /**
    * Account owner.
    */
  var account: js.UndefOr[SchemaUserInfo] = js.undefined
  
  /**
    * The number of results (messages or files) found for this account.
    */
  var count: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountCount {
  
  inline def apply(): SchemaAccountCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountCount]
  }
  
  extension [Self <: SchemaAccountCount](x: Self) {
    
    inline def setAccount(value: SchemaUserInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
