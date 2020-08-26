package typings.jsonToAst.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASTNode extends js.Object {
  var loc: js.UndefOr[Location] = js.native
  var `type`: String = js.native
}

object ASTNode {
  @scala.inline
  def apply(`type`: String): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  implicit class ASTNodeOps[Self <: ASTNode] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

