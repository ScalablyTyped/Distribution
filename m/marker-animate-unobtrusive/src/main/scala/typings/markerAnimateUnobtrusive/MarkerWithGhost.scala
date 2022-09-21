package typings.markerAnimateUnobtrusive

import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerWithGhost
  extends StObject
     with SlidingMarker {
  
  def getGhostAnimationPosition(): LatLng = js.native
  
  def getGhostPosition(): LatLng = js.native
  
  def setGhostPosition(ghostPosition: LatLng): Unit = js.native
  def setGhostPosition(ghostPosition: LatLngLiteral): Unit = js.native
}
