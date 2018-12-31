package typings
package imapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Shared extends js.Object {
  /** Mailboxes that belong to other users that the logged in user has access to. */
  var other: js.Array[_]
  /** Mailboxes that belong to the logged in user. */
  var personal: js.Array[_]
  /** Mailboxes that are accessible by any logged in user. */
  var shared: js.Array[_]
}

