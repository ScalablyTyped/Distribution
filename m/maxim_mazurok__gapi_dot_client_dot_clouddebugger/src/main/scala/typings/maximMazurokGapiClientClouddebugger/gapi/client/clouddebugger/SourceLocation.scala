package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceLocation extends StObject {
  
  /** Column within a line. The first column in a line as the value `1`. Agents that do not support setting breakpoints on specific columns ignore this field. */
  var column: js.UndefOr[Double] = js.undefined
  
  /** Line inside the file. The first line in the file has the value `1`. */
  var line: js.UndefOr[Double] = js.undefined
  
  /** Path to the source file within the source context of the target binary. */
  var path: js.UndefOr[String] = js.undefined
}
object SourceLocation {
  
  inline def apply(): SourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceLocation] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
