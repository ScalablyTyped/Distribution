package typings.graphqlDashTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTransformsTransformRootFieldsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.typeDefinitionMod.GraphQLField
  import typings.graphql.typeDefinitionMod.GraphQLFieldConfig
  import typings.graphqlDashTools.Anon_ArgNameField
  import typings.graphqlDashTools.graphqlDashToolsStrings.Mutation
  import typings.graphqlDashTools.graphqlDashToolsStrings.Query
  import typings.graphqlDashTools.graphqlDashToolsStrings.Subscription

  type RootTransformer = js.Function3[
    /* operation */ Query | Mutation | Subscription, 
    /* fieldName */ String, 
    /* field */ GraphQLField[js.Any, js.Any, StringDictionary[js.Any]], 
    js.UndefOr[
      (GraphQLFieldConfig[js.Any, js.Any, StringDictionary[js.Any]]) | Anon_ArgNameField | Null
    ]
  ]
}
