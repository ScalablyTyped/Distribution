package typings.graphql.executionValuesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.Anon_Directives
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDirectivesMod.GraphQLDirective
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/values", "getDirectiveValues")
@js.native
object getDirectiveValues extends js.Object {
  def apply(directiveDef: GraphQLDirective, node: Anon_Directives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def apply(directiveDef: GraphQLDirective, node: Anon_Directives, variableValues: Maybe[StringDictionary[_]]): js.UndefOr[StringDictionary[js.Any]] = js.native
}

