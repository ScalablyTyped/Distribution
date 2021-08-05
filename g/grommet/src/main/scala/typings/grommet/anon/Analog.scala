package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analog extends StObject {
  
  var analog: js.UndefOr[Hour] = js.undefined
  
  var digital: js.UndefOr[Text] = js.undefined
}
object Analog {
  
  inline def apply(): Analog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analog]
  }
  
  extension [Self <: Analog](x: Self) {
    
    inline def setAnalog(value: Hour): Self = StObject.set(x, "analog", value.asInstanceOf[js.Any])
    
    inline def setAnalogUndefined: Self = StObject.set(x, "analog", js.undefined)
    
    inline def setDigital(value: Text): Self = StObject.set(x, "digital", value.asInstanceOf[js.Any])
    
    inline def setDigitalUndefined: Self = StObject.set(x, "digital", js.undefined)
  }
}
