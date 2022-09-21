package typings.jsts.mod

import typings.jsts.jsts.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simplify {
  
  @JSImport("jsts", "simplify.TopologyPreservingSimplifier")
  @js.native
  open class TopologyPreservingSimplifier protected ()
    extends StObject
       with typings.jsts.jsts.simplify.TopologyPreservingSimplifier {
    def this(inputGeom: Geometry) = this()
    
    /* CompleteClass */
    override def getResultGeometry(): Geometry = js.native
    
    /**
      * Sets the distance tolerance for the simplification.
      * All vertices in the simplified geometry will be within this distance of the original geometry.
      * The tolerance value must be non-negative. A tolerance value of zero is effectively a no-op.
      *
      * @param {double} distanceTolerance the approximation tolerance to use
      */
    /* CompleteClass */
    override def setDistanceTolerance(distanceTolerance: Double): Unit = js.native
  }
  /* static members */
  object TopologyPreservingSimplifier {
    
    @JSImport("jsts", "simplify.TopologyPreservingSimplifier")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {double} distanceTolerance
      */
    inline def simplify(geom: Geometry, distanceTolerance: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("simplify")(geom.asInstanceOf[js.Any], distanceTolerance.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  }
}
