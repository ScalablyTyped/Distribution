package typings.graphqlDashCompose.graphqlDashComposeMod

import typings.graphqlDashCompose.libGraphqlMod.GraphQLInputObjectType
import typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "InputTypeComposer")
@js.native
class InputTypeComposer[TContext] protected ()
  extends typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TContext] {
  def this(
    gqType: GraphQLInputObjectType,
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose", "InputTypeComposer")
@js.native
object InputTypeComposer extends js.Object {
  /**
    * Create `InputTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TCtx](
    typeDef: InputTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  /**
    * Create `InputTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: InputTypeComposeDefinition): typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: InputTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TCtx] = js.native
}

