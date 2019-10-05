package typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces

import typings.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpActionResult extends js.Object {
  def executeAsync(): js.Promise[HttpResponseMessage]
}

object IHttpActionResult {
  @scala.inline
  def apply(executeAsync: () => js.Promise[HttpResponseMessage]): IHttpActionResult = {
    val __obj = js.Dynamic.literal(executeAsync = js.Any.fromFunction0(executeAsync))
  
    __obj.asInstanceOf[IHttpActionResult]
  }
}

