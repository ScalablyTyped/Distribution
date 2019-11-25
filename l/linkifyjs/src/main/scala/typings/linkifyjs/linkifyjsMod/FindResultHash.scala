package typings.linkifyjs.linkifyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindResultHash extends js.Object {
  /**
    * Should be the value of this links `href` attribute.
    */
  var href: String
  /**
    * The type of entity found.
    */
  var `type`: LinkEntityType
  /**
    * The original entity substring.
    */
  var value: String
}

object FindResultHash {
  @scala.inline
  def apply(href: String, `type`: LinkEntityType, value: String): FindResultHash = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindResultHash]
  }
}

