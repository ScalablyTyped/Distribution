package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validate extends StObject {
  
  var validate: js.UndefOr[Boolean] = js.undefined
}
object Validate {
  
  inline def apply(): Validate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Validate]
  }
  
  extension [Self <: Validate](x: Self) {
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
