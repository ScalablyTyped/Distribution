package typings.atHapiHapi.atHapiHapiMod

import typings.atHapiHapi.atHapiHapiMod.LifecycleNs.Method
import typings.atHapiHapi.atHapiHapiMod.LifecycleNs.ReturnValue
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

