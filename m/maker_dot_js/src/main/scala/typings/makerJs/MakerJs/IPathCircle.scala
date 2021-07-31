package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A circle path.
  *
  * Examples:
  * ```
  * var circle: IPathCircle = { type: 'circle', origin: [0, 0], radius: 7 };   //typescript
  * var circle = { type: 'circle', origin: [0, 0], radius: 7 };   //javascript
  * ```
  */
trait IPathCircle
  extends StObject
     with IPath {
  
  /**
    * The radius of the circle.
    */
  var radius: Double
}
object IPathCircle {
  
  @scala.inline
  def apply(origin: IPoint, radius: Double, `type`: String): IPathCircle = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathCircle]
  }
  
  @scala.inline
  implicit class IPathCircleMutableBuilder[Self <: IPathCircle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
