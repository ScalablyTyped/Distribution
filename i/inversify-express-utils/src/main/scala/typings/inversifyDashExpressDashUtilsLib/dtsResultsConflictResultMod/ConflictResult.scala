package typings
package inversifyDashExpressDashUtilsLib.dtsResultsConflictResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConflictResult
  extends inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs.IHttpActionResult {
  var apiController: js.Any
}

object ConflictResult {
  @scala.inline
  def apply(
    apiController: js.Any,
    executeAsync: js.Function0[
      js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
    ]
  ): ConflictResult = {
    val __obj = js.Dynamic.literal(apiController = apiController, executeAsync = executeAsync)
  
    __obj.asInstanceOf[ConflictResult]
  }
}

