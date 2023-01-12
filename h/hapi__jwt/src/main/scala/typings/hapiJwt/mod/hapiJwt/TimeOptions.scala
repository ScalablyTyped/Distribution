package typings.hapiJwt.mod.hapiJwt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeOptions extends StObject {
  
  /**
    * Integer that represents the "Expiration Time" NumericDate of the token.
    */
  var exp: js.UndefOr[Double] = js.undefined
  
  /**
    * Integer to determine the maximum age of the token in seconds. This is time validation using the "Issued At" NumericDate (iat).
    */
  var maxAgeSec: js.UndefOr[Double] = js.undefined
  
  /**
    * Integer that represents the current time in JavaScript epoch format (with msecs). When evaluated the msecs are truncated, not rounded. Either this or nowSec need to be defined.
    */
  var now: js.UndefOr[Double] = js.undefined
  
  /**
    * Integer to adjust exp and maxAgeSec to account for server time drift in seconds.
    */
  var timeSkewSec: js.UndefOr[Double] = js.undefined
}
object TimeOptions {
  
  inline def apply(): TimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeOptions] (val x: Self) extends AnyVal {
    
    inline def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    inline def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    inline def setMaxAgeSec(value: Double): Self = StObject.set(x, "maxAgeSec", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeSecUndefined: Self = StObject.set(x, "maxAgeSec", js.undefined)
    
    inline def setNow(value: Double): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
    
    inline def setTimeSkewSec(value: Double): Self = StObject.set(x, "timeSkewSec", value.asInstanceOf[js.Any])
    
    inline def setTimeSkewSecUndefined: Self = StObject.set(x, "timeSkewSec", js.undefined)
  }
}
