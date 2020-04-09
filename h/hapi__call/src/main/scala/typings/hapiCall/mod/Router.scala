package typings.hapiCall.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/call", "Router")
@js.native
class Router () extends js.Object {
  def add(definition: RouteDefinition): Unit = js.native
  def add(definition: RouteDefinition, data: js.Any): Unit = js.native
  def route(method: String, path: String): Route[_, _] = js.native
}

