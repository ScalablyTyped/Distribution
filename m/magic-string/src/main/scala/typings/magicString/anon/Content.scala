package typings.magicString.anon

import typings.magicString.mod.MagicString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: MagicString
  var filename: js.UndefOr[String] = js.undefined
}

object Content {
  @scala.inline
  def apply(content: MagicString, filename: String = null): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

