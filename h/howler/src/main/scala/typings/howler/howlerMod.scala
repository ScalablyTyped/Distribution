package typings.howler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("howler", JSImport.Namespace)
@js.native
object howlerMod extends js.Object {
  @js.native
  class Howl protected ()
    extends typings.howler.Howl {
    def this(properties: IHowlProperties) = this()
  }
  
  var Howl: HowlStatic = js.native
  var Howler: HowlerGlobal = js.native
}

