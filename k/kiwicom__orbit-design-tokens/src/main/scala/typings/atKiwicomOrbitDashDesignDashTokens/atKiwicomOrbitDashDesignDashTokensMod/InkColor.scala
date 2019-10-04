package typings.atKiwicomOrbitDashDesignDashTokens.atKiwicomOrbitDashDesignDashTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InkColor extends js.Object {
  var light: String
  var lightActive: String
  var lightHover: String
  var lighter: String
  var lighterActive: String
  var lighterHover: String
  var normal: String
  var normalActive: String
  var normalHover: String
}

object InkColor {
  @scala.inline
  def apply(
    light: String,
    lightActive: String,
    lightHover: String,
    lighter: String,
    lighterActive: String,
    lighterHover: String,
    normal: String,
    normalActive: String,
    normalHover: String
  ): InkColor = {
    val __obj = js.Dynamic.literal(light = light, lightActive = lightActive, lightHover = lightHover, lighter = lighter, lighterActive = lighterActive, lighterHover = lighterHover, normal = normal, normalActive = normalActive, normalHover = normalHover)
  
    __obj.asInstanceOf[InkColor]
  }
}

