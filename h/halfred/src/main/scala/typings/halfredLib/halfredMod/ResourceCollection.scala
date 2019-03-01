package typings
package halfredLib.halfredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see https://github.com/basti1302/halfred#links-and-embedded-resources */
trait ResourceCollection
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Array[Resource]]

object ResourceCollection {
  @scala.inline
  def apply(StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Array[Resource]] = null): ResourceCollection = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResourceCollection]
  }
}

