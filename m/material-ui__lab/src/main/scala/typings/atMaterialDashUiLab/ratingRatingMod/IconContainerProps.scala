package typings.atMaterialDashUiLab.ratingRatingMod

import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconContainerProps extends HTMLAttributes[HTMLSpanElement] {
  var value: Double
}

object IconContainerProps {
  @scala.inline
  def apply(value: Double, HTMLAttributes: HTMLAttributes[HTMLSpanElement] = null): IconContainerProps = {
    val __obj = js.Dynamic.literal(value = value)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    __obj.asInstanceOf[IconContainerProps]
  }
}

