package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonCancelClickEventUIParam extends StObject {
  
  /**
    * Gets a reference to the igGridModalDialog element.
    */
  var modalDialog: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the reference to the igGridModalDialog widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ButtonCancelClickEventUIParam {
  
  inline def apply(): ButtonCancelClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonCancelClickEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonCancelClickEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setModalDialog(value: String): Self = StObject.set(x, "modalDialog", value.asInstanceOf[js.Any])
    
    inline def setModalDialogUndefined: Self = StObject.set(x, "modalDialog", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
