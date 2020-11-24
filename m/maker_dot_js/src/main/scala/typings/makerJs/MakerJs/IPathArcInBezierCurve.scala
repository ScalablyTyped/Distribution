package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An arc path segment in a bezier curve.
  */
@js.native
trait IPathArcInBezierCurve extends IPathArc {
  
  var bezierData: IBezierRange = js.native
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
  implicit class IPathArcInBezierCurveOps[Self <: IPathArcInBezierCurve] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBezierData(value: IBezierRange): Self = this.set("bezierData", value.asInstanceOf[js.Any])
  }
}
