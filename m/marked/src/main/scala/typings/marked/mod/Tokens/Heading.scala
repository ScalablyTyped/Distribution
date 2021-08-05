package typings.marked.mod.Tokens

import typings.marked.markedStrings.heading
import typings.marked.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heading
  extends StObject
     with Token {
  
  var depth: Double
  
  var raw: String
  
  var text: String
  
  var `type`: heading
}
object Heading {
  
  inline def apply(depth: Double, raw: String, text: String): Heading = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading")
    __obj.asInstanceOf[Heading]
  }
  
  extension [Self <: Heading](x: Self) {
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: heading): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
