package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.Position
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.LineString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawLineString
  extends StObject
     with DrawFeatureBase[js.Array[Position]]
     with _DrawFeature {
  
  def addCoordinate(path: String, lng: Double, lat: Double): Unit = js.native
  def addCoordinate(path: Double, lng: Double, lat: Double): Unit = js.native
  
  def removeCoordinate(path: String): Unit = js.native
  def removeCoordinate(path: Double): Unit = js.native
  
  @JSName("type")
  val type_DrawLineString: LineString = js.native
}
