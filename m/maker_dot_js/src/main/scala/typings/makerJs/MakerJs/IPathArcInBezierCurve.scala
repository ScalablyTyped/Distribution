package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An arc path segment in a bezier curve.
  */
trait IPathArcInBezierCurve
  extends StObject
     with IPathArc {
  
  var bezierData: IBezierRange
}
object IPathArcInBezierCurve {
  
  @scala.inline
  def apply(
    bezierData: IBezierRange,
    endAngle: Double,
    origin: IPoint,
    radius: Double,
    startAngle: Double,
    `type`: String
  ): IPathArcInBezierCurve = {
    val __obj = js.Dynamic.literal(bezierData = bezierData.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathArcInBezierCurve]
  }
  
  @scala.inline
  implicit class IPathArcInBezierCurveMutableBuilder[Self <: IPathArcInBezierCurve] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBezierData(value: IBezierRange): Self = StObject.set(x, "bezierData", value.asInstanceOf[js.Any])
  }
}
