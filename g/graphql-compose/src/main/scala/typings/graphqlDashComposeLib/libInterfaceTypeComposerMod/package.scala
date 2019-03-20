package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterfaceTypeComposerMod {
  type GraphQLInterfaceTypeExtended[TSource, TContext] = graphqlLib.graphqlMod.GraphQLInterfaceType with (graphqlDashComposeLib.Anon_GqcFields[TSource, TContext])
  type InterfaceTypeComposerDefinition[TContext] = graphqlDashComposeLib.libTypeMapperMod.TypeAsString | (ComposeInterfaceTypeConfig[js.Any, TContext])
  type InterfaceTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
    MaybePromise[js.UndefOr[scala.Boolean | scala.Null]]
  ]
  type InterfaceTypeResolversMap[TSource, TContext] = stdLib.Map[
    (graphqlDashComposeLib.libTypeComposerMod.TypeComposer[js.Any, TContext]) | (graphqlLib.graphqlMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]), 
    InterfaceTypeResolverCheckFn[TSource, TContext]
  ]
  type MaybePromise[T] = js.Promise[T] | T
}
