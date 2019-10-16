package typings.atHigButton.atHigButtonMod

import org.scalablytyped.runtime.TopLevel
import typings.atHigButton.atHigButtonStrings.grow
import typings.atHigButton.atHigButtonStrings.shrink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Widths extends js.Object {
  var GROW: grow
  var SHRINK: shrink
}

object Widths {
  @scala.inline
  def apply(GROW: grow, SHRINK: shrink): Widths = {
    val __obj = js.Dynamic.literal(GROW = GROW, SHRINK = SHRINK)
  
    __obj.asInstanceOf[Widths]
  }
}

@JSImport("@hig/button", "widths")
@js.native
object widths extends TopLevel[Widths]

