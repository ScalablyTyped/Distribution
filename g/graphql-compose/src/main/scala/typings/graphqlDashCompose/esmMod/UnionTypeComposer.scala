package typings.graphqlDashCompose.esmMod

import typings.graphql.graphqlMod.GraphQLUnionType
import typings.graphqlDashCompose.esmUnionTypeComposerMod.UnionTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "UnionTypeComposer")
@js.native
class UnionTypeComposer[TSource, TContext] protected ()
  extends typings.graphqlDashCompose.esmUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] {
  def this(
    gqType: GraphQLUnionType,
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose/esm", "UnionTypeComposer")
@js.native
object UnionTypeComposer extends js.Object {
  /**
    * Create `UnionTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](
    typeDef: UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.esmUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `UnionTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: UnionTypeComposeDefinition[TSrc, TCtx]): typings.graphqlDashCompose.esmUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typings.graphqlDashCompose.esmSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.esmUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
}

