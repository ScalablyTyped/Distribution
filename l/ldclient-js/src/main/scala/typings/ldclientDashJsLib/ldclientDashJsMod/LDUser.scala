package typings
package ldclientDashJsLib.ldclientDashJsMod

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
    ScalablyTyped.runtime.StringDictionary[
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
}

