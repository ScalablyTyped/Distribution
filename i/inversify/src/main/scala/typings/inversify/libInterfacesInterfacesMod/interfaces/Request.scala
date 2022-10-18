package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  def addChildRequest(serviceIdentifier: ServiceIdentifier[Any], bindings: js.Array[Binding[Any]], target: Target): Request = js.native
  def addChildRequest(serviceIdentifier: ServiceIdentifier[Any], bindings: Binding[Any], target: Target): Request = js.native
  
  var bindings: js.Array[Binding[Any]] = js.native
  
  var childRequests: js.Array[Request] = js.native
  
  var id: Double = js.native
  
  var parentContext: Context = js.native
  
  var parentRequest: Request | Null = js.native
  
  var requestScope: RequestScope | Null = js.native
  
  var serviceIdentifier: ServiceIdentifier[Any] = js.native
  
  var target: Target = js.native
}
