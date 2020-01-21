package typings.graphqlTools.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.executeMod.ExecutionResultDataDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMockServer extends js.Object {
  def query(query: String): js.Promise[ExecutionResult[ExecutionResultDataDefault]] = js.native
  def query(query: String, vars: StringDictionary[js.Any]): js.Promise[ExecutionResult[ExecutionResultDataDefault]] = js.native
}

