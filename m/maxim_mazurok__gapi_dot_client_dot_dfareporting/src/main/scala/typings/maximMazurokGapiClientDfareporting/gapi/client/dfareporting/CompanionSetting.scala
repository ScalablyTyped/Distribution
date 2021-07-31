package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompanionSetting extends StObject {
  
  /** Whether companions are disabled for this placement. */
  var companionsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /** Allowlist of companion sizes to be served to this placement. Set this list to null or empty to serve all companion sizes. */
  var enabledSizes: js.UndefOr[js.Array[Size]] = js.undefined
  
  /** Whether to serve only static images as companions. */
  var imageOnly: js.UndefOr[Boolean] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#companionSetting". */
  var kind: js.UndefOr[String] = js.undefined
}
object CompanionSetting {
  
  @scala.inline
  def apply(): CompanionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanionSetting]
  }
  
  @scala.inline
  implicit class CompanionSettingMutableBuilder[Self <: CompanionSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanionsDisabled(value: Boolean): Self = StObject.set(x, "companionsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionsDisabledUndefined: Self = StObject.set(x, "companionsDisabled", js.undefined)
    
    @scala.inline
    def setEnabledSizes(value: js.Array[Size]): Self = StObject.set(x, "enabledSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledSizesUndefined: Self = StObject.set(x, "enabledSizes", js.undefined)
    
    @scala.inline
    def setEnabledSizesVarargs(value: Size*): Self = StObject.set(x, "enabledSizes", js.Array(value :_*))
    
    @scala.inline
    def setImageOnly(value: Boolean): Self = StObject.set(x, "imageOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOnlyUndefined: Self = StObject.set(x, "imageOnly", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
