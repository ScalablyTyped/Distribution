package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveOptions extends StObject {
  
  var around: js.UndefOr[center] = js.undefined
}
object InteractiveOptions {
  
  inline def apply(): InteractiveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveOptions]
  }
  
  extension [Self <: InteractiveOptions](x: Self) {
    
    inline def setAround(value: center): Self = StObject.set(x, "around", value.asInstanceOf[js.Any])
    
    inline def setAroundUndefined: Self = StObject.set(x, "around", js.undefined)
  }
}
