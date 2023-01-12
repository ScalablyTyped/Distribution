package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedTextParagraph extends StObject {
  
  /** The text that's shown in the widget. */
  var text: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedTextParagraph {
  
  inline def apply(): AppsDynamiteSharedTextParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedTextParagraph]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedTextParagraph] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
