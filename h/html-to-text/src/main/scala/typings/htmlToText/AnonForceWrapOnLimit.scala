package typings.htmlToText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceWrapOnLimit extends js.Object {
  /**
    * defines whether to break long words on the limit if true.
    */
  var forceWrapOnLimit: Boolean
  /**
    * an array containing the characters that may be wrapped on.
    * These are used in order.
    */
  var wrapCharacters: js.Array[String]
}

object AnonForceWrapOnLimit {
  @scala.inline
  def apply(forceWrapOnLimit: Boolean, wrapCharacters: js.Array[String]): AnonForceWrapOnLimit = {
    val __obj = js.Dynamic.literal(forceWrapOnLimit = forceWrapOnLimit.asInstanceOf[js.Any], wrapCharacters = wrapCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceWrapOnLimit]
  }
}

