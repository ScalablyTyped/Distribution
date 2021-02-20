package typings.jqueryDrawer

import typings.iscroll.IScrollOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryDrawerOptions extends StObject {
  
  var `class`: js.UndefOr[JQueryDrawerClassOptions] = js.native
  
  var iscroll: js.UndefOr[IScrollOptions] = js.native
  
  var showOverlay: js.UndefOr[Boolean] = js.native
}
object JQueryDrawerOptions {
  
  @scala.inline
  def apply(): JQueryDrawerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryDrawerOptions]
  }
  
  @scala.inline
  implicit class JQueryDrawerOptionsMutableBuilder[Self <: JQueryDrawerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: JQueryDrawerClassOptions): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setIscroll(value: IScrollOptions): Self = StObject.set(x, "iscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIscrollUndefined: Self = StObject.set(x, "iscroll", js.undefined)
    
    @scala.inline
    def setShowOverlay(value: Boolean): Self = StObject.set(x, "showOverlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
  }
}
