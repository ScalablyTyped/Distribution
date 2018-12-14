package typings
package graphqlDashToolsLib.graphqlDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends graphqlDashToolsLib.distTransformsMod.RenameRootFields {
  def this(renamer: js.Function3[
      /* operation */ graphqlDashToolsLib.graphqlDashToolsLibStrings.Query | graphqlDashToolsLib.graphqlDashToolsLibStrings.Mutation | graphqlDashToolsLib.graphqlDashToolsLibStrings.Subscription, 
      /* name */ java.lang.String, 
      /* field */ graphqlLib.typeDefinitionMod.GraphQLField[_, _, org.scalablytyped.runtime.StringDictionary[_]], 
      java.lang.String
    ]) = this()
}

