package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaComposerMod {
  type MustHaveTypes[TContext] = _MustHaveTypes[TContext] | (graphqlDashComposeLib.libTypeComposerMod.TypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, js.Any]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, js.Any]) | graphqlLib.typeDefinitionMod.GraphQLNamedType
}
