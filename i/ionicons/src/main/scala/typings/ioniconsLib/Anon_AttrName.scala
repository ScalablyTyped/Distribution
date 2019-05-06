package typings
package ioniconsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttrName
  extends /* attrName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var `class`: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
}

object Anon_AttrName {
  @scala.inline
  def apply(
    StringDictionary: /* attrName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `class`: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    style: js.Any = null
  ): Anon_AttrName = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_AttrName]
  }
}

