package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsiveModeChangedEventUIParam extends StObject {
  
  /**
    * Gets the newly assumed mode.
    */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * Gets the reference to the igGridResponsive widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the previously assumed mode.
    */
  var previousMode: js.UndefOr[String] = js.native
}
object ResponsiveModeChangedEventUIParam {
  
  @scala.inline
  def apply(): ResponsiveModeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveModeChangedEventUIParam]
  }
  
  @scala.inline
  implicit class ResponsiveModeChangedEventUIParamMutableBuilder[Self <: ResponsiveModeChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPreviousMode(value: String): Self = StObject.set(x, "previousMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousModeUndefined: Self = StObject.set(x, "previousMode", js.undefined)
  }
}
