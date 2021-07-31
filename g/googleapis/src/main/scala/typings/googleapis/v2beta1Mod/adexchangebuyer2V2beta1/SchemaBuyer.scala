package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a buyer of inventory. Each buyer is identified by a unique
  * Authorized Buyers account ID.
  */
trait SchemaBuyer extends StObject {
  
  /**
    * Authorized Buyers account ID of the buyer.
    */
  var accountId: js.UndefOr[String] = js.undefined
}
object SchemaBuyer {
  
  @scala.inline
  def apply(): SchemaBuyer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuyer]
  }
  
  @scala.inline
  implicit class SchemaBuyerMutableBuilder[Self <: SchemaBuyer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
