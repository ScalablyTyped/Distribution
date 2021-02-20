package typings.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutPagedOptions extends StObject {
  
  var pageGenerator: js.UndefOr[String] = js.native
  
  var pageNumber: js.UndefOr[Double] = js.native
  
  var pageSize: js.UndefOr[Double] = js.native
}
object KnockoutPagedOptions {
  
  @scala.inline
  def apply(): KnockoutPagedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutPagedOptions]
  }
  
  @scala.inline
  implicit class KnockoutPagedOptionsMutableBuilder[Self <: KnockoutPagedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageGenerator(value: String): Self = StObject.set(x, "pageGenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageGeneratorUndefined: Self = StObject.set(x, "pageGenerator", js.undefined)
    
    @scala.inline
    def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
