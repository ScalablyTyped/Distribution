package typings.graphql.anon

import typings.graphql.astMod.DirectiveDefinitionNode
import typings.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typings.graphql.directiveLocationMod.DirectiveLocationEnum
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql/type/directives.GraphQLDirectiveConfig & {  args :graphql.graphql/type/definition.GraphQLFieldConfigArgumentMap,   isRepeatable :boolean,   extensions :graphql.graphql/jsutils/Maybe.Maybe<std.Readonly<graphql.graphql/type/directives.GraphQLDirectiveExtensions>>} */
@js.native
trait GraphQLDirectiveConfigarg extends js.Object {
  var args: js.UndefOr[Maybe[GraphQLFieldConfigArgumentMap]] with GraphQLFieldConfigArgumentMap = js.native
  var astNode: js.UndefOr[Maybe[DirectiveDefinitionNode]] = js.native
  var description: js.UndefOr[Maybe[String]] = js.native
  var extensions: js.UndefOr[Maybe[js.Object]] with Maybe[js.Object] = js.native
  var isRepeatable: js.UndefOr[Maybe[Boolean]] with Boolean = js.native
  var locations: js.Array[DirectiveLocationEnum] = js.native
  var name: String = js.native
}

object GraphQLDirectiveConfigarg {
  @scala.inline
  def apply(
    args: js.UndefOr[Maybe[GraphQLFieldConfigArgumentMap]] with GraphQLFieldConfigArgumentMap,
    isRepeatable: js.UndefOr[Maybe[Boolean]] with Boolean,
    locations: js.Array[DirectiveLocationEnum],
    name: String
  ): GraphQLDirectiveConfigarg = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], isRepeatable = isRepeatable.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLDirectiveConfigarg]
  }
  @scala.inline
  implicit class GraphQLDirectiveConfigargOps[Self <: GraphQLDirectiveConfigarg] (val x: Self) extends AnyVal {
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
    def setArgs(value: js.UndefOr[Maybe[GraphQLFieldConfigArgumentMap]] with GraphQLFieldConfigArgumentMap): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsRepeatable(value: js.UndefOr[Maybe[Boolean]] with Boolean): Self = this.set("isRepeatable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationsVarargs(value: DirectiveLocationEnum*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[DirectiveLocationEnum]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
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
    def setExtensions(value: js.UndefOr[Maybe[js.Object]] with Maybe[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
  }
  
}

