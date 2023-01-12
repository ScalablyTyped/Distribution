package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookDirtiedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object WorkbookDirtiedEventUIParam {
  
  inline def apply(): WorkbookDirtiedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookDirtiedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookDirtiedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
