package typings.linkifyjs.reactMod

import typings.linkifyjs.linkifyjsMod.LinkifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkifyProps extends js.Object {
  var options: js.UndefOr[LinkifyOptions] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
}

object LinkifyProps {
  @scala.inline
  def apply(options: LinkifyOptions = null, tagName: String = null): LinkifyProps = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[LinkifyProps]
  }
}

