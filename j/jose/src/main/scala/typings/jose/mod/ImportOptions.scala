package typings.jose.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportOptions extends StObject {
  
  var calculateMissingRSAPrimes: js.UndefOr[Boolean] = js.undefined
}
object ImportOptions {
  
  @scala.inline
  def apply(): ImportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportOptions]
  }
  
  @scala.inline
  implicit class ImportOptionsMutableBuilder[Self <: ImportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculateMissingRSAPrimes(value: Boolean): Self = StObject.set(x, "calculateMissingRSAPrimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculateMissingRSAPrimesUndefined: Self = StObject.set(x, "calculateMissingRSAPrimes", js.undefined)
  }
}
