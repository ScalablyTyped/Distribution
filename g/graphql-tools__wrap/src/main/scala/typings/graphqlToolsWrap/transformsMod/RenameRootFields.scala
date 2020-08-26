package typings.graphqlToolsWrap.transformsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphqlToolsWrap.graphqlToolsWrapStrings.Mutation
import typings.graphqlToolsWrap.graphqlToolsWrapStrings.Query
import typings.graphqlToolsWrap.graphqlToolsWrapStrings.Subscription
import typings.graphqlToolsWrap.renameRootFieldsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/transforms", "RenameRootFields")
@js.native
class RenameRootFields protected () extends default {
  def this(renamer: js.Function3[
        /* operation */ Query | Mutation | Subscription, 
        /* name */ String, 
        /* fieldConfig */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
        String
      ]) = this()
}

