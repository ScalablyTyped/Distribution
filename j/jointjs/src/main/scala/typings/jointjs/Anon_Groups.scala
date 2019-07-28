package typings.jointjs

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsMod.diaNs.ElementNs.Port
import typings.jointjs.jointjsMod.diaNs.ElementNs.PortGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Groups extends js.Object {
  var groups: js.UndefOr[StringDictionary[PortGroup]] = js.undefined
  var items: js.UndefOr[js.Array[Port]] = js.undefined
}

object Anon_Groups {
  @scala.inline
  def apply(groups: StringDictionary[PortGroup] = null, items: js.Array[Port] = null): Anon_Groups = {
    val __obj = js.Dynamic.literal()
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Anon_Groups]
  }
}

