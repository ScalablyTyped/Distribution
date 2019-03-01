package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpActionResult extends js.Object {
  def executeAsync(): js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
}

object IHttpActionResult {
  @scala.inline
  def apply(
    executeAsync: js.Function0[
      js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
    ]
  ): IHttpActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("executeAsync")(executeAsync)
    __obj.asInstanceOf[IHttpActionResult]
  }
}

