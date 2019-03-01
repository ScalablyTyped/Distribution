package typings
package hammerjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssProps extends js.Object {
  var contentZooming: java.lang.String
  var tapHighlightColor: java.lang.String
  var touchCallout: java.lang.String
  var touchSelect: java.lang.String
  var userDrag: java.lang.String
  var userSelect: java.lang.String
}

object CssProps {
  @scala.inline
  def apply(
    contentZooming: java.lang.String,
    tapHighlightColor: java.lang.String,
    touchCallout: java.lang.String,
    touchSelect: java.lang.String,
    userDrag: java.lang.String,
    userSelect: java.lang.String
  ): CssProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentZooming")(contentZooming)
    __obj.updateDynamic("tapHighlightColor")(tapHighlightColor)
    __obj.updateDynamic("touchCallout")(touchCallout)
    __obj.updateDynamic("touchSelect")(touchSelect)
    __obj.updateDynamic("userDrag")(userDrag)
    __obj.updateDynamic("userSelect")(userSelect)
    __obj.asInstanceOf[CssProps]
  }
}

