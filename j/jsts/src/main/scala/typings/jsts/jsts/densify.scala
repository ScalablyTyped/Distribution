package typings.jsts.jsts

import typings.jsts.jsts.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object densify {
  
  trait Densifier extends StObject {
    
    /**
      * Gets the densified geometry.
      */
    def getResultGeometry(): Geometry
    
    /**
      * Sets the distance tolerance for the densification.
      * All line segments in the densified geometry will be no longer than
      * the distance tolerance. simplified geometry will be within this distance
      * of the original geometry. The distance tolerance must be positive.
      *
      * @param {double} distanceTolerance the densification tolerance to use
      */
    def setDistanceTolerance(distanceTolerance: Double): Unit
  }
  object Densifier {
    
    inline def apply(getResultGeometry: () => Geometry, setDistanceTolerance: Double => Unit): Densifier = {
      val __obj = js.Dynamic.literal(getResultGeometry = js.Any.fromFunction0(getResultGeometry), setDistanceTolerance = js.Any.fromFunction1(setDistanceTolerance))
      __obj.asInstanceOf[Densifier]
    }
    
    extension [Self <: Densifier](x: Self) {
      
      inline def setGetResultGeometry(value: () => Geometry): Self = StObject.set(x, "getResultGeometry", js.Any.fromFunction0(value))
      
      inline def setSetDistanceTolerance(value: Double => Unit): Self = StObject.set(x, "setDistanceTolerance", js.Any.fromFunction1(value))
    }
  }
}
