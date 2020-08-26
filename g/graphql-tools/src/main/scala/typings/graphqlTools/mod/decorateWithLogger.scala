package typings.graphqlTools.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphqlToolsSchema.typesMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "decorateWithLogger")
@js.native
object decorateWithLogger extends js.Object {
  def apply(fn: GraphQLFieldResolver[_, _, StringDictionary[_]], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
}

