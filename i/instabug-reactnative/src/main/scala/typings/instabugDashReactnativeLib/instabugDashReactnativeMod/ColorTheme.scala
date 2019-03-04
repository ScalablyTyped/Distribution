package typings
package instabugDashReactnativeLib.instabugDashReactnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorTheme extends js.Object {
  var dark: java.lang.String
  var light: java.lang.String
}

object ColorTheme {
  @scala.inline
  def apply(dark: java.lang.String, light: java.lang.String): ColorTheme = {
    val __obj = js.Dynamic.literal(dark = dark, light = light)
  
    __obj.asInstanceOf[ColorTheme]
  }
}

