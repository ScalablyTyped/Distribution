package typings.linkifyjs.reactMod

import typings.linkifyjs.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkifyProps extends js.Object {
  var options: js.UndefOr[Options] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
}

object LinkifyProps {
  @scala.inline
  def apply(options: Options = null, tagName: String = null): LinkifyProps = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkifyProps]
  }
}

