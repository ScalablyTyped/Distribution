package typings.kiwicomOrbitDesignTokens.mod

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
    val __obj = js.Dynamic.literal(light = light.asInstanceOf[js.Any], lightActive = lightActive.asInstanceOf[js.Any], lightHover = lightHover.asInstanceOf[js.Any], lighter = lighter.asInstanceOf[js.Any], lighterActive = lighterActive.asInstanceOf[js.Any], lighterHover = lighterHover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], normalActive = normalActive.asInstanceOf[js.Any], normalHover = normalHover.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InkColor]
  }
}

