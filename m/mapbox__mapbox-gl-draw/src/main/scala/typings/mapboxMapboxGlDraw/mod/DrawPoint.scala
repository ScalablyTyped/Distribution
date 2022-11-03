package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.Position
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawPoint
  extends StObject
     with DrawFeatureBase[Position]
     with _DrawFeature {
  
  def getCoordinate(): Position = js.native
  
  @JSName("type")
  val type_DrawPoint: Point = js.native
  
  def updateCoordinate(lng: Double, lat: Double): Unit = js.native
}
