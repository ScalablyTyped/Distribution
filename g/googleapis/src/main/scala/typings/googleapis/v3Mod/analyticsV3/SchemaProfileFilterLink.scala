package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for an Analytics profile filter link.
  */
@js.native
trait SchemaProfileFilterLink extends js.Object {
  /**
    * Filter for this link.
    */
  var filterRef: js.UndefOr[SchemaFilterRef] = js.native
  /**
    * Profile filter link ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for Analytics filter.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * View (Profile) for this link.
    */
  var profileRef: js.UndefOr[SchemaProfileRef] = js.native
  /**
    * The rank of this profile filter link relative to the other filters linked
    * to the same profile. For readonly (i.e., list and get) operations, the
    * rank always starts at 1. For write (i.e., create, update, or delete)
    * operations, you may specify a value between 0 and 255 inclusively, [0,
    * 255]. In order to insert a link at the end of the list, either don&#39;t
    * specify a rank or set a rank to a number greater than the largest rank in
    * the list. In order to insert a link to the beginning of the list specify
    * a rank that is less than or equal to 1. The new link will move all
    * existing filters with the same or lower rank down the list. After the
    * link is inserted/updated/deleted all profile filter links will be
    * renumbered starting at 1.
    */
  var rank: js.UndefOr[Double] = js.native
  /**
    * Link for this profile filter link.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaProfileFilterLink {
  @scala.inline
  def apply(
    filterRef: SchemaFilterRef = null,
    id: String = null,
    kind: String = null,
    profileRef: SchemaProfileRef = null,
    rank: js.UndefOr[Double] = js.undefined,
    selfLink: String = null
  ): SchemaProfileFilterLink = {
    val __obj = js.Dynamic.literal()
    if (filterRef != null) __obj.updateDynamic("filterRef")(filterRef.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (profileRef != null) __obj.updateDynamic("profileRef")(profileRef.asInstanceOf[js.Any])
    if (!js.isUndefined(rank)) __obj.updateDynamic("rank")(rank.get.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProfileFilterLink]
  }
}

