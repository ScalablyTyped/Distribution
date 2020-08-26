package typings.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Palette extends js.Object {
  var blue: StatusColor = js.native
  var cloud: CloudColor = js.native
  var green: StatusColor = js.native
  var ink: InkColor = js.native
  var orange: StatusColor = js.native
  var product: ProductColor = js.native
  var red: StatusColor = js.native
  var social: SocialColor = js.native
  var white: WhiteColor = js.native
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
  @scala.inline
  implicit class PaletteOps[Self <: Palette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlue(value: StatusColor): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloud(value: CloudColor): Self = this.set("cloud", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreen(value: StatusColor): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def setInk(value: InkColor): Self = this.set("ink", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrange(value: StatusColor): Self = this.set("orange", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduct(value: ProductColor): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def setRed(value: StatusColor): Self = this.set("red", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocial(value: SocialColor): Self = this.set("social", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhite(value: WhiteColor): Self = this.set("white", value.asInstanceOf[js.Any])
  }
  
}

