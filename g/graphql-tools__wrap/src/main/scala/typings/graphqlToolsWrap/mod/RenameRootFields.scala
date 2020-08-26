package typings.graphqlToolsWrap.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphqlToolsWrap.graphqlToolsWrapStrings.Mutation
import typings.graphqlToolsWrap.graphqlToolsWrapStrings.Query
import typings.graphqlToolsWrap.graphqlToolsWrapStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap", "RenameRootFields")
@js.native
class RenameRootFields protected ()
  extends typings.graphqlToolsWrap.transformsMod.RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

