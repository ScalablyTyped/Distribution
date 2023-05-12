package typings.hlsParser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<hls-parser.hls-parser.Options> */
trait PartialOptions extends StObject {
  
  var allowClosedCaptionsNone: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var strictMode: js.UndefOr[Boolean] = js.undefined
}
object PartialOptions {
  
  inline def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowClosedCaptionsNone(value: Boolean): Self = StObject.set(x, "allowClosedCaptionsNone", value.asInstanceOf[js.Any])
    
    inline def setAllowClosedCaptionsNoneUndefined: Self = StObject.set(x, "allowClosedCaptionsNone", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    
    inline def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
  }
}
