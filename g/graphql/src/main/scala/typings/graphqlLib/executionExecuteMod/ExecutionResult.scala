package typings
package graphqlLib.executionExecuteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExecutionResult[TData] extends js.Object {
  var data: js.UndefOr[TData] = js.undefined
  var errors: js.UndefOr[js.Array[graphqlLib.errorMod.GraphQLError]] = js.undefined
}

