package typings.graphql.astMod

import typings.graphql.graphqlStrings.ListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypeNode
  extends ASTNode
     with TypeNode {
  val kind: ListType = js.native
  val loc: js.UndefOr[Location] = js.native
  val `type`: TypeNode = js.native
}

object ListTypeNode {
  @scala.inline
  def apply(kind: ListType, `type`: TypeNode): ListTypeNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypeNode]
  }
  @scala.inline
  implicit class ListTypeNodeOps[Self <: ListTypeNode] (val x: Self) extends AnyVal {
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
    def setKind(value: ListType): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TypeNode): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

