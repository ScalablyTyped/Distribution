package typings.atKiwicomOrbitDashDesignDashTokens.atKiwicomOrbitDashDesignDashTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudColor extends js.Object {
  var dark: String
  var light: String
  var lightActive: String
  var lightHover: String
  var normal: String
  var normalActive: String
  var normalHover: String
}

object CloudColor {
  @scala.inline
  def apply(
    dark: String,
    light: String,
    lightActive: String,
    lightHover: String,
    normal: String,
    normalActive: String,
    normalHover: String
  ): CloudColor = {
    val __obj = js.Dynamic.literal(dark = dark, light = light, lightActive = lightActive, lightHover = lightHover, normal = normal, normalActive = normalActive, normalHover = normalHover)
  
    __obj.asInstanceOf[CloudColor]
  }
}

