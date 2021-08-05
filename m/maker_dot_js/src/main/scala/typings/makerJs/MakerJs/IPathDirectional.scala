package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A path that may be indicated to "flow" in either direction between its endpoints.
  */
trait IPathDirectional
  extends StObject
     with IPath {
  
  /**
    * The endpoints of the path.
    */
  var endPoints: js.Array[IPoint]
  
  /**
    * Path flows forwards or reverse.
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
}
object IPathDirectional {
  
  inline def apply(endPoints: js.Array[IPoint], origin: IPoint, `type`: String): IPathDirectional = {
    val __obj = js.Dynamic.literal(endPoints = endPoints.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathDirectional]
  }
  
  extension [Self <: IPathDirectional](x: Self) {
    
    inline def setEndPoints(value: js.Array[IPoint]): Self = StObject.set(x, "endPoints", value.asInstanceOf[js.Any])
    
    inline def setEndPointsVarargs(value: IPoint*): Self = StObject.set(x, "endPoints", js.Array(value :_*))
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
