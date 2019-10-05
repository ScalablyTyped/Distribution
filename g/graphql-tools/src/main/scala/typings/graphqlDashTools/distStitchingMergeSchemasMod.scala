package typings.graphqlDashTools

import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/mergeSchemas", JSImport.Namespace)
@js.native
object distStitchingMergeSchemasMod extends js.Object {
  def default(
    hasSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeDirectives: Anon_InheritResolversFromInterfaces
  ): GraphQLSchema = js.native
  type OnTypeConflict = js.Function3[
    /* left */ GraphQLNamedType, 
    /* right */ GraphQLNamedType, 
    /* info */ js.UndefOr[Anon_Left], 
    GraphQLNamedType
  ]
}

