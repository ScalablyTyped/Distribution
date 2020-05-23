package typings.libxmljs.anon

import typings.libxmljs.libxmljsStrings.html
import typings.libxmljs.libxmljsStrings.xhtml
import typings.libxmljs.libxmljsStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Declaration extends js.Object {
  var declaration: Boolean
  var selfCloseEmpty: Boolean
  var `type`: xml | html | xhtml
  var whitespace: Boolean
}

object Declaration {
  @scala.inline
  def apply(declaration: Boolean, selfCloseEmpty: Boolean, `type`: xml | html | xhtml, whitespace: Boolean): Declaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], selfCloseEmpty = selfCloseEmpty.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
}

