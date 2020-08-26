package typings.graphqlToolsMock.typesMod

import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMockServer extends js.Object {
  /**
    * Executes the provided query against the mocked schema.
    * @param query GraphQL query to execute
    * @param vars Variables
    */
  def query(query: String): js.Promise[ExecutionResult[Record[String, _]]] = js.native
  def query(query: String, vars: Record[String, _]): js.Promise[ExecutionResult[Record[String, _]]] = js.native
}

