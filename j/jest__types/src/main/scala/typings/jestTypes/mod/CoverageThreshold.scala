package typings.jestTypes.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageThreshold
  extends StObject
     with /* path */ StringDictionary[CoverageThresholdValue] {
  
  var global: CoverageThresholdValue
}
object CoverageThreshold {
  
  inline def apply(global: CoverageThresholdValue): CoverageThreshold = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageThreshold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageThreshold] (val x: Self) extends AnyVal {
    
    inline def setGlobal(value: CoverageThresholdValue): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
  }
}
