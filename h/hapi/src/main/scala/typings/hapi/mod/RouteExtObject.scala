package typings.hapi.mod

import typings.hapi.mod.Lifecycle.Method
import typings.hapi.mod.Lifecycle.ReturnValue
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteExtObject extends StObject {
  
  def method(request: Request, h: ResponseToolkit): ReturnValue = js.native
  def method(request: Request, h: ResponseToolkit, err: Error): ReturnValue = js.native
  @JSName("method")
  var method_Original: Method = js.native
  
  var options: js.UndefOr[ServerExtOptions] = js.native
}
