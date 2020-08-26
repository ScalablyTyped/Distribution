package typings.graphqlToolsStitch.typesMod

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeTypeCandidate extends js.Object {
  var schema: js.UndefOr[GraphQLSchema] = js.native
  var subschema: js.UndefOr[GraphQLSchema | SubschemaConfig] = js.native
  var transformedSubschema: js.UndefOr[GraphQLSchema] = js.native
  var `type`: GraphQLNamedType = js.native
}

object MergeTypeCandidate {
  @scala.inline
  def apply(`type`: GraphQLNamedType): MergeTypeCandidate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeTypeCandidate]
  }
  @scala.inline
  implicit class MergeTypeCandidateOps[Self <: MergeTypeCandidate] (val x: Self) extends AnyVal {
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
    def setType(value: GraphQLNamedType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setSubschema(value: GraphQLSchema | SubschemaConfig): Self = this.set("subschema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubschema: Self = this.set("subschema", js.undefined)
    @scala.inline
    def setTransformedSubschema(value: GraphQLSchema): Self = this.set("transformedSubschema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformedSubschema: Self = this.set("transformedSubschema", js.undefined)
  }
  
}

