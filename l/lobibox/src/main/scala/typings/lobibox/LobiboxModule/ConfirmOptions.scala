package typings.lobibox.LobiboxModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmOptions
  extends StObject
     with MessageBoxesOptions {
  
  var iconClass: js.UndefOr[String] = js.undefined
}
object ConfirmOptions {
  
  @scala.inline
  def apply(): ConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmOptions]
  }
  
  @scala.inline
  implicit class ConfirmOptionsMutableBuilder[Self <: ConfirmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
  }
}
