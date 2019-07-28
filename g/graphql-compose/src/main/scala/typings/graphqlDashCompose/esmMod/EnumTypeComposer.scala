package typings.graphqlDashCompose.esmMod

import typings.graphqlDashCompose.esmEnumTypeComposerMod.EnumTypeComposeDefinition
import typings.graphqlDashCompose.esmGraphqlMod.GraphQLEnumType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "EnumTypeComposer")
@js.native
class EnumTypeComposer[TContext] protected ()
  extends typings.graphqlDashCompose.esmEnumTypeComposerMod.EnumTypeComposer[TContext] {
  def this(
    gqType: GraphQLEnumType,
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose/esm", "EnumTypeComposer")
@js.native
object EnumTypeComposer extends js.Object {
  /**
    * Create `EnumTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](
    typeDef: EnumTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  /**
    * Create `EnumTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: EnumTypeComposeDefinition): typings.graphqlDashCompose.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: EnumTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.esmEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
}

