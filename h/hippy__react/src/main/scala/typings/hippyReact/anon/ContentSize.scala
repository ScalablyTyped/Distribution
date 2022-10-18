package typings.hippyReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentSize extends StObject {
  
  var contentSize: Width
}
object ContentSize {
  
  inline def apply(contentSize: Width): ContentSize = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSize]
  }
  
  extension [Self <: ContentSize](x: Self) {
    
    inline def setContentSize(value: Width): Self = StObject.set(x, "contentSize", value.asInstanceOf[js.Any])
  }
}
