package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "FeaturePositionMap")
@js.native
open class FeaturePositionMap () extends StObject {
  
  def add(id: Any, index: Double, start: Double, end: Double): scala.Unit = js.native
  
  def getPositions(id: Any): js.Array[FeaturePosition] = js.native
  
  var ids: js.Array[Double] = js.native
  
  var indexed: Boolean = js.native
  
  var positions: js.Array[Double] = js.native
}
/* static members */
object FeaturePositionMap {
  
  @JSImport("maplibre-gl", "FeaturePositionMap")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserialize(obj: SerializedFeaturePositionMap): FeaturePositionMap = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(obj.asInstanceOf[js.Any]).asInstanceOf[FeaturePositionMap]
  
  inline def serialize(map: FeaturePositionMap, transferables: js.Array[js.typedarray.ArrayBuffer]): SerializedFeaturePositionMap = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(map.asInstanceOf[js.Any], transferables.asInstanceOf[js.Any])).asInstanceOf[SerializedFeaturePositionMap]
}
