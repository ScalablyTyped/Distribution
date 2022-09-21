package typings.markerAnimateUnobtrusive

import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngLiteral
import typings.googleMaps.google.maps.Marker
import typings.markerAnimateUnobtrusive.jQuery.easing.IEasingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlidingMarker
  extends StObject
     with Marker {
  
  def getAnimationPosition(): LatLng = js.native
  
  def getDuration(): Double = js.native
  
  def getEasing(): IEasingType = js.native
  
  def setDuration(duration: Double): Unit = js.native
  
  def setEasing(easing: IEasingType): Unit = js.native
  
  def setPositionNotAnimated(position: LatLng): Unit = js.native
  def setPositionNotAnimated(position: LatLngLiteral): Unit = js.native
}
