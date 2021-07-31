package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A status detailing the status of each account creation, and the
  * HeldAccount, if successful.
  */
trait SchemaAddHeldAccountResult extends StObject {
  
  /**
    * If present, this account was successfully created.
    */
  var account: js.UndefOr[SchemaHeldAccount] = js.undefined
  
  /**
    * This represents the success status. If failed, check message.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaAddHeldAccountResult {
  
  @scala.inline
  def apply(): SchemaAddHeldAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddHeldAccountResult]
  }
  
  @scala.inline
  implicit class SchemaAddHeldAccountResultMutableBuilder[Self <: SchemaAddHeldAccountResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: SchemaHeldAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
