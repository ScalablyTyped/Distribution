package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait IPathLine
  extends StObject
     with IPath {
  
  /**
    * The end point defining the line. The start point is the origin.
    */
  var end: IPoint
}
object IPathLine {
  
  inline def apply(end: IPoint, origin: IPoint, `type`: String): IPathLine = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPathLine] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: IPoint): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
  }
}
