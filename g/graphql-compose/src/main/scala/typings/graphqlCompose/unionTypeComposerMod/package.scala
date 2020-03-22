package typings.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object unionTypeComposerMod {
  type ComposeUnionType = (typings.graphqlCompose.unionTypeComposerMod.UnionTypeComposer[js.Any, js.Any]) | typings.graphql.mod.GraphQLUnionType | typings.graphqlCompose.typeMapperMod.TypeDefinitionString | typings.graphqlCompose.typeMapperMod.TypeAsString
  type UnionTypeComposeDefinition[TSource, TContext] = typings.graphqlCompose.typeMapperMod.TypeAsString | (typings.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig[TSource, TContext])
  type UnionTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ typings.graphql.definitionMod.GraphQLResolveInfo, 
    typings.graphqlCompose.definitionsMod.MaybePromise[scala.Boolean | scala.Null | scala.Unit]
  ]
  type UnionTypeResolversMap[TSource, TContext] = typings.std.Map[
    typings.graphqlCompose.objectTypeComposerMod.ComposeObjectType, 
    typings.graphqlCompose.unionTypeComposerMod.UnionTypeResolverCheckFn[TSource, TContext]
  ]
}
