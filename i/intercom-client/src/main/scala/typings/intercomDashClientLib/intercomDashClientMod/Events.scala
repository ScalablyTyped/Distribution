package typings
package intercomDashClientLib.intercomDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Events")
@js.native
class Events () extends js.Object {
  def create(event: stdLib.Partial[intercomDashClientLib.eventMod.Event]): stdLib.Promise[nodeLib.httpMod.IncomingMessage] = js.native
  def create(
    event: stdLib.Partial[intercomDashClientLib.eventMod.Event],
    cb: callback[nodeLib.httpMod.IncomingMessage]
  ): scala.Unit = js.native
  def listBy(params: intercomDashClientLib.eventMod.ListParam): stdLib.Promise[ApiResponse[intercomDashClientLib.companyMod.List]] = js.native
  def listBy(
    params: intercomDashClientLib.eventMod.ListParam,
    cb: callback[ApiResponse[intercomDashClientLib.companyMod.List]]
  ): scala.Unit = js.native
}

