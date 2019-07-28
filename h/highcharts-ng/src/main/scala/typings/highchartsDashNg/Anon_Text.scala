package typings.highchartsDashNg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Text extends js.Object {
  var text: js.UndefOr[String] = js.undefined
}

object Anon_Text {
  @scala.inline
  def apply(text: String = null): Anon_Text = {
    val __obj = js.Dynamic.literal()
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Text]
  }
}

