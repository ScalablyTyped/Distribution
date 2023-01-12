package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Numcharsperline extends StObject {
  
  var num_chars_per_line: Double
  
  var num_lines: Double
}
object Numcharsperline {
  
  inline def apply(num_chars_per_line: Double, num_lines: Double): Numcharsperline = {
    val __obj = js.Dynamic.literal(num_chars_per_line = num_chars_per_line.asInstanceOf[js.Any], num_lines = num_lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Numcharsperline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Numcharsperline] (val x: Self) extends AnyVal {
    
    inline def setNum_chars_per_line(value: Double): Self = StObject.set(x, "num_chars_per_line", value.asInstanceOf[js.Any])
    
    inline def setNum_lines(value: Double): Self = StObject.set(x, "num_lines", value.asInstanceOf[js.Any])
  }
}
