package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Companion Click-through override.
  */
@js.native
trait SchemaCompanionClickThroughOverride extends StObject {
  
  /**
    * Click-through URL of this companion click-through override.
    */
  var clickThroughUrl: js.UndefOr[SchemaClickThroughUrl] = js.native
  
  /**
    * ID of the creative for this companion click-through override.
    */
  var creativeId: js.UndefOr[String] = js.native
}
object SchemaCompanionClickThroughOverride {
  
  @scala.inline
  def apply(): SchemaCompanionClickThroughOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompanionClickThroughOverride]
  }
  
  @scala.inline
  implicit class SchemaCompanionClickThroughOverrideMutableBuilder[Self <: SchemaCompanionClickThroughOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickThroughUrl(value: SchemaClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
  }
}
