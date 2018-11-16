package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTransformsTransformRootFieldsMod {
  type RootTransformer = js.Function3[
    /* operation */ graphqlDashToolsLib.graphqlDashToolsLibStrings.Query | graphqlDashToolsLib.graphqlDashToolsLibStrings.Mutation | graphqlDashToolsLib.graphqlDashToolsLibStrings.Subscription, 
    /* fieldName */ java.lang.String, 
    /* field */ graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, ScalablyTyped.runtime.StringDictionary[js.Any]], 
    js.UndefOr[
      (graphqlLib.typeDefinitionMod.GraphQLFieldConfig[js.Any, js.Any, ScalablyTyped.runtime.StringDictionary[js.Any]]) | graphqlDashToolsLib.Anon_Field | scala.Null
    ]
  ]
}
