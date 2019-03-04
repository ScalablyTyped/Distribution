package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayout extends Layout {
  var `type`: log4jsLib.log4jsLibStrings.basic
}

object BaseLayout {
  @scala.inline
  def apply(`type`: log4jsLib.log4jsLibStrings.basic): BaseLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BaseLayout]
  }
}

