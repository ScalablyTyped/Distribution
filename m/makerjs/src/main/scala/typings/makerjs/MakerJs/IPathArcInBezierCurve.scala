package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An arc path segment in a bezier curve.
  */
trait IPathArcInBezierCurve
  extends StObject
     with IPath {
  
  var bezierData: IBezierRange
}
object IPathArcInBezierCurve {
  
  inline def apply(bezierData: IBezierRange, origin: IPoint, `type`: String): IPathArcInBezierCurve = {
    val __obj = js.Dynamic.literal(bezierData = bezierData.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathArcInBezierCurve]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPathArcInBezierCurve] (val x: Self) extends AnyVal {
    
    inline def setBezierData(value: IBezierRange): Self = StObject.set(x, "bezierData", value.asInstanceOf[js.Any])
  }
}
