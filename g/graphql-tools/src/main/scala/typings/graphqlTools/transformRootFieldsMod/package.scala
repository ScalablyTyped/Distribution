package typings.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transformRootFieldsMod {
  type RootTransformer = js.Function3[
    /* operation */ typings.graphqlTools.graphqlToolsStrings.Query | typings.graphqlTools.graphqlToolsStrings.Mutation | typings.graphqlTools.graphqlToolsStrings.Subscription, 
    /* fieldName */ java.lang.String, 
    /* field */ typings.graphql.definitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    js.UndefOr[
      (typings.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | typings.graphqlTools.anon.FieldName | scala.Null
    ]
  ]
}
