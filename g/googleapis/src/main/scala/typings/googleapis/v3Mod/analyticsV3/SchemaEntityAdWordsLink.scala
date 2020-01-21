package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.AnonWebPropertyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Analytics Entity Google Ads Link.
  */
@js.native
trait SchemaEntityAdWordsLink extends js.Object {
  /**
    * A list of Google Ads client accounts. These cannot be MCC accounts. This
    * field is required when creating a Google Ads link. It cannot be empty.
    */
  var adWordsAccounts: js.UndefOr[js.Array[SchemaAdWordsAccount]] = js.native
  /**
    * Web property being linked.
    */
  var entity: js.UndefOr[AnonWebPropertyRef] = js.native
  /**
    * Entity Google Ads link ID
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type for entity Google Ads link.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the link. This field is required when creating a Google Ads link.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * IDs of linked Views (Profiles) represented as strings.
    */
  var profileIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * URL link for this Google Analytics - Google Ads link.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaEntityAdWordsLink {
  @scala.inline
  def apply(
    adWordsAccounts: js.Array[SchemaAdWordsAccount] = null,
    entity: AnonWebPropertyRef = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    profileIds: js.Array[String] = null,
    selfLink: String = null
  ): SchemaEntityAdWordsLink = {
    val __obj = js.Dynamic.literal()
    if (adWordsAccounts != null) __obj.updateDynamic("adWordsAccounts")(adWordsAccounts.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profileIds != null) __obj.updateDynamic("profileIds")(profileIds.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEntityAdWordsLink]
  }
}

