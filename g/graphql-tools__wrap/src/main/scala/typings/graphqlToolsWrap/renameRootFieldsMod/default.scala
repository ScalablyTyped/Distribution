package typings.graphqlToolsWrap.renameRootFieldsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphqlToolsWrap.graphqlToolsWrapStrings.Mutation
import typings.graphqlToolsWrap.graphqlToolsWrapStrings.Query
import typings.graphqlToolsWrap.graphqlToolsWrapStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms/RenameRootFields", JSImport.Default)
@js.native
class default protected () extends RenameRootFields {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

