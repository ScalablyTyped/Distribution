package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the size of an ad unit that can be targeted on an ad request. It
  * only applies to Private Auction, AdX Preferred Deals and Auction Packages.
  * This targeting does not apply to Programmatic Guaranteed and Preferred
  * Deals in Ad Manager.
  */
@js.native
trait SchemaInventorySizeTargeting extends js.Object {
  /**
    * A list of inventory sizes to be excluded.
    */
  var excludedInventorySizes: js.UndefOr[js.Array[SchemaAdSize]] = js.native
  /**
    * A list of inventory sizes to be included.
    */
  var targetedInventorySizes: js.UndefOr[js.Array[SchemaAdSize]] = js.native
}

object SchemaInventorySizeTargeting {
  @scala.inline
  def apply(
    excludedInventorySizes: js.Array[SchemaAdSize] = null,
    targetedInventorySizes: js.Array[SchemaAdSize] = null
  ): SchemaInventorySizeTargeting = {
    val __obj = js.Dynamic.literal()
    if (excludedInventorySizes != null) __obj.updateDynamic("excludedInventorySizes")(excludedInventorySizes.asInstanceOf[js.Any])
    if (targetedInventorySizes != null) __obj.updateDynamic("targetedInventorySizes")(targetedInventorySizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInventorySizeTargeting]
  }
}

