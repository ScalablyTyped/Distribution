package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowCollapsedEventUIParam extends StObject {
  
  /**
    * Gets access the hierarchical grid object.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets access the row element for the row that was collapsed.
    */
  var parentrow: js.UndefOr[String] = js.undefined
}
object RowCollapsedEventUIParam {
  
  inline def apply(): RowCollapsedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowCollapsedEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowCollapsedEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setParentrow(value: String): Self = StObject.set(x, "parentrow", value.asInstanceOf[js.Any])
    
    inline def setParentrowUndefined: Self = StObject.set(x, "parentrow", js.undefined)
  }
}
