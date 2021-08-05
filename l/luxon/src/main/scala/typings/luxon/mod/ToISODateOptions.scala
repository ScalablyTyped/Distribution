package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToISODateOptions extends StObject {
  
  /**
    * choose between the basic and extended format
    * @default 'extended'
    */
  var format: js.UndefOr[ToISOFormat] = js.undefined
}
object ToISODateOptions {
  
  inline def apply(): ToISODateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToISODateOptions]
  }
  
  extension [Self <: ToISODateOptions](x: Self) {
    
    inline def setFormat(value: ToISOFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
