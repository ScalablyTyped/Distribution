package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUnionTypeComposerMod {
  type GraphQLUnionTypeExtended[TSource, TContext] = graphqlLib.graphqlMod.GraphQLUnionType with (graphqlDashComposeLib.Anon_GqcExtensionsGqcTypeMap[TSource, TContext])
  type UnionTypeComposeDefinition[TSource, TContext] = graphqlDashComposeLib.libTypeMapperMod.TypeAsString | (ComposeUnionTypeConfig[TSource, TContext])
  type UnionTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    graphqlDashComposeLib.libUtilsDefinitionsMod.MaybePromise[scala.Boolean | scala.Null | scala.Unit]
  ]
  type UnionTypeResolversMap[TSource, TContext] = stdLib.Map[
    graphqlDashComposeLib.libTypeMapperMod.ComposeObjectType, 
    UnionTypeResolverCheckFn[TSource, TContext]
  ]
}
