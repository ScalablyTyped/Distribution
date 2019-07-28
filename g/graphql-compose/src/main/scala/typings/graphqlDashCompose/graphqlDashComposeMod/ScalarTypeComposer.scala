package typings.graphqlDashCompose.graphqlDashComposeMod

import typings.graphqlDashCompose.libGraphqlMod.GraphQLScalarType
import typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "ScalarTypeComposer")
@js.native
class ScalarTypeComposer[TContext] protected ()
  extends typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer[TContext] {
  def this(
    gqType: GraphQLScalarType,
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose", "ScalarTypeComposer")
@js.native
object ScalarTypeComposer extends js.Object {
  /**
    * Create `ScalarTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](
    typeDef: ScalarTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  /**
    * Create `ScalarTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: ScalarTypeComposeDefinition): typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: ScalarTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
}

