package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentOffset extends StObject {
  
  var contentOffset: X
}
object ContentOffset {
  
  inline def apply(contentOffset: X): ContentOffset = {
    val __obj = js.Dynamic.literal(contentOffset = contentOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOffset]
  }
  
  extension [Self <: ContentOffset](x: Self) {
    
    inline def setContentOffset(value: X): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
  }
}
