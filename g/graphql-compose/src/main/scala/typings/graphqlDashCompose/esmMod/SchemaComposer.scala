package typings.graphqlDashCompose.esmMod

import typings.graphql.graphqlMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "SchemaComposer")
@js.native
class SchemaComposer[TContext] ()
  extends typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TContext] {
  def this(schema: GraphQLSchema) = this()
}

