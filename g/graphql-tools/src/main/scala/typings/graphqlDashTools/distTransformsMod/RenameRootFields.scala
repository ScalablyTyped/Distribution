package typings.graphqlDashTools.distTransformsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphqlDashTools.distTransformsRenameRootFieldsMod.default
import typings.graphqlDashTools.graphqlDashToolsStrings.Mutation
import typings.graphqlDashTools.graphqlDashToolsStrings.Query
import typings.graphqlDashTools.graphqlDashToolsStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms", "RenameRootFields")
@js.native
class RenameRootFields protected () extends default {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* field */ GraphQLField[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

