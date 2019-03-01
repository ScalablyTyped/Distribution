package typings
package knockoutDotMappingLib.knockoutDotMappingMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutStatic extends js.Object {
  var mapping: KnockoutMapping
}

object KnockoutStatic {
  @scala.inline
  def apply(mapping: KnockoutMapping): KnockoutStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mapping")(mapping)
    __obj.asInstanceOf[KnockoutStatic]
  }
}

