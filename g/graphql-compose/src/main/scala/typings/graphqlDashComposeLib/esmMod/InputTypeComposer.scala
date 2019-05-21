package typings
package graphqlDashComposeLib.esmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "InputTypeComposer")
@js.native
class InputTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] {
  def this(gqType: graphqlDashComposeLib.esmGraphqlMod.GraphQLInputObjectType, schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose/esm", "InputTypeComposer")
@js.native
object InputTypeComposer extends js.Object {
  /**
    * Create `InputTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TCtx](
    typeDef: graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  /**
    * Create `InputTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposeDefinition): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
}

