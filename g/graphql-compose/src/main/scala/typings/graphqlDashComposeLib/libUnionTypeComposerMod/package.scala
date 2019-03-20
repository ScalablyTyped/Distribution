package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUnionTypeComposerMod {
  type ComposeTypesArray = js.Array[graphqlDashComposeLib.libTypeMapperMod.ComposeObjectType]
  type GraphQLUnionTypeExtended[TSource, TContext] = graphqlLib.graphqlMod.GraphQLUnionType with (graphqlDashComposeLib.Anon_GqcTypeMap[TSource, TContext])
  type MaybePromise[T] = js.Promise[T] | T
  type UnionTypeComposerDefinition[TContext] = graphqlDashComposeLib.libTypeMapperMod.TypeAsString | (ComposeUnionTypeConfig[js.Any, TContext])
  type UnionTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    MaybePromise[js.UndefOr[scala.Boolean | scala.Null]]
  ]
  type UnionTypeResolversMap[TSource, TContext] = stdLib.Map[
    graphqlDashComposeLib.libTypeMapperMod.ComposeObjectType, 
    UnionTypeResolverCheckFn[TSource, TContext]
  ]
}
