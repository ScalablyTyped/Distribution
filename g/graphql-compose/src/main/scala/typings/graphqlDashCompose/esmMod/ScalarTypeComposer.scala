package typings.graphqlDashCompose.esmMod

import typings.graphqlDashCompose.esmGraphqlMod.GraphQLScalarType
import typings.graphqlDashCompose.esmScalarTypeComposerMod.ScalarTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "ScalarTypeComposer")
@js.native
class ScalarTypeComposer[TContext] protected ()
  extends typings.graphqlDashCompose.esmScalarTypeComposerMod.ScalarTypeComposer[TContext] {
  def this(
    gqType: GraphQLScalarType,
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose/esm", "ScalarTypeComposer")
@js.native
object ScalarTypeComposer extends js.Object {
  /**
    * Create `ScalarTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](
    typeDef: ScalarTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  /**
    * Create `ScalarTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: ScalarTypeComposeDefinition): typings.graphqlDashCompose.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: ScalarTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.esmScalarTypeComposerMod.ScalarTypeComposer[TCtx] = js.native
}

