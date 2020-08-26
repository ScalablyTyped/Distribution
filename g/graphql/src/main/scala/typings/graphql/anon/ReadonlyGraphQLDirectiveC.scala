package typings.graphql.anon

import typings.graphql.astMod.DirectiveDefinitionNode
import typings.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typings.graphql.directiveLocationMod.DirectiveLocationEnum
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<graphql.graphql/type/directives.GraphQLDirectiveConfig> */
@js.native
trait ReadonlyGraphQLDirectiveC extends js.Object {
  val args: js.UndefOr[Maybe[GraphQLFieldConfigArgumentMap]] = js.native
  val astNode: js.UndefOr[Maybe[DirectiveDefinitionNode]] = js.native
  val description: js.UndefOr[Maybe[String]] = js.native
  val extensions: js.UndefOr[Maybe[js.Object]] = js.native
  val isRepeatable: js.UndefOr[Maybe[Boolean]] = js.native
  val locations: js.Array[DirectiveLocationEnum] = js.native
  val name: String = js.native
}

object ReadonlyGraphQLDirectiveC {
  @scala.inline
  def apply(locations: js.Array[DirectiveLocationEnum], name: String): ReadonlyGraphQLDirectiveC = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyGraphQLDirectiveC]
  }
  @scala.inline
  implicit class ReadonlyGraphQLDirectiveCOps[Self <: ReadonlyGraphQLDirectiveC] (val x: Self) extends AnyVal {
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
    def setLocationsVarargs(value: DirectiveLocationEnum*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[DirectiveLocationEnum]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: Maybe[GraphQLFieldConfigArgumentMap]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setArgsNull: Self = this.set("args", null)
    @scala.inline
    def setAstNode(value: Maybe[DirectiveDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setExtensions(value: Maybe[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    @scala.inline
    def setIsRepeatable(value: Maybe[Boolean]): Self = this.set("isRepeatable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRepeatable: Self = this.set("isRepeatable", js.undefined)
    @scala.inline
    def setIsRepeatableNull: Self = this.set("isRepeatable", null)
  }
  
}

