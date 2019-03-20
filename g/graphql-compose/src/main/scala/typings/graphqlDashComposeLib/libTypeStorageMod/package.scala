package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypeStorageMod {
  type K = js.Any
  type V[TContext] = _V[TContext] | (graphqlDashComposeLib.libTypeComposerMod.TypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, js.Any]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, js.Any]) | graphqlLib.typeDefinitionMod.GraphQLNamedType | graphqlLib.graphqlMod.GraphQLScalarType
}
