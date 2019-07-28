package typings.instabugDashReactnative.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorTheme extends js.Object {
  var dark: String
  var light: String
}

object ColorTheme {
  @scala.inline
  def apply(dark: String, light: String): ColorTheme = {
    val __obj = js.Dynamic.literal(dark = dark, light = light)
  
    __obj.asInstanceOf[ColorTheme]
  }
}

