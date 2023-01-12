package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The element type stored in the index of a PointGraph.
  */
trait IPointGraphIndexElement extends StObject {
  
  /**
    * This point's ordinal position in the kd-tree.
    */
  var kdId: js.UndefOr[Double] = js.undefined
  
  /**
    * Array of other pointId's merged with this one.
    */
  var merged: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The point.
    */
  var point: IPoint
  
  /**
    * The id of this point.
    */
  var pointId: Double
  
  /**
    * Array of valueId's for this point.
    */
  var valueIds: js.Array[Double]
}
object IPointGraphIndexElement {
  
  inline def apply(point: IPoint, pointId: Double, valueIds: js.Array[Double]): IPointGraphIndexElement = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], pointId = pointId.asInstanceOf[js.Any], valueIds = valueIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPointGraphIndexElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPointGraphIndexElement] (val x: Self) extends AnyVal {
    
    inline def setKdId(value: Double): Self = StObject.set(x, "kdId", value.asInstanceOf[js.Any])
    
    inline def setKdIdUndefined: Self = StObject.set(x, "kdId", js.undefined)
    
    inline def setMerged(value: js.Array[Double]): Self = StObject.set(x, "merged", value.asInstanceOf[js.Any])
    
    inline def setMergedUndefined: Self = StObject.set(x, "merged", js.undefined)
    
    inline def setMergedVarargs(value: Double*): Self = StObject.set(x, "merged", js.Array(value*))
    
    inline def setPoint(value: IPoint): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointId(value: Double): Self = StObject.set(x, "pointId", value.asInstanceOf[js.Any])
    
    inline def setValueIds(value: js.Array[Double]): Self = StObject.set(x, "valueIds", value.asInstanceOf[js.Any])
    
    inline def setValueIdsVarargs(value: Double*): Self = StObject.set(x, "valueIds", js.Array(value*))
  }
}
