package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "EnumTypeComposer")
@js.native
class EnumTypeComposer[TContext] protected ()
  extends graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] {
  def this(gqType: graphqlDashComposeLib.libGraphqlMod.GraphQLEnumType, schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "EnumTypeComposer")
@js.native
object EnumTypeComposer extends js.Object {
  /**
    * Create `EnumTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
    */
  def create[TCtx](
    typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  /**
    * Create `EnumTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposeDefinition): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
}

