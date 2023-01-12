package typings.jssip.libRtcsessionMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoldOptions] (val x: Self) extends AnyVal {
    
    inline def setUseUpdate(value: Boolean): Self = StObject.set(x, "useUpdate", value.asInstanceOf[js.Any])
    
    inline def setUseUpdateUndefined: Self = StObject.set(x, "useUpdate", js.undefined)
  }
}
