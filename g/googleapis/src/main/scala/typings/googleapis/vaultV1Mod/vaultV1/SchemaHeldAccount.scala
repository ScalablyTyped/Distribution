package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An account being held in a particular hold. This structure is immutable.
  * This can be either a single user or a google group, depending on the
  * corpus.
  */
trait SchemaHeldAccount extends StObject {
  
  /**
    * The account&#39;s ID as provided by the &lt;a
    * href=&quot;https://developers.google.com/admin-sdk/&quot;&gt;Admin
    * SDK&lt;/a&gt;.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * When the account was put on hold.
    */
  var holdTime: js.UndefOr[String] = js.undefined
}
object SchemaHeldAccount {
  
  inline def apply(): SchemaHeldAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeldAccount]
  }
  
  extension [Self <: SchemaHeldAccount](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setHoldTime(value: String): Self = StObject.set(x, "holdTime", value.asInstanceOf[js.Any])
    
    inline def setHoldTimeUndefined: Self = StObject.set(x, "holdTime", js.undefined)
  }
}
