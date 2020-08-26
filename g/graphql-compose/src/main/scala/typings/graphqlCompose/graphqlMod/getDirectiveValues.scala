package typings.graphqlCompose.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.anon.Directives
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "getDirectiveValues")
@js.native
object getDirectiveValues extends js.Object {
  def apply(directiveDef: typings.graphql.directivesMod.GraphQLDirective, node: Directives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def apply(
    directiveDef: typings.graphql.directivesMod.GraphQLDirective,
    node: Directives,
    variableValues: Maybe[StringDictionary[_]]
  ): js.UndefOr[StringDictionary[js.Any]] = js.native
}

