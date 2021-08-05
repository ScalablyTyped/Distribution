package typings.lodash.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TruncateOptions extends StObject {
  
  /**
    * @see _.length
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * @see _.omission
    */
  var omission: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * @see _.separator
    */
  var separator: js.UndefOr[java.lang.String | RegExp] = js.undefined
}
object TruncateOptions {
  
  inline def apply(): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateOptions]
  }
  
  extension [Self <: TruncateOptions](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOmission(value: java.lang.String): Self = StObject.set(x, "omission", value.asInstanceOf[js.Any])
    
    inline def setOmissionUndefined: Self = StObject.set(x, "omission", js.undefined)
    
    inline def setSeparator(value: java.lang.String | RegExp): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
