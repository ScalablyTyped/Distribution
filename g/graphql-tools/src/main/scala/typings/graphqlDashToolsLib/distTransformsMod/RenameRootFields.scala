package typings
package graphqlDashToolsLib.distTransformsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends graphqlDashToolsLib.distTransformsRenameRootFieldsMod.default {
  def this(renamer: js.Function3[
      /* operation */ graphqlDashToolsLib.graphqlDashToolsLibStrings.Query | graphqlDashToolsLib.graphqlDashToolsLibStrings.Mutation | graphqlDashToolsLib.graphqlDashToolsLibStrings.Subscription, 
      /* name */ java.lang.String, 
      /* field */ graphqlLib.typeDefinitionMod.GraphQLField[_, _, org.scalablytyped.runtime.StringDictionary[_]], 
      java.lang.String
    ]) = this()
}

