package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Hippy React Components
// ----------------------------------------------------------------------
trait ImageSource extends StObject {
  
  var uri: String
}
object ImageSource {
  
  inline def apply(uri: String): ImageSource = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageSource] (val x: Self) extends AnyVal {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
