package typings.graphqlTools

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/mergeSchemas", JSImport.Namespace)
@js.native
object mergeSchemasMod extends js.Object {
  def default(
    hasSchemasOnTypeConflictResolversSchemaDirectivesInheritResolversFromInterfacesMergeDirectives: AnonInheritResolversFromInterfaces
  ): GraphQLSchema = js.native
  type OnTypeConflict = js.Function3[
    /* left */ GraphQLNamedType, 
    /* right */ GraphQLNamedType, 
    /* info */ js.UndefOr[AnonLeft], 
    GraphQLNamedType
  ]
}

