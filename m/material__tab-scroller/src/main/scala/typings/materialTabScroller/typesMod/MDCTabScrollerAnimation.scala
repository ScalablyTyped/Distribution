package typings.materialTabScroller.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabScrollerAnimation extends js.Object {
  var finalScrollPosition: Double
  var scrollDelta: Double
}

object MDCTabScrollerAnimation {
  @scala.inline
  def apply(finalScrollPosition: Double, scrollDelta: Double): MDCTabScrollerAnimation = {
    val __obj = js.Dynamic.literal(finalScrollPosition = finalScrollPosition.asInstanceOf[js.Any], scrollDelta = scrollDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MDCTabScrollerAnimation]
  }
}

