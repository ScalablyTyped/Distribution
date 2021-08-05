package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rich Media Exit Override.
  */
trait SchemaRichMediaExitOverride extends StObject {
  
  /**
    * Click-through URL of this rich media exit override. Applicable if the
    * enabled field is set to true.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.undefined
  
  /**
    * Whether to use the clickThroughUrl. If false, the creative-level exit
    * will be used.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ID for the override to refer to a specific exit in the creative.
    */
  var exitId: js.UndefOr[String] = js.undefined
}
object SchemaRichMediaExitOverride {
  
  inline def apply(): SchemaRichMediaExitOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRichMediaExitOverride]
  }
  
  extension [Self <: SchemaRichMediaExitOverride](x: Self) {
    
    inline def setClickThroughUrl(value: SchemaClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExitId(value: String): Self = StObject.set(x, "exitId", value.asInstanceOf[js.Any])
    
    inline def setExitIdUndefined: Self = StObject.set(x, "exitId", js.undefined)
  }
}
