package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "ImagePosition")
@js.native
open class ImagePosition protected () extends StObject {
  def this(paddedRect: Rect, param1: StyleImage) = this()
  
  def br: js.Tuple2[Double, Double] = js.native
  
  var content: js.Tuple4[Double, Double, Double, Double] = js.native
  
  def displaySize: js.Tuple2[Double, Double] = js.native
  
  var paddedRect: Rect = js.native
  
  var pixelRatio: Double = js.native
  
  var stretchX: js.Array[js.Tuple2[Double, Double]] = js.native
  
  var stretchY: js.Array[js.Tuple2[Double, Double]] = js.native
  
  def tl: js.Tuple2[Double, Double] = js.native
  
  def tlbr: js.Array[Double] = js.native
  
  var version: Double = js.native
}
