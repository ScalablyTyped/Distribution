package typings
package imapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Other extends js.Object {
  /** Mailboxes that belong to other users that the logged in user has access to. */
  var other: js.Array[_]
  /** Mailboxes that belong to the logged in user. */
  var personal: js.Array[_]
  /** Mailboxes that are accessible by any logged in user. */
  var shared: js.Array[_]
}

object Anon_Other {
  @scala.inline
  def apply(other: js.Array[_], personal: js.Array[_], shared: js.Array[_]): Anon_Other = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("other")(other)
    __obj.updateDynamic("personal")(personal)
    __obj.updateDynamic("shared")(shared)
    __obj.asInstanceOf[Anon_Other]
  }
}

