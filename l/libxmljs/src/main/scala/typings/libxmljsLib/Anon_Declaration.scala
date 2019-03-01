package typings
package libxmljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Declaration extends js.Object {
  var declaration: scala.Boolean
  var selfCloseEmpty: scala.Boolean
  var `type`: libxmljsLib.libxmljsLibStrings.xml | libxmljsLib.libxmljsLibStrings.html | libxmljsLib.libxmljsLibStrings.xhtml
  var whitespace: scala.Boolean
}

object Anon_Declaration {
  @scala.inline
  def apply(
    declaration: scala.Boolean,
    selfCloseEmpty: scala.Boolean,
    `type`: libxmljsLib.libxmljsLibStrings.xml | libxmljsLib.libxmljsLibStrings.html | libxmljsLib.libxmljsLibStrings.xhtml,
    whitespace: scala.Boolean
  ): Anon_Declaration = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("declaration")(declaration)
    __obj.updateDynamic("selfCloseEmpty")(selfCloseEmpty)
    __obj.updateDynamic("whitespace")(whitespace)
    __obj.asInstanceOf[Anon_Declaration]
  }
}

