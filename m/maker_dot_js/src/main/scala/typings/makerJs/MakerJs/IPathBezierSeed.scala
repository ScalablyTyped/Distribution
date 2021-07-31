package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bezier seed defines the endpoints and control points of a bezier curve.
  */
trait IPathBezierSeed
  extends StObject
     with IPathLine {
  
  /**
    * The bezier control points. One point for quadratic, 2 points for cubic.
    */
  var controls: js.Array[IPoint]
  
  /**
    * T values of the parent if this is a child that represents a split.
    */
  var parentRange: js.UndefOr[IBezierRange] = js.undefined
}
object IPathBezierSeed {
  
  @scala.inline
  def apply(controls: js.Array[IPoint], end: IPoint, origin: IPoint, `type`: String): IPathBezierSeed = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathBezierSeed]
  }
  
  @scala.inline
  implicit class IPathBezierSeedMutableBuilder[Self <: IPathBezierSeed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControls(value: js.Array[IPoint]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsVarargs(value: IPoint*): Self = StObject.set(x, "controls", js.Array(value :_*))
    
    @scala.inline
    def setParentRange(value: IBezierRange): Self = StObject.set(x, "parentRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRangeUndefined: Self = StObject.set(x, "parentRange", js.undefined)
  }
}
