package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlight extends StObject {
  
  var highlight: Boolean
  
  var sound: Boolean
}
object Highlight {
  
  inline def apply(highlight: Boolean, sound: Boolean): Highlight = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Highlight] (val x: Self) extends AnyVal {
    
    inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
  }
}
