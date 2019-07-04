package typings
package intlDashMessageformatLib.libCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralFormat extends _Pattern {
  var id: java.lang.String
  var offset: js.Any
  var options: js.Any
  var pluralRules: js.Any
  def getOption(value: scala.Double): js.Array[Pattern]
}

object PluralFormat {
  @scala.inline
  def apply(
    getOption: scala.Double => js.Array[Pattern],
    id: java.lang.String,
    offset: js.Any,
    options: js.Any,
    pluralRules: js.Any
  ): PluralFormat = {
    val __obj = js.Dynamic.literal(getOption = js.Any.fromFunction1(getOption), id = id, offset = offset, options = options, pluralRules = pluralRules)
  
    __obj.asInstanceOf[PluralFormat]
  }
}

