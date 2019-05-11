package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmUnionTypeComposerMod {
  type GraphQLUnionTypeExtended[TSource, TContext] = graphqlLib.graphqlMod.GraphQLUnionType with (graphqlDashComposeLib.Anon_GqcExtensionsGqcTypeMap[TSource, TContext])
  type UnionTypeComposeDefinition[TSource, TContext] = graphqlDashComposeLib.esmTypeMapperMod.TypeAsString | (ComposeUnionTypeConfig[TSource, TContext])
  type UnionTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    graphqlDashComposeLib.esmUtilsDefinitionsMod.MaybePromise[scala.Boolean | scala.Null | scala.Unit]
  ]
  type UnionTypeResolversMap[TSource, TContext] = stdLib.Map[
    graphqlDashComposeLib.esmTypeMapperMod.ComposeObjectType, 
    UnionTypeResolverCheckFn[TSource, TContext]
  ]
}
