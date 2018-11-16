package typings
package mailparserLib.mailparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Address details.
 */

trait EmailAddress extends js.Object {
  /**
  	 * The email address.
  	 */
  var address: java.lang.String
  /**
  	 * An array of grouped addresses.
  	 */
  var group: js.UndefOr[js.Array[EmailAddress]] = js.undefined
  /**
  	 * The name part of the email/group.
  	 */
  var name: java.lang.String
}

