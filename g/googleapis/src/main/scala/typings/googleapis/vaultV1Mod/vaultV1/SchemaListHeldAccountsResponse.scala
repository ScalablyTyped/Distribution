package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns a list of held accounts for a hold.
  */
@js.native
trait SchemaListHeldAccountsResponse extends StObject {
  
  /**
    * The held accounts on a hold.
    */
  var accounts: js.UndefOr[js.Array[SchemaHeldAccount]] = js.native
}
object SchemaListHeldAccountsResponse {
  
  @scala.inline
  def apply(): SchemaListHeldAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHeldAccountsResponse]
  }
  
  @scala.inline
  implicit class SchemaListHeldAccountsResponseMutableBuilder[Self <: SchemaListHeldAccountsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[SchemaHeldAccount]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: SchemaHeldAccount*): Self = StObject.set(x, "accounts", js.Array(value :_*))
  }
}
