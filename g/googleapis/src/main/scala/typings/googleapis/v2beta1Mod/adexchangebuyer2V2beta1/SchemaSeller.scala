package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a seller of inventory. Each seller is identified by a unique Ad
  * Manager account ID.
  */
@js.native
trait SchemaSeller extends js.Object {
  
  /**
    * The unique ID for the seller. The seller fills in this field. The seller
    * account ID is then available to buyer in the product.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Optional sub-account ID for the seller.
    */
  var subAccountId: js.UndefOr[String] = js.native
}
object SchemaSeller {
  
  @scala.inline
  def apply(): SchemaSeller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeller]
  }
  
  @scala.inline
  implicit class SchemaSellerOps[Self <: SchemaSeller] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setSubAccountId(value: String): Self = this.set("subAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubAccountId: Self = this.set("subAccountId", js.undefined)
  }
}
