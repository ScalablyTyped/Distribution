package typings.leafletDashResponsiveDashPopup.leafletMod

import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.Popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "ResponsivePopup")
@js.native
class ResponsivePopup () extends Popup {
  def this(options: ResponsivePopupOptions) = this()
  def this(options: ResponsivePopupOptions, source: Layer) = this()
}

@JSImport("leaflet", "responsivePopup")
@js.native
object responsivePopup extends js.Object {
  def apply(): ResponsivePopup = js.native
  def apply(options: ResponsivePopupOptions): ResponsivePopup = js.native
  def apply(options: ResponsivePopupOptions, source: Layer): ResponsivePopup = js.native
}

