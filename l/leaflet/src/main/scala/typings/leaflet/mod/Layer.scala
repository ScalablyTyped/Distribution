package typings.leaflet.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Layer")
@js.native
class Layer () extends Evented {
  def this(options: LayerOptions) = this()
  var _map: Map_ = js.native
  var beforeAdd: js.UndefOr[js.Function1[/* map */ Map_, this.type]] = js.native
  var getAttribution: js.UndefOr[js.Function0[String | Null]] = js.native
  var getEvents: js.UndefOr[js.Function0[StringDictionary[LeafletEventHandlerFn]]] = js.native
  def addTo(map: LayerGroup_[_]): this.type = js.native
  def addTo(map: Map_): this.type = js.native
  // Popup methods
  def bindPopup(content: js.Function1[/* layer */ this.type, Content]): this.type = js.native
  def bindPopup(content: js.Function1[/* layer */ this.type, Content], options: PopupOptions): this.type = js.native
  def bindPopup(content: Content): this.type = js.native
  def bindPopup(content: Content, options: PopupOptions): this.type = js.native
  def bindPopup(content: Popup_): this.type = js.native
  def bindPopup(content: Popup_, options: PopupOptions): this.type = js.native
  // Tooltip methods
  def bindTooltip(content: js.Function1[/* layer */ this.type, Content]): this.type = js.native
  def bindTooltip(content: js.Function1[/* layer */ this.type, Content], options: TooltipOptions): this.type = js.native
  def bindTooltip(content: Content): this.type = js.native
  def bindTooltip(content: Content, options: TooltipOptions): this.type = js.native
  def bindTooltip(content: Tooltip_): this.type = js.native
  def bindTooltip(content: Tooltip_, options: TooltipOptions): this.type = js.native
  def closePopup(): this.type = js.native
  def closeTooltip(): this.type = js.native
  def getPane(): js.UndefOr[HTMLElement] = js.native
  def getPane(name: String): js.UndefOr[HTMLElement] = js.native
  def getPopup(): js.UndefOr[Popup_] = js.native
  def getTooltip(): js.UndefOr[Tooltip_] = js.native
  def isPopupOpen(): Boolean = js.native
  def isTooltipOpen(): Boolean = js.native
  // Extension methods
  def onAdd(map: Map_): this.type = js.native
  def onRemove(map: Map_): this.type = js.native
  def openPopup(): this.type = js.native
  def openPopup(latlng: LatLngExpression): this.type = js.native
  def openTooltip(): this.type = js.native
  def openTooltip(latlng: LatLngExpression): this.type = js.native
  def remove(): this.type = js.native
  def removeFrom(map: Map_): this.type = js.native
  def setPopupContent(content: Content): this.type = js.native
  def setPopupContent(content: Popup_): this.type = js.native
  def setTooltipContent(content: Content): this.type = js.native
  def setTooltipContent(content: Tooltip_): this.type = js.native
  def togglePopup(): this.type = js.native
  def toggleTooltip(): this.type = js.native
  def unbindPopup(): this.type = js.native
  def unbindTooltip(): this.type = js.native
}

