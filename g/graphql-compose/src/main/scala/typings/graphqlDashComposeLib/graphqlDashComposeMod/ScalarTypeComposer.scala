package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "ScalarTypeComposer")
@js.native
class ScalarTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] {
  def this(gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLScalarType, schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "ScalarTypeComposer")
@js.native
object ScalarTypeComposer extends js.Object {
  def create[TCtx](
    typeDef: graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposeDefinition): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
}

