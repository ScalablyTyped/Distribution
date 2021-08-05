package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PolyUtil {
  
  @JSImport("leaflet", "PolyUtil")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clipPolygon(points: js.Array[Point_], bounds: BoundsExpression): js.Array[Point_] = (^.asInstanceOf[js.Dynamic].applyDynamic("clipPolygon")(points.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[Point_]]
  inline def clipPolygon(points: js.Array[Point_], bounds: BoundsExpression, round: Boolean): js.Array[Point_] = (^.asInstanceOf[js.Dynamic].applyDynamic("clipPolygon")(points.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], round.asInstanceOf[js.Any])).asInstanceOf[js.Array[Point_]]
}
