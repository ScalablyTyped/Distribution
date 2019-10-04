package typings.atKiwicomOrbitDashDesignDashTokens.atKiwicomOrbitDashDesignDashTokensMod

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
    val __obj = js.Dynamic.literal(blue = blue, cloud = cloud, green = green, ink = ink, orange = orange, product = product, red = red, social = social, white = white)
  
    __obj.asInstanceOf[Palette]
  }
}

