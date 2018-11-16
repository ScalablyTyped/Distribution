package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMockServer extends js.Object {
  def query(query: java.lang.String): stdLib.Promise[
    graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
  ] = js.native
  def query(query: java.lang.String, vars: ScalablyTyped.runtime.StringDictionary[js.Any]): stdLib.Promise[
    graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
  ] = js.native
}

