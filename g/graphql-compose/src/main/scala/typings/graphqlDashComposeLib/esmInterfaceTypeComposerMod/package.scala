package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmInterfaceTypeComposerMod {
  type GraphQLInterfaceTypeExtended[TSource, TContext] = graphqlLib.graphqlMod.GraphQLInterfaceType with (graphqlDashComposeLib.Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer[TSource, TContext])
  type InterfaceTypeComposeDefinition[TSource, TContext] = graphqlDashComposeLib.esmTypeMapperMod.TypeAsString | (ComposeInterfaceTypeConfig[TSource, TContext])
  type InterfaceTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    graphqlDashComposeLib.esmUtilsDefinitionsMod.MaybePromise[js.UndefOr[scala.Boolean | scala.Null]]
  ]
  type InterfaceTypeResolversMap[TContext] = stdLib.Map[
    (graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[js.Any, TContext]) | (graphqlLib.graphqlMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]), 
    InterfaceTypeResolverCheckFn[js.Any, TContext]
  ]
}
