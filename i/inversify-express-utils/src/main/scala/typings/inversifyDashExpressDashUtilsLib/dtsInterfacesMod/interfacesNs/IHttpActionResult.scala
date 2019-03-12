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
    executeAsync: () => js.Promise[inversifyDashExpressDashUtilsLib.dtsHttpResponseMessageMod.HttpResponseMessage]
  ): IHttpActionResult = {
    val __obj = js.Dynamic.literal(executeAsync = js.Any.fromFunction0(executeAsync))
  
    __obj.asInstanceOf[IHttpActionResult]
  }
}

