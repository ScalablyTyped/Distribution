package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly The auction type the restriction applies to.
  */
@js.native
trait SchemaAuctionContext extends js.Object {
  /**
    * The auction types this restriction applies to.
    */
  var auctionTypes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAuctionContext {
  @scala.inline
  def apply(auctionTypes: js.Array[String] = null): SchemaAuctionContext = {
    val __obj = js.Dynamic.literal()
    if (auctionTypes != null) __obj.updateDynamic("auctionTypes")(auctionTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuctionContext]
  }
}

