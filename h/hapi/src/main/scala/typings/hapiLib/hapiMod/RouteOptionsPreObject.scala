package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptionsPreObject extends js.Object {
  /**
       * key name used to assign the response of the method to in request.pre and request.preResponses.
       */
  var assign: js.UndefOr[java.lang.String] = js.native
  /**
       * A failAction value which determine what to do when a pre-handler method throws an error. If assign is specified and the failAction setting is not 'error', the error will be assigned.
       */
  var failAction: js.UndefOr[hapiLib.hapiMod.LifecycleNs.FailAction] = js.native
  /**
       * a lifecycle method.
       */
  @JSName("method")
  var method_Original: hapiLib.hapiMod.LifecycleNs.Method = js.native
  /**
       * a lifecycle method.
       */
  def method(request: Request, h: ResponseToolkit): hapiLib.hapiMod.LifecycleNs.ReturnValue = js.native
  /**
       * a lifecycle method.
       */
  def method(request: Request, h: ResponseToolkit, err: nodeLib.Error): hapiLib.hapiMod.LifecycleNs.ReturnValue = js.native
}

