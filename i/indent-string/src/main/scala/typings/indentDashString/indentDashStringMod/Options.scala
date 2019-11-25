package typings.indentDashString.indentDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Also indent empty lines.
  		@default false
  		*/
  val includeEmptyLines: js.UndefOr[Boolean] = js.undefined
  /**
  		The string to use for the indent.
  		@default ' '
  		*/
  val indent: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(includeEmptyLines: js.UndefOr[Boolean] = js.undefined, indent: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeEmptyLines)) __obj.updateDynamic("includeEmptyLines")(includeEmptyLines.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

