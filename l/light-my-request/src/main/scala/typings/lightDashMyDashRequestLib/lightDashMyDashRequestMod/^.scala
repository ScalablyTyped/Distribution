package typings
package lightDashMyDashRequestLib.lightDashMyDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("light-my-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def inject(dispatchFunc: DispatchFunc, options: java.lang.String): js.Promise[Response] = js.native
  def inject(
    dispatchFunc: DispatchFunc,
    options: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* response */ Response, scala.Unit]
  ): scala.Unit = js.native
  def inject(dispatchFunc: DispatchFunc, options: InjectOptions): js.Promise[Response] = js.native
  def inject(
    dispatchFunc: DispatchFunc,
    options: InjectOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* response */ Response, scala.Unit]
  ): scala.Unit = js.native
  def isInjection(obj: Request): scala.Boolean = js.native
  def isInjection(obj: Response): scala.Boolean = js.native
}

