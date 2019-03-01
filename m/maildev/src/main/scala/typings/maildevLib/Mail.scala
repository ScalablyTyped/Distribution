package typings
package maildevLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for mail.
  */
trait Mail extends js.Object {
  /**
    * Client.
    */
  var envelope: js.UndefOr[js.Object] = js.undefined
  /**
    * Identifier.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Mail {
  @scala.inline
  def apply(envelope: js.Object = null, id: java.lang.String = null): Mail = {
    val __obj = js.Dynamic.literal()
    if (envelope != null) __obj.updateDynamic("envelope")(envelope)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Mail]
  }
}

