package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompanionClickThroughOverride extends StObject {
  
  /** Click-through URL of this companion click-through override. */
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  
  /** ID of the creative for this companion click-through override. */
  var creativeId: js.UndefOr[String] = js.undefined
}
object CompanionClickThroughOverride {
  
  @scala.inline
  def apply(): CompanionClickThroughOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanionClickThroughOverride]
  }
  
  @scala.inline
  implicit class CompanionClickThroughOverrideMutableBuilder[Self <: CompanionClickThroughOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickThroughUrl(value: ClickThroughUrl): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
  }
}
