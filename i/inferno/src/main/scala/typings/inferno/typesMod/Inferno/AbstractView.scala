package typings.inferno.typesMod.Inferno

import typings.std.Document
import typings.std.StyleMedia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractView extends StObject {
  
  var document: Document
  
  var styleMedia: StyleMedia
}
object AbstractView {
  
  inline def apply(document: Document, styleMedia: StyleMedia): AbstractView = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], styleMedia = styleMedia.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractView]
  }
  
  extension [Self <: AbstractView](x: Self) {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setStyleMedia(value: StyleMedia): Self = StObject.set(x, "styleMedia", value.asInstanceOf[js.Any])
  }
}
