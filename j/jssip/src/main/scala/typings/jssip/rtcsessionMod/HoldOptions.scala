package typings.jssip.rtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoldOptions
  extends StObject
     with ExtraHeaders {
  
  var useUpdate: js.UndefOr[Boolean] = js.undefined
}
object HoldOptions {
  
  inline def apply(): HoldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoldOptions]
  }
  
  extension [Self <: HoldOptions](x: Self) {
    
    inline def setUseUpdate(value: Boolean): Self = StObject.set(x, "useUpdate", value.asInstanceOf[js.Any])
    
    inline def setUseUpdateUndefined: Self = StObject.set(x, "useUpdate", js.undefined)
  }
}
