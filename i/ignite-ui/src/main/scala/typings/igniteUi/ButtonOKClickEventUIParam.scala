package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonOKClickEventUIParam extends StObject {
  
  /**
    * Gets a reference to the igGridModalDialog element.
    */
  var modalDialog: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the reference to the igGridModalDialog widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object ButtonOKClickEventUIParam {
  
  inline def apply(): ButtonOKClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonOKClickEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonOKClickEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setModalDialog(value: String): Self = StObject.set(x, "modalDialog", value.asInstanceOf[js.Any])
    
    inline def setModalDialogUndefined: Self = StObject.set(x, "modalDialog", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
