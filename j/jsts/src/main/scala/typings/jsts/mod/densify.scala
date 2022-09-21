package typings.jsts.mod

import typings.jsts.jsts.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object densify {
  
  @JSImport("jsts", "densify.Densifier")
  @js.native
  open class Densifier protected ()
    extends StObject
       with typings.jsts.jsts.densify.Densifier {
    /**
      * Creates a new densifier instance.
      */
    def this(inputGeom: Geometry) = this()
    
    /**
      * Gets the densified geometry.
      */
    /* CompleteClass */
    override def getResultGeometry(): Geometry = js.native
    
    /**
      * Sets the distance tolerance for the densification.
      * All line segments in the densified geometry will be no longer than
      * the distance tolerance. simplified geometry will be within this distance
      * of the original geometry. The distance tolerance must be positive.
      *
      * @param {double} distanceTolerance the densification tolerance to use
      */
    /* CompleteClass */
    override def setDistanceTolerance(distanceTolerance: Double): Unit = js.native
  }
  /* static members */
  object Densifier {
    
    @JSImport("jsts", "densify.Densifier")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Densifies a geometry using a given distance tolerance,
      * and respecting the input geometry's PrecisionModel.
      *
      * @param geom the geometry to densify
      * @param {double} distanceTolerance the distance tolerance to densify
      *
      * @returns the densified geometry
      */
    inline def densify(geom: Geometry, distanceTolerance: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("densify")(geom.asInstanceOf[js.Any], distanceTolerance.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  }
}
