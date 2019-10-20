package typings.grommet

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundBorder extends js.Object {
  var background: BackgroundType
  var border: Anon_Radius
  var shadowSize: String
  var zIndex: String
}

object Anon_BackgroundBorder {
  @scala.inline
  def apply(background: BackgroundType, border: Anon_Radius, shadowSize: String, zIndex: String): Anon_BackgroundBorder = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border, shadowSize = shadowSize, zIndex = zIndex)
  
    __obj.asInstanceOf[Anon_BackgroundBorder]
  }
}

