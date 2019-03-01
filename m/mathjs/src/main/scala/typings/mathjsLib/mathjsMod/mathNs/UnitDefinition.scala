package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitDefinition extends js.Object {
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var definition: js.UndefOr[java.lang.String | Unit] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var prefixes: js.UndefOr[java.lang.String] = js.undefined
}

object UnitDefinition {
  @scala.inline
  def apply(
    aliases: js.Array[java.lang.String] = null,
    definition: java.lang.String | Unit = null,
    offset: scala.Int | scala.Double = null,
    prefixes: java.lang.String = null
  ): UnitDefinition = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes)
    __obj.asInstanceOf[UnitDefinition]
  }
}

