package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "InputTypeComposer")
@js.native
class InputTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] {
  def this(gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLInputObjectType, schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "InputTypeComposer")
@js.native
object InputTypeComposer extends js.Object {
  def create[TCtx](
    typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposeDefinition): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
}

