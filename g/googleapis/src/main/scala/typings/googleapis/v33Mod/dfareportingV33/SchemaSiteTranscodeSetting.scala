package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transcode Settings
  */
trait SchemaSiteTranscodeSetting extends StObject {
  
  /**
    * Whitelist of video formats to be served to this site template. Set this
    * list to null or empty to serve all video formats.
    */
  var enabledVideoFormats: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteTranscodeSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaSiteTranscodeSetting {
  
  @scala.inline
  def apply(): SchemaSiteTranscodeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteTranscodeSetting]
  }
  
  @scala.inline
  implicit class SchemaSiteTranscodeSettingMutableBuilder[Self <: SchemaSiteTranscodeSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabledVideoFormats(value: js.Array[Double]): Self = StObject.set(x, "enabledVideoFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledVideoFormatsUndefined: Self = StObject.set(x, "enabledVideoFormats", js.undefined)
    
    @scala.inline
    def setEnabledVideoFormatsVarargs(value: Double*): Self = StObject.set(x, "enabledVideoFormats", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
