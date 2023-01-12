package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidthString extends StObject {
  
  var width: String
}
object WidthString {
  
  inline def apply(width: String): WidthString = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidthString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WidthString] (val x: Self) extends AnyVal {
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
