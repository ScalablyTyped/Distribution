package typings.inversify

import typings.inversify.interfacesMod.interfaces.BindingScope
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingMod {
  
  @JSImport("inversify/dts/bindings/binding", "Binding")
  @js.native
  class Binding[T] protected ()
    extends typings.inversify.interfacesMod.interfaces.Binding[T] {
    def this(serviceIdentifier: ServiceIdentifier[T], scope: BindingScope) = this()
  }
}
