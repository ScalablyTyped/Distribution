package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.Binding
import typings.inversify.libInterfacesInterfacesMod.interfaces.Context
import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversify.libInterfacesInterfacesMod.interfaces.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlanningRequestMod {
  
  @JSImport("inversify/lib/planning/request", "Request")
  @js.native
  open class Request protected ()
    extends StObject
       with typings.inversify.libInterfacesInterfacesMod.interfaces.Request {
    def this(
      serviceIdentifier: ServiceIdentifier[Any],
      parentContext: Context,
      parentRequest: Null,
      bindings: js.Array[Binding[Any]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[Any],
      parentContext: Context,
      parentRequest: Null,
      bindings: Binding[Any],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[Any],
      parentContext: Context,
      parentRequest: typings.inversify.libInterfacesInterfacesMod.interfaces.Request,
      bindings: js.Array[Binding[Any]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[Any],
      parentContext: Context,
      parentRequest: typings.inversify.libInterfacesInterfacesMod.interfaces.Request,
      bindings: Binding[Any],
      target: Target
    ) = this()
  }
}
