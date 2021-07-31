package typings.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A measurement of extents, with a center point.
  */
trait IMeasureWithCenter
  extends StObject
     with IMeasure {
  
  /**
    * The center point of the rectangle containing the item being measured.
    */
  var center: IPoint
}
object IMeasureWithCenter {
  
  @scala.inline
  def apply(center: IPoint, high: IPoint, low: IPoint): IMeasureWithCenter = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeasureWithCenter]
  }
  
  @scala.inline
  implicit class IMeasureWithCenterMutableBuilder[Self <: IMeasureWithCenter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: IPoint): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
  }
}
