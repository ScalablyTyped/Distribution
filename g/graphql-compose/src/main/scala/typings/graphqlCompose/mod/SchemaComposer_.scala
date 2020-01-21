package typings.graphqlCompose.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlCompose.schemaComposerMod.SchemaComposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "SchemaComposer")
@js.native
class SchemaComposer_[TContext] () extends SchemaComposer[TContext] {
  def this(schema: GraphQLSchema) = this()
}

