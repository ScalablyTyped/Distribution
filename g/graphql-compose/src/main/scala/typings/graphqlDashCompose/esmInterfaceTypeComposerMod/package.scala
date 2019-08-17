package typings.graphqlDashCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmInterfaceTypeComposerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.graphqlMod.GraphQLInterfaceType
  import typings.graphql.graphqlMod.GraphQLObjectType
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typings.graphqlDashCompose.Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer
  import typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposer
  import typings.graphqlDashCompose.esmTypeMapperMod.TypeAsString
  import typings.graphqlDashCompose.esmTypeMapperMod.TypeDefinitionString
  import typings.graphqlDashCompose.esmUtilsDefinitionsMod.MaybePromise
  import typings.std.Map

  type ComposeInterfaceType = (InterfaceTypeComposer[js.Any, js.Any]) | GraphQLInterfaceType | TypeDefinitionString | TypeAsString
  type GraphQLInterfaceTypeExtended[TSource, TContext] = GraphQLInterfaceType with (Anon_GqcExtensionsGqcFieldsGqcInputTypeComposer[TSource, TContext])
  type InterfaceTypeComposeDefinition[TSource, TContext] = TypeAsString | (ComposeInterfaceTypeConfig[TSource, TContext])
  type InterfaceTypeResolverCheckFn[TSource, TContext] = js.Function3[
    /* value */ TSource, 
    /* context */ TContext, 
    /* info */ GraphQLResolveInfo, 
    MaybePromise[js.UndefOr[Boolean | Null]]
  ]
  type InterfaceTypeResolversMap[TContext] = Map[
    (ObjectTypeComposer[js.Any, TContext]) | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]), 
    InterfaceTypeResolverCheckFn[js.Any, TContext]
  ]
}
