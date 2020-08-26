package typings.graphql.astMod

import typings.graphql.graphqlStrings.NonNullType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonNullTypeNode
  extends ASTNode
     with TypeNode {
  val kind: NonNullType = js.native
  val loc: js.UndefOr[Location] = js.native
  val `type`: NamedTypeNode | ListTypeNode = js.native
}

object NonNullTypeNode {
  @scala.inline
  def apply(kind: NonNullType, `type`: NamedTypeNode | ListTypeNode): NonNullTypeNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonNullTypeNode]
  }
  @scala.inline
  implicit class NonNullTypeNodeOps[Self <: NonNullTypeNode] (val x: Self) extends AnyVal {
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
    def setKind(value: NonNullType): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NamedTypeNode | ListTypeNode): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

