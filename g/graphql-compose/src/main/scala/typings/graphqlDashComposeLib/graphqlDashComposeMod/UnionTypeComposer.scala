package typings
package graphqlDashComposeLib.graphqlDashComposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "UnionTypeComposer")
@js.native
class UnionTypeComposer[TSource, TContext] protected ()
  extends graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] {
  def this(gqType: graphqlLib.graphqlMod.GraphQLUnionType, schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TContext]) = this()
}

/* static members */
@JSImport("graphql-compose", "UnionTypeComposer")
@js.native
object UnionTypeComposer extends js.Object {
  def create[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposeDefinition[TSrc, TCtx]): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: graphqlDashComposeLib.libSchemaComposerMod.SchemaComposer[TCtx]
  ): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
}

