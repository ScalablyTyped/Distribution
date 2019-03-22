package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaComposerMod {
  type MustHaveTypes[TContext] = _MustHaveTypes[TContext] | (graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]) | graphqlLib.typeDefinitionMod.GraphQLNamedType
}
