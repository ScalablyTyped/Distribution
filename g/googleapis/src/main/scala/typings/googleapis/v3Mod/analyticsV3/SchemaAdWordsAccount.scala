package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Google Ads account.
  */
@js.native
trait SchemaAdWordsAccount extends js.Object {
  
  /**
    * True if auto-tagging is enabled on the Google Ads account. Read-only
    * after the insert operation.
    */
  var autoTaggingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Customer ID. This field is required when creating a Google Ads link.
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * Resource type for Google Ads account.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaAdWordsAccount {
  
  @scala.inline
  def apply(): SchemaAdWordsAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdWordsAccount]
  }
  
  @scala.inline
  implicit class SchemaAdWordsAccountOps[Self <: SchemaAdWordsAccount] (val x: Self) extends AnyVal {
    
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
    def setAutoTaggingEnabled(value: Boolean): Self = this.set("autoTaggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoTaggingEnabled: Self = this.set("autoTaggingEnabled", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
