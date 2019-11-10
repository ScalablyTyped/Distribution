package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DarkLight extends js.Object {
  var dark: String | js.Array[String]
  var light: String | js.Array[String]
}

object Anon_DarkLight {
  @scala.inline
  def apply(dark: String | js.Array[String], light: String | js.Array[String]): Anon_DarkLight = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DarkLight]
  }
}

