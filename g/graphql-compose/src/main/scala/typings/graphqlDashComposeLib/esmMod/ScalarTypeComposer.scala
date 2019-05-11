package typings
package graphqlDashComposeLib.esmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "ScalarTypeComposer")
@js.native
class ScalarTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext] {
  def this(gqType: graphqlDashComposeLib.esmGraphqlMod.GraphQLScalarType, schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose/esm", "ScalarTypeComposer")
@js.native
object ScalarTypeComposer extends js.Object {
  def create[TCtx](
    typeDef: graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposeDefinition): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
}

