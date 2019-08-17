package typings.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSchemaComposerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.typeDefinitionMod.GraphQLNamedType
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typings.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer
  import typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer
  import typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer

  /* Rewritten from type alias, can be one of: 
    - typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TContext]
    - typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TContext]
    - typings.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer[TContext]
  */
  type AnyComposeType[TContext] = _AnyComposeType[TContext] | (ObjectTypeComposer[js.Any, TContext]) | (InterfaceTypeComposer[js.Any, TContext]) | (UnionTypeComposer[js.Any, TContext])
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlDashCompose.libObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.libInputTypeComposerMod.InputTypeComposer[TContext]
    - typings.graphqlDashCompose.libEnumTypeComposerMod.EnumTypeComposer[TContext]
    - typings.graphqlDashCompose.libInterfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.libUnionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - typings.graphqlDashCompose.libScalarTypeComposerMod.ScalarTypeComposer[TContext]
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
