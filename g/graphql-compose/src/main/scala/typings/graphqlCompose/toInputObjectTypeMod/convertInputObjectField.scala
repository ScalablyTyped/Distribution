package typings.graphqlCompose.toInputObjectTypeMod

import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.definitionMod.GraphQLType
import typings.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/utils/toInputObjectType", "convertInputObjectField")
@js.native
object convertInputObjectField extends js.Object {
  def apply(field: GraphQLType, opts: ConvertInputObjectFieldOpts, schemaComposer: SchemaComposer[_]): GraphQLInputType | Null = js.native
}

