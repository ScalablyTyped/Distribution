package typings.jsts.global.jsts

import typings.jsts.jsts.geom.Geometry
import typings.jsts.jsts.geom.PrecisionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object precision {
  
  @JSGlobal("jsts.precision.GeometryPrecisionReducer")
  @js.native
  open class GeometryPrecisionReducer protected ()
    extends StObject
       with typings.jsts.jsts.precision.GeometryPrecisionReducer {
    def this(precisionModel: PrecisionModel) = this()
    
    /* CompleteClass */
    override def reduce(geom: Geometry): Geometry = js.native
    
    /**
      * Sets whether the PrecisionModel of the new reduced Geometry will be changed
      * to be the PrecisionModel supplied to specify the precision reduction.
      * The default is to NOT change the precision model
      *
      * @param changePrecisionModel if true the precision model of the created Geometry
      * will be the the precisionModel supplied in the constructor.
      */
    /* CompleteClass */
    override def setChangePrecisionModel(changePrecisionModel: Boolean): Unit = js.native
    
    /**
      * Sets whether the precision reduction will be done in pointwise fashion only.
      * Pointwise precision reduction reduces the precision of the individual coordinates only,
      * but does not attempt to recreate valid topology.
      * This is only relevant for geometries containing polygonal components.
      *
      * @param isPointwise if reduction should be done pointwise only
      */
    /* CompleteClass */
    override def setPointwise(isPointwise: Boolean): Unit = js.native
    
    /**
      * Sets whether the reduction will result in collapsed components being removed completely,
      * or simply being collapsed to an (invalid) Geometry of the same type.
      * The default is to remove collapsed components.
      *
      * @param removeCollapsed if true collapsed components will be removed
      */
    /* CompleteClass */
    override def setRemoveCollapsedComponents(removeCollapsed: Boolean): Unit = js.native
  }
  /* static members */
  object GeometryPrecisionReducer {
    
    @JSGlobal("jsts.precision.GeometryPrecisionReducer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convenience method for doing precision reduction on a single geometry,
      * with collapses removed and keeping the geometry precision model the same,
      * and preserving polygonal topology.
      *
      * @param g the geometry to reduce
      * @param precModel the precision model to use
      *
      * @returns the reduced geometry
      */
    inline def reduce(g: Geometry, precModel: PrecisionModel): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(g.asInstanceOf[js.Any], precModel.asInstanceOf[js.Any])).asInstanceOf[Geometry]
    
    /**
      * Convenience method for doing pointwise precision reduction on a single geometry,
      * with collapses removed and keeping the geometry precision model the same,
      * but NOT preserving valid polygonal topology.
      *
      * @param g the geometry to reduce
      * @param precModel the precision model to use
      *
      * @returns the reduced geometry
      */
    inline def reducePointwise(g: Geometry, precModel: PrecisionModel): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("reducePointwise")(g.asInstanceOf[js.Any], precModel.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  }
}
