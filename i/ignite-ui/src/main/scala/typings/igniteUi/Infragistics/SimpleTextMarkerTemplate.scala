package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTextMarkerTemplate extends js.Object {
  def getText(item: js.Object, textDelegate: js.Object): Unit
  def measure(measureInfo: js.Object): Unit
  def render(renderInfo: js.Object): Unit
}

object SimpleTextMarkerTemplate {
  @scala.inline
  def apply(getText: (js.Object, js.Object) => Unit, measure: js.Object => Unit, render: js.Object => Unit): SimpleTextMarkerTemplate = {
    val __obj = js.Dynamic.literal(getText = js.Any.fromFunction2(getText), measure = js.Any.fromFunction1(measure), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[SimpleTextMarkerTemplate]
  }
}

