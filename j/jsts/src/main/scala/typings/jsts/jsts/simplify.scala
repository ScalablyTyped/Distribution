package typings.jsts.jsts

import typings.jsts.jsts.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simplify {
  
  trait TopologyPreservingSimplifier extends StObject {
    
    def getResultGeometry(): Geometry
    
    /**
      * Sets the distance tolerance for the simplification.
      * All vertices in the simplified geometry will be within this distance of the original geometry.
      * The tolerance value must be non-negative. A tolerance value of zero is effectively a no-op.
      *
      * @param {double} distanceTolerance the approximation tolerance to use
      */
    def setDistanceTolerance(distanceTolerance: Double): Unit
  }
  object TopologyPreservingSimplifier {
    
    inline def apply(getResultGeometry: () => Geometry, setDistanceTolerance: Double => Unit): TopologyPreservingSimplifier = {
      val __obj = js.Dynamic.literal(getResultGeometry = js.Any.fromFunction0(getResultGeometry), setDistanceTolerance = js.Any.fromFunction1(setDistanceTolerance))
      __obj.asInstanceOf[TopologyPreservingSimplifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TopologyPreservingSimplifier] (val x: Self) extends AnyVal {
      
      inline def setGetResultGeometry(value: () => Geometry): Self = StObject.set(x, "getResultGeometry", js.Any.fromFunction0(value))
      
      inline def setSetDistanceTolerance(value: Double => Unit): Self = StObject.set(x, "setDistanceTolerance", js.Any.fromFunction1(value))
    }
  }
}
