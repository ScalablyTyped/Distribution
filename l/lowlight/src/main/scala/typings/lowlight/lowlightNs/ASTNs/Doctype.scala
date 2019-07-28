package typings.lowlight.lowlightNs.ASTNs

import typings.lowlight.lowlightNs.ASTNs.UnistNs.Data
import typings.lowlight.lowlightNs.ASTNs.UnistNs.Location
import typings.lowlight.lowlightNs.ASTNs.UnistNs.Node
import typings.lowlight.lowlightNs.HastNode
import typings.lowlight.lowlightStrings.doctype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Doctype
  extends Node
     with HastNode {
  var name: String
  var public: js.UndefOr[String] = js.undefined
  var system: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_Doctype: doctype
}

object Doctype {
  @scala.inline
  def apply(
    name: String,
    `type`: doctype,
    data: Data = null,
    position: Location = null,
    public: String = null,
    system: String = null
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

