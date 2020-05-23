package typings.howler

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Howl protected ()
    extends typings.howler.Howl {
    def this(properties: IHowlProperties) = this()
  }
  
  var Howler: HowlerGlobal = js.native
  @js.native
  object Howl extends TopLevel[HowlStatic]
  
}

