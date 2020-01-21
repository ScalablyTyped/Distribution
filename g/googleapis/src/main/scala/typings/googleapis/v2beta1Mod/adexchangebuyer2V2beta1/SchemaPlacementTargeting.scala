package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents targeting about where the ads can appear, e.g., certain sites or
  * mobile applications. Different placement targeting types will be logically
  * OR&#39;ed.
  */
@js.native
trait SchemaPlacementTargeting extends js.Object {
  /**
    * Mobile application targeting information in a deal. This doesn&#39;t
    * apply to Auction Packages.
    */
  var mobileApplicationTargeting: js.UndefOr[SchemaMobileApplicationTargeting] = js.native
  /**
    * URLs to be included/excluded.
    */
  var urlTargeting: js.UndefOr[SchemaUrlTargeting] = js.native
}

object SchemaPlacementTargeting {
  @scala.inline
  def apply(
    mobileApplicationTargeting: SchemaMobileApplicationTargeting = null,
    urlTargeting: SchemaUrlTargeting = null
  ): SchemaPlacementTargeting = {
    val __obj = js.Dynamic.literal()
    if (mobileApplicationTargeting != null) __obj.updateDynamic("mobileApplicationTargeting")(mobileApplicationTargeting.asInstanceOf[js.Any])
    if (urlTargeting != null) __obj.updateDynamic("urlTargeting")(urlTargeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlacementTargeting]
  }
}

