package typings.graphqlDashCompose.graphqlDashComposeMod

import typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposeDefinition
import typings.graphqlDashCompose.libGraphqlMod.GraphQLEnumType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "EnumTypeComposer")
@js.native
class EnumTypeComposer[TContext] protected ()
  extends typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TContext] {
  def this(
    gqType: GraphQLEnumType,
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose", "EnumTypeComposer")
@js.native
object EnumTypeComposer extends js.Object {
  /**
    * Create `EnumTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](
    typeDef: EnumTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  /**
    * Create `EnumTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: EnumTypeComposeDefinition): typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: EnumTypeComposeDefinition,
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
}

