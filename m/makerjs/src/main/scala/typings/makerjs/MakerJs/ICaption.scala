package typings.makerjs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Text annotation, diplayable natively to the output format.
  */
trait ICaption extends StObject {
  
  /**
    * Invisible line to which the text is aligned.
    * The text will be horizontally and vertically centered on the center point of this line.
    * The text may be longer or shorter than the line, it is used only for position and angle.
    * The anchor line's endpoints may be omitted, in which the case the text will always remain non-angled, even if the model is rotated.
    */
  var anchor: IPathLine
  
  /**
    * Caption text.
    */
  var text: String
}
object ICaption {
  
  inline def apply(anchor: IPathLine, text: String): ICaption = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICaption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICaption] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: IPathLine): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
