package typings.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUnionTypeComposerMod {
  import typings.graphql.graphqlMod.GraphQLUnionType
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typings.graphqlDashCompose.Anon_GqcExtensionsGqcTypeMapGqcTypeResolvers
  import typings.graphqlDashCompose.libObjectTypeComposerMod.ComposeObjectType
  import typings.graphqlDashCompose.libTypeMapperMod.TypeAsString
  import typings.graphqlDashCompose.libTypeMapperMod.TypeDefinitionString
  import typings.graphqlDashCompose.libUtilsDefinitionsMod.MaybePromise
  import typings.std.Map

  type ComposeUnionType = (UnionTypeComposer[js.Any, js.Any]) | GraphQLUnionType | TypeDefinitionString | TypeAsString
  type GraphQLUnionTypeExtended[TSource, TContext] = GraphQLUnionType with (Anon_GqcExtensionsGqcTypeMapGqcTypeResolvers[TSource, TContext])
  type UnionTypeComposeDefinition[TSource, TContext] = TypeAsString | (ComposeUnionTypeConfig[TSource, TContext])
  type UnionTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    MaybePromise[Boolean | Null | Unit]
  ]
  type UnionTypeResolversMap[TSource, TContext] = Map[ComposeObjectType, UnionTypeResolverCheckFn[TSource, TContext]]
}
