package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transcode Settings
  */
trait SchemaTranscodeSetting extends StObject {
  
  /**
    * Whitelist of video formats to be served to this placement. Set this list
    * to null or empty to serve all video formats.
    */
  var enabledVideoFormats: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#transcodeSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaTranscodeSetting {
  
  inline def apply(): SchemaTranscodeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranscodeSetting]
  }
  
  extension [Self <: SchemaTranscodeSetting](x: Self) {
    
    inline def setEnabledVideoFormats(value: js.Array[Double]): Self = StObject.set(x, "enabledVideoFormats", value.asInstanceOf[js.Any])
    
    inline def setEnabledVideoFormatsUndefined: Self = StObject.set(x, "enabledVideoFormats", js.undefined)
    
    inline def setEnabledVideoFormatsVarargs(value: Double*): Self = StObject.set(x, "enabledVideoFormats", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
