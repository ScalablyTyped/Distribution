package typings.intercomClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Next extends StObject {
  
  var next: js.UndefOr[String] = js.undefined
  
  var page: Double
  
  var per_page: Double
  
  var total_pages: Double
}
object Next {
  
  inline def apply(page: Double, per_page: Double, total_pages: Double): Next = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], total_pages = total_pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Next]
  }
  
  extension [Self <: Next](x: Self) {
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
  }
}
