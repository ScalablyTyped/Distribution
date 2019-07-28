package typings.graphqlDashCompose.esmMod

import typings.graphql.graphqlMod.GraphQLInterfaceType
import typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "InterfaceTypeComposer")
@js.native
class InterfaceTypeComposer[TSource, TContext] protected ()
  extends typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] {
  def this(
    gqType: GraphQLInterfaceType,
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose/esm", "InterfaceTypeComposer")
@js.native
object InterfaceTypeComposer extends js.Object {
  /**
    * Create `InterfaceTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](
    typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `InterfaceTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx]): typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: InterfaceTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSrc, TCtx] = js.native
}

