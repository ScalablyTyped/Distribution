package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildGridRenderedEventUIParam extends StObject {
  
  /**
    * Gets reference to the child grid.
    */
  var childgrid: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets access the hierarchical grid object.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets access the row element for the row that's about to be populated.
    */
  var parentrow: js.UndefOr[String] = js.native
}
object ChildGridRenderedEventUIParam {
  
  @scala.inline
  def apply(): ChildGridRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildGridRenderedEventUIParam]
  }
  
  @scala.inline
  implicit class ChildGridRenderedEventUIParamMutableBuilder[Self <: ChildGridRenderedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildgrid(value: js.Any): Self = StObject.set(x, "childgrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildgridUndefined: Self = StObject.set(x, "childgrid", js.undefined)
    
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
