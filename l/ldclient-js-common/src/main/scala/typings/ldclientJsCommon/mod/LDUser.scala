package typings.ldclientJsCommon.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDUser extends js.Object {
  /**
    * Whether to show the user on the Users page in LaunchDarkly.
    */
  var anonymous: js.UndefOr[Boolean] = js.undefined
  /**
    * An absolute URL to an avatar image for the user.
    */
  var avatar: js.UndefOr[String] = js.undefined
  /**
    * The country associated with the user.
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * Any additional attributes associated with the user.
    */
  var custom: js.UndefOr[
    StringDictionary[String | Boolean | Double | (js.Array[String | Boolean | Double])]
  ] = js.undefined
  /**
    * The user's email address.
    *
    * If an `avatar` URL is not provided, LaunchDarkly will use Gravatar
    * to try to display an avatar for the user on the Users page.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The user's first name.
    */
  var firstName: js.UndefOr[String] = js.undefined
  /**
    * The user's IP address.
    */
  var ip: js.UndefOr[String] = js.undefined
  /**
    * A unique string identifying a user.
    *
    * If you omit this property, and also set `anonymous` to `true`, the SDK will generate a UUID string
    * and use that as the key; it will attempt to persist that value in local storage if possible so the
    * next anonymous user will get the same key, but if local storage is unavailable then it will
    * generate a new key each time you specify the user.
    *
    * It is an error to omit the `key` property if `anonymous` is not set.
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The user's last name.
    */
  var lastName: js.UndefOr[String] = js.undefined
  /**
    * The user's name.
    *
    * You can search for users on the User page by name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Specifies a list of attribute names (either built-in or custom) which should be
    * marked as private, and not sent to LaunchDarkly in analytics events. This is in
    * addition to any private attributes designated in the global configuration
    * with [[LDOptions.privateAttributeNames]] or [[LDOptions.allAttributesPrivate]].
    */
  var privateAttributeNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An optional secondary key for a user. This affects
    * [feature flag targeting](https://docs.launchdarkly.com/docs/targeting-users#section-targeting-rules-based-on-user-attributes)
    * as follows: if you have chosen to bucket users by a specific attribute, the secondary key (if set)
    * is used to further distinguish between users who are otherwise identical according to that attribute.
    */
  var secondary: js.UndefOr[String] = js.undefined
}

object LDUser {
  @scala.inline
  def apply(
    anonymous: js.UndefOr[Boolean] = js.undefined,
    avatar: String = null,
    country: String = null,
    custom: StringDictionary[String | Boolean | Double | (js.Array[String | Boolean | Double])] = null,
    email: String = null,
    firstName: String = null,
    ip: String = null,
    key: String = null,
    lastName: String = null,
    name: String = null,
    privateAttributeNames: js.Array[String] = null,
    secondary: String = null
  ): LDUser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (firstName != null) __obj.updateDynamic("firstName")(firstName.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lastName != null) __obj.updateDynamic("lastName")(lastName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (privateAttributeNames != null) __obj.updateDynamic("privateAttributeNames")(privateAttributeNames.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDUser]
  }
}

