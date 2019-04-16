package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "InterfaceTypeComposer")
@js.native
class InterfaceTypeComposer[TSource, TContext] protected ()
  extends graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] {
  def this(gqType: graphqlLib.graphqlMod.GraphQLInterfaceType, schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "InterfaceTypeComposer")
@js.native
object InterfaceTypeComposer extends js.Object {
  def create[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSrc, TCtx]
  ): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
}

