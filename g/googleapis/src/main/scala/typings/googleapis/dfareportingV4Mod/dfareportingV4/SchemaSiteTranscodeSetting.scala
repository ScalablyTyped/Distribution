package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSiteTranscodeSetting extends StObject {
  
  /**
    * Allowlist of video formats to be served to this site template. Set this list to null or empty to serve all video formats.
    */
  var enabledVideoFormats: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#siteTranscodeSetting".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaSiteTranscodeSetting {
  
  inline def apply(): SchemaSiteTranscodeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteTranscodeSetting]
  }
  
  extension [Self <: SchemaSiteTranscodeSetting](x: Self) {
    
    inline def setEnabledVideoFormats(value: js.Array[Double]): Self = StObject.set(x, "enabledVideoFormats", value.asInstanceOf[js.Any])
    
    inline def setEnabledVideoFormatsNull: Self = StObject.set(x, "enabledVideoFormats", null)
    
    inline def setEnabledVideoFormatsUndefined: Self = StObject.set(x, "enabledVideoFormats", js.undefined)
    
    inline def setEnabledVideoFormatsVarargs(value: Double*): Self = StObject.set(x, "enabledVideoFormats", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
