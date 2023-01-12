package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An intersection of two paths.
  */
trait IPathIntersection extends StObject {
  
  /**
    * Array of points where the two paths intersected. The length of the array may be either 1 or 2 points.
    */
  var intersectionPoints: js.Array[IPoint]
  
  /**
    * This Array property will only be defined if the first parameter passed to pathIntersection is either an Arc or a Circle.
    * It contains the angles of intersection relative to the first path parameter.
    * The length of the array may be either 1 or 2.
    */
  var path1Angles: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * This Array property will only be defined if the second parameter passed to pathIntersection is either an Arc or a Circle.
    * It contains the angles of intersection relative to the second path parameter.
    * The length of the array may be either 1 or 2.
    */
  var path2Angles: js.UndefOr[js.Array[Double]] = js.undefined
}
object IPathIntersection {
  
  inline def apply(intersectionPoints: js.Array[IPoint]): IPathIntersection = {
    val __obj = js.Dynamic.literal(intersectionPoints = intersectionPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathIntersection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPathIntersection] (val x: Self) extends AnyVal {
    
    inline def setIntersectionPoints(value: js.Array[IPoint]): Self = StObject.set(x, "intersectionPoints", value.asInstanceOf[js.Any])
    
    inline def setIntersectionPointsVarargs(value: IPoint*): Self = StObject.set(x, "intersectionPoints", js.Array(value*))
    
    inline def setPath1Angles(value: js.Array[Double]): Self = StObject.set(x, "path1Angles", value.asInstanceOf[js.Any])
    
    inline def setPath1AnglesUndefined: Self = StObject.set(x, "path1Angles", js.undefined)
    
    inline def setPath1AnglesVarargs(value: Double*): Self = StObject.set(x, "path1Angles", js.Array(value*))
    
    inline def setPath2Angles(value: js.Array[Double]): Self = StObject.set(x, "path2Angles", value.asInstanceOf[js.Any])
    
    inline def setPath2AnglesUndefined: Self = StObject.set(x, "path2Angles", js.undefined)
    
    inline def setPath2AnglesVarargs(value: Double*): Self = StObject.set(x, "path2Angles", js.Array(value*))
  }
}
