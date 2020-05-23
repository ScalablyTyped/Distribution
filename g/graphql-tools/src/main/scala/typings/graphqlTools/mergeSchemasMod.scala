package typings.graphqlTools

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.anon.InheritResolversFromInterfaces
import typings.graphqlTools.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/mergeSchemas", JSImport.Namespace)
@js.native
object mergeSchemasMod extends js.Object {
  def default(
    hasSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeDirectives: InheritResolversFromInterfaces
  ): GraphQLSchema = js.native
  type OnTypeConflict = js.Function3[
    /* left */ GraphQLNamedType, 
    /* right */ GraphQLNamedType, 
    /* info */ js.UndefOr[Left], 
    GraphQLNamedType
  ]
}

