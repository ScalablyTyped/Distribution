package typings
package markoLib.srcCompilerTaglibDashLookupTaglibLookupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var tagName: java.lang.String
}

object Element {
  @scala.inline
  def apply(tagName: java.lang.String): Element = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[Element]
  }
}

