package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogoOptions extends StObject {
  
  var compact: js.UndefOr[Boolean] = js.undefined
}
object LogoOptions {
  
  inline def apply(): LogoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogoOptions]
  }
  
  extension [Self <: LogoOptions](x: Self) {
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
  }
}
