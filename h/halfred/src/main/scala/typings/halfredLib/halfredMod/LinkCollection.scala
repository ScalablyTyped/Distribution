package typings
package halfredLib.halfredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see https://github.com/basti1302/halfred#links-and-embedded-resources */
trait LinkCollection
  extends /* rel */ org.scalablytyped.runtime.StringDictionary[js.Array[Link]]

object LinkCollection {
  @scala.inline
  def apply(StringDictionary: /* rel */ org.scalablytyped.runtime.StringDictionary[js.Array[Link]] = null): LinkCollection = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LinkCollection]
  }
}

