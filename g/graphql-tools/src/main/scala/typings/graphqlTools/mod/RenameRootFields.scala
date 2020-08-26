package typings.graphqlTools.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphqlTools.graphqlToolsStrings.Mutation
import typings.graphqlTools.graphqlToolsStrings.Query
import typings.graphqlTools.graphqlToolsStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typings.graphqlToolsWrap.mod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

