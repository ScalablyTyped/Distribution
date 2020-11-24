package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  def addChildRequest(serviceIdentifier: ServiceIdentifier[_], bindings: js.Array[Binding[_]], target: Target): Request = js.native
  def addChildRequest(serviceIdentifier: ServiceIdentifier[_], bindings: Binding[_], target: Target): Request = js.native
  
  var bindings: js.Array[Binding[_]] = js.native
  
  var childRequests: js.Array[Request] = js.native
  
  var id: Double = js.native
  
  var parentContext: Context = js.native
  
  var parentRequest: Request | Null = js.native
  
  var requestScope: RequestScope = js.native
  
  var serviceIdentifier: ServiceIdentifier[_] = js.native
  
  var target: Target = js.native
}
