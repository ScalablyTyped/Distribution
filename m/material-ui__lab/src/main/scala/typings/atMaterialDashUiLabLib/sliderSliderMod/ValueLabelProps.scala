package typings
package atMaterialDashUiLabLib.sliderSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueLabelProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLSpanElement] {
  @JSName("children")
  var children_ValueLabelProps: reactLib.reactMod.ReactElement
  var open: scala.Boolean
  var value: scala.Double
}

object ValueLabelProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactElement,
    open: scala.Boolean,
    value: scala.Double,
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLSpanElement] = null
  ): ValueLabelProps = {
    val __obj = js.Dynamic.literal(children = children, open = open, value = value)
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    __obj.asInstanceOf[ValueLabelProps]
  }
}

