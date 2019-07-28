package typings.graphqlDashCompose

import typings.graphql.graphqlMod.GraphQLUnionType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashCompose.Anon_GqcExtensionsGqcTypeMap
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ComposeObjectType
import typings.graphqlDashCompose.esmTypeMapperMod.TypeAsString
import typings.graphqlDashCompose.esmTypeMapperMod.TypeDefinitionString
import typings.graphqlDashCompose.esmUtilsDefinitionsMod.MaybePromise
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmUnionTypeComposerMod {
  type ComposeUnionType = (UnionTypeComposer[js.Any, js.Any]) | GraphQLUnionType | TypeDefinitionString | TypeAsString
  type GraphQLUnionTypeExtended[TSource, TContext] = GraphQLUnionType with (Anon_GqcExtensionsGqcTypeMap[TSource, TContext])
  type UnionTypeComposeDefinition[TSource, TContext] = TypeAsString | (ComposeUnionTypeConfig[TSource, TContext])
  type UnionTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    MaybePromise[Boolean | Null | Unit]
  ]
  type UnionTypeResolversMap[TSource, TContext] = Map[ComposeObjectType, UnionTypeResolverCheckFn[TSource, TContext]]
}
