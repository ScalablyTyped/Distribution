package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Override extends StObject {
  
  var `override`: js.UndefOr[Boolean] = js.undefined
}
object Override {
  
  inline def apply(): Override = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Override]
  }
  
  extension [Self <: Override](x: Self) {
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
  }
}
