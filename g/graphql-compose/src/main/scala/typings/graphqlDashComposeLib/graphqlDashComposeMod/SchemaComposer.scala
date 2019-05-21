package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "SchemaComposer")
@js.native
class SchemaComposer[TContext] ()
  extends graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext] {
  def this(schema: graphqlLib.graphqlMod.GraphQLSchema) = this()
}

