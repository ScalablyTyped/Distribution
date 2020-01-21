package typings.marko.taglibLookupTaglibLookupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var tagName: String
}

object Element {
  @scala.inline
  def apply(tagName: String): Element = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Element]
  }
}

