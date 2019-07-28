package typings.hastDashFormat.hastDashFormatMod

import typings.hastDashFormat.hastDashFormatStrings.doctype
import typings.unist.unistMod.Data
import typings.unist.unistMod.Node
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocType extends Node {
  var name: String
  /**
    * Represents the document’s public identifier.
    */
  var public: js.UndefOr[String] = js.undefined
  /**
    * Represents the document’s system identifier.
    */
  var system: js.UndefOr[String] = js.undefined
  /**
    * Represents this variant of a Node.
    */
  @JSName("type")
  var type_DocType: doctype
}

object DocType {
  @scala.inline
  def apply(
    name: String,
    `type`: doctype,
    data: Data = null,
    position: Position = null,
    public: String = null,
    system: String = null
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

