package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.Context
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversify.interfacesMod.interfaces.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/request", JSImport.Namespace)
@js.native
object requestMod extends js.Object {
  @js.native
  class Request protected ()
    extends typings.inversify.interfacesMod.interfaces.Request {
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
      parentRequest: typings.inversify.interfacesMod.interfaces.Request,
      bindings: js.Array[Binding[_]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: typings.inversify.interfacesMod.interfaces.Request,
      bindings: Binding[_],
      target: Target
    ) = this()
  }
  
}

