package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaComposerMod {
  /* Rewritten from type alias, can be one of: 
    - graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext]
    - graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext]
    - graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext]
    - graphqlLib.typeDefinitionMod.GraphQLNamedType
  */
  type AnyType[TContext] = _AnyType[TContext] | (graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]) | graphqlLib.typeDefinitionMod.GraphQLNamedType
}
