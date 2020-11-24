package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuctionContext extends js.Object {
  
  /** The auction types this restriction applies to. */
  var auctionTypes: js.UndefOr[js.Array[String]] = js.native
}
object AuctionContext {
  
  @scala.inline
  def apply(): AuctionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuctionContext]
  }
  
  @scala.inline
  implicit class AuctionContextOps[Self <: AuctionContext] (val x: Self) extends AnyVal {
    
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
    def setAuctionTypesVarargs(value: String*): Self = this.set("auctionTypes", js.Array(value :_*))
    
    @scala.inline
    def setAuctionTypes(value: js.Array[String]): Self = this.set("auctionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuctionTypes: Self = this.set("auctionTypes", js.undefined)
  }
}
