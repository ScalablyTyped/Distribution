package typings
package lightDashMyDashRequestLib.lightDashMyDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("light-my-request", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def inject(
    dispatchFunc: lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.DispatchFunc,
    options: java.lang.String
  ): js.Promise[lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.Response] = js.native
  def inject(
    dispatchFunc: lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.DispatchFunc,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* response */ lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def inject(
    dispatchFunc: lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.DispatchFunc,
    options: lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.InjectOptions
  ): js.Promise[lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.Response] = js.native
  def inject(
    dispatchFunc: lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.DispatchFunc,
    options: lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.InjectOptions,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* response */ lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def isInjection(obj: lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.Request): scala.Boolean = js.native
  def isInjection(obj: lightDashMyDashRequestLib.lightDashMyDashRequestMod.LightMyRequestNs.Response): scala.Boolean = js.native
}

