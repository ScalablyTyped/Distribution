package typings.leaflet.leafletMod

import typings.leaflet.leafletMod.IconNs.DefaultIconOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Icon")
@js.native
object IconNs extends js.Object {
  @js.native
  class Default () extends Icon[DefaultIconOptions] {
    def this(options: DefaultIconOptions) = this()
  }
  
  trait DefaultIconOptions extends BaseIconOptions {
    var imagePath: js.UndefOr[String] = js.undefined
  }
  
  /* static members */
  @js.native
  object Default extends js.Object {
    var imagePath: js.UndefOr[String] = js.native
  }
  
}

