package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait IPathCircle extends IPath {
  
  /**
    * The radius of the circle.
    */
  var radius: Double = js.native
}
object IPathCircle {
  
  @scala.inline
  def apply(origin: IPoint, radius: Double, `type`: String): IPathCircle = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathCircle]
  }
  
  @scala.inline
  implicit class IPathCircleOps[Self <: IPathCircle] (val x: Self) extends AnyVal {
    
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
  }
}
