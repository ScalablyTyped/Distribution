package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupCollapsedEventUIParam extends StObject {
  
  /**
    * Gets the column object for the current group that is collapsed.
    */
  var column: js.UndefOr[js.Any] = js.native
  
  /**
    * Get a reference to the jQuery object for the column being collapsed (th).
    */
  var element: js.UndefOr[String] = js.native
  
  /**
    * Gets the reference to the GridMultiColumnHeaders widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object GroupCollapsedEventUIParam {
  
  @scala.inline
  def apply(): GroupCollapsedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupCollapsedEventUIParam]
  }
  
  @scala.inline
  implicit class GroupCollapsedEventUIParamMutableBuilder[Self <: GroupCollapsedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
