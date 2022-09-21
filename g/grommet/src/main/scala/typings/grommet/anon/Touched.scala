package typings.grommet.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Touched extends StObject {
  
  var touched: js.UndefOr[Record[String, Boolean]] = js.undefined
}
object Touched {
  
  inline def apply(): Touched = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Touched]
  }
  
  extension [Self <: Touched](x: Self) {
    
    inline def setTouched(value: Record[String, Boolean]): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    inline def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
  }
}
