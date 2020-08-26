package typings.graphql.astMod

import typings.graphql.graphqlStrings.EnumTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumTypeExtensionNode
  extends TypeExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  val kind: EnumTypeExtension = js.native
  val loc: js.UndefOr[Location] = js.native
  val name: NameNode = js.native
  val values: js.UndefOr[js.Array[EnumValueDefinitionNode]] = js.native
}

object EnumTypeExtensionNode {
  @scala.inline
  def apply(kind: EnumTypeExtension, name: NameNode): EnumTypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumTypeExtensionNode]
  }
  @scala.inline
  implicit class EnumTypeExtensionNodeOps[Self <: EnumTypeExtensionNode] (val x: Self) extends AnyVal {
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
    def setKind(value: EnumTypeExtension): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NameNode): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectivesVarargs(value: DirectiveNode*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[DirectiveNode]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    @scala.inline
    def setValuesVarargs(value: EnumValueDefinitionNode*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[EnumValueDefinitionNode]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

