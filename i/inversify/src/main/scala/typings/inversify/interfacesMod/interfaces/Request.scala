package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  def addChildRequest(serviceIdentifier: ServiceIdentifier[js.Any], bindings: js.Array[Binding[js.Any]], target: Target): Request = js.native
  def addChildRequest(serviceIdentifier: ServiceIdentifier[js.Any], bindings: Binding[js.Any], target: Target): Request = js.native
  
  var bindings: js.Array[Binding[js.Any]] = js.native
  
  var childRequests: js.Array[Request] = js.native
  
  var id: Double = js.native
  
  var parentContext: Context = js.native
  
  var parentRequest: Request | Null = js.native
  
  var requestScope: RequestScope = js.native
  
  var serviceIdentifier: ServiceIdentifier[js.Any] = js.native
  
  var target: Target = js.native
}
