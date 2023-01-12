package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface used to specify coordinates.
  */
trait JQueryCoordinates extends StObject {
  
  var left: Double
  
  var top: Double
}
object JQueryCoordinates {
  
  inline def apply(left: Double, top: Double): JQueryCoordinates = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryCoordinates] (val x: Self) extends AnyVal {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
