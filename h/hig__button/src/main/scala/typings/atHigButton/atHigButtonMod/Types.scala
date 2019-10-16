package typings.atHigButton.atHigButtonMod

import org.scalablytyped.runtime.TopLevel
import typings.atHigButton.atHigButtonStrings.flat
import typings.atHigButton.atHigButtonStrings.outline
import typings.atHigButton.atHigButtonStrings.primary
import typings.atHigButton.atHigButtonStrings.secondary
import typings.atHigButton.atHigButtonStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var FLAT: flat
  var OUTLINE: outline
  /** @deprecated */
  var PRIMARY: primary
  /** @deprecated */
  var SECONDARY: secondary
  var SOLID: solid
}

object Types {
  @scala.inline
  def apply(FLAT: flat, OUTLINE: outline, PRIMARY: primary, SECONDARY: secondary, SOLID: solid): Types = {
    val __obj = js.Dynamic.literal(FLAT = FLAT, OUTLINE = OUTLINE, PRIMARY = PRIMARY, SECONDARY = SECONDARY, SOLID = SOLID)
  
    __obj.asInstanceOf[Types]
  }
}

@JSImport("@hig/button", "types")
@js.native
object types extends TopLevel[Types]

