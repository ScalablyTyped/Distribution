package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A link in a chain, with direction of flow.
  */
trait IChainLink extends StObject {
  
  /**
    * The endpoints of the path, in absolute coords.
    */
  var endPoints: js.Array[IPoint]
  
  /**
    * Length of the path.
    */
  var pathLength: Double
  
  /**
    * Path flows forwards or reverse.
    */
  var reversed: Boolean
  
  /**
    * Reference to the path.
    */
  var walkedPath: IWalkPath
}
object IChainLink {
  
  inline def apply(endPoints: js.Array[IPoint], pathLength: Double, reversed: Boolean, walkedPath: IWalkPath): IChainLink = {
    val __obj = js.Dynamic.literal(endPoints = endPoints.asInstanceOf[js.Any], pathLength = pathLength.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], walkedPath = walkedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChainLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IChainLink] (val x: Self) extends AnyVal {
    
    inline def setEndPoints(value: js.Array[IPoint]): Self = StObject.set(x, "endPoints", value.asInstanceOf[js.Any])
    
    inline def setEndPointsVarargs(value: IPoint*): Self = StObject.set(x, "endPoints", js.Array(value*))
    
    inline def setPathLength(value: Double): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setWalkedPath(value: IWalkPath): Self = StObject.set(x, "walkedPath", value.asInstanceOf[js.Any])
  }
}
