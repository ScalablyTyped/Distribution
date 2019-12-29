package typings.leafletDashLoading.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Control")
@js.native
object Control extends js.Object {
  @js.native
  class Loading ()
    extends typings.leaflet.leafletMod.Control {
    def this(options: LoadingOptions) = this()
    @JSName("options")
    var options_Loading: LoadingOptions = js.native
  }
  
  def loading(): Loading = js.native
  def loading(options: LoadingOptions): Loading = js.native
}

