package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUnionTypeComposerMod {
  type ComposeUnionType = (UnionTypeComposer[js.Any, js.Any]) | graphqlLib.graphqlMod.GraphQLUnionType | graphqlDashComposeLib.libTypeMapperMod.TypeDefinitionString | graphqlDashComposeLib.libTypeMapperMod.TypeAsString
  type GraphQLUnionTypeExtended[TSource, TContext] = graphqlLib.graphqlMod.GraphQLUnionType with (graphqlDashComposeLib.Anon_GqcExtensionsGqcTypeMapGqcTypeResolvers[TSource, TContext])
  type UnionTypeComposeDefinition[TSource, TContext] = graphqlDashComposeLib.libTypeMapperMod.TypeAsString | (ComposeUnionTypeConfig[TSource, TContext])
  type UnionTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    graphqlDashComposeLib.libUtilsDefinitionsMod.MaybePromise[scala.Boolean | scala.Null | scala.Unit]
  ]
  type UnionTypeResolversMap[TSource, TContext] = stdLib.Map[
    graphqlDashComposeLib.libObjectTypeComposerMod.ComposeObjectType, 
    UnionTypeResolverCheckFn[TSource, TContext]
  ]
}
