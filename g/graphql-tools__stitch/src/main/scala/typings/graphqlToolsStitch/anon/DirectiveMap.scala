package typings.graphqlToolsStitch.anon

import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.SubschemaConfig
import typings.graphqlToolsStitch.typesMod.MergeTypeCandidate
import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveMap extends js.Object {
  var directiveMap: Record[String, GraphQLDirective] = js.native
  var extensions: js.Array[DocumentNode] = js.native
  var mergeDirectives: Boolean = js.native
  var operationTypeNames: Record[String, _] = js.native
  var schemaDefs: SchemaDef = js.native
  var schemaLikeObjects: js.Array[GraphQLSchema | SubschemaConfig | DocumentNode | GraphQLNamedType] = js.native
  var transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema] = js.native
  var typeCandidates: Record[String, js.Array[MergeTypeCandidate]] = js.native
}

object DirectiveMap {
  @scala.inline
  def apply(
    directiveMap: Record[String, GraphQLDirective],
    extensions: js.Array[DocumentNode],
    mergeDirectives: Boolean,
    operationTypeNames: Record[String, _],
    schemaDefs: SchemaDef,
    schemaLikeObjects: js.Array[GraphQLSchema | SubschemaConfig | DocumentNode | GraphQLNamedType],
    transformedSchemas: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema],
    typeCandidates: Record[String, js.Array[MergeTypeCandidate]]
  ): DirectiveMap = {
    val __obj = js.Dynamic.literal(directiveMap = directiveMap.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], mergeDirectives = mergeDirectives.asInstanceOf[js.Any], operationTypeNames = operationTypeNames.asInstanceOf[js.Any], schemaDefs = schemaDefs.asInstanceOf[js.Any], schemaLikeObjects = schemaLikeObjects.asInstanceOf[js.Any], transformedSchemas = transformedSchemas.asInstanceOf[js.Any], typeCandidates = typeCandidates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveMap]
  }
  @scala.inline
  implicit class DirectiveMapOps[Self <: DirectiveMap] (val x: Self) extends AnyVal {
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
    def setDirectiveMap(value: Record[String, GraphQLDirective]): Self = this.set("directiveMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionsVarargs(value: DocumentNode*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[DocumentNode]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeDirectives(value: Boolean): Self = this.set("mergeDirectives", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationTypeNames(value: Record[String, _]): Self = this.set("operationTypeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaDefs(value: SchemaDef): Self = this.set("schemaDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaLikeObjectsVarargs(value: (GraphQLSchema | SubschemaConfig | DocumentNode | GraphQLNamedType)*): Self = this.set("schemaLikeObjects", js.Array(value :_*))
    @scala.inline
    def setSchemaLikeObjects(value: js.Array[GraphQLSchema | SubschemaConfig | DocumentNode | GraphQLNamedType]): Self = this.set("schemaLikeObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransformedSchemas(value: Map[GraphQLSchema | SubschemaConfig, GraphQLSchema]): Self = this.set("transformedSchemas", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeCandidates(value: Record[String, js.Array[MergeTypeCandidate]]): Self = this.set("typeCandidates", value.asInstanceOf[js.Any])
  }
  
}

