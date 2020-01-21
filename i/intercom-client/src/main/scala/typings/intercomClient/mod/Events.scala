package typings.intercomClient.mod

import typings.intercomClient.companyMod.List
import typings.intercomClient.eventMod.Event
import typings.intercomClient.eventMod.ListParam
import typings.node.httpMod.IncomingMessage
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intercom-client", "Events")
@js.native
class Events () extends js.Object {
  def create(event: Partial[Event]): js.Promise[IncomingMessage] = js.native
  def create(event: Partial[Event], cb: callback[IncomingMessage]): Unit = js.native
  def listBy(params: ListParam): js.Promise[ApiResponse[List]] = js.native
  def listBy(params: ListParam, cb: callback[ApiResponse[List]]): Unit = js.native
}

