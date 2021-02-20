package typings.mapboxGl.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mapbox-gl", "Marker")
@js.native
class Marker () extends Evented {
  def this(element: HTMLElement) = this()
  def this(options: MarkerOptions) = this()
  def this(element: js.UndefOr[scala.Nothing], options: MarkerOptions) = this()
  def this(element: HTMLElement, options: MarkerOptions) = this()
  
  def addTo(map: Map): this.type = js.native
  
  def getElement(): HTMLElement = js.native
  
  def getLngLat(): LngLat = js.native
  
  def getOffset(): PointLike = js.native
  
  def getPitchAlignment(): Alignment = js.native
  
  def getPopup(): Popup = js.native
  
  def getRotationAlignment(): Alignment = js.native
  
  def isDraggable(): Boolean = js.native
  
  def remove(): this.type = js.native
  
  def setDraggable(shouldBeDraggable: Boolean): this.type = js.native
  
  def setLngLat(lngLat: LngLatLike): this.type = js.native
  
  def setOffset(offset: PointLike): this.type = js.native
  
  def setPitchAlignment(alignment: Alignment): this.type = js.native
  
  def setPopup(): this.type = js.native
  def setPopup(popup: Popup): this.type = js.native
  
  def setRotationAlignment(alignment: Alignment): this.type = js.native
  
  def togglePopup(): this.type = js.native
}
