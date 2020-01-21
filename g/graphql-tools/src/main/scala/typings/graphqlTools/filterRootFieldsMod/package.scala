package typings.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object filterRootFieldsMod {
  type RootFilter = js.Function3[
    /* operation */ typings.graphqlTools.graphqlToolsStrings.Query | typings.graphqlTools.graphqlToolsStrings.Mutation | typings.graphqlTools.graphqlToolsStrings.Subscription, 
    /* fieldName */ java.lang.String, 
    /* field */ typings.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    scala.Boolean
  ]
}
