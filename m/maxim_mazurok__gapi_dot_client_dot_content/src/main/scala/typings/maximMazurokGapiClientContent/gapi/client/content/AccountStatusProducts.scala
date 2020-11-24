package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountStatusProducts extends js.Object {
  
  /** The channel the data applies to. Acceptable values are: - "`local`" - "`online`" */
  var channel: js.UndefOr[String] = js.native
  
  /** The country the data applies to. */
  var country: js.UndefOr[String] = js.native
  
  /** The destination the data applies to. */
  var destination: js.UndefOr[String] = js.native
  
  /** List of item-level issues. */
  var itemLevelIssues: js.UndefOr[js.Array[AccountStatusItemLevelIssue]] = js.native
  
  /** Aggregated product statistics. */
  var statistics: js.UndefOr[AccountStatusStatistics] = js.native
}
object AccountStatusProducts {
  
  @scala.inline
  def apply(): AccountStatusProducts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatusProducts]
  }
  
  @scala.inline
  implicit class AccountStatusProductsOps[Self <: AccountStatusProducts] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setItemLevelIssuesVarargs(value: AccountStatusItemLevelIssue*): Self = this.set("itemLevelIssues", js.Array(value :_*))
    
    @scala.inline
    def setItemLevelIssues(value: js.Array[AccountStatusItemLevelIssue]): Self = this.set("itemLevelIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemLevelIssues: Self = this.set("itemLevelIssues", js.undefined)
    
    @scala.inline
    def setStatistics(value: AccountStatusStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
  }
}
