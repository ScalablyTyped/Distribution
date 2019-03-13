package typings
package ldclientDashJsDashCommonLib.ldclientDashJsDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDUser extends js.Object {
  /**
    * Whether to show the user on the Users page in LaunchDarkly.
    */
  var anonymous: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An absolute URL to an avatar image for the user.
    */
  var avatar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The country associated with the user.
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Any additional attributes associated with the user.
    */
  var custom: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Boolean | scala.Double | (js.Array[java.lang.String | scala.Boolean | scala.Double])
    ]
  ] = js.undefined
  /**
    * The user's email address.
    *
    * If an `avatar` URL is not provided, LaunchDarkly will use Gravatar
    * to try to display an avatar for the user on the Users page.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user's first name.
    */
  var firstName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user's IP address.
    */
  var ip: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A unique string identifying a user.
    */
  var key: java.lang.String
  /**
    * The user's last name.
    */
  var lastName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user's name.
    *
    * You can search for users on the User page by name.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies a list of attribute names (either built-in or custom) which should be
    * marked as private, and not sent to LaunchDarkly in analytics events. This is in
    * addition to any private attributes designated in the global configuration
    * with [[LDOptions.privateAttributeNames]] or [[LDOptions.allAttributesPrivate]].
    */
  var privateAttributeNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An optional secondary key for a user. This affects
    * [feature flag targeting](https://docs.launchdarkly.com/docs/targeting-users#section-targeting-rules-based-on-user-attributes)
    * as follows: if you have chosen to bucket users by a specific attribute, the secondary key (if set)
    * is used to further distinguish between users who are otherwise identical according to that attribute.
    */
  var secondary: js.UndefOr[java.lang.String] = js.undefined
}

object LDUser {
  @scala.inline
  def apply(
    key: java.lang.String,
    anonymous: js.UndefOr[scala.Boolean] = js.undefined,
    avatar: java.lang.String = null,
    country: java.lang.String = null,
    custom: org.scalablytyped.runtime.StringDictionary[
      java.lang.String | scala.Boolean | scala.Double | (js.Array[java.lang.String | scala.Boolean | scala.Double])
    ] = null,
    email: java.lang.String = null,
    firstName: java.lang.String = null,
    ip: java.lang.String = null,
    lastName: java.lang.String = null,
    name: java.lang.String = null,
    privateAttributeNames: js.Array[java.lang.String] = null,
    secondary: java.lang.String = null
  ): LDUser = {
    val __obj = js.Dynamic.literal(key = key)
    if (!js.isUndefined(anonymous)) __obj.updateDynamic("anonymous")(anonymous)
    if (avatar != null) __obj.updateDynamic("avatar")(avatar)
    if (country != null) __obj.updateDynamic("country")(country)
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (email != null) __obj.updateDynamic("email")(email)
    if (firstName != null) __obj.updateDynamic("firstName")(firstName)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (lastName != null) __obj.updateDynamic("lastName")(lastName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (privateAttributeNames != null) __obj.updateDynamic("privateAttributeNames")(privateAttributeNames)
    if (secondary != null) __obj.updateDynamic("secondary")(secondary)
    __obj.asInstanceOf[LDUser]
  }
}

