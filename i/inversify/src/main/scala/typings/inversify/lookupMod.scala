package typings.inversify

import typings.inversify.interfacesMod.interfaces.Clonable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/container/lookup", JSImport.Namespace)
@js.native
object lookupMod extends js.Object {
  @js.native
  class Lookup[T /* <: Clonable[T] */] ()
    extends typings.inversify.interfacesMod.interfaces.Lookup[T] {
    var _map: js.Any = js.native
  }
  
}

