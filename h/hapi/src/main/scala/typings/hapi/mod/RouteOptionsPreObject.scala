package typings.hapi.mod

import typings.hapi.mod.Lifecycle.FailAction
import typings.hapi.mod.Lifecycle.Method
import typings.hapi.mod.Lifecycle.ReturnValue
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteOptionsPreObject extends StObject {
  
  /**
    * key name used to assign the response of the method to in request.pre and request.preResponses.
    */
  var assign: js.UndefOr[String] = js.native
  
  /**
    * A failAction value which determine what to do when a pre-handler method throws an error. If assign is specified and the failAction setting is not 'error', the error will be assigned.
    */
  var failAction: js.UndefOr[FailAction] = js.native
  
  /**
    * a lifecycle method.
    */
  def method(request: Request, h: ResponseToolkit): ReturnValue = js.native
  def method(request: Request, h: ResponseToolkit, err: Error): ReturnValue = js.native
  /**
    * a lifecycle method.
    */
  @JSName("method")
  var method_Original: Method = js.native
}
