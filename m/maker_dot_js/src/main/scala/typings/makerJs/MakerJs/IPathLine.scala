package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A line path.
  *
  * Examples:
  * ```
  * var line: IPathLine = { type: 'line', origin: [0, 0], end: [1, 1] };   //typescript
  * var line = { type: 'line', origin: [0, 0], end: [1, 1] };   //javascript
  * ```
  */
@js.native
trait IPathLine extends IPath {
  
  /**
    * The end point defining the line. The start point is the origin.
    */
  var end: IPoint = js.native
}
object IPathLine {
  
  @scala.inline
  def apply(end: IPoint, origin: IPoint, `type`: String): IPathLine = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathLine]
  }
  
  @scala.inline
  implicit class IPathLineMutableBuilder[Self <: IPathLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: IPoint): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
  }
}
