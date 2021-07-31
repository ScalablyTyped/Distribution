package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuctionContext extends StObject {
  
  /** The auction types this restriction applies to. */
  var auctionTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object AuctionContext {
  
  @scala.inline
  def apply(): AuctionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuctionContext]
  }
  
  @scala.inline
  implicit class AuctionContextMutableBuilder[Self <: AuctionContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuctionTypes(value: js.Array[String]): Self = StObject.set(x, "auctionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuctionTypesUndefined: Self = StObject.set(x, "auctionTypes", js.undefined)
    
    @scala.inline
    def setAuctionTypesVarargs(value: String*): Self = StObject.set(x, "auctionTypes", js.Array(value :_*))
  }
}
