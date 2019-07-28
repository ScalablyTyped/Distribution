package typings.hammerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssProps extends js.Object {
  var contentZooming: String
  var tapHighlightColor: String
  var touchCallout: String
  var touchSelect: String
  var userDrag: String
  var userSelect: String
}

object CssProps {
  @scala.inline
  def apply(
    contentZooming: String,
    tapHighlightColor: String,
    touchCallout: String,
    touchSelect: String,
    userDrag: String,
    userSelect: String
  ): CssProps = {
    val __obj = js.Dynamic.literal(contentZooming = contentZooming, tapHighlightColor = tapHighlightColor, touchCallout = touchCallout, touchSelect = touchSelect, userDrag = userDrag, userSelect = userSelect)
  
    __obj.asInstanceOf[CssProps]
  }
}

