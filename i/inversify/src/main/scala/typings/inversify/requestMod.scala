package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.Context
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversify.interfacesMod.interfaces.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("inversify/lib/planning/request", "Request")
  @js.native
  open class Request protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.Request {
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
      parentRequest: typings.inversify.interfacesMod.interfaces.Request,
      bindings: js.Array[Binding[Any]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[Any],
      parentContext: Context,
      parentRequest: typings.inversify.interfacesMod.interfaces.Request,
      bindings: Binding[Any],
      target: Target
    ) = this()
  }
}
