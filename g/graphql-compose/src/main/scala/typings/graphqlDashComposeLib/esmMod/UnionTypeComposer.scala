package typings
package graphqlDashComposeLib.esmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "UnionTypeComposer")
@js.native
class UnionTypeComposer[TSource, TContext] protected ()
  extends graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] {
  def this(gqType: graphqlLib.graphqlMod.GraphQLUnionType, schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose/esm", "UnionTypeComposer")
@js.native
object UnionTypeComposer extends js.Object {
  /**
    * Create `UnionTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `UnionTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposeDefinition[TSrc, TCtx]): graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
}

