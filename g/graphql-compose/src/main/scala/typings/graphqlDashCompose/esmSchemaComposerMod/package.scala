package typings.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmSchemaComposerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.typeDefinitionMod.GraphQLNamedType
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer
  import typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposer
  import typings.graphqlDashCompose.esmUnionTypeComposerMod.UnionTypeComposer

  /* Rewritten from type alias, can be one of: 
    - typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TContext]
    - typings.graphqlDashCompose.esmEnumTypeComposerMod.EnumTypeComposer[TContext]
    - typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.esmUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.esmScalarTypeComposerMod.ScalarTypeComposer[TContext]
  */
  type AnyComposeType[TContext] = _AnyComposeType[TContext] | (ObjectTypeComposer[js.Any, TContext]) | (InterfaceTypeComposer[js.Any, TContext]) | (UnionTypeComposer[js.Any, TContext])
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer[TContext]
    - typings.graphqlDashCompose.esmEnumTypeComposerMod.EnumTypeComposer[TContext]
    - typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.esmUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.esmScalarTypeComposerMod.ScalarTypeComposer[TContext]
    - typings.graphql.typeDefinitionMod.GraphQLNamedType
  */
  type AnyType[TContext] = _AnyType[TContext] | (ObjectTypeComposer[js.Any, TContext]) | (InterfaceTypeComposer[js.Any, TContext]) | (UnionTypeComposer[js.Any, TContext]) | GraphQLNamedType
  type GraphQLToolsResolveMethods[TContext] = StringDictionary[
    StringDictionary[
      js.Function4[
        /* source */ js.Any, 
        /* args */ js.Object, 
        /* context */ TContext, 
        /* info */ GraphQLResolveInfo, 
        js.Any
      ]
    ]
  ]
}
