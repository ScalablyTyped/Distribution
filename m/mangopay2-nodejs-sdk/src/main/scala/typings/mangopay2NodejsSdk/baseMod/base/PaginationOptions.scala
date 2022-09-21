package typings.mangopay2NodejsSdk.baseMod.base

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationOptions extends StObject {
  
  /**
    * The page number of results you wish to return
    * @default 1
    */
  var Page: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of results to return per page: Max 100;
    * @default 10
    */
  var Per_Page: js.UndefOr[Double] = js.undefined
}
object PaginationOptions {
  
  inline def apply(): PaginationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationOptions]
  }
  
  extension [Self <: PaginationOptions](x: Self) {
    
    inline def setPage(value: Double): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
    
    inline def setPer_Page(value: Double): Self = StObject.set(x, "Per_Page", value.asInstanceOf[js.Any])
    
    inline def setPer_PageUndefined: Self = StObject.set(x, "Per_Page", js.undefined)
  }
}
