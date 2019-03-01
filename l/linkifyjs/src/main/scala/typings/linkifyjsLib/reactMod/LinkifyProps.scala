package typings
package linkifyjsLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkifyProps extends js.Object {
  var options: js.UndefOr[linkifyjsLib.linkifyjsMod.LinkifyOptions] = js.undefined
  var tagName: js.UndefOr[java.lang.String] = js.undefined
}

object LinkifyProps {
  @scala.inline
  def apply(options: linkifyjsLib.linkifyjsMod.LinkifyOptions = null, tagName: java.lang.String = null): LinkifyProps = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[LinkifyProps]
  }
}

