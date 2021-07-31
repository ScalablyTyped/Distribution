package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowExpandedEventUIParam extends StObject {
  
  /**
    * Gets access the hierarchical grid object.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets access the row element for the row that was expanded.
    */
  var parentrow: js.UndefOr[String] = js.undefined
}
object RowExpandedEventUIParam {
  
  @scala.inline
  def apply(): RowExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowExpandedEventUIParam]
  }
  
  @scala.inline
  implicit class RowExpandedEventUIParamMutableBuilder[Self <: RowExpandedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setParentrow(value: String): Self = StObject.set(x, "parentrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentrowUndefined: Self = StObject.set(x, "parentrow", js.undefined)
  }
}
