package typings.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfaceTypeComposerMod {
  type ComposeInterfaceType = (typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[js.Any, js.Any]) | typings.graphql.mod.GraphQLInterfaceType | typings.graphqlCompose.typeMapperMod.TypeDefinitionString | typings.graphqlCompose.typeMapperMod.TypeAsString
  type InterfaceTypeComposeDefinition[TSource, TContext] = typings.graphqlCompose.typeMapperMod.TypeAsString | (typings.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig[TSource, TContext])
  type InterfaceTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    typings.graphqlCompose.definitionsMod.MaybePromise[js.UndefOr[scala.Boolean | scala.Null]]
  ]
  type InterfaceTypeResolversMap[TContext] = typings.std.Map[
    (typings.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (typings.graphql.mod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]), 
    typings.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeResolverCheckFn[js.Any, TContext]
  ]
}
