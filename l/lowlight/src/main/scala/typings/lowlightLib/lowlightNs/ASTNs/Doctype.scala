package typings
package lowlightLib.lowlightNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Doctype
  extends lowlightLib.lowlightNs.ASTNs.UnistNs.Node
     with lowlightLib.lowlightNs.HastNode {
  var name: java.lang.String
  var public: js.UndefOr[java.lang.String] = js.undefined
  var system: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_Doctype: lowlightLib.lowlightLibStrings.doctype
}

object Doctype {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: lowlightLib.lowlightLibStrings.doctype,
    data: lowlightLib.lowlightNs.ASTNs.UnistNs.Data = null,
    position: lowlightLib.lowlightNs.ASTNs.UnistNs.Location = null,
    public: java.lang.String = null,
    system: java.lang.String = null
  ): Doctype = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    if (public != null) __obj.updateDynamic("public")(public)
    if (system != null) __obj.updateDynamic("system")(system)
    __obj.asInstanceOf[Doctype]
  }
}

