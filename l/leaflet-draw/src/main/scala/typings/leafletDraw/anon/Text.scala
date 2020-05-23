package typings.leafletDraw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var subtext: String
  var text: String
}

object Text {
  @scala.inline
  def apply(subtext: String, text: String): Text = {
    val __obj = js.Dynamic.literal(subtext = subtext.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

