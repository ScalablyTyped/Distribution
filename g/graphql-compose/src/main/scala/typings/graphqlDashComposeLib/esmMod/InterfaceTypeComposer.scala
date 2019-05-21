package typings
package graphqlDashComposeLib.esmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "InterfaceTypeComposer")
@js.native
class InterfaceTypeComposer[TSource, TContext] protected ()
  extends graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] {
  def this(gqType: graphqlLib.graphqlMod.GraphQLInterfaceType, schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose/esm", "InterfaceTypeComposer")
@js.native
object InterfaceTypeComposer extends js.Object {
  /**
    * Create `InterfaceTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `InterfaceTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSrc, TCtx]
  ): graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
}

