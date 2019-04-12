package typings
package atHapiHapiLib.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteExtObject extends js.Object {
  @JSName("method")
  var method_Original: atHapiHapiLib.atHapiHapiMod.LifecycleNs.Method = js.native
  var options: js.UndefOr[ServerExtOptions] = js.native
  def method(request: Request, h: ResponseToolkit): atHapiHapiLib.atHapiHapiMod.LifecycleNs.ReturnValue = js.native
  def method(request: Request, h: ResponseToolkit, err: stdLib.Error): atHapiHapiLib.atHapiHapiMod.LifecycleNs.ReturnValue = js.native
}

