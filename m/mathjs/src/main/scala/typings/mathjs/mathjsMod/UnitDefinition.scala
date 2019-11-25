package typings.mathjs.mathjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitDefinition extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var definition: js.UndefOr[String | Unit] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var prefixes: js.UndefOr[String] = js.undefined
}

object UnitDefinition {
  @scala.inline
  def apply(
    aliases: js.Array[String] = null,
    definition: String | Unit = null,
    offset: Int | Double = null,
    prefixes: String = null
  ): UnitDefinition = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (prefixes != null) __obj.updateDynamic("prefixes")(prefixes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitDefinition]
  }
}

