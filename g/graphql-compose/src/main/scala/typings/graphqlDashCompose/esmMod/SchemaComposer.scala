package typings.graphqlDashCompose.esmMod

import org.scalablytyped.runtime.TopLevel
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

@JSImport("graphql-compose/esm", "schemaComposer")
@js.native
object schemaComposer
  extends TopLevel[typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[js.Any]]

