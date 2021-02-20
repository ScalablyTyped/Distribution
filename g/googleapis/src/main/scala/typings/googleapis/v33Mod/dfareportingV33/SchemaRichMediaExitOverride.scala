package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rich Media Exit Override.
  */
@js.native
trait SchemaRichMediaExitOverride extends StObject {
  
  /**
    * Click-through URL of this rich media exit override. Applicable if the
    * enabled field is set to true.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.native
  
  /**
    * Whether to use the clickThroughUrl. If false, the creative-level exit
    * will be used.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * ID for the override to refer to a specific exit in the creative.
    */
  var exitId: js.UndefOr[String] = js.native
}
object SchemaRichMediaExitOverride {
  
  @scala.inline
  def apply(): SchemaRichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRichMediaExitOverride]
  }
  
  @scala.inline
  implicit class SchemaRichMediaExitOverrideMutableBuilder[Self <: SchemaRichMediaExitOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickThroughUrl(value: SchemaClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setExitId(value: String): Self = StObject.set(x, "exitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitIdUndefined: Self = StObject.set(x, "exitId", js.undefined)
  }
}
