package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageIterator extends StObject {
  
  var collection: Double
  
  var docIndex: Double
  
  var pageIndex: Double
}
object PageIterator {
  
  @scala.inline
  def apply(collection: Double, docIndex: Double, pageIndex: Double): PageIterator = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], docIndex = docIndex.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageIterator]
  }
  
  @scala.inline
  implicit class PageIteratorMutableBuilder[Self <: PageIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection(value: Double): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocIndex(value: Double): Self = StObject.set(x, "docIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
  }
}
