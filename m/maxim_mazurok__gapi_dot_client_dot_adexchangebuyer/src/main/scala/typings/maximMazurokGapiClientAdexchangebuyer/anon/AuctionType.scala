package typings.maximMazurokGapiClientAdexchangebuyer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuctionType extends js.Object {
  
  /** Only set when contextType=AUCTION_TYPE. Represents the auction types this restriction applies to. */
  var auctionType: js.UndefOr[js.Array[String]] = js.native
  
  /** The type of context (e.g., location, platform, auction type, SSL-ness). */
  var contextType: js.UndefOr[String] = js.native
  
  /**
    * Only set when contextType=LOCATION. Represents the geo criterias this restriction applies to. Impressions are considered to match a context if either the user location or
    * publisher location matches a given geoCriteriaId.
    */
  var geoCriteriaId: js.UndefOr[js.Array[Double]] = js.native
  
  /** Only set when contextType=PLATFORM. Represents the platforms this restriction applies to. */
  var platform: js.UndefOr[js.Array[String]] = js.native
}
object AuctionType {
  
  @scala.inline
  def apply(): AuctionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuctionType]
  }
  
  @scala.inline
  implicit class AuctionTypeOps[Self <: AuctionType] (val x: Self) extends AnyVal {
    
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
    def setAuctionTypeVarargs(value: String*): Self = this.set("auctionType", js.Array(value :_*))
    
    @scala.inline
    def setAuctionType(value: js.Array[String]): Self = this.set("auctionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuctionType: Self = this.set("auctionType", js.undefined)
    
    @scala.inline
    def setContextType(value: String): Self = this.set("contextType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextType: Self = this.set("contextType", js.undefined)
    
    @scala.inline
    def setGeoCriteriaIdVarargs(value: Double*): Self = this.set("geoCriteriaId", js.Array(value :_*))
    
    @scala.inline
    def setGeoCriteriaId(value: js.Array[Double]): Self = this.set("geoCriteriaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoCriteriaId: Self = this.set("geoCriteriaId", js.undefined)
    
    @scala.inline
    def setPlatformVarargs(value: String*): Self = this.set("platform", js.Array(value :_*))
    
    @scala.inline
    def setPlatform(value: js.Array[String]): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
  }
}
