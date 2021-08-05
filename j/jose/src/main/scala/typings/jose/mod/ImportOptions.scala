package typings.jose.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportOptions extends StObject {
  
  var calculateMissingRSAPrimes: js.UndefOr[Boolean] = js.undefined
}
object ImportOptions {
  
  inline def apply(): ImportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportOptions]
  }
  
  extension [Self <: ImportOptions](x: Self) {
    
    inline def setCalculateMissingRSAPrimes(value: Boolean): Self = StObject.set(x, "calculateMissingRSAPrimes", value.asInstanceOf[js.Any])
    
    inline def setCalculateMissingRSAPrimesUndefined: Self = StObject.set(x, "calculateMissingRSAPrimes", js.undefined)
  }
}
