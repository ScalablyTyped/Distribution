package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDarkLight extends js.Object {
  var dark: String | js.Array[String]
  var light: String | js.Array[String]
}

object AnonDarkLight {
  @scala.inline
  def apply(dark: String | js.Array[String], light: String | js.Array[String]): AnonDarkLight = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDarkLight]
  }
}

