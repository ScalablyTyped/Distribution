package typings.kakaomaps.kakao.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoWindow extends StObject {
  
  def close(): Unit = js.native
  
  def getAltitude(): Double = js.native
  
  def getContent(): HTMLElement | String = js.native
  
  def getMap(): Map | Null = js.native
  
  def getPosition(): LatLng = js.native
  
  def getRange(): Double = js.native
  
  def getZIndex(): Double = js.native
  
  def open(map_or_roadview: Map): Unit = js.native
  def open(map_or_roadview: Map, marker: Marker): Unit = js.native
  def open(map_or_roadview: Roadview): Unit = js.native
  def open(map_or_roadview: Roadview, marker: Marker): Unit = js.native
  
  def setAltitude(altitude: Double): Unit = js.native
  
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  
  def setPosition(position: LatLng): Unit = js.native
  def setPosition(position: Viewpoint): Unit = js.native
  
  def setRange(range: Double): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
