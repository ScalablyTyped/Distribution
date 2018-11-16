package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Icon")
@js.native
object IconNs extends js.Object {
  @js.native
  class Default ()
    extends leafletLib.leafletMod.Icon[DefaultIconOptions] {
    def this(options: DefaultIconOptions) = this()
  }
  
  
  trait DefaultIconOptions
    extends leafletLib.leafletMod.BaseIconOptions {
    var imagePath: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  object Default extends js.Object {
    var imagePath: js.UndefOr[java.lang.String] = js.native
  }
  
}

