package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaComposerMod {
  type GraphQLToolsResolveMethods[TContext] = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* source */ js.Any, 
        /* args */ js.Object, 
        /* context */ TContext, 
        /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
        js.Any
      ]
    ]
  ]
  /* Rewritten from type alias, can be one of: 
    - graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext]
    - graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext]
    - graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext]
    - graphqlLib.typeDefinitionMod.GraphQLNamedType
  */
  type MustHaveTypes[TContext] = _MustHaveTypes[TContext] | (graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]) | graphqlLib.typeDefinitionMod.GraphQLNamedType
}
