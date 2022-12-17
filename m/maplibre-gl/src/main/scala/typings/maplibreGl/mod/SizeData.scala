package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.anon.LayoutSize
  - typings.maplibreGl.anon.`0`
  - typings.maplibreGl.anon.InterpolationType
  - typings.maplibreGl.anon.MaxZoom_
*/
trait SizeData extends StObject
object SizeData {
  
  inline def `0`(): typings.maplibreGl.anon.`0` = {
    val __obj = js.Dynamic.literal(kind = "source")
    __obj.asInstanceOf[typings.maplibreGl.anon.`0`]
  }
  
  inline def InterpolationType(
    interpolationType: typings.maplibreGl.mod.InterpolationType,
    maxSize: Double,
    maxZoom: Double,
    minSize: Double,
    minZoom: Double
  ): typings.maplibreGl.anon.InterpolationType = {
    val __obj = js.Dynamic.literal(interpolationType = interpolationType.asInstanceOf[js.Any], kind = "camera", maxSize = maxSize.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.maplibreGl.anon.InterpolationType]
  }
  
  inline def LayoutSize(layoutSize: Double): typings.maplibreGl.anon.LayoutSize = {
    val __obj = js.Dynamic.literal(kind = "constant", layoutSize = layoutSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.maplibreGl.anon.LayoutSize]
  }
  
  inline def MaxZoom_(interpolationType: InterpolationType, maxZoom: Double, minZoom: Double): typings.maplibreGl.anon.MaxZoom_ = {
    val __obj = js.Dynamic.literal(interpolationType = interpolationType.asInstanceOf[js.Any], kind = "composite", maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.maplibreGl.anon.MaxZoom_]
  }
}
