package typings
package hastDashFormatLib.hastDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocType
  extends unistLib.unistMod.Node {
  var name: java.lang.String
  /**
    * Represents the document’s public identifier.
    */
  var public: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Represents the document’s system identifier.
    */
  var system: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Represents this variant of a Node.
    */
  @JSName("type")
  var type_DocType: hastDashFormatLib.hastDashFormatLibStrings.doctype
}

object DocType {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: hastDashFormatLib.hastDashFormatLibStrings.doctype,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null,
    public: java.lang.String = null,
    system: java.lang.String = null
  ): DocType = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    if (public != null) __obj.updateDynamic("public")(public)
    if (system != null) __obj.updateDynamic("system")(system)
    __obj.asInstanceOf[DocType]
  }
}

