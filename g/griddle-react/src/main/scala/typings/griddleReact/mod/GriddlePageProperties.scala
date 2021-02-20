package typings.griddleReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddlePageProperties extends StObject {
  
  var currentPage: js.UndefOr[Double] = js.native
  
  var pageSize: js.UndefOr[Double] = js.native
  
  var recordCount: js.UndefOr[Double] = js.native
}
object GriddlePageProperties {
  
  @scala.inline
  def apply(): GriddlePageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddlePageProperties]
  }
  
  @scala.inline
  implicit class GriddlePagePropertiesMutableBuilder[Self <: GriddlePageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setRecordCount(value: Double): Self = StObject.set(x, "recordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCountUndefined: Self = StObject.set(x, "recordCount", js.undefined)
  }
}
