package typings.graphqlDashTools

import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphqlDashTools.Anon_Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distStitchingMergeSchemasMod {
  type OnTypeConflict = js.Function3[
    /* left */ GraphQLNamedType, 
    /* right */ GraphQLNamedType, 
    /* info */ js.UndefOr[Anon_Left], 
    GraphQLNamedType
  ]
}
