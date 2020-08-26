package typings.inversify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/metadata", JSImport.Namespace)
@js.native
object metadataMod extends js.Object {
  @js.native
  class Metadata protected ()
    extends typings.inversify.interfacesMod.interfaces.Metadata {
    def this(key: String, value: js.Any) = this()
    def this(key: js.Symbol, value: js.Any) = this()
    def this(key: Double, value: js.Any) = this()
  }
  
}

