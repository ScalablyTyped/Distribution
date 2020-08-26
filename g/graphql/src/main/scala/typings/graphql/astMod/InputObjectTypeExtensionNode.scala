package typings.graphql.astMod

import typings.graphql.graphqlStrings.InputObjectTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputObjectTypeExtensionNode
  extends TypeExtensionNode
     with ASTNode {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  val fields: js.UndefOr[js.Array[InputValueDefinitionNode]] = js.native
  val kind: InputObjectTypeExtension = js.native
  val loc: js.UndefOr[Location] = js.native
  val name: NameNode = js.native
}

object InputObjectTypeExtensionNode {
  @scala.inline
  def apply(kind: InputObjectTypeExtension, name: NameNode): InputObjectTypeExtensionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputObjectTypeExtensionNode]
  }
  @scala.inline
  implicit class InputObjectTypeExtensionNodeOps[Self <: InputObjectTypeExtensionNode] (val x: Self) extends AnyVal {
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
    def setKind(value: InputObjectTypeExtension): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NameNode): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectivesVarargs(value: DirectiveNode*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[DirectiveNode]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: InputValueDefinitionNode*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[InputValueDefinitionNode]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

