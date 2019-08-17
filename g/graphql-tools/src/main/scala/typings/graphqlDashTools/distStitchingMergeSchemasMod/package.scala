package typings.graphqlDashTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distStitchingMergeSchemasMod {
  import typings.graphql.typeDefinitionMod.GraphQLNamedType
  import typings.graphqlDashTools.Anon_Left

  type OnTypeConflict = js.Function3[
    /* left */ GraphQLNamedType, 
    /* right */ GraphQLNamedType, 
    /* info */ js.UndefOr[Anon_Left], 
    GraphQLNamedType
  ]
}
