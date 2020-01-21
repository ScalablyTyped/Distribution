package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Palette extends js.Object {
  var blue: StatusColor
  var cloud: CloudColor
  var green: StatusColor
  var ink: InkColor
  var orange: StatusColor
  var product: ProductColor
  var red: StatusColor
  var social: SocialColor
  var white: WhiteColor
}

object Palette {
  @scala.inline
  def apply(
    blue: StatusColor,
    cloud: CloudColor,
    green: StatusColor,
    ink: InkColor,
    orange: StatusColor,
    product: ProductColor,
    red: StatusColor,
    social: SocialColor,
    white: WhiteColor
  ): Palette = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], cloud = cloud.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], ink = ink.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], social = social.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Palette]
  }
}

