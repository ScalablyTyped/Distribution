package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groups extends js.Object {
  var groups: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[jointjsLib.jointjsMod.diaNs.ElementNs.PortGroup]
  ] = js.undefined
  var items: js.UndefOr[js.Array[jointjsLib.jointjsMod.diaNs.ElementNs.Port]] = js.undefined
}

object Anon_Groups {
  @scala.inline
  def apply(
    groups: org.scalablytyped.runtime.StringDictionary[jointjsLib.jointjsMod.diaNs.ElementNs.PortGroup] = null,
    items: js.Array[jointjsLib.jointjsMod.diaNs.ElementNs.Port] = null
  ): Anon_Groups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_Groups]
  }
}

