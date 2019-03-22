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
  def create[TCtx](
    typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposeDefinition): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
  def createTemp[TCtx](
    typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposeDefinition,
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TCtx] = js.native
}

