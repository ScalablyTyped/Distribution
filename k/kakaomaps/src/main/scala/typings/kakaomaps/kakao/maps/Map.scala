package typings.kakaomaps.kakao.maps

import typings.kakaomaps.anon.Anchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map extends StObject {
  
  def addControl(control: MapTypeControl, position: ControlPosition): Unit = js.native
  def addControl(control: ZoomControl, position: ControlPosition): Unit = js.native
  
  def addOverlayMapTypeId(mapTypeId: MapTypeId): Unit = js.native
  
  def getBounds(): LatLngBounds = js.native
  
  def getCenter(): LatLng = js.native
  
  def getDraggable(): Boolean = js.native
  
  def getKeyboardShortcuts(): Boolean = js.native
  
  def getLevel(): Double = js.native
  
  def getMapTypeId(): MapTypeId = js.native
  
  def getProjection(): MapProjection = js.native
  
  def getZoomable(): Boolean = js.native
  
  def panBy(dx: Double, dy: Double): Unit = js.native
  
  def panTo(latlng_or_bounds: LatLng): Unit = js.native
  def panTo(latlng_or_bounds: LatLngBounds): Unit = js.native
  def panTo(latlng_or_bounds: LatLngBounds, padding: Double): Unit = js.native
  def panTo(latlng_or_bounds: LatLng, padding: Double): Unit = js.native
  
  // setProjectionId(projectionId: ProjectionId): void;
  // getProjectionId(): ProjectionId;
  def relayout(): Unit = js.native
  
  def removeControl(control: MapTypeControl): Unit = js.native
  def removeControl(control: ZoomControl): Unit = js.native
  
  def removeOverlayMapTypeId(mapTypeId: MapTypeId): Unit = js.native
  
  def setBounds(bounds: LatLngBounds): Unit = js.native
  def setBounds(bounds: LatLngBounds, paddingTop: Double): Unit = js.native
  def setBounds(bounds: LatLngBounds, paddingTop: Double, paddingRight: Double): Unit = js.native
  def setBounds(bounds: LatLngBounds, paddingTop: Double, paddingRight: Double, paddingBottom: Double): Unit = js.native
  def setBounds(
    bounds: LatLngBounds,
    paddingTop: Double,
    paddingRight: Double,
    paddingBottom: Double,
    paddingLeft: Double
  ): Unit = js.native
  def setBounds(
    bounds: LatLngBounds,
    paddingTop: Double,
    paddingRight: Double,
    paddingBottom: Unit,
    paddingLeft: Double
  ): Unit = js.native
  def setBounds(bounds: LatLngBounds, paddingTop: Double, paddingRight: Unit, paddingBottom: Double): Unit = js.native
  def setBounds(
    bounds: LatLngBounds,
    paddingTop: Double,
    paddingRight: Unit,
    paddingBottom: Double,
    paddingLeft: Double
  ): Unit = js.native
  def setBounds(
    bounds: LatLngBounds,
    paddingTop: Double,
    paddingRight: Unit,
    paddingBottom: Unit,
    paddingLeft: Double
  ): Unit = js.native
  def setBounds(bounds: LatLngBounds, paddingTop: Unit, paddingRight: Double): Unit = js.native
  def setBounds(bounds: LatLngBounds, paddingTop: Unit, paddingRight: Double, paddingBottom: Double): Unit = js.native
  def setBounds(
    bounds: LatLngBounds,
    paddingTop: Unit,
    paddingRight: Double,
    paddingBottom: Double,
    paddingLeft: Double
  ): Unit = js.native
  def setBounds(
    bounds: LatLngBounds,
    paddingTop: Unit,
    paddingRight: Double,
    paddingBottom: Unit,
    paddingLeft: Double
  ): Unit = js.native
  def setBounds(bounds: LatLngBounds, paddingTop: Unit, paddingRight: Unit, paddingBottom: Double): Unit = js.native
  def setBounds(
    bounds: LatLngBounds,
    paddingTop: Unit,
    paddingRight: Unit,
    paddingBottom: Double,
    paddingLeft: Double
  ): Unit = js.native
  def setBounds(
    bounds: LatLngBounds,
    paddingTop: Unit,
    paddingRight: Unit,
    paddingBottom: Unit,
    paddingLeft: Double
  ): Unit = js.native
  
  def setCenter(latlng: LatLng): Unit = js.native
  
  def setCopyrightPosition(copyrightPosition: CopyrightPosition): Unit = js.native
  def setCopyrightPosition(copyrightPosition: CopyrightPosition, reversed: Boolean): Unit = js.native
  
  def setCursor(style: String): Unit = js.native
  
  def setDraggable(draggable: Boolean): Unit = js.native
  
  def setKeyboardShortcuts(active: Boolean): Unit = js.native
  
  def setLevel(level: Double): Unit = js.native
  def setLevel(level: Double, options: Anchor): Unit = js.native
  
  def setMapTypeId(mapTypeId: MapTypeId): Unit = js.native
  
  def setMaxLevel(maxLevel: Double): Unit = js.native
  
  def setMinLevel(minLevel: Double): Unit = js.native
  
  def setZoomable(zoomable: Boolean): Unit = js.native
}
