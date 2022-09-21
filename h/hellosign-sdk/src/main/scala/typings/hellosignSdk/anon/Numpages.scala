package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Numpages extends StObject {
  
  var num_pages: Double
  
  var num_results: Double
  
  var page: Double
  
  var page_size: Double
}
object Numpages {
  
  inline def apply(num_pages: Double, num_results: Double, page: Double, page_size: Double): Numpages = {
    val __obj = js.Dynamic.literal(num_pages = num_pages.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Numpages]
  }
  
  extension [Self <: Numpages](x: Self) {
    
    inline def setNum_pages(value: Double): Self = StObject.set(x, "num_pages", value.asInstanceOf[js.Any])
    
    inline def setNum_results(value: Double): Self = StObject.set(x, "num_results", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
  }
}
