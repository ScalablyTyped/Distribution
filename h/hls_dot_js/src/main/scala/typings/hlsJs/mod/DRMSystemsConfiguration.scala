package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<hls.js.hls.js.KeySystems, hls.js.hls.js.DRMSystemConfiguration>> */
trait DRMSystemsConfiguration extends StObject {
  
  @JSName("com.apple.fps")
  var comDotappleDotfps: js.UndefOr[DRMSystemConfiguration] = js.undefined
  
  @JSName("com.microsoft.playready")
  var comDotmicrosoftDotplayready: js.UndefOr[DRMSystemConfiguration] = js.undefined
  
  @JSName("com.widevine.alpha")
  var comDotwidevineDotalpha: js.UndefOr[DRMSystemConfiguration] = js.undefined
  
  @JSName("org.w3.clearkey")
  var orgDotw3Dotclearkey: js.UndefOr[DRMSystemConfiguration] = js.undefined
}
object DRMSystemsConfiguration {
  
  inline def apply(): DRMSystemsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DRMSystemsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DRMSystemsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setComDotappleDotfps(value: DRMSystemConfiguration): Self = StObject.set(x, "com.apple.fps", value.asInstanceOf[js.Any])
    
    inline def setComDotappleDotfpsUndefined: Self = StObject.set(x, "com.apple.fps", js.undefined)
    
    inline def setComDotmicrosoftDotplayready(value: DRMSystemConfiguration): Self = StObject.set(x, "com.microsoft.playready", value.asInstanceOf[js.Any])
    
    inline def setComDotmicrosoftDotplayreadyUndefined: Self = StObject.set(x, "com.microsoft.playready", js.undefined)
    
    inline def setComDotwidevineDotalpha(value: DRMSystemConfiguration): Self = StObject.set(x, "com.widevine.alpha", value.asInstanceOf[js.Any])
    
    inline def setComDotwidevineDotalphaUndefined: Self = StObject.set(x, "com.widevine.alpha", js.undefined)
    
    inline def setOrgDotw3Dotclearkey(value: DRMSystemConfiguration): Self = StObject.set(x, "org.w3.clearkey", value.asInstanceOf[js.Any])
    
    inline def setOrgDotw3DotclearkeyUndefined: Self = StObject.set(x, "org.w3.clearkey", js.undefined)
  }
}
