package typings.inversify

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Binding
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Context
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/request", JSImport.Namespace)
@js.native
object dtsPlanningRequestMod extends js.Object {
  @js.native
  class Request protected ()
    extends typings.inversify.dtsInterfacesInterfacesMod.interfaces.Request {
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: Null,
      bindings: js.Array[Binding[_]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: Null,
      bindings: Binding[_],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: typings.inversify.dtsInterfacesInterfacesMod.interfaces.Request,
      bindings: js.Array[Binding[_]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: typings.inversify.dtsInterfacesInterfacesMod.interfaces.Request,
      bindings: Binding[_],
      target: Target
    ) = this()
  }
  
}

