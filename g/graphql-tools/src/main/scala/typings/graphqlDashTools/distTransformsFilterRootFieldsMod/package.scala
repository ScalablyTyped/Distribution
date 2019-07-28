package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphqlDashTools.graphqlDashToolsStrings.Mutation
import typings.graphqlDashTools.graphqlDashToolsStrings.Query
import typings.graphqlDashTools.graphqlDashToolsStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTransformsFilterRootFieldsMod {
  type RootFilter = js.Function3[
    /* operation */ Query | Mutation | Subscription, 
    /* fieldName */ String, 
    /* field */ GraphQLField[js.Any, js.Any, StringDictionary[js.Any]], 
    Boolean
  ]
}
