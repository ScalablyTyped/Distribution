package typings.mangopay2NodejsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationOptions extends StObject {
  
  /**
    * The page number of results you wish to return
    * @default 1
    */
  var Page: js.UndefOr[Double] = js.native
  
  /**
    * The number of results to return per page: Max 100;
    * @default 10
    */
  var Per_Page: js.UndefOr[Double] = js.native
}
object PaginationOptions {
  
  @scala.inline
  def apply(): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationOptions]
  }
  
  @scala.inline
  implicit class PaginationOptionsMutableBuilder[Self <: PaginationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
    
    @scala.inline
    def setPer_Page(value: Double): Self = StObject.set(x, "Per_Page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_PageUndefined: Self = StObject.set(x, "Per_Page", js.undefined)
  }
}
