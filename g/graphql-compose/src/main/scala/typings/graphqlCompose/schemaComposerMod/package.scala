package typings.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schemaComposerMod {
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext]
    - typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext]
    - typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - typings.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext]
  */
  type AnyComposeType[TContext] = typings.graphqlCompose.schemaComposerMod._AnyComposeType[TContext] | (typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]) | (typings.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext])
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]
    - typings.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext]
    - typings.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[TContext]
    - typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]
    - typings.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext]
    - typings.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[TContext]
    - typings.graphql.definitionMod.GraphQLNamedType
  */
  type AnyType[TContext] = typings.graphqlCompose.schemaComposerMod._AnyType[TContext] | (typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, TContext]) | (typings.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, TContext]) | typings.graphql.definitionMod.GraphQLNamedType
  type GraphQLToolsResolveMethods[TContext] = org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* source */ js.Any, 
        /* args */ js.Object, 
        /* context */ TContext, 
        /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
        js.Any
      ]
    ]
  ]
}
