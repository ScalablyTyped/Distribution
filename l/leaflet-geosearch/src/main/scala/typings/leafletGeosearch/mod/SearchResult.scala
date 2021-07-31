package typings.leafletGeosearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResult[Raw] extends StObject {
  
  var bounds: BoundsTuple
  
  var label: String
  
  var raw: Raw
  
  var x: String
  
  var y: String
}
object SearchResult {
  
  @scala.inline
  def apply[Raw](bounds: BoundsTuple, label: String, raw: Raw, x: String, y: String): SearchResult[Raw] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult[Raw]]
  }
  
  @scala.inline
  implicit class SearchResultMutableBuilder[Self <: SearchResult[?], Raw] (val x: Self & SearchResult[Raw]) extends AnyVal {
    
    @scala.inline
    def setBounds(value: BoundsTuple): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Raw): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
