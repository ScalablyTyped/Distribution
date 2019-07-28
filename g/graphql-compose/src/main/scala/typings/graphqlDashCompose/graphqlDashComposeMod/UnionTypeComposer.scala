package typings.graphqlDashCompose.graphqlDashComposeMod

import typings.graphql.graphqlMod.GraphQLUnionType
import typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "UnionTypeComposer")
@js.native
class UnionTypeComposer[TSource, TContext] protected ()
  extends typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] {
  def this(
    gqType: GraphQLUnionType,
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TContext]
  ) = this()
}

/* static members */
@JSImport("graphql-compose", "UnionTypeComposer")
@js.native
object UnionTypeComposer extends js.Object {
  /**
    * Create `UnionTypeComposer` with adding it by name to the `SchemaComposer`.
    */
  def create[TSrc, TCtx](
    typeDef: UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  /**
    * Create `UnionTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
    */
  def createTemp[TSrc, TCtx](typeDef: UnionTypeComposeDefinition[TSrc, TCtx]): typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
  def createTemp[TSrc, TCtx](
    typeDef: UnionTypeComposeDefinition[TSrc, TCtx],
    schemaComposer: typings.graphqlDashCompose.libSchemaComposerMod.SchemaComposer[TCtx]
  ): typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[TSrc, TCtx] = js.native
}

