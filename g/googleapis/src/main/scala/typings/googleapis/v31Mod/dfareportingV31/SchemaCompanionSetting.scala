package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Companion Settings
  */
@js.native
trait SchemaCompanionSetting extends StObject {
  
  /**
    * Whether companions are disabled for this placement.
    */
  var companionsDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whitelist of companion sizes to be served to this placement. Set this
    * list to null or empty to serve all companion sizes.
    */
  var enabledSizes: js.UndefOr[js.Array[SchemaSize]] = js.native
  
  /**
    * Whether to serve only static images as companions.
    */
  var imageOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#companionSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaCompanionSetting {
  
  @scala.inline
  def apply(): SchemaCompanionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompanionSetting]
  }
  
  @scala.inline
  implicit class SchemaCompanionSettingMutableBuilder[Self <: SchemaCompanionSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanionsDisabled(value: Boolean): Self = StObject.set(x, "companionsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionsDisabledUndefined: Self = StObject.set(x, "companionsDisabled", js.undefined)
    
    @scala.inline
    def setEnabledSizes(value: js.Array[SchemaSize]): Self = StObject.set(x, "enabledSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledSizesUndefined: Self = StObject.set(x, "enabledSizes", js.undefined)
    
    @scala.inline
    def setEnabledSizesVarargs(value: SchemaSize*): Self = StObject.set(x, "enabledSizes", js.Array(value :_*))
    
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
