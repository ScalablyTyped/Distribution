package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageMapType
  extends StObject
     with MVCObject
     with MapType {
  
  @JSName("alt")
  var alt_ImageMapType: String = js.native
  
  def getOpacity(): Double = js.native
  
  @JSName("maxZoom")
  var maxZoom_ImageMapType: Double = js.native
  
  @JSName("minZoom")
  var minZoom_ImageMapType: Double = js.native
  
  @JSName("name")
  var name_ImageMapType: String = js.native
  
  @JSName("projection")
  var projection_ImageMapType: Projection = js.native
  
  @JSName("radius")
  var radius_ImageMapType: Double = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
  
  @JSName("tileSize")
  var tileSize_ImageMapType: Size = js.native
}
