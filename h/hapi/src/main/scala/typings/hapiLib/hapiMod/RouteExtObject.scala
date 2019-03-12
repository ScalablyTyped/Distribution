package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteExtObject extends js.Object {
  @JSName("method")
  var method_Original: hapiLib.hapiMod.LifecycleNs.Method = js.native
  var options: js.UndefOr[ServerExtOptions] = js.native
  def method(request: Request, h: ResponseToolkit): hapiLib.hapiMod.LifecycleNs.ReturnValue = js.native
  def method(request: Request, h: ResponseToolkit, err: stdLib.Error): hapiLib.hapiMod.LifecycleNs.ReturnValue = js.native
}

