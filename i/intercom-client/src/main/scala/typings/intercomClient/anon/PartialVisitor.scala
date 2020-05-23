package typings.intercomClient.anon

import org.scalablytyped.runtime.StringDictionary
import typings.intercomClient.intercomClientStrings.visitor
import typings.intercomClient.tagMod.Tag
import typings.intercomClient.userMod.Avatar
import typings.intercomClient.userMod.LocationData
import typings.intercomClient.userMod.Segment
import typings.intercomClient.userMod.SocialProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/Visitor.Visitor> */
trait PartialVisitor extends js.Object {
  var avatar: js.UndefOr[Avatar] = js.undefined
  var created_at: js.UndefOr[Double] = js.undefined
  var custom_attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var last_request_at: js.UndefOr[Double] = js.undefined
  var location_data: js.UndefOr[LocationData | js.Object] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var segments: js.UndefOr[js.Array[Segment]] = js.undefined
  var social_profiles: js.UndefOr[js.Array[SocialProfile]] = js.undefined
  var tags: js.UndefOr[js.Array[Tag]] = js.undefined
  var `type`: js.UndefOr[visitor] = js.undefined
  var unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined
  var updated_at: js.UndefOr[Double] = js.undefined
  var user_id: js.UndefOr[String] = js.undefined
}

object PartialVisitor {
  @scala.inline
  def apply(
    avatar: Avatar = null,
    created_at: js.UndefOr[Double] = js.undefined,
    custom_attributes: StringDictionary[js.Any] = null,
    id: String = null,
    last_request_at: js.UndefOr[Double] = js.undefined,
    location_data: LocationData | js.Object = null,
    name: String = null,
    segments: js.Array[Segment] = null,
    social_profiles: js.Array[SocialProfile] = null,
    tags: js.Array[Tag] = null,
    `type`: visitor = null,
    unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined,
    updated_at: js.UndefOr[Double] = js.undefined,
    user_id: String = null
  ): PartialVisitor = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (!js.isUndefined(created_at)) __obj.updateDynamic("created_at")(created_at.get.asInstanceOf[js.Any])
    if (custom_attributes != null) __obj.updateDynamic("custom_attributes")(custom_attributes.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(last_request_at)) __obj.updateDynamic("last_request_at")(last_request_at.get.asInstanceOf[js.Any])
    if (location_data != null) __obj.updateDynamic("location_data")(location_data.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (social_profiles != null) __obj.updateDynamic("social_profiles")(social_profiles.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unsubscribed_from_emails)) __obj.updateDynamic("unsubscribed_from_emails")(unsubscribed_from_emails.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updated_at)) __obj.updateDynamic("updated_at")(updated_at.get.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialVisitor]
  }
}

