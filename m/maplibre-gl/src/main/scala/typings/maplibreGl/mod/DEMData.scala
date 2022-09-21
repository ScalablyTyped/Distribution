package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.mapbox
import typings.maplibreGl.maplibreGlStrings.terrarium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "DEMData")
@js.native
open class DEMData protected () extends StObject {
  def this(uid: String, data: RGBAImage, encoding: mapbox | terrarium) = this()
  
  def _idx(x: Double, y: Double): Double = js.native
  
  def _unpackMapbox(r: Double, g: Double, b: Double): Double = js.native
  
  def _unpackTerrarium(r: Double, g: Double, b: Double): Double = js.native
  
  def backfillBorder(borderTile: DEMData, dx: Double, dy: Double): scala.Unit = js.native
  
  var data: js.typedarray.Uint32Array = js.native
  
  var dim: Double = js.native
  
  var encoding: mapbox | terrarium = js.native
  
  def get(x: Double, y: Double): Double = js.native
  
  def getPixels(): RGBAImage = js.native
  
  def getUnpackVector(): js.Array[Double] = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var stride: Double = js.native
  
  var uid: String = js.native
}
