package typings.luxon.srcDatetimeMod

import typings.luxon.srcDurationMod.ToISOFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToISODateOptions extends StObject {
  
  /**
    * Choose between the basic and extended format
    * @default 'extended'
    */
  var format: js.UndefOr[ToISOFormat] = js.undefined
}
object ToISODateOptions {
  
  inline def apply(): ToISODateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToISODateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToISODateOptions] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: ToISOFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
