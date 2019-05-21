package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmSchemaComposerMod {
  /* Rewritten from type alias, can be one of: 
    - graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext]
    - graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext]
    - graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext]
  */
  type AnyComposeType[TContext] = _AnyComposeType[TContext] | (graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext])
  /* Rewritten from type alias, can be one of: 
    - graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext]
    - graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext]
    - graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext]
    - graphqlLib.typeDefinitionMod.GraphQLNamedType
  */
  type AnyType[TContext] = _AnyType[TContext] | (graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]) | (graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]) | graphqlLib.typeDefinitionMod.GraphQLNamedType
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
}
