package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentInset extends StObject {
  
  var contentInset: Left
  
  var contentOffset: X
  
  var contentSize: Height
  
  var layoutMeasurement: Height
}
object ContentInset {
  
  inline def apply(contentInset: Left, contentOffset: X, contentSize: Height, layoutMeasurement: Height): ContentInset = {
    val __obj = js.Dynamic.literal(contentInset = contentInset.asInstanceOf[js.Any], contentOffset = contentOffset.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], layoutMeasurement = layoutMeasurement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentInset]
  }
  
  extension [Self <: ContentInset](x: Self) {
    
    inline def setContentInset(value: Left): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    inline def setContentOffset(value: X): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
    
    inline def setContentSize(value: Height): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
    
    inline def setLayoutMeasurement(value: Height): Self = StObject.set(x, "layoutMeasurement", value.asInstanceOf[js.Any])
  }
}
