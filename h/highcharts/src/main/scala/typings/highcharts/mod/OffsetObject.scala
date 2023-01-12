package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OffsetObject extends StObject {
  
  /**
    * Left distance to the page border.
    */
  var left: Double
  
  /**
    * Top distance to the page border.
    */
  var top: Double
}
object OffsetObject {
  
  inline def apply(left: Double, top: Double): OffsetObject = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffsetObject] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
