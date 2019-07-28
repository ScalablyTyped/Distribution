package typings.graphqlDashCompose.graphqlDashComposeMod

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "SchemaComposer")
@js.native
class SchemaComposer[TContext] ()
  extends typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TContext] {
  def this(schema: GraphQLSchema) = this()
}

