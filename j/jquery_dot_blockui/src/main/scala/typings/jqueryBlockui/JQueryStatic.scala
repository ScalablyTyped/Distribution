package typings.jqueryBlockui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  /** block user activity for the page */
  var blockUI: js.UndefOr[JQBlockUIStatic] = js.native
  
  /** unblock the page */
  var unblockUI: js.UndefOr[JQBlockUIStatic] = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockUI(value: JQBlockUIStatic): Self = StObject.set(x, "blockUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockUIUndefined: Self = StObject.set(x, "blockUI", js.undefined)
    
    @scala.inline
    def setUnblockUI(value: JQBlockUIStatic): Self = StObject.set(x, "unblockUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnblockUIUndefined: Self = StObject.set(x, "unblockUI", js.undefined)
  }
}
