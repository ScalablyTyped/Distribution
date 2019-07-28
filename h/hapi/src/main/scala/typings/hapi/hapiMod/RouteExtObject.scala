package typings.hapi.hapiMod

import typings.hapi.hapiMod.LifecycleNs.Method
import typings.hapi.hapiMod.LifecycleNs.ReturnValue
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteExtObject extends js.Object {
  @JSName("method")
  var method_Original: Method = js.native
  var options: js.UndefOr[ServerExtOptions] = js.native
  def method(request: Request, h: ResponseToolkit): ReturnValue = js.native
  def method(request: Request, h: ResponseToolkit, err: Error): ReturnValue = js.native
}

