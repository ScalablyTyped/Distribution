package typings.htmlToText.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsAttributeValue extends js.Object {
  var isAttributeValue: Boolean
  var strict: Boolean
}

object IsAttributeValue {
  @scala.inline
  def apply(isAttributeValue: Boolean, strict: Boolean): IsAttributeValue = {
    val __obj = js.Dynamic.literal(isAttributeValue = isAttributeValue.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAttributeValue]
  }
}

