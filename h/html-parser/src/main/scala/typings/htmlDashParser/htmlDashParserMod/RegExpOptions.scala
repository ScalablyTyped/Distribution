package typings.htmlDashParser.htmlDashParserMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegExpOptions extends js.Object {
  var attribute: js.UndefOr[RegExp] = js.undefined
  var name: js.UndefOr[RegExp] = js.undefined
}

object RegExpOptions {
  @scala.inline
  def apply(attribute: RegExp = null, name: RegExp = null): RegExpOptions = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[RegExpOptions]
  }
}

