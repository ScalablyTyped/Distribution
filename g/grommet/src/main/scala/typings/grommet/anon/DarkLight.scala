package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DarkLight extends js.Object {
  var dark: String | js.Array[String]
  var light: String | js.Array[String]
}

object DarkLight {
  @scala.inline
  def apply(dark: String | js.Array[String], light: String | js.Array[String]): DarkLight = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[DarkLight]
  }
}

