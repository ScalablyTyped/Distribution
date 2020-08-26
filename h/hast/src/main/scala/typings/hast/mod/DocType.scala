package typings.hast.mod

import typings.hast.hastStrings.doctype
import typings.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocType extends Node {
  var name: String = js.native
  /**
    * Represents the document’s public identifier.
    */
  var public: js.UndefOr[String] = js.native
  /**
    * Represents the document’s system identifier.
    */
  var system: js.UndefOr[String] = js.native
  /**
    * Represents this variant of a Node.
    */
  @JSName("type")
  var type_DocType: doctype = js.native
}

object DocType {
  @scala.inline
  def apply(name: String, `type`: doctype): DocType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocType]
  }
  @scala.inline
  implicit class DocTypeOps[Self <: DocType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: doctype): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublic(value: String): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    @scala.inline
    def setSystem(value: String): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("system", js.undefined)
  }
  
}

