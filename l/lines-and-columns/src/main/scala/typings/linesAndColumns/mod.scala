package typings.linesAndColumns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lines-and-columns", "LinesAndColumns")
  @js.native
  open class LinesAndColumns protected () extends StObject {
    def this(string: String) = this()
    
    def indexForLocation(location: SourceLocation): Double | Null = js.native
    
    /* private */ val length: Any = js.native
    
    /* private */ var lengthOfLine: Any = js.native
    
    def locationForIndex(index: Double): SourceLocation | Null = js.native
    
    /* private */ val offsets: Any = js.native
  }
  
  trait SourceLocation extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object SourceLocation {
    
    inline def apply(column: Double, line: Double): SourceLocation = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceLocation] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
}
