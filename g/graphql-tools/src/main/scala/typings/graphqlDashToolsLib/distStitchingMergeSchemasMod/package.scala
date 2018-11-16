package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distStitchingMergeSchemasMod {
  type OnTypeConflict = js.Function3[
    /* left */ graphqlLib.typeDefinitionMod.GraphQLNamedType, 
    /* right */ graphqlLib.typeDefinitionMod.GraphQLNamedType, 
    /* info */ js.UndefOr[graphqlDashToolsLib.Anon_Left], 
    graphqlLib.typeDefinitionMod.GraphQLNamedType
  ]
}
