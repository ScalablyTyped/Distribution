package typings.log4js.log4jsMod

import typings.log4js.log4jsStrings.basic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayout extends Layout {
  var `type`: basic
}

object BaseLayout {
  @scala.inline
  def apply(`type`: basic): BaseLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseLayout]
  }
}

