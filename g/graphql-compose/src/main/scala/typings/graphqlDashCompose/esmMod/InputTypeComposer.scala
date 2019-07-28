package typings.graphqlDashCompose.esmMod

import typings.graphqlDashCompose.esmGraphqlMod.GraphQLInputObjectType
import typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "InputTypeComposer")
@js.native
class InputTypeComposer[TContext] protected ()
  extends typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TContext] {
  def this(
    gqType: GraphQLInputObjectType,
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose/esm", "InputTypeComposer")
@js.native
object InputTypeComposer extends js.Object {
  /**
    * Create `InputTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TCtx](
    typeDef: InputTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  /**
    * Create `InputTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: InputTypeComposeDefinition): typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: InputTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
}

